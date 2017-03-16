// Generated from DBMS.g4 by ANTLR 4.6.

package parser // DBMS

import "github.com/antlr/antlr4/runtime/Go/antlr"

// A complete Visitor for a parse tree produced by DBMSParser.
type DBMSVisitor interface {
	antlr.ParseTreeVisitor

	// Visit a parse tree produced by DBMSParser#literal.
	VisitLiteral(ctx *LiteralContext) interface{}

	// Visit a parse tree produced by DBMSParser#fecha.
	VisitFecha(ctx *FechaContext) interface{}

	// Visit a parse tree produced by DBMSParser#program.
	VisitProgram(ctx *ProgramContext) interface{}

	// Visit a parse tree produced by DBMSParser#database.
	VisitDatabase(ctx *DatabaseContext) interface{}

	// Visit a parse tree produced by DBMSParser#createDatabase.
	VisitCreateDatabase(ctx *CreateDatabaseContext) interface{}

	// Visit a parse tree produced by DBMSParser#alterDatabase.
	VisitAlterDatabase(ctx *AlterDatabaseContext) interface{}

	// Visit a parse tree produced by DBMSParser#dropDatabase.
	VisitDropDatabase(ctx *DropDatabaseContext) interface{}

	// Visit a parse tree produced by DBMSParser#showDatabase.
	VisitShowDatabase(ctx *ShowDatabaseContext) interface{}

	// Visit a parse tree produced by DBMSParser#useDatabase.
	VisitUseDatabase(ctx *UseDatabaseContext) interface{}

	// Visit a parse tree produced by DBMSParser#opTable.
	VisitOpTable(ctx *OpTableContext) interface{}

	// Visit a parse tree produced by DBMSParser#tipo.
	VisitTipo(ctx *TipoContext) interface{}

	// Visit a parse tree produced by DBMSParser#createTable.
	VisitCreateTable(ctx *CreateTableContext) interface{}

	// Visit a parse tree produced by DBMSParser#constraint.
	VisitConstraint(ctx *ConstraintContext) interface{}

	// Visit a parse tree produced by DBMSParser#primaryKey.
	VisitPrimaryKey(ctx *PrimaryKeyContext) interface{}

	// Visit a parse tree produced by DBMSParser#foreignKey.
	VisitForeignKey(ctx *ForeignKeyContext) interface{}

	// Visit a parse tree produced by DBMSParser#check.
	VisitCheck(ctx *CheckContext) interface{}

	// Visit a parse tree produced by DBMSParser#exp.
	VisitExp(ctx *ExpContext) interface{}

	// Visit a parse tree produced by DBMSParser#expression.
	VisitExpression(ctx *ExpressionContext) interface{}

	// Visit a parse tree produced by DBMSParser#andExpr.
	VisitAndExpr(ctx *AndExprContext) interface{}

	// Visit a parse tree produced by DBMSParser#eqExpr.
	VisitEqExpr(ctx *EqExprContext) interface{}

	// Visit a parse tree produced by DBMSParser#relationExpr.
	VisitRelationExpr(ctx *RelationExprContext) interface{}

	// Visit a parse tree produced by DBMSParser#unaryExpr.
	VisitUnaryExpr(ctx *UnaryExprContext) interface{}

	// Visit a parse tree produced by DBMSParser#alterTable.
	VisitAlterTable(ctx *AlterTableContext) interface{}

	// Visit a parse tree produced by DBMSParser#action.
	VisitAction(ctx *ActionContext) interface{}

	// Visit a parse tree produced by DBMSParser#dropTable.
	VisitDropTable(ctx *DropTableContext) interface{}

	// Visit a parse tree produced by DBMSParser#showTables.
	VisitShowTables(ctx *ShowTablesContext) interface{}

	// Visit a parse tree produced by DBMSParser#showColumns.
	VisitShowColumns(ctx *ShowColumnsContext) interface{}

	// Visit a parse tree produced by DBMSParser#insertInto.
	VisitInsertInto(ctx *InsertIntoContext) interface{}

	// Visit a parse tree produced by DBMSParser#updateSet.
	VisitUpdateSet(ctx *UpdateSetContext) interface{}

	// Visit a parse tree produced by DBMSParser#deleteFrom.
	VisitDeleteFrom(ctx *DeleteFromContext) interface{}

	// Visit a parse tree produced by DBMSParser#selectFrom.
	VisitSelectFrom(ctx *SelectFromContext) interface{}

	// Visit a parse tree produced by DBMSParser#sep.
	VisitSep(ctx *SepContext) interface{}

	// Visit a parse tree produced by DBMSParser#rel_op.
	VisitRel_op(ctx *Rel_opContext) interface{}

	// Visit a parse tree produced by DBMSParser#eq_op.
	VisitEq_op(ctx *Eq_opContext) interface{}

	// Visit a parse tree produced by DBMSParser#add_op.
	VisitAdd_op(ctx *Add_opContext) interface{}

	// Visit a parse tree produced by DBMSParser#mult_op.
	VisitMult_op(ctx *Mult_opContext) interface{}
}
