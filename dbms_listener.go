// Generated from DBMS.g4 by ANTLR 4.6.

package parser // DBMS

import "github.com/antlr/antlr4/runtime/Go/antlr"

// DBMSListener is a complete listener for a parse tree produced by DBMSParser.
type DBMSListener interface {
	antlr.ParseTreeListener

	// EnterLiteral is called when entering the literal production.
	EnterLiteral(c *LiteralContext)

	// EnterFecha is called when entering the fecha production.
	EnterFecha(c *FechaContext)

	// EnterProgram is called when entering the program production.
	EnterProgram(c *ProgramContext)

	// EnterDatabase is called when entering the database production.
	EnterDatabase(c *DatabaseContext)

	// EnterCreateDatabase is called when entering the createDatabase production.
	EnterCreateDatabase(c *CreateDatabaseContext)

	// EnterAlterDatabase is called when entering the alterDatabase production.
	EnterAlterDatabase(c *AlterDatabaseContext)

	// EnterDropDatabase is called when entering the dropDatabase production.
	EnterDropDatabase(c *DropDatabaseContext)

	// EnterShowDatabase is called when entering the showDatabase production.
	EnterShowDatabase(c *ShowDatabaseContext)

	// EnterUseDatabase is called when entering the useDatabase production.
	EnterUseDatabase(c *UseDatabaseContext)

	// EnterOpTable is called when entering the opTable production.
	EnterOpTable(c *OpTableContext)

	// EnterTipo is called when entering the tipo production.
	EnterTipo(c *TipoContext)

	// EnterCreateTable is called when entering the createTable production.
	EnterCreateTable(c *CreateTableContext)

	// EnterConstraint is called when entering the constraint production.
	EnterConstraint(c *ConstraintContext)

	// EnterPrimaryKey is called when entering the primaryKey production.
	EnterPrimaryKey(c *PrimaryKeyContext)

	// EnterForeignKey is called when entering the foreignKey production.
	EnterForeignKey(c *ForeignKeyContext)

	// EnterCheck is called when entering the check production.
	EnterCheck(c *CheckContext)

	// EnterExp is called when entering the exp production.
	EnterExp(c *ExpContext)

	// EnterExpression is called when entering the expression production.
	EnterExpression(c *ExpressionContext)

	// EnterAndExpr is called when entering the andExpr production.
	EnterAndExpr(c *AndExprContext)

	// EnterEqExpr is called when entering the eqExpr production.
	EnterEqExpr(c *EqExprContext)

	// EnterRelationExpr is called when entering the relationExpr production.
	EnterRelationExpr(c *RelationExprContext)

	// EnterUnaryExpr is called when entering the unaryExpr production.
	EnterUnaryExpr(c *UnaryExprContext)

	// EnterAlterTable is called when entering the alterTable production.
	EnterAlterTable(c *AlterTableContext)

	// EnterAction is called when entering the action production.
	EnterAction(c *ActionContext)

	// EnterDropTable is called when entering the dropTable production.
	EnterDropTable(c *DropTableContext)

	// EnterShowTables is called when entering the showTables production.
	EnterShowTables(c *ShowTablesContext)

	// EnterShowColumns is called when entering the showColumns production.
	EnterShowColumns(c *ShowColumnsContext)

	// EnterInsertInto is called when entering the insertInto production.
	EnterInsertInto(c *InsertIntoContext)

	// EnterUpdateSet is called when entering the updateSet production.
	EnterUpdateSet(c *UpdateSetContext)

	// EnterDeleteFrom is called when entering the deleteFrom production.
	EnterDeleteFrom(c *DeleteFromContext)

	// EnterSelectFrom is called when entering the selectFrom production.
	EnterSelectFrom(c *SelectFromContext)

	// EnterSep is called when entering the sep production.
	EnterSep(c *SepContext)

	// EnterRel_op is called when entering the rel_op production.
	EnterRel_op(c *Rel_opContext)

	// EnterEq_op is called when entering the eq_op production.
	EnterEq_op(c *Eq_opContext)

	// EnterAdd_op is called when entering the add_op production.
	EnterAdd_op(c *Add_opContext)

	// EnterMult_op is called when entering the mult_op production.
	EnterMult_op(c *Mult_opContext)

	// ExitLiteral is called when exiting the literal production.
	ExitLiteral(c *LiteralContext)

	// ExitFecha is called when exiting the fecha production.
	ExitFecha(c *FechaContext)

	// ExitProgram is called when exiting the program production.
	ExitProgram(c *ProgramContext)

	// ExitDatabase is called when exiting the database production.
	ExitDatabase(c *DatabaseContext)

	// ExitCreateDatabase is called when exiting the createDatabase production.
	ExitCreateDatabase(c *CreateDatabaseContext)

	// ExitAlterDatabase is called when exiting the alterDatabase production.
	ExitAlterDatabase(c *AlterDatabaseContext)

	// ExitDropDatabase is called when exiting the dropDatabase production.
	ExitDropDatabase(c *DropDatabaseContext)

	// ExitShowDatabase is called when exiting the showDatabase production.
	ExitShowDatabase(c *ShowDatabaseContext)

	// ExitUseDatabase is called when exiting the useDatabase production.
	ExitUseDatabase(c *UseDatabaseContext)

	// ExitOpTable is called when exiting the opTable production.
	ExitOpTable(c *OpTableContext)

	// ExitTipo is called when exiting the tipo production.
	ExitTipo(c *TipoContext)

	// ExitCreateTable is called when exiting the createTable production.
	ExitCreateTable(c *CreateTableContext)

	// ExitConstraint is called when exiting the constraint production.
	ExitConstraint(c *ConstraintContext)

	// ExitPrimaryKey is called when exiting the primaryKey production.
	ExitPrimaryKey(c *PrimaryKeyContext)

	// ExitForeignKey is called when exiting the foreignKey production.
	ExitForeignKey(c *ForeignKeyContext)

	// ExitCheck is called when exiting the check production.
	ExitCheck(c *CheckContext)

	// ExitExp is called when exiting the exp production.
	ExitExp(c *ExpContext)

	// ExitExpression is called when exiting the expression production.
	ExitExpression(c *ExpressionContext)

	// ExitAndExpr is called when exiting the andExpr production.
	ExitAndExpr(c *AndExprContext)

	// ExitEqExpr is called when exiting the eqExpr production.
	ExitEqExpr(c *EqExprContext)

	// ExitRelationExpr is called when exiting the relationExpr production.
	ExitRelationExpr(c *RelationExprContext)

	// ExitUnaryExpr is called when exiting the unaryExpr production.
	ExitUnaryExpr(c *UnaryExprContext)

	// ExitAlterTable is called when exiting the alterTable production.
	ExitAlterTable(c *AlterTableContext)

	// ExitAction is called when exiting the action production.
	ExitAction(c *ActionContext)

	// ExitDropTable is called when exiting the dropTable production.
	ExitDropTable(c *DropTableContext)

	// ExitShowTables is called when exiting the showTables production.
	ExitShowTables(c *ShowTablesContext)

	// ExitShowColumns is called when exiting the showColumns production.
	ExitShowColumns(c *ShowColumnsContext)

	// ExitInsertInto is called when exiting the insertInto production.
	ExitInsertInto(c *InsertIntoContext)

	// ExitUpdateSet is called when exiting the updateSet production.
	ExitUpdateSet(c *UpdateSetContext)

	// ExitDeleteFrom is called when exiting the deleteFrom production.
	ExitDeleteFrom(c *DeleteFromContext)

	// ExitSelectFrom is called when exiting the selectFrom production.
	ExitSelectFrom(c *SelectFromContext)

	// ExitSep is called when exiting the sep production.
	ExitSep(c *SepContext)

	// ExitRel_op is called when exiting the rel_op production.
	ExitRel_op(c *Rel_opContext)

	// ExitEq_op is called when exiting the eq_op production.
	ExitEq_op(c *Eq_opContext)

	// ExitAdd_op is called when exiting the add_op production.
	ExitAdd_op(c *Add_opContext)

	// ExitMult_op is called when exiting the mult_op production.
	ExitMult_op(c *Mult_opContext)
}
