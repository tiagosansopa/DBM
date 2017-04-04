package application.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import application.model.DBMSParser.ConstraintAtContext;
import application.model.DBmanagerDDL;
import application.model.DBmanagerDML;
import application.model.DBMSParser.ExpContext;

public class DBMSQueryVisitor extends DBMSBaseVisitor <ArrayList<String>>{
	public StringBuffer errors = new StringBuffer("\n Execution \n");
	//public StringBuffer outputText = new StringBuffer("");
	public Integer n = 0;
	public DBmanagerDDL ddl;
	public DBmanagerDML dml;
	public Integer notExpression;
	public boolean notCompareExpr;
	public ArrayList<String> tables_list;
	public ArrayList<String> columns_list;
	public ExpContext expX;
	public ArrayList<String> rowX;
	public ArrayList<String> columnX;
	public ArrayList<String> typeX;
	public ArrayList<ArrayList<String>> resultX;
	public ArrayList<ArrayList<ArrayList<String>>> tableX;
	
	public DBMSQueryVisitor (DBmanagerDDL ddl, DBmanagerDML dml){
		System.out.println("DBMSVisitor");
		this.ddl = ddl;
		this.dml = dml;
		//Hello Santiago Koch
		notExpression = 0;
		notCompareExpr = false;
	}
	
	@Override 
	public ArrayList<String> visitSql(DBMSParser.SqlContext ctx) {
		System.out.println("visitSql");
		return visitChildren(ctx); 
	}
	
	@Override
	public ArrayList<String> visitSql_executable(DBMSParser.Sql_executableContext ctx){
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
	public  ArrayList<String> visitSql_ddl(DBMSParser.Sql_ddlContext ctx){
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
	public ArrayList<String> visitCreate_database(DBMSParser.Create_databaseContext ctx){
		//create database ID END_SQL
		System.out.println("visitCreate_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id); //Santiago function
		handleSemanticError(ddl.createDatabase(id));
		return null; //errors
	}
	
	//ALTER DATABASE
	@Override
	public ArrayList<String> visitAlter_database(DBMSParser.Alter_databaseContext ctx){
		//alter database ID rename to ID END_SQL
		System.out.println("visitAlter_database");
		String id_number_1 = ctx.getChild(2).getText(); //arg 1
		String id_number_2 = ctx.getChild(5).getText(); //arg 2
		System.out.println("Bueno, id numero 1 es "+id_number_1+" y id numero 2 es "+id_number_2);
		handleSemanticError(ddl.alterDatabase(id_number_1, id_number_2));
		return null; //Errors :)
	}
	
	//DROP DATABASE
	@Override
	public ArrayList<String> visitDrop_database(DBMSParser.Drop_databaseContext ctx){
		//drop database ID END_SQL
		System.out.println("visitDrop_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id);//FUNCTION SANTIAGO
		handleSemanticError(ddl.killDatabase(id));
		return null;
	}
	
	
	//SHOW DATABASE
	@Override
	public ArrayList<String> visitShow_database(DBMSParser.Show_databaseContext ctx){
		//show databases END_SQL
		System.out.println("visitShow_database");
		ddl.showDatabases();
		return null;
	}
	
	//USE DATABASE
	@Override
	public ArrayList<String> visitUse_database(DBMSParser.Use_databaseContext ctx){
		//use database ID END_SQL
		System.out.println("visitUse_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		handleSemanticError(ddl.useDatabase(id));
		handleSemanticError(dml.useDatabase(id));
		return null;
	}
	
	//TABLE STATEMENT
	
	//CREATE TABLE
	@Override
	public ArrayList<String> visitCreate_table(DBMSParser.Create_tableContext ctx){
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
					 key.exp = constraintAt.checks().exp().getText();
				 }
				 keys_list.add(key);
			}
		}

		handleSemanticError(ddl.createTable(table_id, columns_list, types_list,keys_list));

		return null;
	}

	//ALTER TABLE
	@Override
	public ArrayList<String> visitAlter_table(DBMSParser.Alter_tableContext ctx){
		//alter table ID rename to ID END_SQL
	    //|   alter table ID action comma_action_k END_SQL
		
		/*
		 * rename te mando: idViejo y idNuevo
		 * addColumn: id string, un ArrayList de PKC 
		 * ADD Constraint: ArrayList de PKC
		 * Drop column: nombre de la columna. String
		 * Drop de la constraint: nombre de la constraint. String
		 * 
		 */
		System.out.println("visitAlter_table");
		if(ctx.getChildCount()==7){
			String id_number_1 = ctx.getChild(2).getText();
			String id_number_2 = ctx.getChild(5).getText();
			System.out.println("Bueno, id numero 1 es "+id_number_1+" y id numero 2 es "+id_number_2);
			ddl.alterTableRename(id_number_1,id_number_2);
		} else {
			//action
			visit(ctx.action());
		}
		return null;
	}
	public KeyPFC makeListKeyPFC(ConstraintAtContext constraintAt){
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
			 key.exp = constraintAt.checks().exp().getText();
		 }
		return key;
	}
	
	public ArrayList<String> visitAction(DBMSParser.ActionContext ctx){
		String addOrDrop = ctx.getChild(0).getText().toLowerCase();
		String constraintOrColumn = ctx.getChild(1).getText().toLowerCase();
		ArrayList<KeyPFC> keys_list = new ArrayList<KeyPFC>();
		if(addOrDrop.equals("drop") && constraintOrColumn.equals("constraint")){
			// Llamar a la funcion de Santiago borrar constraint
			
			System.out.println("Constraint a borrar: "
					+ ctx.ID().getText()
					);
			ctx.ID().getText();
		}
		else if (addOrDrop.equals("drop") && constraintOrColumn.equals("column")){
			// LLamar a la funcion de Santiago borrar columna
			System.out.println("Columna a borrar: "
					+ ctx.ID().getText()
					);
			ctx.ID().getText();
		}
		else if (addOrDrop.equals("add") && constraintOrColumn.equals("constraint")){
			ConstraintAtContext constraint = ctx.constraintAt();
			keys_list.add(makeListKeyPFC(constraint));
		}
		else if (addOrDrop.equals("add") && constraintOrColumn.equals("constraint")){
			ConstraintAtContext constraint = ctx.constraintAt();
			keys_list.add(makeListKeyPFC(constraint));
			Integer constraints_number = ctx.comma_constraint_constraintAt_k().getChildCount()/3;
			if(constraints_number > 0){
				for(Integer i = 0; i < constraints_number; i++){
					 ConstraintAtContext constraintAt = ctx.comma_constraint_constraintAt_k().constraintAt(i);
					 keys_list.add(makeListKeyPFC(constraintAt));
				}
			}
			
		}
		return null;
	}
	
	//DROP TABLES
	@Override
	public ArrayList<String> visitDrop_table(DBMSParser.Drop_tableContext ctx){
		//drop table ID END_SQL
		System.out.println("visitDrop_table");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		return null;
	}
	
	//SHOW TABLES
	@Override
	public ArrayList<String> visitShow_tables(DBMSParser.Show_tablesContext ctx){
		//show tables END_SQL
		System.out.println("visitShow_tables");
		ddl.showTables();
		return null;
	}
	
	//SHOW COLUMNS
	@Override
	public ArrayList<String> visitShow_columns(DBMSParser.Show_columnsContext ctx){
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
	public ArrayList<String> visitSql_dml(DBMSParser.Sql_dmlContext ctx){
		System.out.println("visitSql_dml");
		return visitChildren(ctx);
	}
	
	//INSERT
	@Override
	public ArrayList<String> visitInsert_value(DBMSParser.Insert_valueContext ctx){
		//insert into ID some_order values LPAREN literal comma_literal_k RPAREN END_SQL
		System.out.println("visitInsert_value");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		ArrayList<String> order_list = new ArrayList<String>();
		ArrayList<String> literal_list = new ArrayList<String>();
		if(ctx.getChild(3).getChildCount()>0){
			//( LPAREN ID comma_id_k  RPAREN )?
			order_list.add(ctx.some_order().ID().getText());
			System.out.println(order_list.get(0));
			Integer total_number_order = ctx.some_order().comma_id_k().getChildCount()/2;
			for(Integer i = 0; i < total_number_order; i++){
				order_list.add(ctx.some_order().comma_id_k().getChild((i*2)+1).getText());
				System.out.println(order_list.get(i+1));
			}
		}
		System.out.println(order_list);
		literal_list.add(ctx.getChild(6).getText());
		System.out.println(literal_list.get(0));
		if(ctx.getChild(7).getChildCount()>0){
			//MULTIPLE VALUES
			Integer total_number_literal = ctx.comma_literal_k().getChildCount()/2;
			for(Integer i = 0; i<total_number_literal; i++){
				literal_list.add(ctx.comma_literal_k().getChild((i*2)+1).getText());
				System.out.println(literal_list.get(i+1));
			}
		}
		System.out.println(literal_list);
		try {
			handleSemanticError(dml.insertInto(id, order_list, literal_list));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	//UPDATE
	@Override
	public ArrayList<String> visitUpdate_value(DBMSParser.Update_valueContext ctx){
		//update ID set ID EQ literal comma_id_eq_literal_k  where_exp END_SQL
		System.out.println("visitUpdate_value");
		String id = ctx.getChild(1).getText();
		tables_list = new ArrayList<String>();
		tables_list.add(id);
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
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
			System.out.println("WHERE EXPRESSION");
		}
		return null;
	}
	
	//DELETE
	@Override
	public ArrayList<String> visitDelete_value(DBMSParser.Delete_valueContext ctx){
		//delete from ID where_exp END_SQL
		System.out.println("visitDelete_value");
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		tables_list = new ArrayList<String>();
		String id = ctx.getChild(2).getText();
		tables_list.add(id);
		System.out.println(id);
		if(ctx.where_exp() != null){
			System.out.println("WHERE EXPRESSION");
		}
		return null;
	}
	
	//SELECT
	@Override
	public ArrayList<String> visitSelect_value(DBMSParser.Select_valueContext ctx){
		//select select_k_id from ID comma_id_k where_exp order_by END_SQL
		System.out.println("visitSelect_value");
		
		columns_list = new ArrayList<String>();
		tables_list = new ArrayList<String>();
		
		columnX = new ArrayList<String>();
		typeX = new ArrayList<String>();
		resultX = new ArrayList<ArrayList<String>>();
		resultX.add(new ArrayList<String>());
		resultX.add(new ArrayList<String>());
		
		tableX = new ArrayList<ArrayList<ArrayList<String>>>();
		
		ArrayList<String> order_by_id_list = new ArrayList<String>();
		ArrayList<Integer> order_by_ad_list = new ArrayList<Integer>();
		
		// * OR multiple columns
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

		//Table list
		tables_list.add(ctx.ID().getText());
		if(ctx.comma_id_k() != null){
			// (COMMA ID)*
			Integer total_number_tables = ctx.comma_id_k().getChildCount()/2;
			for(Integer i = 0; i < total_number_tables; i++){
				tables_list.add(ctx.comma_id_k().getChild((i*2)+1).getText());
				System.out.println(tables_list.get(i+1));
			}
		}
		
		//Load tables
		for(String table_name : tables_list){
			try {
				tableX.add(removeIndex(dml.tableToArraylist(table_name)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//Load info tables
		for(String table_name : tables_list){
			try {
				ArrayList<ArrayList<String>> info = dml.tableTypesAndNames(table_name);
				info.get(0).remove(0);
				info.get(1).remove(0);
				resultX.get(0).addAll(info.get(0)); //REMOVE INDEX
				resultX.get(1).addAll(info.get(1)); //REMOVE INDEX
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(ctx.where_exp().getChildCount() > 0){
			System.out.println("WHERE EXPRESSION");
			expX = ctx.where_exp().exp();
		}
		
		//PRODUCTO CRUZ y el resultado se almacena en resultX
		makeX(null, 0);

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
		//ORDENAR resultX
		return null;
	}
	
	public ArrayList<ArrayList<String>> removeIndex(ArrayList<ArrayList<String>> table){
		ArrayList<ArrayList<String>> table_no_index = new ArrayList<ArrayList<String>>();
		for(ArrayList<String> row : table){
			row.remove(0);
			table_no_index.add(row);
		}
		return table_no_index;
	}
	
	public void makeX(ArrayList<String> current_row, Integer current_table_index){
		ArrayList<ArrayList<String>> current_tableX = new ArrayList<ArrayList<String>>();
		if(current_table_index < tableX.size()){
			current_tableX.addAll(tableX.get(current_table_index));
			for (ArrayList<String> row : current_tableX){
				ArrayList<String> current_rowX = new ArrayList<String>();
				if(current_row != null){
						current_rowX.addAll(current_row);
				}
				current_rowX.addAll(row);
				makeX(current_rowX, current_table_index+1);
			}
		} else {
			if(expX != null){
				if(isExp(current_row)){
					resultX.add(current_row);
				}
			} else {
				resultX.add(current_row);
			}
		}
	}
	
	public boolean isExp(ArrayList<String> row){
		rowX = row;
		System.out.println(expX.getText());
		if(visit(expX) != null){
			return true;
		}
		return false;
	}
	
	public ArrayList<String> makeOr(ArrayList<String> row1, ArrayList<String> row2){
		if(row1 == null && row2 == null){
			return null;
		}
		return row1;
	}
	
	public ArrayList<String> makeAnd(ArrayList<String> row1, ArrayList<String> row2){
		if(row1 != null && row2 != null){
			return row1;
		}
		return null;
	}
	
	//Exp
	@Override
	public ArrayList<String> visitExp(DBMSParser.ExpContext ctx){
		//:   expression |   //epsilon
		if(ctx.expression() != null){
			return visitChildren(ctx);
		}
		return null;
	}
	
	@Override
	public ArrayList<String> visitExpression(DBMSParser.ExpressionContext ctx){
		/*expression 
    		:   andExpr
    		|   expression or andExpr*/
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			ArrayList<String> row1 = visit(ctx.expression());
			ArrayList<String> row2 = visit(ctx.andExpr());
			if(notExpression%2 != 0){
				return makeAnd(row1, row2);
			} else {
				return makeOr(row1, row2);
			}
		}
	}
	
	@Override
	public ArrayList<String> visitAndExpr(DBMSParser.AndExprContext ctx){
		/*andExpr
			: factor 
    		| andExpr and factor */
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			ArrayList<String> row1 = visit(ctx.andExpr());
			ArrayList<String> row2 = visit(ctx.factor());
			if(notExpression%2 != 0){
				return makeOr(row1, row2);
			} else {
				return makeAnd(row1, row2);
			}
		}
		
	}
	
	@Override
	public ArrayList<String> visitFactor(DBMSParser.FactorContext ctx){
		/*factor
    		: primaryExpr 
    		| not primaryExpr*/
		if(ctx.getChildCount() == 1){
			return visitChildren(ctx);
		} else {
			if(ctx.getChild(1).getChildCount() == 1){
				notCompareExpr = true;
				return visitChildren(ctx);
			} else {
				notExpression += 1;
				ArrayList<String> temp = visitChildren(ctx);
				notExpression -= 1;
				return temp;
			}
		}
	}
	
	@Override
	public ArrayList<String> visitPrimaryExpr(DBMSParser.PrimaryExprContext ctx){
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
	public ArrayList<String> visitCompareExpr(DBMSParser.CompareExprContext ctx){
		/*	compareExpr
				:	term rel_op term
		 */
		
		/*term
			:	ID
			|	literal
		 
		 */
		System.out.println(ctx.getText());
		String term1 = ctx.getChild(0).getText();
		String term1_type = "";
		if(ctx.term(0).ID() == null){
			term1_type = type(term1);
			if(term1_type.length() > 3 && term1_type.substring(0, 4).equals("char")){
				term1 = term1.substring(1, term1.length()-1);
				term1_type = type(term1);
			}
		} 
		
		String term2 = ctx.getChild(2).getText();
		String term2_type = "";
		if(ctx.term(1).ID() == null){
			term2_type = type(term2);
			if(term2_type.length() > 3 && term2_type.substring(0, 4).equals("char")){
				term2 = term2.substring(1, term2.length()-1);
				term2_type = type(term2);
			}
		}

		String rel_op = ctx.rel_op().getText();
		
		System.out.println(term1);
		System.out.println(term2);
		System.out.println(rel_op);
		
		//NOT 
		if(notCompareExpr && notExpression%2 != 0){
			notCompareExpr = false;
		} else if (notExpression%2 != 0){
			rel_op = notCompareRel(rel_op);
		} else if (notCompareExpr){
			rel_op = notCompareRel(rel_op);
			notCompareExpr = false;
		}
		
		if(term1_type.equals("") && term2_type.equals("")){
			//PRODUCTO CRUZ
		} else if(term1_type.equals("")){
			//System.out.println(term1);
			Integer index_current_column = resultX.get(0).indexOf(term1);
			String current_column_type = resultX.get(1).get(index_current_column);
			String current_column_value = rowX.get(index_current_column);
			if(relation(rel_op, current_column_value, term2, current_column_type, term2_type)){
				return rowX;
			}
		} else if(term2_type.equals("")){
			//System.out.println(term2);
			Integer index_current_column = resultX.get(1).indexOf(term2);
			String current_column_type = resultX.get(0).get(index_current_column);
			String current_column_value = rowX.get(index_current_column);
			if(relation(rel_op, term1, current_column_value, term1_type, current_column_type)){
				return rowX;
			}
		}
		return null;
	}
	
	public String notCompareRel(String rel_op){
		String new_rel_op = "";
		switch (rel_op){
		case "<":
			return ">=";
		case ">":
			return "<=";
		case "<=":
			return ">";
		case ">=":
			return "<";
		case "<>":
			return "=";
		case "=":
			return "<>";
		}
		return new_rel_op;
	}
	
	public boolean relation(String op, String item1, String item2, String type1, String type2){
		if(type1.equals(type2)){
			System.out.println("same type");
			if(type1.equals("int")){
				System.out.println("INT");
				switch (op) {
					case "<" :
						return Integer.parseInt(item1) < Integer.parseInt(item2);
					case ">" :
						return Integer.parseInt(item1) > Integer.parseInt(item2);
					case "<=" :
						return Integer.parseInt(item1) <= Integer.parseInt(item2);
					case ">=" :
						return Integer.parseInt(item1) >= Integer.parseInt(item2);
					case "=" :
						return Integer.parseInt(item1) == Integer.parseInt(item2);
					case "<>" :
						return Integer.parseInt(item1) != Integer.parseInt(item2);
				}
			} else if(type1.equals("float")){
				System.out.println("FLOAT");
				switch (op) {
					case "<" :
						return Float.parseFloat(item1) < Float.parseFloat(item2);
					case ">" :
						return Float.parseFloat(item1) > Float.parseFloat(item2);
					case "<=" :
						return Float.parseFloat(item1) <= Float.parseFloat(item2);
					case ">=" :
						return Float.parseFloat(item1) >= Float.parseFloat(item2);
					case "=" :
						return Float.parseFloat(item1) == Float.parseFloat(item2);
					case "<>" :
						return Float.parseFloat(item1) != Float.parseFloat(item2);
				}
			} else if(type1.equals("date")){
				List<String> date1 = Arrays.asList(item1.split("\\s*-\\s*"));
				List<String> date2 = Arrays.asList(item2.split("\\s*-\\s*"));
				int year1 = Integer.valueOf(date1.get(0));
				int year2 = Integer.valueOf(date2.get(0));
				int month1 = Integer.valueOf(date1.get(1));
				int month2 = Integer.valueOf(date2.get(1));
				int day1 = Integer.valueOf(date1.get(2));
				int day2 = Integer.valueOf(date2.get(2));
				switch(op){
					case "<":
						if ( year1 < year2 ){
							return true;
						}
						else if ( month1 < month2 ){
							return true; 
						}
						else if ( day1 < day2 ){
							return true;
						}
						else 
							return false;
					case ">":
						if ( year1 > year2 ){
							return true;
						}
						else if ( month1 > month2 ){
							return true; 
						}
						else if ( day1 > day2 ){
							return true;
						}
						else 
							return false;
					case "<=":
						if ( year1 <= year2 ){
							return true;
						}
						else if ( month1 <= month2 ){
							return true; 
						}
						else if ( day1 <= day2 ){
							return true;
						}
						else 
							return false;
					case ">=":
						if ( year1 >= year2 ){
							return true;
						}
						else if ( month1 >= month2 ){
							return true; 
						}
						else if ( day1 >= day2 ){
							return true;
						}
						else 
							return false;
					case "=":
						if ( ( year1 == year2 )
							&& ( month1 == month2)
							&& ( day1 == day2)
							)
							return true;
						else 
							return false; 
					case "<>":
						if(( year1 != year2 )
						   ||( month1 != month2 )
						   ||( day1 != day2 )
						  )
							return true;
						else
							return false; 
				}
			} else {
				//CHAR
				System.out.println("CHAR");
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
		} else if((type1.equals("float") && type2.equals("int")) || (type2.equals("float") && type1.equals("int"))){
			System.out.println("FLOAT or INT");
			switch (op) {
				case "<" :
					return Float.parseFloat(item1) < Float.parseFloat(item2);
				case ">" :
					return Float.parseFloat(item1) > Float.parseFloat(item2);
				case "<=" :
					return Float.parseFloat(item1) <= Float.parseFloat(item2);
				case ">=" :
					return Float.parseFloat(item1) >= Float.parseFloat(item2);
				case "=" :
					return Float.parseFloat(item1) == Float.parseFloat(item2);
				case "<>" :
					return Float.parseFloat(item1) != Float.parseFloat(item2);
			}
		} else if (type1.length() > 3 && type2.length() > 3 && type1.substring(0, 4).equals("char") && type2.substring(0, 4).equals("char")){
			System.out.println("CHAR");
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
		return false;
	}
	
	public String type(String literal){
		String type = "";
		if(dml.validateInt(literal)){
			type = "int";
		} else if (dml.validateFloat(literal)){
			type = "float";
		} else if (dml.validateDate(literal)){
			type = "date";
		} else {
			type = "char("+String.valueOf(literal.length())+")";
		}
		return type;
	}
	
	public void handleSemanticError(String message){
		errors.append("["+n+"]: "+message+"\n \n");
		n++;
	}
}
