// Generated from DBMS.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DBMSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DBMSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DBMSParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(DBMSParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#sql_executable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_executable(DBMSParser.Sql_executableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#sql_ddl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_ddl(DBMSParser.Sql_ddlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_statement(DBMSParser.Database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_statement(DBMSParser.Table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(DBMSParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(DBMSParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#drop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database(DBMSParser.Drop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#show_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_database(DBMSParser.Show_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#use_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_database(DBMSParser.Use_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(DBMSParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DBMSParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(DBMSParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DBMSParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(DBMSParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(DBMSParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#show_tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_tables(DBMSParser.Show_tablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#show_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_columns(DBMSParser.Show_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(DBMSParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#sql_dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_dml(DBMSParser.Sql_dmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#insert_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_value(DBMSParser.Insert_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#update_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_value(DBMSParser.Update_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#delete_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_value(DBMSParser.Delete_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#select_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_value(DBMSParser.Select_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(DBMSParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(DBMSParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(DBMSParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DBMSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr1(DBMSParser.Expr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr2(DBMSParser.Expr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#unifactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnifactor(DBMSParser.UnifactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DBMSParser.FactorContext ctx);
}