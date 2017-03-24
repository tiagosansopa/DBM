package application.model;

public class DBMSQueryVisitor extends DBMSBaseVisitor<String> {
	public DBMSQueryVisitor (){
		System.out.println("DBMSVisitor");
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
	public String visitSelect_value(DBMSParser.Select_valueContext ctx){
		System.out.println("visitSelect_value");
		System.out.println(ctx.getText());
		return visitChildren(ctx);
	}

}
