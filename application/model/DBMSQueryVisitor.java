package application.model;

import java.io.IOException;
import java.util.ArrayList;
import application.model.DBMSParser.ConstraintAtContext;
import application.model.DBmanagerDDL;
import application.model.DBmanagerDML;

public class DBMSQueryVisitor extends DBMSBaseVisitor <ArrayList<ArrayList<String>>> {
	public StringBuffer errors = new StringBuffer("\n Semantic Errors: \n");
	public Integer n = 0;
	public DBmanagerDDL ddl;
	public DBmanagerDML dml;
	public ArrayList<String> tables_list;
	public ArrayList<String> columns_list;
	
	public DBMSQueryVisitor (DBmanagerDDL ddl, DBmanagerDML dml){
		System.out.println("DBMSVisitor");
		this.ddl = ddl;
		this.dml = dml;
		//Hello Santiago Koch
	}
	
	@Override 
	public ArrayList<ArrayList<String>> visitSql(DBMSParser.SqlContext ctx) {
		System.out.println("visitSql");
		return visitChildren(ctx); 
	}
	
	@Override
	public ArrayList<ArrayList<String>> visitSql_executable(DBMSParser.Sql_executableContext ctx){
		System.out.println("visitSql_Executable");
		if(ctx.sql_dml() != null){
			System.out.println("sql_dml"); // <- noten como la gramatica nos permite saber que onda
		} else {
			System.out.println("sql_ddl"); //Yep, cool. Esto no lo tenía la de Hsin
		}
		return visitChildren(ctx);
	}
	
	//SQL DDL
	
	@Override
	public  ArrayList<ArrayList<String>> visitSql_ddl(DBMSParser.Sql_ddlContext ctx){
		System.out.println("visitSql_ddl");
		if(ctx.database_statement() != null){
			System.out.println("database_statement");
		} else {
			System.out.println("table_statement");
		}
			
		return visitChildren(ctx);
	}
	
	//DATABASE STATEMENT
	
	//CREATE DATABASE
	@Override
	public ArrayList<ArrayList<String>> visitCreate_database(DBMSParser.Create_databaseContext ctx){
		//create database ID END_SQL
		System.out.println("visitCreate_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id); //Santiago function
		ddl.createDatabase(id);
		return null; //errors
	}
	
	//ALTER DATABASE
	@Override
	public ArrayList<ArrayList<String>> visitAlter_database(DBMSParser.Alter_databaseContext ctx){
		//alter database ID rename to ID END_SQL
		System.out.println("visitAlter_database");
		String id_number_1 = ctx.getChild(2).getText(); //arg 1
		String id_number_2 = ctx.getChild(5).getText(); //arg 2
		System.out.println("Bueno, id numero 1 es "+id_number_1+" y id numero 2 es "+id_number_2);
		ddl.alterDatabase(id_number_1, id_number_2);
		return null; //Errors :)
	}
	
	//DROP DATABASE
	@Override
	public ArrayList<ArrayList<String>> visitDrop_database(DBMSParser.Drop_databaseContext ctx){
		//drop database ID END_SQL
		System.out.println("visitDrop_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id);//FUNCTION SANTIAGO
		ddl.killDatabase(id);
		return null;
	}
	
	
	//SHOW DATABASE
	@Override
	public ArrayList<ArrayList<String>> visitShow_database(DBMSParser.Show_databaseContext ctx){
		//show databases END_SQL
		System.out.println("visitShow_database");
		ddl.showDatabases();
		return null;
	}
	
	//USE DATABASE
	@Override
	public ArrayList<ArrayList<String>> visitUse_database(DBMSParser.Use_databaseContext ctx){
		//use database ID END_SQL
		System.out.println("visitUse_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		ddl.useDatabase(id);
		return null;
	}
	
	//TABLE STATEMENT
	
	//CREATE TABLE
	@Override
	public ArrayList<ArrayList<String>> visitCreate_table(DBMSParser.Create_tableContext ctx){
		//create table ID LPAREN ID type comma_id_type_k comma_constraint_constraintAt_k  RPAREN END_SQL
		System.out.println("visitCreate_table");
		String table_id = ctx.getChild(2).getText();
		//Listas para enviar a Santiago
		ArrayList<String> columns_list = new ArrayList<String>();
		ArrayList<String> types_list = new ArrayList<String>();
		ArrayList<KeyPFC> keys_list = new ArrayList<KeyPFC>();
		String column_1 = ctx.getChild(4).getText();
		String type_1 = ctx.getChild(5).getText();
		columns_list.add(column_1);
		types_list.add(type_1);
		System.out.println(column_1);
		System.out.println(type_1);
		Integer columns_number = ctx.getChild(6).getChildCount()/3;
		//Obtener columnas
		if(columns_number > 0){
			for(Integer i = 0; i < columns_number; i++){
				String column_i = ctx.getChild(6).getChild(1+(3*i)).getText();
				String type_i = ctx.getChild(6).getChild(2+(3*i)).getText();
				columns_list.add(column_i);
				types_list.add(type_i);
				System.out.println(column_i);
				System.out.println(type_i);
			}
		}
		//Obtener constraints
		Integer constraints_number = ctx.comma_constraint_constraintAt_k().getChildCount()/3;
		if(constraints_number > 0){
			for(Integer i = 0; i < constraints_number; i++){
				 ConstraintAtContext constraintAt = ctx.comma_constraint_constraintAt_k().constraintAt(i);
				 KeyPFC key = new KeyPFC();
				 if(constraintAt.primaryKey() != null){
					 System.out.println("PK");
					 //ID primary key LPAREN ID comma_id_k RPAREN ;
					 String id = constraintAt.primaryKey().getChild(0).getText();
					 System.out.println(id);
					 key.id = id;
					 key.type = "pk";
					 String key_column_1 = constraintAt.primaryKey().getChild(4).getText();
					 key.columns_list_1.add(key_column_1);
					 System.out.println(key_column_1);
					 Integer columns_constraint_number = constraintAt.primaryKey().comma_id_k().getChildCount()/2;
					 if(columns_constraint_number > 0){
						 for(Integer j = 0; j < columns_constraint_number; j++){
							 String key_column_i = constraintAt.primaryKey().comma_id_k().ID(j).getText();
							 key.columns_list_1.add(key_column_i);
							 System.out.println(key_column_i);
						 }
					 }
				 } else if(constraintAt.foreignKey() != null){
					 System.out.println("FK");
					 //ID foreign key LPAREN ID comma_id_k RPAREN references ID LPAREN ID comma_id_k RPAREN;
					 String id = constraintAt.foreignKey().getChild(0).getText();
					 System.out.println(id);
					 key.id = id;
					 key.type = "fk";
					 String id_references = constraintAt.foreignKey().getChild(8).getText();
					 key.id_references = id_references;
					 String key_column_1 = constraintAt.foreignKey().getChild(4).getText();
					 key.columns_list_1.add(key_column_1);
					 System.out.println(key_column_1);
					 Integer columns_constraint_number = constraintAt.foreignKey().comma_id_k(0).getChildCount()/2;
					 if(columns_constraint_number > 0){
						 for(Integer j = 0; j < columns_constraint_number; j++){
							 String key_column_i = constraintAt.foreignKey().comma_id_k(0).ID(j).getText();
							 key.columns_list_1.add(key_column_i);
							 System.out.println(key_column_i);
						 }
					 }
					 String key_column_2 = constraintAt.foreignKey().getChild(10).getText();
					 key.columns_list_2.add(key_column_2);
					 System.out.println(key_column_2);
					 columns_constraint_number = constraintAt.foreignKey().comma_id_k(1).getChildCount()/2;
					 if(columns_constraint_number > 0){
						 for(Integer j = 0; j < columns_constraint_number; j++){
							 String key_column_i = constraintAt.foreignKey().comma_id_k(1).ID(j).getText();
							 key.columns_list_2.add(key_column_i);
							 System.out.println(key_column_i);
						 }
					 }
				 } else if(constraintAt.checks() != null) {
					 System.out.println("CH");
					 //ID check LPAREN exp RPAREN
					 String id = constraintAt.checks().getChild(0).getText();
					 System.out.println(id);
					 key.id = id;
					 key.type = "ch";
					 key.exp = constraintAt.checks().exp();
				 }
				 keys_list.add(key);
			}
		}
		ddl.createTable(table_id, columns_list, types_list);
		return null;
	}

	//ALTER TABLE
	@Override
	public ArrayList<ArrayList<String>> visitAlter_table(DBMSParser.Alter_tableContext ctx){
		//alter table ID rename to ID END_SQL
	    //|   alter table ID action comma_action_k END_SQL
		System.out.println("visitAlter_table");
		if(ctx.getChildCount()==7){
			String id_number_1 = ctx.getChild(2).getText();
			String id_number_2 = ctx.getChild(4).getText();
			System.out.println("Bueno, id numero 1 es "+id_number_1+" y id numero 2 es "+id_number_2);
		} else {
			//action
		}
		return null;
	}
	
	//DROP TABLES
	@Override
	public ArrayList<ArrayList<String>> visitDrop_table(DBMSParser.Drop_tableContext ctx){
		//drop table ID END_SQL
		System.out.println("visitDrop_table");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		return null;
	}
	
	//SHOW TABLES
	@Override
	public ArrayList<ArrayList<String>> visitShow_tables(DBMSParser.Show_tablesContext ctx){
		//show tables END_SQL
		System.out.println("visitShow_tables");
		ddl.showTables();
		return null;
	}
	
	//SHOW COLUMNS
	@Override
	public ArrayList<ArrayList<String>> visitShow_columns(DBMSParser.Show_columnsContext ctx){
		//show columns from ID END_SQL
		System.out.println("visitShow_columns");
		String id = ctx.getChild(3).getText();
		System.out.println(id);
		try{
			ddl.showColumns(id);
		} catch(IOException ex) {
	        ex.printStackTrace();
	    }
		return null;
	}
	
	//SQL DML
	
	@Override
	public ArrayList<ArrayList<String>> visitSql_dml(DBMSParser.Sql_dmlContext ctx){
		System.out.println("visitSql_dml");
		return visitChildren(ctx);
	}
	
	//INSERT
	@Override
	public ArrayList<ArrayList<String>> visitInsert_value(DBMSParser.Insert_valueContext ctx){
		//insert into ID some_order values LPAREN literal comma_literal_k RPAREN END_SQL
		System.out.println("visitInsert_value");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		ArrayList<String> order_list = new ArrayList<String>();
		ArrayList<String> literal_list = new ArrayList<String>();
		if(ctx.some_order() != null){
			//( LPAREN ID comma_id_k  RPAREN )?
			order_list.add(ctx.some_order().ID().getText());
			System.out.println(order_list.get(0));
			Integer total_number_order = ctx.some_order().comma_id_k().getChildCount()/2;
			for(Integer i = 0; i < total_number_order; i++){
				order_list.add(ctx.some_order().comma_id_k().getChild((i*2)+1).getText());
				System.out.println(order_list.get(i+1));
			}
		}
		literal_list.add(ctx.getChild(6).getText());
		System.out.println(literal_list.get(0));
		if(ctx.comma_literal_k() != null){
			//MULTIPLE VALUES
			Integer total_number_literal = ctx.comma_literal_k().getChildCount()/2;
			for(Integer i = 0; i<total_number_literal; i++){
				literal_list.add(ctx.comma_literal_k().getChild((i*2)+1).getText());
				System.out.println(literal_list.get(i+1));
			}
		}
		try {
			dml.insertInto(id, order_list, literal_list);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//UPDATE
	@Override
	public ArrayList<ArrayList<String>> visitUpdate_value(DBMSParser.Update_valueContext ctx){
		//update ID set ID EQ literal comma_id_eq_literal_k  where_exp END_SQL
		System.out.println("visitUpdate_value");
		String id = ctx.getChild(1).getText();
		ArrayList<String> id_list = new ArrayList<String>();
		ArrayList<String> literal_list = new ArrayList<String>();
		id_list.add(ctx.getChild(3).getText());
		System.out.println(id_list.get(0));
		literal_list.add(ctx.getChild(5).getText());
		System.out.println(literal_list.get(0));
		if(ctx.comma_id_eq_literal_k() != null){
			Integer total_number_id_literal = ctx.comma_id_eq_literal_k().getChildCount()/3;
			for(Integer i = 0; i < total_number_id_literal; i++){
				id_list.add(ctx.comma_id_eq_literal_k().getChild(i*3).getText());
				System.out.println(id_list.get(i+1));
				literal_list.add(ctx.comma_id_eq_literal_k().getChild((i*3)+2).getText());
				System.out.println(literal_list.get(i+1));
			}
		}
		if(ctx.where_exp() != null){
			System.out.println(ctx.where_exp().getText());
		}
		
		return null;
	}
	
	
	//DELETE
	@Override
	public ArrayList<ArrayList<String>> visitDelete_value(DBMSParser.Delete_valueContext ctx){
		//delete from ID where_exp END_SQL
		System.out.println("visitDelete_value");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		if(ctx.where_exp() != null){
			System.out.println(ctx.where_exp().getText());
		}
		return null;
	}
	
	//SELECT
	@Override
	public ArrayList<ArrayList<String>> visitSelect_value(DBMSParser.Select_valueContext ctx){
		//select select_k_id from ID comma_id_k where_exp order_by END_SQL
		System.out.println("visitSelect_value");
		columns_list = new ArrayList<String>();
		tables_list = new ArrayList<String>();
		ArrayList<String> order_by_id_list = new ArrayList<String>();
		ArrayList<Integer> order_by_ad_list = new ArrayList<Integer>();
		if(ctx.select_k_id().KL() != null){
			columns_list.add("*");
			System.out.println("*");
		} else {
			//ID comma_id_k
			columns_list.add(ctx.select_k_id().getChild(0).getText());
			System.out.println(columns_list.get(0));
			Integer total_number_columns = ctx.select_k_id().comma_id_k().getChildCount()/2;
			for(Integer i = 0; i < total_number_columns; i++){
				columns_list.add(ctx.select_k_id().comma_id_k().getChild((i*2)+1).getText());
				System.out.println(columns_list.get(i+1));
			}
		}
		tables_list.add(ctx.ID().getText());
		System.out.println(tables_list.get(0));
		if(ctx.comma_id_k() != null){
			// (COMMA ID)*
			Integer total_number_tables = ctx.comma_id_k().getChildCount()/2;
			for(Integer i = 0; i < total_number_tables; i++){
				tables_list.add(ctx.comma_id_k().getChild((i*2)+1).getText());
				System.out.println(tables_list.get(i+1));
			}
		}

		if(ctx.where_exp() != null){
			System.out.println("WHERE EXPRESSION");
			ArrayList<ArrayList<String>> result = visit(ctx.where_exp().exp());
			if(result == null){
				//AUN ASI TENEMOS QUE TRABAJAR AMBAS TABLAS :(
			}
		}
		if(ctx.order_by().getChildCount() > 0){
			//(order by ID (asc | desc) comma_id_ad_k)?
			System.out.println("ORDER BY");
			order_by_id_list.add(ctx.order_by().ID().getText());
			if(ctx.order_by().asc() != null){
				order_by_ad_list.add(1);
			} else {
				order_by_ad_list.add(0);
			}
			System.out.println(order_by_id_list.get(0));
			System.out.println(order_by_ad_list.get(0));
			Integer total_number_order_by = ctx.order_by().comma_id_ad_k().getChildCount()/3; 
			if(total_number_order_by > 0){
				//( COMMA ID ( asc | desc ) )*
				for(Integer i = 0; i < total_number_order_by; i++){
					order_by_id_list.add(ctx.order_by().comma_id_ad_k().ID(i).getText());
					String current_order_by = ctx.order_by().comma_id_ad_k().getChild((i*3)+2).getText();
					if(current_order_by.equals("ASC") || current_order_by.equals("Asc") || current_order_by.equals("asc")){
						order_by_ad_list.add(1);
					} else {
						order_by_ad_list.add(0);
					}
					System.out.println(order_by_id_list.get(i+1));
					System.out.println(order_by_ad_list.get(i+1));
				}
			}
		}
		return null;
	}
	
	
	//Exp
	@Override
	public ArrayList<ArrayList<String>> visitExp(DBMSParser.ExpContext ctx){
		//:   expression |   //epsilon
		if(ctx.expression() != null){
			return visitChildren(ctx);
		}
		return null;
	}
	
	@Override
	public ArrayList<ArrayList<String>> visitExpression(DBMSParser.ExpressionContext ctx){
		/*expression 
    		:   andExpr
    		|   expression or andExpr*/
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			ArrayList<ArrayList<String>> t1 = visit(ctx.expression());
			if(t1 == null){
				return null;
			}
			ArrayList<ArrayList<String>> t2 = visit(ctx.andExpr());
			if(t2 == null){
				return null;
			}
			if(t1.size() > t2.size()){
				for(ArrayList<String> row : t2){
					if(!t1.contains(row)){
						t1.add(row);
					}
				}
			} else {
				for(ArrayList<String> row : t1){
					if(!t2.contains(row)){
						t2.add(row);
					}
				}
			}
			return t2;
		}
	}

	@Override
	public ArrayList<ArrayList<String>> visitAndExpr(DBMSParser.AndExprContext ctx){
		/*andExpr
			: factor 
    		| andExpr and factor */
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			ArrayList<ArrayList<String>> t1 = visit(ctx.andExpr());
			if(t1 == null){
				return null;
			}
			ArrayList<ArrayList<String>> t2 = visit(ctx.factor());
			if(t2 == null){
				return null;
			}
			ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
			if(t1.size() > t2.size()){
				for(ArrayList<String> row : t1){
					if(t2.contains(row)){
						result.add(row);
					}
				}
			} else {
				for(ArrayList<String> row : t2){
					if(t1.contains(row)){
						result.add(row);
					}
				}
			}
			return result;
		}
		
	}
	
	@Override
	public ArrayList<ArrayList<String>> visitFactor(DBMSParser.FactorContext ctx){
		/*factor
    		: primaryExpr 
    		| not primaryExpr*/
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			return null;
		}
	}
	
	@Override
	public ArrayList<ArrayList<String>> visitPrimaryExpr(DBMSParser.PrimaryExprContext ctx){
		/*primaryExpr
			: compareExpr
			| LPAREN expression RPAREN
			;*/
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			return visitChildren(ctx.expression());
		}
	}
	
	@Override
	public ArrayList<ArrayList<String>> visitCompareExpr(DBMSParser.CompareExprContext ctx){
		/*	compareExpr
				:	term rel_op term
		 */
		
		/*term
			:	ID
			|	literal
		 */
		ArrayList<ArrayList<String>> current_table_info;
		ArrayList<ArrayList<String>> table1 = new ArrayList<ArrayList<String>>();
		String literal1 = "";
		Integer index1;
		String type1 = "";
		ArrayList<ArrayList<String>> table2 = new ArrayList<ArrayList<String>>();
		String literal2 = "";
		Integer index2;
		String type2 = "";
		String rel_op = ctx.rel_op().getText();
		
		if(ctx.term(0).literal() == null){
			System.out.println("term 0 es ID ");
			String column_name = ctx.term(0).ID().getText();
			for(String table_name : tables_list){
				System.out.println(table_name);
				try {
					current_table_info = dml.tableTypesAndNames(table_name);
				} catch (IOException e1) {
					System.out.println("Error info de tabla "+table_name);
					e1.printStackTrace();
					return null;
				}
				if(current_table_info.get(0).contains(column_name)){
					try {
						table1 = dml.tableToArraylist(table_name);
					} catch (IOException e) {
						System.out.println("Error cargar tabla "+table_name);
						e.printStackTrace();
						return null;
					}
					index1 = current_table_info.get(0).indexOf(column_name);
					type1 = current_table_info.get(1).get(index1);
					System.out.println(current_table_info.get(0));
					System.out.println("Nombre de tabla "+table_name);
					System.out.println("Nombre de columna "+column_name);
					System.out.println("Indice de columna "+index1);
					System.out.println("Tipo de columna "+type1);
				}
			}
		} else {
			literal1 = ctx.term(0).literal().getText();
			if(dml.validateInt(literal1)){
				type1 = "INT";
			} else if (dml.validateFloat(literal1)){
				type1 = "FLOAT";
			} else if (dml.validateDate(literal1)){
				type1 = "DATE";
			} else {
				type1 = "CHAR("+String.valueOf(literal1.length())+")";
			}
			System.out.println("Tipo de columna "+type1);
		}
		
		if(ctx.term(1).literal() == null){
			System.out.println("term 1 es ID ");
			String column_name = ctx.term(1).ID().getText();
			for(String table_name : tables_list){
				System.out.println(table_name);
				try {
					current_table_info = dml.tableTypesAndNames(table_name);
				} catch (IOException e1) {
					System.out.println("Error info de tabla "+table_name);
					e1.printStackTrace();
					return null;
				}
				if(current_table_info.get(0).contains(column_name)){
					try {
						table2 = dml.tableToArraylist(table_name);
					} catch (IOException e) {
						System.out.println("Error cargar tabla "+table_name);
						e.printStackTrace();
						return null;
					}
					index2 = current_table_info.get(0).indexOf(column_name);
					type2 = current_table_info.get(1).get(index2);
					System.out.println(current_table_info.get(0));
					System.out.println("Nombre de tabla "+table_name);
					System.out.println("Nombre de columna "+column_name);
					System.out.println("Indice de columna "+index2);
					System.out.println("Tipo de columna "+type2);
				}
			}
		} else {
			literal2 = ctx.term(1).literal().getText();
			if(dml.validateInt(literal2)){
				type2 = "INT";
			} else if (dml.validateFloat(literal2)){
				type2 = "FLOAT";
			} else if (dml.validateDate(literal2)){
				type2 = "DATE";
			} else {
				type2 = "CHAR("+String.valueOf(literal2.length())+")";
			}
			System.out.println("Tipo de columna "+type2);
		}
		
		if(literal1.equals("") && literal2.equals("")){
			System.out.println("Ambas son columnas.. producto cruz");
			return null;
		} else if(literal1.equals("")){
			//Tabla 2 tiene contenido
			System.out.println("Tabla 0 tiene contenido");
			if(!table1.isEmpty()){
				for(ArrayList<String> row : table1){
					System.out.println(row);
				}
			}
		} else if(literal2.equals("")){
			//Tabla 1 tiene contenido
			System.out.println("Tabla 1 tiene contenido");
		} else {
			System.out.println("ERROR, ambas son literales");
			return null;
		}
		return null;
	}
	
	public boolean relation(String op, String item1, String item2, String type1, String type2){
		if(type1.equals(type2)){
			if(type1.equals("INT")){
				switch (op) {
					case "<" :
						return Integer.valueOf(item1) < Integer.valueOf(item2);
					case ">" :
						return Integer.valueOf(item1) > Integer.valueOf(item2);
					case "<=" :
						return Integer.valueOf(item1) <= Integer.valueOf(item2);
					case ">=" :
						return Integer.valueOf(item1) >= Integer.valueOf(item2);
					case "=" :
						return Integer.valueOf(item1) == Integer.valueOf(item2);
					case "<>" :
						return Integer.valueOf(item1) != Integer.valueOf(item2);
				}
			} else if(type1.equals("FLOAT")){
				switch (op) {
					case "<" :
						return Float.valueOf(item1) < Float.valueOf(item2);
					case ">" :
						return Float.valueOf(item1) > Float.valueOf(item2);
					case "<=" :
						return Float.valueOf(item1) <= Float.valueOf(item2);
					case ">=" :
						return Float.valueOf(item1) >= Float.valueOf(item2);
					case "=" :
						return Float.valueOf(item1) == Float.valueOf(item2);
					case "<>" :
						return Float.valueOf(item1) != Float.valueOf(item2);
				}
			} else if(type1.equals("DATE")){
				
			} else {
				//CHAR
				switch(op) {
					case "<":
						boolean result = false; 
						int cmp = item1.compareTo(item2);
						if (cmp < 0)
							result = true;
						return result;
					case ">":
						result = false; 
						cmp = item1.compareTo(item2);
						if (cmp > 0)
							result = true;
						return result;
					case "<=":
						result = false; 
						cmp = item1.compareTo(item2);
						if (cmp <= 0)
							result = true;
						return result;
					case ">=":
						result = false; 
						cmp = item1.compareTo(item2);
						if (cmp >= 0)
							result = true;
						return result;
					case "=" :
						return item1.equals(item2);
					case "<>" :
						return !item1.equals(item2);
					default	:
						return false;
				}
			}
		} else if((type1.equals("FLOAT") && type2.equals("INT")) || (type2.equals("FLOAT") && type1.equals("INT"))){
			switch (op) {
				case "<" :
					return Float.valueOf(item1) < Float.valueOf(item2);
				case ">" :
					return Float.valueOf(item1) > Float.valueOf(item2);
				case "<=" :
					return Float.valueOf(item1) <= Float.valueOf(item2);
				case ">=" :
					return Float.valueOf(item1) >= Float.valueOf(item2);
				case "=" :
					return Float.valueOf(item1) == Float.valueOf(item2);
				case "<>" :
					return Float.valueOf(item1) != Float.valueOf(item2);
			}
		}
		return false;
	}
	
	public void handleSemanticError(String message){
		errors.append("["+n+"]: "+message+"\n \n");
		n++;
	}
}
