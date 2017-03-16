// Generated from DBMS.g4 by ANTLR 4.6.

package parser // DBMS

import "github.com/antlr/antlr4/runtime/Go/antlr"

type BaseDBMSVisitor struct {
	*antlr.BaseParseTreeVisitor
}

func (v *BaseDBMSVisitor) VisitLiteral(ctx *LiteralContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitFecha(ctx *FechaContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitProgram(ctx *ProgramContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitDatabase(ctx *DatabaseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitCreateDatabase(ctx *CreateDatabaseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitAlterDatabase(ctx *AlterDatabaseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitDropDatabase(ctx *DropDatabaseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitShowDatabase(ctx *ShowDatabaseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitUseDatabase(ctx *UseDatabaseContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitOpTable(ctx *OpTableContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitTipo(ctx *TipoContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitCreateTable(ctx *CreateTableContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitConstraint(ctx *ConstraintContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitPrimaryKey(ctx *PrimaryKeyContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitForeignKey(ctx *ForeignKeyContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitCheck(ctx *CheckContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitExp(ctx *ExpContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitExpression(ctx *ExpressionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitAndExpr(ctx *AndExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitEqExpr(ctx *EqExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitRelationExpr(ctx *RelationExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitUnaryExpr(ctx *UnaryExprContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitAlterTable(ctx *AlterTableContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitAction(ctx *ActionContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitDropTable(ctx *DropTableContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitShowTables(ctx *ShowTablesContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitShowColumns(ctx *ShowColumnsContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitInsertInto(ctx *InsertIntoContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitUpdateSet(ctx *UpdateSetContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitDeleteFrom(ctx *DeleteFromContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitSelectFrom(ctx *SelectFromContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitSep(ctx *SepContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitRel_op(ctx *Rel_opContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitEq_op(ctx *Eq_opContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitAdd_op(ctx *Add_opContext) interface{} {
	return v.VisitChildren(ctx)
}

func (v *BaseDBMSVisitor) VisitMult_op(ctx *Mult_opContext) interface{} {
	return v.VisitChildren(ctx)
}
