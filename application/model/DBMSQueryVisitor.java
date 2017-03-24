package application.model;

public class DBMSQueryVisitor extends DBMSBaseVisitor<String> {
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
	
	
	
	//SELECT
	@Override
	public String visitSelect_value(DBMSParser.Select_valueContext ctx){
		System.out.println("visitSelect_value");
		System.out.println(ctx.getText());
		return visitChildren(ctx);
	}

}
