// Generated from DBMS.g4 by ANTLR 4.6.

package parser // DBMS

import "github.com/antlr/antlr4/runtime/Go/antlr"

// BaseDBMSListener is a complete listener for a parse tree produced by DBMSParser.
type BaseDBMSListener struct{}

var _ DBMSListener = &BaseDBMSListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseDBMSListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseDBMSListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseDBMSListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseDBMSListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterLiteral is called when production literal is entered.
func (s *BaseDBMSListener) EnterLiteral(ctx *LiteralContext) {}

// ExitLiteral is called when production literal is exited.
func (s *BaseDBMSListener) ExitLiteral(ctx *LiteralContext) {}

// EnterFecha is called when production fecha is entered.
func (s *BaseDBMSListener) EnterFecha(ctx *FechaContext) {}

// ExitFecha is called when production fecha is exited.
func (s *BaseDBMSListener) ExitFecha(ctx *FechaContext) {}

// EnterProgram is called when production program is entered.
func (s *BaseDBMSListener) EnterProgram(ctx *ProgramContext) {}

// ExitProgram is called when production program is exited.
func (s *BaseDBMSListener) ExitProgram(ctx *ProgramContext) {}

// EnterDatabase is called when production database is entered.
func (s *BaseDBMSListener) EnterDatabase(ctx *DatabaseContext) {}

// ExitDatabase is called when production database is exited.
func (s *BaseDBMSListener) ExitDatabase(ctx *DatabaseContext) {}

// EnterCreateDatabase is called when production createDatabase is entered.
func (s *BaseDBMSListener) EnterCreateDatabase(ctx *CreateDatabaseContext) {}

// ExitCreateDatabase is called when production createDatabase is exited.
func (s *BaseDBMSListener) ExitCreateDatabase(ctx *CreateDatabaseContext) {}

// EnterAlterDatabase is called when production alterDatabase is entered.
func (s *BaseDBMSListener) EnterAlterDatabase(ctx *AlterDatabaseContext) {}

// ExitAlterDatabase is called when production alterDatabase is exited.
func (s *BaseDBMSListener) ExitAlterDatabase(ctx *AlterDatabaseContext) {}

// EnterDropDatabase is called when production dropDatabase is entered.
func (s *BaseDBMSListener) EnterDropDatabase(ctx *DropDatabaseContext) {}

// ExitDropDatabase is called when production dropDatabase is exited.
func (s *BaseDBMSListener) ExitDropDatabase(ctx *DropDatabaseContext) {}

// EnterShowDatabase is called when production showDatabase is entered.
func (s *BaseDBMSListener) EnterShowDatabase(ctx *ShowDatabaseContext) {}

// ExitShowDatabase is called when production showDatabase is exited.
func (s *BaseDBMSListener) ExitShowDatabase(ctx *ShowDatabaseContext) {}

// EnterUseDatabase is called when production useDatabase is entered.
func (s *BaseDBMSListener) EnterUseDatabase(ctx *UseDatabaseContext) {}

// ExitUseDatabase is called when production useDatabase is exited.
func (s *BaseDBMSListener) ExitUseDatabase(ctx *UseDatabaseContext) {}

// EnterOpTable is called when production opTable is entered.
func (s *BaseDBMSListener) EnterOpTable(ctx *OpTableContext) {}

// ExitOpTable is called when production opTable is exited.
func (s *BaseDBMSListener) ExitOpTable(ctx *OpTableContext) {}

// EnterTipo is called when production tipo is entered.
func (s *BaseDBMSListener) EnterTipo(ctx *TipoContext) {}

// ExitTipo is called when production tipo is exited.
func (s *BaseDBMSListener) ExitTipo(ctx *TipoContext) {}

// EnterCreateTable is called when production createTable is entered.
func (s *BaseDBMSListener) EnterCreateTable(ctx *CreateTableContext) {}

// ExitCreateTable is called when production createTable is exited.
func (s *BaseDBMSListener) ExitCreateTable(ctx *CreateTableContext) {}

// EnterConstraint is called when production constraint is entered.
func (s *BaseDBMSListener) EnterConstraint(ctx *ConstraintContext) {}

// ExitConstraint is called when production constraint is exited.
func (s *BaseDBMSListener) ExitConstraint(ctx *ConstraintContext) {}

// EnterPrimaryKey is called when production primaryKey is entered.
func (s *BaseDBMSListener) EnterPrimaryKey(ctx *PrimaryKeyContext) {}

// ExitPrimaryKey is called when production primaryKey is exited.
func (s *BaseDBMSListener) ExitPrimaryKey(ctx *PrimaryKeyContext) {}

// EnterForeignKey is called when production foreignKey is entered.
func (s *BaseDBMSListener) EnterForeignKey(ctx *ForeignKeyContext) {}

// ExitForeignKey is called when production foreignKey is exited.
func (s *BaseDBMSListener) ExitForeignKey(ctx *ForeignKeyContext) {}

// EnterCheck is called when production check is entered.
func (s *BaseDBMSListener) EnterCheck(ctx *CheckContext) {}

// ExitCheck is called when production check is exited.
func (s *BaseDBMSListener) ExitCheck(ctx *CheckContext) {}

// EnterExp is called when production exp is entered.
func (s *BaseDBMSListener) EnterExp(ctx *ExpContext) {}

// ExitExp is called when production exp is exited.
func (s *BaseDBMSListener) ExitExp(ctx *ExpContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseDBMSListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseDBMSListener) ExitExpression(ctx *ExpressionContext) {}

// EnterAndExpr is called when production andExpr is entered.
func (s *BaseDBMSListener) EnterAndExpr(ctx *AndExprContext) {}

// ExitAndExpr is called when production andExpr is exited.
func (s *BaseDBMSListener) ExitAndExpr(ctx *AndExprContext) {}

// EnterEqExpr is called when production eqExpr is entered.
func (s *BaseDBMSListener) EnterEqExpr(ctx *EqExprContext) {}

// ExitEqExpr is called when production eqExpr is exited.
func (s *BaseDBMSListener) ExitEqExpr(ctx *EqExprContext) {}

// EnterRelationExpr is called when production relationExpr is entered.
func (s *BaseDBMSListener) EnterRelationExpr(ctx *RelationExprContext) {}

// ExitRelationExpr is called when production relationExpr is exited.
func (s *BaseDBMSListener) ExitRelationExpr(ctx *RelationExprContext) {}

// EnterUnaryExpr is called when production unaryExpr is entered.
func (s *BaseDBMSListener) EnterUnaryExpr(ctx *UnaryExprContext) {}

// ExitUnaryExpr is called when production unaryExpr is exited.
func (s *BaseDBMSListener) ExitUnaryExpr(ctx *UnaryExprContext) {}

// EnterAlterTable is called when production alterTable is entered.
func (s *BaseDBMSListener) EnterAlterTable(ctx *AlterTableContext) {}

// ExitAlterTable is called when production alterTable is exited.
func (s *BaseDBMSListener) ExitAlterTable(ctx *AlterTableContext) {}

// EnterAction is called when production action is entered.
func (s *BaseDBMSListener) EnterAction(ctx *ActionContext) {}

// ExitAction is called when production action is exited.
func (s *BaseDBMSListener) ExitAction(ctx *ActionContext) {}

// EnterDropTable is called when production dropTable is entered.
func (s *BaseDBMSListener) EnterDropTable(ctx *DropTableContext) {}

// ExitDropTable is called when production dropTable is exited.
func (s *BaseDBMSListener) ExitDropTable(ctx *DropTableContext) {}

// EnterShowTables is called when production showTables is entered.
func (s *BaseDBMSListener) EnterShowTables(ctx *ShowTablesContext) {}

// ExitShowTables is called when production showTables is exited.
func (s *BaseDBMSListener) ExitShowTables(ctx *ShowTablesContext) {}

// EnterShowColumns is called when production showColumns is entered.
func (s *BaseDBMSListener) EnterShowColumns(ctx *ShowColumnsContext) {}

// ExitShowColumns is called when production showColumns is exited.
func (s *BaseDBMSListener) ExitShowColumns(ctx *ShowColumnsContext) {}

// EnterInsertInto is called when production insertInto is entered.
func (s *BaseDBMSListener) EnterInsertInto(ctx *InsertIntoContext) {}

// ExitInsertInto is called when production insertInto is exited.
func (s *BaseDBMSListener) ExitInsertInto(ctx *InsertIntoContext) {}

// EnterUpdateSet is called when production updateSet is entered.
func (s *BaseDBMSListener) EnterUpdateSet(ctx *UpdateSetContext) {}

// ExitUpdateSet is called when production updateSet is exited.
func (s *BaseDBMSListener) ExitUpdateSet(ctx *UpdateSetContext) {}

// EnterDeleteFrom is called when production deleteFrom is entered.
func (s *BaseDBMSListener) EnterDeleteFrom(ctx *DeleteFromContext) {}

// ExitDeleteFrom is called when production deleteFrom is exited.
func (s *BaseDBMSListener) ExitDeleteFrom(ctx *DeleteFromContext) {}

// EnterSelectFrom is called when production selectFrom is entered.
func (s *BaseDBMSListener) EnterSelectFrom(ctx *SelectFromContext) {}

// ExitSelectFrom is called when production selectFrom is exited.
func (s *BaseDBMSListener) ExitSelectFrom(ctx *SelectFromContext) {}

// EnterSep is called when production sep is entered.
func (s *BaseDBMSListener) EnterSep(ctx *SepContext) {}

// ExitSep is called when production sep is exited.
func (s *BaseDBMSListener) ExitSep(ctx *SepContext) {}

// EnterRel_op is called when production rel_op is entered.
func (s *BaseDBMSListener) EnterRel_op(ctx *Rel_opContext) {}

// ExitRel_op is called when production rel_op is exited.
func (s *BaseDBMSListener) ExitRel_op(ctx *Rel_opContext) {}

// EnterEq_op is called when production eq_op is entered.
func (s *BaseDBMSListener) EnterEq_op(ctx *Eq_opContext) {}

// ExitEq_op is called when production eq_op is exited.
func (s *BaseDBMSListener) ExitEq_op(ctx *Eq_opContext) {}

// EnterAdd_op is called when production add_op is entered.
func (s *BaseDBMSListener) EnterAdd_op(ctx *Add_opContext) {}

// ExitAdd_op is called when production add_op is exited.
func (s *BaseDBMSListener) ExitAdd_op(ctx *Add_opContext) {}

// EnterMult_op is called when production mult_op is entered.
func (s *BaseDBMSListener) EnterMult_op(ctx *Mult_opContext) {}

// ExitMult_op is called when production mult_op is exited.
func (s *BaseDBMSListener) ExitMult_op(ctx *Mult_opContext) {}
