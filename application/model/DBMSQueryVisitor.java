package application.model;

import java.util.ArrayList;
import application.model.KeyPFC;
import application.model.DBMSParser.ConstraintAtContext;

public class DBMSQueryVisitor extends DBMSBaseVisitor<String> {
	public StringBuffer errors = new StringBuffer("\n Semantic Errors: \n");
	int n = 0;
	
	public DBMSQueryVisitor (){
		System.out.println("DBMSVisitor");
		//Hello Santiago Koch
	}
	
	@Override 
	public String visitSql(DBMSParser.SqlContext ctx) {
		System.out.println("visitSql");
		return visitChildren(ctx); 
	}
	
	@Override
	public String visitSql_executable(DBMSParser.Sql_executableContext ctx){
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
	public String visitSql_ddl(DBMSParser.Sql_ddlContext ctx){
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
	public String visitCreate_database(DBMSParser.Create_databaseContext ctx){
		//create database ID END_SQL
		System.out.println("visitCreate_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id); //Santiago function
		return "HEY"; //errors
	}
	
	//ALTER DATABASE
	@Override
	public String visitAlter_database(DBMSParser.Alter_databaseContext ctx){
		//alter database ID rename to ID END_SQL
		System.out.println("visitAlter_database");
		String id_number_1 = ctx.getChild(2).getText(); //arg 1
		String id_number_2 = ctx.getChild(5).getText(); //arg 2
		System.out.println("Bueno, id numero 1 es "+id_number_1+" y id numero 2 es "+id_number_2);
		return "HEY"; //Errors :)
	}
	
	//DROP DATABASE
	@Override
	public String visitDrop_database(DBMSParser.Drop_databaseContext ctx){
		//drop database ID END_SQL
		System.out.println("visitDrop_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id);//FUNCTION SANTIAGO
		return "HEY";
	}
	
	
	//SHOW DATABASE
	@Override
	public String visitShow_database(DBMSParser.Show_databaseContext ctx){
		//show databases END_SQL
		System.out.println("visitShow_database");
		return "HEY";
	}
	
	//USE DATABASE
	@Override
	public String visitUse_database(DBMSParser.Use_databaseContext ctx){
		//use database ID END_SQL
		System.out.println("visitUse_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		return "HEY";
	}
	
	//TABLE STATEMENT
	
	//CREATE TABLE
	@Override
	public String visitCreate_table(DBMSParser.Create_tableContext ctx){
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
				 } else {
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
		return "";
	}
	
	//TODO
	//ALTER TABLE
	@Override
	public String visitAlter_table(DBMSParser.Alter_tableContext ctx){
		//alter table ID rename to ID END_SQL
	    //|   alter table ID action comma_action_k END_SQL
		System.out.println("visitAlter_table");
		if(ctx.getChildCount()==7){
			String id_number_1 = ctx.getChild(2).getText();
			String id_number_2 = ctx.getChild(4).getText();
			System.out.println("Bueno, id numero 1 es "+id_number_1+" y id numero 2 es "+id_number_2);
		} else {
			
		}
		return "HEY";
	}
	
	public String visitAction(DBMSParser.ActionContext ctx){
		
		return "HEY";
	}

	//DROP TABLES
	public String visitDrop_table(DBMSParser.Drop_tableContext ctx){
		//drop table ID END_SQL
		System.out.println("visitDrop_table");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		return "HEY";
	}
	
	//SHOW TABLES
	public String visitShow_tables(DBMSParser.Show_tablesContext ctx){
		//show tables END_SQL
		System.out.println("visitShow_tables");
		return "HEY";
	}
	
	//SHOW COLUMNS
	public String visitiShow_columns(DBMSParser.Show_columnsContext ctx){
		//show columns from ID END_SQL
		System.out.println("visitShow_columns");
		String id = ctx.getChild(3).getText();
		System.out.println(id);
		return visitChildren(ctx);
	}
	
	//SQL DML
	
	@Override
	public String visitSql_dml(DBMSParser.Sql_dmlContext ctx){
		System.out.println("visitSql_dml");
		return visitChildren(ctx);
	}
	
	//INSERT
	@Override
	public String visitInsert_value(DBMSParser.Insert_valueContext ctx){
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
		return visitChildren(ctx);
	}
	
	//UPDATE
	@Override
	public String visitUpdate_value(DBMSParser.Update_valueContext ctx){
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
		return visitChildren(ctx);
	}
	
	
	//DELETE
	@Override
	public String visitDelete_value(DBMSParser.Delete_valueContext ctx){
		//delete from ID where_exp END_SQL
		System.out.println("visitDelete_value");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		if(ctx.where_exp() != null){
			System.out.println(ctx.where_exp().getText());
		}
		return visitChildren(ctx);
	}
	
	//SELECT
	@Override
	public String visitSelect_value(DBMSParser.Select_valueContext ctx){
		System.out.println("visitSelect_value");
		System.out.println(ctx.getText());
		return visitChildren(ctx);
	}
	
	public void handleSemanticError(String message){
		errors.append("["+n+"]: "+message+"\n \n");
		n++;
	}
}
