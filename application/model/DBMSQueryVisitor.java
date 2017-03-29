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
		System.out.println("visitCreate_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id); //Santiago function
		return "HEY"; //errors
	}
	
	//ALTER DATABASE
	@Override
	public String visitAlter_database(DBMSParser.Alter_databaseContext ctx){
		System.out.println("visitAlter_database");
		String id_number_1 = ctx.getChild(2).getText(); //arg 1
		String id_number_2 = ctx.getChild(5).getText(); //arg 2
		System.out.println("Bueno, id numero 1 es "+id_number_1+" y id numero 2 es "+id_number_2);
		return "HEY"; //Errors :)
	}
	
	//DROP DATABASE
	@Override
	public String visitDrop_database(DBMSParser.Drop_databaseContext ctx){
		System.out.println("visitDrop_database");
		String id = ctx.getChild(2).getText();
		System.out.println(id);//FUNCTION SANTIAGO
		return "HEY";
	}
	
	
	//SHOW DATABASE
	@Override
	public String visitShow_database(DBMSParser.Show_databaseContext ctx){
		System.out.println("visitShow_database");
		return "HEY";
	}
	
	//USE DATABASE
	@Override
	public String visitUse_database(DBMSParser.Use_databaseContext ctx){
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
		Integer constraints_number = ctx.comma_constraint_constraintAt_k().getChildCount()/3;
		if(constraints_number > 0){
			for(Integer i = 0; i < constraints_number; i++){
				 ConstraintAtContext constraintAt = ctx.comma_constraint_constraintAt_k().constraintAt(i);
				 if(constraintAt.primaryKey() != null){
					 System.out.println("PK");
					 //ID primary key LPAREN ID comma_id_k RPAREN ;
					 String id = constraintAt.primaryKey().getChild(0).getText();
					 System.out.println(id);
					 KeyPFC key = new KeyPFC(id, "pk");
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
					 KeyPFC key = new KeyPFC(id, "pk");
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
				 }
			}
		}
		return "Hey";
	}
	
	//TODO
	//ALTER TABLE
	@Override
	public String visitAlter_table(DBMSParser.Alter_tableContext ctx){
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
		
		return "";
	}

	//SHOW TABLES
	public String visitDrop_table(DBMSParser.Drop_tableContext ctx){
		System.out.println("visitDrop_table");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		return "HEY";
	}
	
	//SHOW TABLES
	public String visitShow_tables(DBMSParser.Show_tablesContext ctx){
		System.out.println("visitShow_tables");
		return "HEY";
	}
	
	//SHOW COLUMNS
	public String visitiShow_columns(DBMSParser.Show_columnsContext ctx){
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
		System.out.println("visitInsert_value");
		String id = ctx.getChild(2).getText();
		if(ctx.getChildCount()>9){
			//INSERT INTO id SOME_ORDER...
			
			
		} else {
			//INSERT INTO id VALUES ... <- SAME ORDER AS DEFINED
			if(ctx.getChildCount()==9){
				//MULTIPLE VALUES
				ArrayList<String> values_list = new ArrayList<String>();
				values_list.add(ctx.getChild(5).getText());
				System.out.println(values_list.get(0));
				Integer total_number_values = ctx.getChild(6).getChildCount()/2;
				for(int i = 0; i<total_number_values; i++){
					values_list.add(ctx.getChild(6).getChild(i*2+1).getText());
					System.out.println(values_list.get(1+i));
				}
			} else {
				//ONE VALUE
				String literal = ctx.getChild(5).getText();
				System.out.println(literal);
			}
		}
		return visitChildren(ctx);
	}
	
	//UPDATE
	@Override
	public String visitUpdate_value(DBMSParser.Update_valueContext ctx){
		System.out.println("visitUpdate_value");
		String id = ctx.getChild(1).getText();
		if(ctx.where() != null){
			//WHERE STATEMENT
			System.out.println("WHERE");
			if(ctx.getChildCount()>9){
				//MULTIPLE ID EQ LITERAL
				ArrayList<String> id_list = new ArrayList<String>();
				ArrayList<String> literal_list = new ArrayList<String>();
				id_list.add(ctx.getChild(3).getText());
				literal_list.add(ctx.getChild(5).getText());
				System.out.println(id_list.get(0));
				System.out.println(literal_list.get(0));
				Integer total_number_values = ctx.getChild(6).getChildCount()/4;
				for(Integer i = 0; i < total_number_values; i++){
					id_list.add(ctx.getChild(6).getChild(i*4+1).getText());
					literal_list.add(ctx.getChild(6).getChild(i*4+3).getText());
					System.out.println(id_list.get(i+1));
					System.out.println(literal_list.get(i+1));
				}
			} else {
				String id_eq = ctx.getChild(3).getText();
				String literal = ctx.getChild(5).getText();
				String exp = ctx.getChild(7).getText();
			}
		} else {
			//NO WHERE STATEMENT
			System.out.println("NO WHERE");
			if(ctx.getChildCount()>7){
				//MULTIPLE ID EQ LITERAL
				ArrayList<String> id_list = new ArrayList<String>();
				ArrayList<String> literal_list = new ArrayList<String>();
				id_list.add(ctx.getChild(3).getText());
				literal_list.add(ctx.getChild(5).getText());
				System.out.println(id_list.get(0));
				System.out.println(literal_list.get(0));
				Integer total_number_values = ctx.getChild(6).getChildCount()/4;
				for(Integer i = 0; i < total_number_values; i++){
					id_list.add(ctx.getChild(6).getChild(i*4+1).getText());
					literal_list.add(ctx.getChild(6).getChild(i*4+3).getText());
					System.out.println(id_list.get(i+1));
					System.out.println(literal_list.get(i+1));
				}
			} else {
				String id_eq = ctx.getChild(3).getText();
				String literal = ctx.getChild(5).getText();
				System.out.println(id_eq);
				System.out.println(literal);
			} 
		}
		return visitChildren(ctx);
	}
	
	
	//DELETE
	@Override
	public String visitDelete_value(DBMSParser.Delete_valueContext ctx){
		System.out.println("visitDelete_value");
		String id = ctx.getChild(2).getText();
		System.out.println(id);
		if(ctx.where() != null){
			//WHERE
			System.out.println("WHERE");
			String exp = ctx.getChild(4).getText();
			System.out.println(exp); //SE DEBE MEJORAR
		} else {
			//NO WHERE STATEMENT
			System.out.println("NO WHERE");
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
