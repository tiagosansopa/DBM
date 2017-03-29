package application.model;
// Generated from DBMS.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DBMSParser}.
 */
public interface DBMSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DBMSParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(DBMSParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(DBMSParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#or}.
	 * @param ctx the parse tree
	 */
	void enterOr(DBMSParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#or}.
	 * @param ctx the parse tree
	 */
	void exitOr(DBMSParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(DBMSParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(DBMSParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(DBMSParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(DBMSParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#database}.
	 * @param ctx the parse tree
	 */
	void enterDatabase(DBMSParser.DatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#database}.
	 * @param ctx the parse tree
	 */
	void exitDatabase(DBMSParser.DatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#databases}.
	 * @param ctx the parse tree
	 */
	void enterDatabases(DBMSParser.DatabasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#databases}.
	 * @param ctx the parse tree
	 */
	void exitDatabases(DBMSParser.DatabasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(DBMSParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(DBMSParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(DBMSParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(DBMSParser.TablesContext ctx);
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
	 * Enter a parse tree produced by {@link DBMSParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(DBMSParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(DBMSParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(DBMSParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(DBMSParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#drop}.
	 * @param ctx the parse tree
	 */
	void enterDrop(DBMSParser.DropContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#drop}.
	 * @param ctx the parse tree
	 */
	void exitDrop(DBMSParser.DropContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#alter}.
	 * @param ctx the parse tree
	 */
	void enterAlter(DBMSParser.AlterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#alter}.
	 * @param ctx the parse tree
	 */
	void exitAlter(DBMSParser.AlterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(DBMSParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(DBMSParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#rename}.
	 * @param ctx the parse tree
	 */
	void enterRename(DBMSParser.RenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#rename}.
	 * @param ctx the parse tree
	 */
	void exitRename(DBMSParser.RenameContext ctx);
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
	 * Enter a parse tree produced by {@link DBMSParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(DBMSParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(DBMSParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(DBMSParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(DBMSParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#foreign}.
	 * @param ctx the parse tree
	 */
	void enterForeign(DBMSParser.ForeignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#foreign}.
	 * @param ctx the parse tree
	 */
	void exitForeign(DBMSParser.ForeignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(DBMSParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(DBMSParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(DBMSParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(DBMSParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(DBMSParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(DBMSParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(DBMSParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(DBMSParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#asc}.
	 * @param ctx the parse tree
	 */
	void enterAsc(DBMSParser.AscContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#asc}.
	 * @param ctx the parse tree
	 */
	void exitAsc(DBMSParser.AscContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(DBMSParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(DBMSParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#to}.
	 * @param ctx the parse tree
	 */
	void enterTo(DBMSParser.ToContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#to}.
	 * @param ctx the parse tree
	 */
	void exitTo(DBMSParser.ToContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#references}.
	 * @param ctx the parse tree
	 */
	void enterReferences(DBMSParser.ReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#references}.
	 * @param ctx the parse tree
	 */
	void exitReferences(DBMSParser.ReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(DBMSParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(DBMSParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(DBMSParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(DBMSParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#into}.
	 * @param ctx the parse tree
	 */
	void enterInto(DBMSParser.IntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#into}.
	 * @param ctx the parse tree
	 */
	void exitInto(DBMSParser.IntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(DBMSParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(DBMSParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(DBMSParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(DBMSParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(DBMSParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(DBMSParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(DBMSParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(DBMSParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(DBMSParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(DBMSParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#by}.
	 * @param ctx the parse tree
	 */
	void enterBy(DBMSParser.ByContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#by}.
	 * @param ctx the parse tree
	 */
	void exitBy(DBMSParser.ByContext ctx);
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
	 * Enter a parse tree produced by {@link DBMSParser#comma_id_k}.
	 * @param ctx the parse tree
	 */
	void enterComma_id_k(DBMSParser.Comma_id_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#comma_id_k}.
	 * @param ctx the parse tree
	 */
	void exitComma_id_k(DBMSParser.Comma_id_kContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#comma_literal_k}.
	 * @param ctx the parse tree
	 */
	void enterComma_literal_k(DBMSParser.Comma_literal_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#comma_literal_k}.
	 * @param ctx the parse tree
	 */
	void exitComma_literal_k(DBMSParser.Comma_literal_kContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#comma_id_eq_literal_k}.
	 * @param ctx the parse tree
	 */
	void enterComma_id_eq_literal_k(DBMSParser.Comma_id_eq_literal_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#comma_id_eq_literal_k}.
	 * @param ctx the parse tree
	 */
	void exitComma_id_eq_literal_k(DBMSParser.Comma_id_eq_literal_kContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#comma_action_k}.
	 * @param ctx the parse tree
	 */
	void enterComma_action_k(DBMSParser.Comma_action_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#comma_action_k}.
	 * @param ctx the parse tree
	 */
	void exitComma_action_k(DBMSParser.Comma_action_kContext ctx);
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
	 * Enter a parse tree produced by {@link DBMSParser#comma_id_type_k}.
	 * @param ctx the parse tree
	 */
	void enterComma_id_type_k(DBMSParser.Comma_id_type_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#comma_id_type_k}.
	 * @param ctx the parse tree
	 */
	void exitComma_id_type_k(DBMSParser.Comma_id_type_kContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#comma_constraint_constraintAt_k}.
	 * @param ctx the parse tree
	 */
	void enterComma_constraint_constraintAt_k(DBMSParser.Comma_constraint_constraintAt_kContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#comma_constraint_constraintAt_k}.
	 * @param ctx the parse tree
	 */
	void exitComma_constraint_constraintAt_k(DBMSParser.Comma_constraint_constraintAt_kContext ctx);
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
	 * Enter a parse tree produced by {@link DBMSParser#constraintAt}.
	 * @param ctx the parse tree
	 */
	void enterConstraintAt(DBMSParser.ConstraintAtContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#constraintAt}.
	 * @param ctx the parse tree
	 */
	void exitConstraintAt(DBMSParser.ConstraintAtContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKey(DBMSParser.PrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#primaryKey}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKey(DBMSParser.PrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#foreignKey}.
	 * @param ctx the parse tree
	 */
	void enterForeignKey(DBMSParser.ForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#foreignKey}.
	 * @param ctx the parse tree
	 */
	void exitForeignKey(DBMSParser.ForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DBMSParser#checks}.
	 * @param ctx the parse tree
	 */
	void enterChecks(DBMSParser.ChecksContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#checks}.
	 * @param ctx the parse tree
	 */
	void exitChecks(DBMSParser.ChecksContext ctx);
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
	 * Enter a parse tree produced by {@link DBMSParser#some_order}.
	 * @param ctx the parse tree
	 */
	void enterSome_order(DBMSParser.Some_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#some_order}.
	 * @param ctx the parse tree
	 */
	void exitSome_order(DBMSParser.Some_orderContext ctx);
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
	 * Enter a parse tree produced by {@link DBMSParser#where_exp}.
	 * @param ctx the parse tree
	 */
	void enterWhere_exp(DBMSParser.Where_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link DBMSParser#where_exp}.
	 * @param ctx the parse tree
	 */
	void exitWhere_exp(DBMSParser.Where_expContext ctx);
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