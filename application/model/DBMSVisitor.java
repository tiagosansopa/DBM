package application.model;
// Generated from DBMS.g4 by ANTLR 4.5.3
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
	 * Visit a parse tree produced by {@link DBMSParser#intx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntx(DBMSParser.IntxContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#floatx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatx(DBMSParser.FloatxContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#datex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatex(DBMSParser.DatexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#charx}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharx(DBMSParser.CharxContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(DBMSParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(DBMSParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(DBMSParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(DBMSParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase(DBMSParser.DatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#databases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabases(DBMSParser.DatabasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(DBMSParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(DBMSParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(DBMSParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(DBMSParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(DBMSParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop(DBMSParser.DropContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter(DBMSParser.AlterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(DBMSParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#rename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename(DBMSParser.RenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(DBMSParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(DBMSParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(DBMSParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#foreign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign(DBMSParser.ForeignContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck(DBMSParser.CheckContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(DBMSParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(DBMSParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(DBMSParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#asc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc(DBMSParser.AscContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(DBMSParser.DescContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTo(DBMSParser.ToContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferences(DBMSParser.ReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(DBMSParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(DBMSParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto(DBMSParser.IntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(DBMSParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(DBMSParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(DBMSParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(DBMSParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(DBMSParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBy(DBMSParser.ByContext ctx);
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
	 * Visit a parse tree produced by {@link DBMSParser#comma_id_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_id_k(DBMSParser.Comma_id_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#comma_literal_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_literal_k(DBMSParser.Comma_literal_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#comma_id_eq_literal_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_id_eq_literal_k(DBMSParser.Comma_id_eq_literal_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#comma_action_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_action_k(DBMSParser.Comma_action_kContext ctx);
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
	 * Visit a parse tree produced by {@link DBMSParser#comma_id_type_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_id_type_k(DBMSParser.Comma_id_type_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#comma_constraint_constraintAt_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_constraint_constraintAt_k(DBMSParser.Comma_constraint_constraintAt_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(DBMSParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#constraintAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintAt(DBMSParser.ConstraintAtContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#primaryKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKey(DBMSParser.PrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#foreignKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKey(DBMSParser.ForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#checks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecks(DBMSParser.ChecksContext ctx);
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
	 * Visit a parse tree produced by {@link DBMSParser#some_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSome_order(DBMSParser.Some_orderContext ctx);
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
	 * Visit a parse tree produced by {@link DBMSParser#where_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_exp(DBMSParser.Where_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#order_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by(DBMSParser.Order_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#comma_id_ad_k}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma_id_ad_k(DBMSParser.Comma_id_ad_kContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#select_k_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_k_id(DBMSParser.Select_k_idContext ctx);
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
	 * Visit a parse tree produced by {@link DBMSParser#add_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_op(DBMSParser.Add_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#mult_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult_op(DBMSParser.Mult_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(DBMSParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(DBMSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(DBMSParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(DBMSParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#primaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(DBMSParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#compareExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(DBMSParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DBMSParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(DBMSParser.TermContext ctx);
}