package application.model;

import java.util.ArrayList;

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
		String id = ctx.getChild(2).getText();
		System.out.println(id);//FUNCTION SANTIAGO
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
	
	public String visitCreate_Table(DBMSParser.Create_tableContext ctx){
		
		
		return "";
	}
	//ALTER TABLE
	@Override
	
	/**
	 * TODO: THIS NEEDS TO BE MODIFIED I think.  
	 */
	public String visitAlter_table(DBMSParser.Alter_tableContext ctx){
		System.out.println("visitAlter_table");
		if(ctx.getChildCount()==7){
			String id_number_1 = ctx.getChild(2).getText(); //arg 1
			String id_number_2 = ctx.getChild(5).getText(); //arg 2
			System.out.println(
					"Bueno, id numero 1 es "
					+id_number_1+" "
					+ "y id numero 2(a cambiar es es "
					+id_number_2);
		} else {
			String id = ctx.getChild(2).getText();
			System.out.println("id : "+id);
		}
		return "HEY";
	}
	
	public String visitAction(DBMSParser.ActionContext ctx){
		
		return "";
	}

	//SHOW TABLES
	public String visitShow_tables(DBMSParser.Show_tablesContext ctx){
		System.out.println("visitShow_tables");
		return "HEY";
	}
	
	//SHOW COLUMNS
	public String visitiShow_columns(DBMSParser.Show_columnsContext ctx){
		System.out.println("visitShow_columns");
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
		if(ctx.getChildCount()==9){
			//WHERE STATEMENT
		} else {
			//NO WHERE STATEMENT
			if(ctx.getChildCount()==8){
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
			} 
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
