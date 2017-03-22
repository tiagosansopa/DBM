// Generated from DBMS.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DBMSParser}.
 */
public interface DBMSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DBMSParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(DBMSParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(DBMSParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#sql_executable}.
	 * @param ctx the parse tree
	 */
	void enterSql_executable(DBMSParser.Sql_executableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#sql_executable}.
	 * @param ctx the parse tree
	 */
	void exitSql_executable(DBMSParser.Sql_executableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#sql_ddl}.
	 * @param ctx the parse tree
	 */
	void enterSql_ddl(DBMSParser.Sql_ddlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#sql_ddl}.
	 * @param ctx the parse tree
	 */
	void exitSql_ddl(DBMSParser.Sql_ddlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#database_statement}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_statement(DBMSParser.Database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#database_statement}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_statement(DBMSParser.Database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#table_statement}.
	 * @param ctx the parse tree
	 */
	void enterTable_statement(DBMSParser.Table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#table_statement}.
	 * @param ctx the parse tree
	 */
	void exitTable_statement(DBMSParser.Table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(DBMSParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(DBMSParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(DBMSParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(DBMSParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(DBMSParser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(DBMSParser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#show_database}.
	 * @param ctx the parse tree
	 */
	void enterShow_database(DBMSParser.Show_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#show_database}.
	 * @param ctx the parse tree
	 */
	void exitShow_database(DBMSParser.Show_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#use_database}.
	 * @param ctx the parse tree
	 */
	void enterUse_database(DBMSParser.Use_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#use_database}.
	 * @param ctx the parse tree
	 */
	void exitUse_database(DBMSParser.Use_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(DBMSParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(DBMSParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(DBMSParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(DBMSParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(DBMSParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(DBMSParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DBMSParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DBMSParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(DBMSParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(DBMSParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(DBMSParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(DBMSParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#show_tables}.
	 * @param ctx the parse tree
	 */
	void enterShow_tables(DBMSParser.Show_tablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#show_tables}.
	 * @param ctx the parse tree
	 */
	void exitShow_tables(DBMSParser.Show_tablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#show_columns}.
	 * @param ctx the parse tree
	 */
	void enterShow_columns(DBMSParser.Show_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#show_columns}.
	 * @param ctx the parse tree
	 */
	void exitShow_columns(DBMSParser.Show_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(DBMSParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(DBMSParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#sql_dml}.
	 * @param ctx the parse tree
	 */
	void enterSql_dml(DBMSParser.Sql_dmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#sql_dml}.
	 * @param ctx the parse tree
	 */
	void exitSql_dml(DBMSParser.Sql_dmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_value(DBMSParser.Insert_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#insert_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_value(DBMSParser.Insert_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#update_value}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_value(DBMSParser.Update_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#update_value}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_value(DBMSParser.Update_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#delete_value}.
	 * @param ctx the parse tree
	 */
	void enterDelete_value(DBMSParser.Delete_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#delete_value}.
	 * @param ctx the parse tree
	 */
	void exitDelete_value(DBMSParser.Delete_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#select_value}.
	 * @param ctx the parse tree
	 */
	void enterSelect_value(DBMSParser.Select_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#select_value}.
	 * @param ctx the parse tree
	 */
	void exitSelect_value(DBMSParser.Select_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(DBMSParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(DBMSParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(DBMSParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(DBMSParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(DBMSParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(DBMSParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(DBMSParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(DBMSParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#add_op}.
	 * @param ctx the parse tree
	 */
	void enterAdd_op(DBMSParser.Add_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#add_op}.
	 * @param ctx the parse tree
	 */
	void exitAdd_op(DBMSParser.Add_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void enterMult_op(DBMSParser.Mult_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#mult_op}.
	 * @param ctx the parse tree
	 */
	void exitMult_op(DBMSParser.Mult_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(DBMSParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(DBMSParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(DBMSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(DBMSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(DBMSParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(DBMSParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(DBMSParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#eqExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(DBMSParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(DBMSParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#relationExpr}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(DBMSParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(DBMSParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(DBMSParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void enterUnifactor(DBMSParser.UnifactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#unifactor}.
	 * @param ctx the parse tree
	 */
	void exitUnifactor(DBMSParser.UnifactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(DBMSParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(DBMSParser.FactorContext ctx);
}