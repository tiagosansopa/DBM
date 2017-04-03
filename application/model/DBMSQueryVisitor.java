package application.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import application.main;
import application.model.DBMSParser.ConstraintAtContext;
import application.model.DBmanagerDDL;
import application.model.DBmanagerDML;
import application.view.QueryGUIController;

public class DBMSQueryVisitor extends DBMSBaseVisitor <ArrayList<ArrayList<String>>> {
	public StringBuffer errors = new StringBuffer("\n Execution \n");
	//public StringBuffer outputText = new StringBuffer("");
	public Integer n = 0;
	public DBmanagerDDL ddl;
	public DBmanagerDML dml;
	public ArrayList<String> tables_list;
	public ArrayList<String> columns_list;
	public Integer notExpression;
	public boolean notCompareExpr;
	QueryGUIController control = null;
	
	public DBMSQueryVisitor (DBmanagerDDL ddl, DBmanagerDML dml){
		System.out.println("DBMSVisitor");
		this.ddl = ddl;
		this.dml = dml;
		//Hello Santiago Koch
		notExpression = 0;
		notCompareExpr = false;
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
		String create = ddl.createDatabase(id);
		if(!create.equals("")){
			handleSemanticError(create);
			return null;
		}
		handleSemanticError("Succesfully created database: "+id);
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
		String alter = ddl.alterDatabase(id_number_1, id_number_2);
		if(!alter.equals("")){
			handleSemanticError(alter);
			return null;
		}
		handleSemanticError("Succesfully altered database with new name: "
							+id_number_2);
		return null; //Errors :)
	}
	
	//DROP DATABASE
	@Override
	public ArrayList<ArrayList<String>> visitDrop_database(DBMSParser.Drop_databaseContext ctx){
		//drop database ID END_SQL
		System.out.println("visitDrop_database");
		String id = ctx.getChild(2).getText();
		int registers = 0;
		System.out.println(id);//FUNCTION SANTIAGO
		control.setDetails("Database: "+id+" with "+registers+" registers");
		boolean shouldWeDelete = control.handleDelete();
		String drop = "";
		System.out.println(shouldWeDelete);
		if(shouldWeDelete == true){
			drop = ddl.killDatabase(id);
		}
		else{
			drop = "Not deleted";
		}
		if (drop.equals("Not deleted")){
			handleSemanticError("Did not delete database: "+id);
			return null;
		}
		else if(!drop.equals("")){
			handleSemanticError(drop);
			return null;
		}
		handleSemanticError("Succesfully deleted database: "+id);
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
		String using = ddl.useDatabase(id);
		if(!using.equals("")){
			handleSemanticError(ddl.useDatabase(id));
			return null;
		}
		handleSemanticError("Using databse: "+id);
		handleSemanticError(dml.useDatabase(id));
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
					 key.exp = constraintAt.checks().exp().getText();
				 }
				 keys_list.add(key);
			}
		}
		String cTable = ddl.createTable(table_id, columns_list, types_list,keys_list);
		if (!cTable.equals("")){
			handleSemanticError(cTable);
			return null;
		}
		handleSemanticError("Succesfully created Table: "+table_id);
		return null;
	}

	//ALTER TABLE
	@Override
	public ArrayList<ArrayList<String>> visitAlter_table(DBMSParser.Alter_tableContext ctx){
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
	
	public ArrayList<ArrayList<String>> visitAction(DBMSParser.ActionContext ctx){
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
			String insertT = dml.insertInto(id, order_list, literal_list);
			if(!insertT.equals("")){
				handleSemanticError(insertT);
			}
			handleSemanticError("Succesfully inserted values");
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
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		if(ctx.where_exp() != null){
			System.out.println("WHERE EXPRESSION");
			result = visit(ctx.where_exp().exp());
			if(result == null){
				//AUN ASI TENEMOS QUE TRABAJAR AMBAS TABLAS :(
			}
		}
		return null;
	}
	
	//SELECT
	@Override
	public ArrayList<ArrayList<String>> visitSelect_value(DBMSParser.Select_valueContext ctx){
		//select select_k_id from ID comma_id_k where_exp order_by END_SQL
		System.out.println("visitSelect_value");
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
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
			result = visit(ctx.where_exp().exp());
			if(result == null || result.size() == 0){
				return null;
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
		if(columns_list.get(0).equals("*")){
			return result;
		} else {
			ArrayList<ArrayList<String>> temp_result = new ArrayList<ArrayList<String>>();
			ArrayList<String> current_columns_list = result.get(0);
			result.remove(0); //column list remove
			ArrayList<String> current_types_list = result.get(0);
			result.remove(0); //types remove
			temp_result.add(columns_list); //columns_name
			temp_result.add(rowByColumns(current_types_list, current_columns_list)); //types
			for(ArrayList<String> row : result){
				temp_result.add(rowByColumns(row, current_columns_list));
			}
			return temp_result;
		}
	}
	
	ArrayList<String> rowByColumns(ArrayList<String> row, ArrayList<String> current_columns_list){
		ArrayList<String> row_result = new ArrayList<String>();
		for(String column_name : columns_list){
			row_result.add(row.get(current_columns_list.indexOf(column_name)));
		}
		return row_result;
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
			ArrayList<ArrayList<String>> t2 = visit(ctx.andExpr());
			if(t1 == null){
				return null;
			}
			if(t2 == null){
				return null;
			}
			if(notExpression%2 != 0){
				return makeAnd(t1, t2);
			} else {
				return makeOr(t1, t2);
			}
		}
	}
	
	public ArrayList<ArrayList<String>> makeOr(ArrayList<ArrayList<String>> t1, ArrayList<ArrayList<String>> t2){
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		ArrayList<String> t1_info = t1.get(0);
		t1.remove(0);
		ArrayList<String> t1_type = t1.get(0);
		t1.remove(0);
		ArrayList<String> t2_info = t2.get(0);
		t2.remove(0);
		ArrayList<String> t2_type = t2.get(0);
		t2.remove(0);
		if(sameColumns(t1_info, t2_info)){
			if(t1.size() > t2.size()){
				for(ArrayList<String> row : t2){
					if(!t1.contains(row)){
						t1.add(row);
					}
				}
			result.add(t1_info);
			result.add(t1_type);
			result.addAll(t1);
			} else {
				for(ArrayList<String> row : t1){
					if(!t2.contains(row)){
						t2.add(row);
					}
				}
			result.add(t2_info);
			result.add(t2_type);
			result.addAll(t2);
			}
		} else {
			//PRODUCTO CARTESIANO
			System.out.println("Producto cartesiano OR");
			t1_info.addAll(t2_info);
			t1_type.addAll(t2_type);
			result.add(t1_info);
			result.add(t1_type);
			if(t1.size() > 0 && t2.size() > 0){
				for(ArrayList<String> row : t1){
					for(ArrayList<String> row2 : t2){
						ArrayList<String> temp = new ArrayList<String>();
						temp.addAll(row);
						temp.addAll(row2);
						result.add(temp);
					}
				}
			} else if(t1.size() > 0){
				result.addAll(t1);
			} else if(t2.size() > 0){
				result.addAll(t2);
			}
		}
		return result;
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
			if(notExpression%2 != 0){
				return makeOr(t1, t2);
			} else {
				return makeAnd(t1, t2);
			}
		}
		
	}
	
	public ArrayList<ArrayList<String>> makeAnd(ArrayList<ArrayList<String>> t1, ArrayList<ArrayList<String>> t2){
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		result.add(t1.get(0)); //names
		result.add(t1.get(1)); //types
		t1.remove(0);
		t1.remove(0);
		t2.remove(0);
		t2.remove(0);
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
	
	@Override
	public ArrayList<ArrayList<String>> visitFactor(DBMSParser.FactorContext ctx){
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
				ArrayList<ArrayList<String>> temp = visitChildren(ctx);
				notExpression -= 1;
				return temp;
			}
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
		ArrayList<ArrayList<String>> table1_info = new ArrayList<ArrayList<String>>();
		String literal1 = "";
		Integer index1 = 0;
		String type1 = "";
		ArrayList<ArrayList<String>> table2 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> table2_info = new ArrayList<ArrayList<String>>();
		String literal2 = "";
		Integer index2 = 0;
		String type2 = "";
		String rel_op = ctx.rel_op().getText();
		
		//NOT 
		if(notCompareExpr && notExpression%2 != 0){
			notCompareExpr = false;
		} else if (notExpression%2 != 0){
			rel_op = notCompareRel(rel_op);
		} else if (notCompareExpr){
			rel_op = notCompareRel(rel_op);
			notCompareExpr = false;
		}
		
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
		
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
					table1_info = current_table_info;
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
			type1 = type(literal1);
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
					table2_info = current_table_info;
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
			type2 = type(literal2);
			System.out.println("Tipo de columna "+type2);
		}
		
		if(literal1.equals("") && literal2.equals("")){
			System.out.println("Ambas son columnas.. producto cruz");
			//PRODUCTO CARTESIANO
			ArrayList<ArrayList<String>> temp_result = new ArrayList<ArrayList<String>>();
			Integer new_index = table1_info.get(0).size();
			table1_info.get(0).addAll(table2_info.get(0));
			table1_info.get(1).addAll(table2_info.get(1));
			result.add(table1_info.get(0));
			result.add(table1_info.get(1));
			for(ArrayList<String> row : table1){
				for(ArrayList<String> row2 : table2){
					ArrayList<String> temp = new ArrayList<String>();
					System.out.println(temp);
					temp.addAll(row);
					System.out.println(temp);
					temp.addAll(row2);
					System.out.println(temp);
					temp_result.add(temp);
					System.out.println(temp_result);
				}
			}
			for(ArrayList<String> row : temp_result){
				if(relation(rel_op, row.get(index1), row.get(index2+new_index), type1, type2)){
					result.add(row);
				}
			}
			return result;
		} else if(literal1.equals("")){
			//Tabla 2 tiene contenido
			System.out.println("Tabla 0 tiene contenido");
			result.addAll(table1_info);
			for(ArrayList<String> row : table1){
				System.out.println(row);
				if(relation(rel_op, row.get(index1), literal2, type1, type2)){
					//System.out.println("Relacion "+rel_op+" cumple con " + row.get(index1) + " y " + literal2);
					result.add(row);
				}
			}
			System.out.println("Return table 1");
			return result;
		} else if(literal2.equals("")){
			//Tabla 1 tiene contenido
			System.out.println("Tabla 1 tiene contenido");
			result.addAll(table2_info);
			for(ArrayList<String> row : table2){
				System.out.println(row);
				if(relation(rel_op, literal1, row.get(index2), type1, type2)){
					//System.out.println("Relacion "+rel_op+" cumple con " + literal1  + " y " + row.get(index2));
					result.add(row);
				}
			}
			System.out.println("Return table 2");
			return result;
		} else {
			System.out.println("ERROR, ambas son literales");
			return null;
		}
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
	
	public boolean sameColumns(ArrayList<String> r1, ArrayList<String> r2){
		if(r1.size() != r2.size()){
			return false;
		} else {
			for(String column : r1){
				if(!r2.contains(column)){
					return false;
				}
			}
			return true;
		}
	}
	
	public void handleSemanticError(String message){
		errors.append("["+n+"]: "+message+"\n \n");
		n++;
	}
	public void setController (QueryGUIController control){
		this.control = control;
	}
}
