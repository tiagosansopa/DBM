// Generated from DBMS.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DBMSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, LPAREN=116, RPAREN=117, LBRACKET=118, RBRACKET=119, 
		EQ=120, KL=121, INT=122, CHAR=123, AND=124, OR=125, NOT=126, BOOLEAN=127, 
		DATETIME=128, ID=129, NUM=130, FLOAT=131, CHARX=132, DATE=133, WS=134, 
		COMMENT=135, END_SQL=136, COMMA=137;
	public static final int
		RULE_create = 0, RULE_database = 1, RULE_databases = 2, RULE_table = 3, 
		RULE_tables = 4, RULE_column = 5, RULE_columns = 6, RULE_show = 7, RULE_drop = 8, 
		RULE_alter = 9, RULE_use = 10, RULE_rename = 11, RULE_constraint = 12, 
		RULE_key = 13, RULE_primary = 14, RULE_foreign = 15, RULE_check = 16, 
		RULE_select = 17, RULE_from = 18, RULE_where = 19, RULE_asc = 20, RULE_desc = 21, 
		RULE_to = 22, RULE_references = 23, RULE_add = 24, RULE_insert = 25, RULE_into = 26, 
		RULE_values = 27, RULE_update = 28, RULE_set = 29, RULE_delete = 30, RULE_order = 31, 
		RULE_by = 32, RULE_sql = 33, RULE_sql_executable = 34, RULE_sql_ddl = 35, 
		RULE_database_statement = 36, RULE_table_statement = 37, RULE_create_database = 38, 
		RULE_alter_database = 39, RULE_drop_database = 40, RULE_show_database = 41, 
		RULE_use_database = 42, RULE_create_table = 43, RULE_columnAt = 44, RULE_constraintAt = 45, 
		RULE_type = 46, RULE_alter_table = 47, RULE_drop_table = 48, RULE_show_tables = 49, 
		RULE_show_columns = 50, RULE_action = 51, RULE_sql_dml = 52, RULE_insert_value = 53, 
		RULE_update_value = 54, RULE_delete_value = 55, RULE_select_value = 56, 
		RULE_literal = 57, RULE_rel_op = 58, RULE_cond_op = 59, RULE_eq_op = 60, 
		RULE_add_op = 61, RULE_mult_op = 62, RULE_exp = 63, RULE_expression = 64, 
		RULE_andExpr = 65, RULE_eqExpr = 66, RULE_relationExpr = 67, RULE_unaryExpr = 68, 
		RULE_unifactor = 69, RULE_factor = 70;
	public static final String[] ruleNames = {
		"create", "database", "databases", "table", "tables", "column", "columns", 
		"show", "drop", "alter", "use", "rename", "constraint", "key", "primary", 
		"foreign", "check", "select", "from", "where", "asc", "desc", "to", "references", 
		"add", "insert", "into", "values", "update", "set", "delete", "order", 
		"by", "sql", "sql_executable", "sql_ddl", "database_statement", "table_statement", 
		"create_database", "alter_database", "drop_database", "show_database", 
		"use_database", "create_table", "columnAt", "constraintAt", "type", "alter_table", 
		"drop_table", "show_tables", "show_columns", "action", "sql_dml", "insert_value", 
		"update_value", "delete_value", "select_value", "literal", "rel_op", "cond_op", 
		"eq_op", "add_op", "mult_op", "exp", "expression", "andExpr", "eqExpr", 
		"relationExpr", "unaryExpr", "unifactor", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'CREATE'", "'Create'", "'create'", "'DATABASE'", "'Database'", 
		"'database'", "'DATABASES'", "'Databases'", "'databases'", "'TABLE'", 
		"'Table'", "'table'", "'TABLES'", "'Tables'", "'tables'", "'COLUN'", "'Column'", 
		"'column'", "'COLUMNS'", "'Columns'", "'SHOW'", "'Show'", "'show'", "'DROP'", 
		"'Drop'", "'drop'", "'ALTER'", "'Alter'", "'alter'", "'USE'", "'Use'", 
		"'use'", "'RENAME'", "'Rename'", "'rename'", "'CONSTRAINT'", "'Constraint'", 
		"'constraint'", "'KEY'", "'Key'", "'key'", "'PRIMARY'", "'Primary'", "'primary'", 
		"'FOREIGN'", "'Foreign'", "'foreign'", "'CHECK'", "'Check'", "'check'", 
		"'SELECT'", "'Select'", "'select'", "'FROM'", "'From'", "'from'", "'WHERE'", 
		"'Where'", "'where'", "'ASC'", "'Asc'", "'asc'", "'DESC'", "'Desc'", "'desc'", 
		"'TO'", "'To'", "'to'", "'REFERENCES'", "'References'", "'references'", 
		"'ADD'", "'Add'", "'add'", "'INSERT'", "'Insert'", "'insert'", "'INTO'", 
		"'Into'", "'into'", "'VALUES'", "'Values'", "'values'", "'UPDATE'", "'Update'", 
		"'update'", "'SET'", "'Set'", "'set'", "'DELETE'", "'Delete'", "'delete'", 
		"'ORDER'", "'Order'", "'order'", "'BY'", "'By'", "'by'", "'PK_'", "'FK_'", 
		"'CH_'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'AND'", "'OR'", "'=='", 
		"'!='", "'+'", "'-'", "'/'", "'%'", "'NOT'", "'('", "')'", "'['", "']'", 
		"'='", "'*'", "'int'", "'char'", null, null, null, "'boolean'", "'datetime'", 
		null, null, null, null, null, null, null, "';'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "LPAREN", "RPAREN", "LBRACKET", 
		"RBRACKET", "EQ", "KL", "INT", "CHAR", "AND", "OR", "NOT", "BOOLEAN", 
		"DATETIME", "ID", "NUM", "FLOAT", "CHARX", "DATE", "WS", "COMMENT", "END_SQL", 
		"COMMA"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DBMS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DBMSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CreateContext extends ParserRuleContext {
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseContext extends ParserRuleContext {
		public DatabaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDatabase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDatabase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDatabase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabaseContext database() throws RecognitionException {
		DatabaseContext _localctx = new DatabaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabasesContext extends ParserRuleContext {
		public DatabasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDatabases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDatabases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDatabases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatabasesContext databases() throws RecognitionException {
		DatabasesContext _localctx = new DatabasesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_databases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableContext extends ParserRuleContext {
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablesContext extends ParserRuleContext {
		public TablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablesContext tables() throws RecognitionException {
		TablesContext _localctx = new TablesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnContext extends ParserRuleContext {
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsContext extends ParserRuleContext {
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShowContext extends ParserRuleContext {
		public ShowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterShow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitShow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitShow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShowContext show() throws RecognitionException {
		ShowContext _localctx = new ShowContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DropContext extends ParserRuleContext {
		public DropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDrop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDrop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDrop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DropContext drop() throws RecognitionException {
		DropContext _localctx = new DropContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterContext extends ParserRuleContext {
		public AlterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAlter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAlter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAlter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterContext alter() throws RecognitionException {
		AlterContext _localctx = new AlterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseContext extends ParserRuleContext {
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RenameContext extends ParserRuleContext {
		public RenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterRename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitRename(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitRename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RenameContext rename() throws RecognitionException {
		RenameContext _localctx = new RenameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintContext extends ParserRuleContext {
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyContext extends ParserRuleContext {
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeignContext extends ParserRuleContext {
		public ForeignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterForeign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitForeign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitForeign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignContext foreign() throws RecognitionException {
		ForeignContext _localctx = new ForeignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_foreign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CheckContext extends ParserRuleContext {
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_check);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectContext extends ParserRuleContext {
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__51) | (1L << T__52))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromContext extends ParserRuleContext {
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereContext extends ParserRuleContext {
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AscContext extends ParserRuleContext {
		public AscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAsc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAsc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAsc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscContext asc() throws RecognitionException {
		AscContext _localctx = new AscContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_asc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__60) | (1L << T__61))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescContext extends ParserRuleContext {
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (T__64 - 63)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToContext extends ParserRuleContext {
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReferencesContext extends ParserRuleContext {
		public ReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_references; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitReferences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitReferences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferencesContext references() throws RecognitionException {
		ReferencesContext _localctx = new ReferencesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__69 - 69)) | (1L << (T__70 - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddContext extends ParserRuleContext {
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (T__71 - 72)) | (1L << (T__72 - 72)) | (1L << (T__73 - 72)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertContext extends ParserRuleContext {
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntoContext extends ParserRuleContext {
		public IntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitInto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntoContext into() throws RecognitionException {
		IntoContext _localctx = new IntoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_into);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (T__80 - 81)) | (1L << (T__81 - 81)) | (1L << (T__82 - 81)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__84 - 84)) | (1L << (T__85 - 84)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T__89 - 90)) | (1L << (T__90 - 90)) | (1L << (T__91 - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderContext extends ParserRuleContext {
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (T__93 - 93)) | (1L << (T__94 - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByContext extends ParserRuleContext {
		public ByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ByContext by() throws RecognitionException {
		ByContext _localctx = new ByContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (T__96 - 96)) | (1L << (T__97 - 96)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlContext extends ParserRuleContext {
		public List<Sql_executableContext> sql_executable() {
			return getRuleContexts(Sql_executableContext.class);
		}
		public Sql_executableContext sql_executable(int i) {
			return getRuleContext(Sql_executableContext.class,i);
		}
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				sql_executable();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__76 - 75)) | (1L << (T__83 - 75)) | (1L << (T__84 - 75)) | (1L << (T__85 - 75)) | (1L << (T__89 - 75)) | (1L << (T__90 - 75)) | (1L << (T__91 - 75)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_executableContext extends ParserRuleContext {
		public Sql_ddlContext sql_ddl() {
			return getRuleContext(Sql_ddlContext.class,0);
		}
		public Sql_dmlContext sql_dml() {
			return getRuleContext(Sql_dmlContext.class,0);
		}
		public Sql_executableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_executable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSql_executable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSql_executable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSql_executable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_executableContext sql_executable() throws RecognitionException {
		Sql_executableContext _localctx = new Sql_executableContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_sql_executable);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				sql_ddl();
				}
				break;
			case T__50:
			case T__51:
			case T__52:
			case T__74:
			case T__75:
			case T__76:
			case T__83:
			case T__84:
			case T__85:
			case T__89:
			case T__90:
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				sql_dml();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_ddlContext extends ParserRuleContext {
		public Database_statementContext database_statement() {
			return getRuleContext(Database_statementContext.class,0);
		}
		public Table_statementContext table_statement() {
			return getRuleContext(Table_statementContext.class,0);
		}
		public Sql_ddlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_ddl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSql_ddl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSql_ddl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSql_ddl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_ddlContext sql_ddl() throws RecognitionException {
		Sql_ddlContext _localctx = new Sql_ddlContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sql_ddl);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				table_statement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_statementContext extends ParserRuleContext {
		public Create_databaseContext create_database() {
			return getRuleContext(Create_databaseContext.class,0);
		}
		public Alter_databaseContext alter_database() {
			return getRuleContext(Alter_databaseContext.class,0);
		}
		public Drop_databaseContext drop_database() {
			return getRuleContext(Drop_databaseContext.class,0);
		}
		public Show_databaseContext show_database() {
			return getRuleContext(Show_databaseContext.class,0);
		}
		public Use_databaseContext use_database() {
			return getRuleContext(Use_databaseContext.class,0);
		}
		public Database_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDatabase_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDatabase_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDatabase_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_statementContext database_statement() throws RecognitionException {
		Database_statementContext _localctx = new Database_statementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_database_statement);
		try {
			setState(226);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				create_database();
				}
				break;
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				alter_database();
				}
				break;
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				drop_database();
				}
				break;
			case T__20:
			case T__21:
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				show_database();
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				use_database();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_statementContext extends ParserRuleContext {
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Show_tablesContext show_tables() {
			return getRuleContext(Show_tablesContext.class,0);
		}
		public Show_columnsContext show_columns() {
			return getRuleContext(Show_columnsContext.class,0);
		}
		public Table_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterTable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitTable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitTable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_statementContext table_statement() throws RecognitionException {
		Table_statementContext _localctx = new Table_statementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_table_statement);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				alter_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				drop_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				show_tables();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				show_columns();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_databaseContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Create_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCreate_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCreate_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCreate_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_databaseContext create_database() throws RecognitionException {
		Create_databaseContext _localctx = new Create_databaseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			create();
			setState(236);
			database();
			setState(237);
			match(ID);
			setState(238);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_databaseContext extends ParserRuleContext {
		public AlterContext alter() {
			return getRuleContext(AlterContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Alter_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAlter_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAlter_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAlter_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_databaseContext alter_database() throws RecognitionException {
		Alter_databaseContext _localctx = new Alter_databaseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alter_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			alter();
			setState(241);
			database();
			setState(242);
			match(ID);
			setState(243);
			rename();
			setState(244);
			to();
			setState(245);
			match(ID);
			setState(246);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_databaseContext extends ParserRuleContext {
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Drop_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDrop_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDrop_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDrop_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_databaseContext drop_database() throws RecognitionException {
		Drop_databaseContext _localctx = new Drop_databaseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			drop();
			setState(249);
			database();
			setState(250);
			match(ID);
			setState(251);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_databaseContext extends ParserRuleContext {
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public DatabasesContext databases() {
			return getRuleContext(DatabasesContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Show_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterShow_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitShow_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitShow_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_databaseContext show_database() throws RecognitionException {
		Show_databaseContext _localctx = new Show_databaseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_show_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			show();
			setState(254);
			databases();
			setState(255);
			match(ID);
			setState(256);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Use_databaseContext extends ParserRuleContext {
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Use_databaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_database; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUse_database(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUse_database(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUse_database(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_databaseContext use_database() throws RecognitionException {
		Use_databaseContext _localctx = new Use_databaseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_use_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			use();
			setState(259);
			database();
			setState(260);
			match(ID);
			setState(261);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public List<ColumnContext> column() {
			return getRuleContexts(ColumnContext.class);
		}
		public ColumnContext column(int i) {
			return getRuleContext(ColumnContext.class,i);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			create();
			setState(264);
			table();
			setState(265);
			match(ID);
			setState(266);
			match(LPAREN);
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				column();
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0) );
			setState(272);
			match(RPAREN);
			setState(273);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(DBMSParser.COMMA, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public ColumnAtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterColumnAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitColumnAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitColumnAt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAtContext columnAt() throws RecognitionException {
		ColumnAtContext _localctx = new ColumnAtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_columnAt);
		try {
			setState(280);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(ID);
				setState(276);
				type();
				{
				setState(277);
				match(COMMA);
				}
				}
				break;
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstraintAtContext extends ParserRuleContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DBMSParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DBMSParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DBMSParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DBMSParser.RPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public ForeignContext foreign() {
			return getRuleContext(ForeignContext.class,0);
		}
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstraintAtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintAt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterConstraintAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitConstraintAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitConstraintAt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintAtContext constraintAt() throws RecognitionException {
		ConstraintAtContext _localctx = new ConstraintAtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_constraintAt);
		int _la;
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				constraint();
				setState(283);
				match(T__98);
				setState(284);
				match(ID);
				setState(285);
				primary();
				setState(286);
				key();
				setState(287);
				match(LPAREN);
				setState(288);
				match(ID);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(289);
					match(COMMA);
					setState(290);
					match(ID);
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(296);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				constraint();
				setState(299);
				match(T__99);
				setState(300);
				match(ID);
				setState(301);
				foreign();
				setState(302);
				key();
				setState(303);
				match(LPAREN);
				setState(304);
				match(ID);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(305);
					match(COMMA);
					setState(306);
					match(ID);
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
				match(RPAREN);
				setState(313);
				references();
				setState(314);
				match(ID);
				setState(315);
				match(RPAREN);
				setState(316);
				match(ID);
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(317);
					match(COMMA);
					setState(318);
					match(ID);
					}
					}
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(324);
				match(LPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				constraint();
				setState(327);
				match(T__100);
				setState(328);
				match(ID);
				setState(329);
				check();
				setState(330);
				match(RPAREN);
				setState(331);
				expression(0);
				setState(332);
				match(LPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DBMSParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DBMSParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(DBMSParser.DATE, 0); }
		public TerminalNode CHAR() { return getToken(DBMSParser.CHAR, 0); }
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public TerminalNode NUM() { return getToken(DBMSParser.NUM, 0); }
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_type);
		try {
			setState(343);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(FLOAT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(DATE);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				match(CHAR);
				setState(340);
				match(LPAREN);
				setState(341);
				match(NUM);
				setState(342);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public AlterContext alter() {
			return getRuleContext(AlterContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public RenameContext rename() {
			return getRuleContext(RenameContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAlter_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAlter_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alter_table);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				alter();
				setState(346);
				table();
				setState(347);
				match(ID);
				setState(348);
				rename();
				setState(349);
				to();
				setState(350);
				match(ID);
				setState(351);
				match(END_SQL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				alter();
				setState(354);
				table();
				setState(355);
				match(ID);
				setState(356);
				action();
				setState(357);
				match(END_SQL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public DatabaseContext database() {
			return getRuleContext(DatabaseContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDrop_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDrop_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_drop_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			drop();
			setState(362);
			database();
			setState(363);
			match(ID);
			setState(364);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_tablesContext extends ParserRuleContext {
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public TablesContext tables() {
			return getRuleContext(TablesContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Show_tablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_tables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterShow_tables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitShow_tables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitShow_tables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_tablesContext show_tables() throws RecognitionException {
		Show_tablesContext _localctx = new Show_tablesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_show_tables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			show();
			setState(367);
			tables();
			setState(368);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_columnsContext extends ParserRuleContext {
		public ShowContext show() {
			return getRuleContext(ShowContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public Show_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterShow_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitShow_columns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitShow_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_columnsContext show_columns() throws RecognitionException {
		Show_columnsContext _localctx = new Show_columnsContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_show_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			show();
			setState(371);
			columns();
			setState(372);
			from();
			setState(373);
			match(ID);
			setState(374);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public DropContext drop() {
			return getRuleContext(DropContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_action);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				add();
				setState(377);
				column();
				setState(378);
				match(ID);
				setState(379);
				type();
				setState(381); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(380);
					constraint();
					}
					}
					setState(383); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37))) != 0) );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				add();
				setState(386);
				constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				drop();
				setState(389);
				column();
				setState(390);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(392);
				drop();
				setState(393);
				constraint();
				setState(394);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_dmlContext extends ParserRuleContext {
		public Insert_valueContext insert_value() {
			return getRuleContext(Insert_valueContext.class,0);
		}
		public Update_valueContext update_value() {
			return getRuleContext(Update_valueContext.class,0);
		}
		public Delete_valueContext delete_value() {
			return getRuleContext(Delete_valueContext.class,0);
		}
		public Select_valueContext select_value() {
			return getRuleContext(Select_valueContext.class,0);
		}
		public Sql_dmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_dml; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSql_dml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSql_dml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSql_dml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_dmlContext sql_dml() throws RecognitionException {
		Sql_dmlContext _localctx = new Sql_dmlContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_sql_dml);
		try {
			setState(402);
			switch (_input.LA(1)) {
			case T__74:
			case T__75:
			case T__76:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				insert_value();
				}
				break;
			case T__83:
			case T__84:
			case T__85:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				update_value();
				}
				break;
			case T__89:
			case T__90:
			case T__91:
				enterOuterAlt(_localctx, 3);
				{
				setState(400);
				delete_value();
				}
				break;
			case T__50:
			case T__51:
			case T__52:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				select_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_valueContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public IntoContext into() {
			return getRuleContext(IntoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(DBMSParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DBMSParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DBMSParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DBMSParser.RPAREN, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public Insert_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterInsert_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitInsert_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitInsert_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_valueContext insert_value() throws RecognitionException {
		Insert_valueContext _localctx = new Insert_valueContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_insert_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			insert();
			setState(405);
			into();
			setState(406);
			match(ID);
			setState(419);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(407);
				match(LPAREN);
				setState(416);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					{
					setState(408);
					match(ID);
					}
					setState(413);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(409);
						match(COMMA);
						setState(410);
						match(ID);
						}
						}
						setState(415);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(418);
				match(RPAREN);
				}
			}

			setState(421);
			values();
			setState(434);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(422);
				match(LPAREN);
				setState(431);
				_la = _input.LA(1);
				if (((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ID - 129)) | (1L << (NUM - 129)) | (1L << (FLOAT - 129)) | (1L << (CHARX - 129)) | (1L << (DATE - 129)))) != 0)) {
					{
					{
					setState(423);
					literal();
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(424);
						match(COMMA);
						setState(425);
						literal();
						}
						}
						setState(430);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(433);
				match(RPAREN);
				}
			}

			setState(436);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_valueContext extends ParserRuleContext {
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public List<TerminalNode> EQ() { return getTokens(DBMSParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(DBMSParser.EQ, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Update_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUpdate_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUpdate_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUpdate_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_valueContext update_value() throws RecognitionException {
		Update_valueContext _localctx = new Update_valueContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_update_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			update();
			setState(439);
			match(ID);
			setState(440);
			set();
			setState(441);
			match(ID);
			setState(442);
			match(EQ);
			setState(443);
			literal();
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(444);
				match(COMMA);
				setState(445);
				match(ID);
				setState(446);
				match(EQ);
				setState(447);
				literal();
				}
				}
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) {
				{
				setState(453);
				where();
				setState(454);
				expression(0);
				}
			}

			setState(458);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_valueContext extends ParserRuleContext {
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Delete_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterDelete_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitDelete_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitDelete_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_valueContext delete_value() throws RecognitionException {
		Delete_valueContext _localctx = new Delete_valueContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_delete_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			delete();
			setState(461);
			from();
			setState(462);
			match(ID);
			setState(466);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) {
				{
				setState(463);
				where();
				setState(464);
				expression(0);
				}
			}

			setState(468);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_valueContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public TerminalNode KL() { return getToken(DBMSParser.KL, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public ByContext by() {
			return getRuleContext(ByContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public AscContext asc() {
			return getRuleContext(AscContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public Select_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSelect_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSelect_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSelect_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_valueContext select_value() throws RecognitionException {
		Select_valueContext _localctx = new Select_valueContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_select_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			select();
			setState(480);
			switch (_input.LA(1)) {
			case KL:
				{
				setState(471);
				match(KL);
				}
				break;
			case ID:
				{
				setState(472);
				match(ID);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(473);
					match(COMMA);
					setState(474);
					match(ID);
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(482);
			from();
			setState(483);
			match(ID);
			setState(487);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__56) | (1L << T__57) | (1L << T__58))) != 0)) {
				{
				setState(484);
				where();
				setState(485);
				expression(0);
				}
			}

			setState(495);
			_la = _input.LA(1);
			if (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (T__93 - 93)) | (1L << (T__94 - 93)))) != 0)) {
				{
				setState(489);
				order();
				setState(490);
				by();
				setState(493);
				switch (_input.LA(1)) {
				case T__59:
				case T__60:
				case T__61:
					{
					setState(491);
					asc();
					}
					break;
				case T__62:
				case T__63:
				case T__64:
					{
					setState(492);
					desc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(497);
			match(END_SQL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DBMSParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DBMSParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(DBMSParser.DATE, 0); }
		public TerminalNode CHARX() { return getToken(DBMSParser.CHARX, 0); }
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !(((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (ID - 129)) | (1L << (NUM - 129)) | (1L << (FLOAT - 129)) | (1L << (CHARX - 129)) | (1L << (DATE - 129)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitRel_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitRel_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (T__101 - 102)) | (1L << (T__102 - 102)) | (1L << (T__103 - 102)) | (1L << (T__104 - 102)) | (1L << (T__105 - 102)) | (1L << (EQ - 102)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitCond_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitCond_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_la = _input.LA(1);
			if ( !(_la==T__106 || _la==T__107) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitEq_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitEq_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_la = _input.LA(1);
			if ( !(_la==T__108 || _la==T__109) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_opContext extends ParserRuleContext {
		public Add_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAdd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAdd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAdd_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_opContext add_op() throws RecognitionException {
		Add_opContext _localctx = new Add_opContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ( !(_la==T__110 || _la==T__111) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mult_opContext extends ParserRuleContext {
		public Mult_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterMult_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitMult_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitMult_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_opContext mult_op() throws RecognitionException {
		Mult_opContext _localctx = new Mult_opContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (T__112 - 113)) | (1L << (T__113 - 113)) | (1L << (KL - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_exp);
		try {
			setState(513);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				expression(0);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR() { return getToken(DBMSParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(516);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(523);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(518);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(519);
					match(OR);
					setState(520);
					andExpr(0);
					}
					} 
				}
				setState(525);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExprContext extends ParserRuleContext {
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public AndExprContext andExpr() {
			return getRuleContext(AndExprContext.class,0);
		}
		public TerminalNode AND() { return getToken(DBMSParser.AND, 0); }
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		return andExpr(0);
	}

	private AndExprContext andExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExprContext _localctx = new AndExprContext(_ctx, _parentState);
		AndExprContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(527);
			eqExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(529);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(530);
					match(AND);
					setState(531);
					eqExpr(0);
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqExprContext extends ParserRuleContext {
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public EqExprContext eqExpr() {
			return getRuleContext(EqExprContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public EqExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqExprContext eqExpr() throws RecognitionException {
		return eqExpr(0);
	}

	private EqExprContext eqExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqExprContext _localctx = new EqExprContext(_ctx, _parentState);
		EqExprContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_eqExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(538);
			relationExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(546);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eqExpr);
					setState(540);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(541);
					eq_op();
					setState(542);
					relationExpr(0);
					}
					} 
				}
				setState(548);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public RelationExprContext relationExpr() {
			return getRuleContext(RelationExprContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public RelationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitRelationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationExprContext relationExpr() throws RecognitionException {
		return relationExpr(0);
	}

	private RelationExprContext relationExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationExprContext _localctx = new RelationExprContext(_ctx, _parentState);
		RelationExprContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_relationExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(550);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(558);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpr);
					setState(552);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(553);
					rel_op();
					setState(554);
					unaryExpr();
					}
					} 
				}
				setState(560);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public TerminalNode NOT() { return getToken(DBMSParser.NOT, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_unaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(LPAREN);
			setState(563);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(562);
				match(NOT);
				}
			}

			setState(565);
			match(ID);
			setState(566);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnifactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnifactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unifactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterUnifactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitUnifactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitUnifactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnifactorContext unifactor() throws RecognitionException {
		UnifactorContext _localctx = new UnifactorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unifactor);
		try {
			setState(571);
			switch (_input.LA(1)) {
			case T__114:
				enterOuterAlt(_localctx, 1);
				{
				setState(568);
				match(T__114);
				setState(569);
				factor();
				}
				break;
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_factor);
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(LPAREN);
				setState(574);
				expression(0);
				setState(575);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				match(ID);
				setState(579);
				matchWildcard();
				setState(580);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 64:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 65:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 66:
			return eqExpr_sempred((EqExprContext)_localctx, predIndex);
		case 67:
			return relationExpr_sempred((RelationExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpr_sempred(AndExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean eqExpr_sempred(EqExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationExpr_sempred(RelationExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u008b\u024a\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\6#\u00d4\n#\r#\16#\u00d5\3$\3$\5$\u00da\n$\3%\3%\5"+
		"%\u00de\n%\3&\3&\3&\3&\3&\5&\u00e5\n&\3\'\3\'\3\'\3\'\3\'\5\'\u00ec\n"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\6-\u010f\n-\r-\16-\u0110\3-\3-\3-\3.\3"+
		".\3.\3.\3.\5.\u011b\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0126\n/\f/\16/\u0129"+
		"\13/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\7/\u0136\n/\f/\16/\u0139\13/\3/"+
		"\3/\3/\3/\3/\3/\3/\7/\u0142\n/\f/\16/\u0145\13/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\5/\u0151\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u015a\n\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\5\61\u016a\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\6\65\u0180\n\65\r\65\16"+
		"\65\u0181\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u018f\n\65\3\66\3\66\3\66\3\66\5\66\u0195\n\66\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\7\67\u019e\n\67\f\67\16\67\u01a1\13\67\5\67\u01a3\n\67\3"+
		"\67\5\67\u01a6\n\67\3\67\3\67\3\67\3\67\3\67\7\67\u01ad\n\67\f\67\16\67"+
		"\u01b0\13\67\5\67\u01b2\n\67\3\67\5\67\u01b5\n\67\3\67\3\67\38\38\38\3"+
		"8\38\38\38\38\38\38\78\u01c3\n8\f8\168\u01c6\138\38\38\38\58\u01cb\n8"+
		"\38\38\39\39\39\39\39\39\59\u01d5\n9\39\39\3:\3:\3:\3:\3:\7:\u01de\n:"+
		"\f:\16:\u01e1\13:\5:\u01e3\n:\3:\3:\3:\3:\3:\5:\u01ea\n:\3:\3:\3:\3:\5"+
		":\u01f0\n:\5:\u01f2\n:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3"+
		"A\5A\u0204\nA\3B\3B\3B\3B\3B\3B\7B\u020c\nB\fB\16B\u020f\13B\3C\3C\3C"+
		"\3C\3C\3C\7C\u0217\nC\fC\16C\u021a\13C\3D\3D\3D\3D\3D\3D\3D\7D\u0223\n"+
		"D\fD\16D\u0226\13D\3E\3E\3E\3E\3E\3E\3E\7E\u022f\nE\fE\16E\u0232\13E\3"+
		"F\3F\5F\u0236\nF\3F\3F\3F\3G\3G\3G\5G\u023e\nG\3H\3H\3H\3H\3H\3H\3H\3"+
		"H\5H\u0248\nH\3H\2\6\u0082\u0084\u0086\u0088I\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv"+
		"xz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\2)\3\2\3\5\3\2\6"+
		"\b\3\2\t\13\3\2\f\16\3\2\17\21\3\2\22\24\3\2\24\26\3\2\27\31\3\2\32\34"+
		"\3\2\35\37\3\2 \"\3\2#%\3\2&(\3\2)+\3\2,.\3\2/\61\3\2\62\64\3\2\65\67"+
		"\3\28:\3\2;=\3\2>@\3\2AC\3\2DF\3\2GI\3\2JL\3\2MO\3\2PR\3\2SU\3\2VX\3\2"+
		"Y[\3\2\\^\3\2_a\3\2bd\3\2\u0083\u0087\4\2hlzz\3\2mn\3\2op\3\2qr\4\2st"+
		"{{\u0236\2\u0090\3\2\2\2\4\u0092\3\2\2\2\6\u0094\3\2\2\2\b\u0096\3\2\2"+
		"\2\n\u0098\3\2\2\2\f\u009a\3\2\2\2\16\u009c\3\2\2\2\20\u009e\3\2\2\2\22"+
		"\u00a0\3\2\2\2\24\u00a2\3\2\2\2\26\u00a4\3\2\2\2\30\u00a6\3\2\2\2\32\u00a8"+
		"\3\2\2\2\34\u00aa\3\2\2\2\36\u00ac\3\2\2\2 \u00ae\3\2\2\2\"\u00b0\3\2"+
		"\2\2$\u00b2\3\2\2\2&\u00b4\3\2\2\2(\u00b6\3\2\2\2*\u00b8\3\2\2\2,\u00ba"+
		"\3\2\2\2.\u00bc\3\2\2\2\60\u00be\3\2\2\2\62\u00c0\3\2\2\2\64\u00c2\3\2"+
		"\2\2\66\u00c4\3\2\2\28\u00c6\3\2\2\2:\u00c8\3\2\2\2<\u00ca\3\2\2\2>\u00cc"+
		"\3\2\2\2@\u00ce\3\2\2\2B\u00d0\3\2\2\2D\u00d3\3\2\2\2F\u00d9\3\2\2\2H"+
		"\u00dd\3\2\2\2J\u00e4\3\2\2\2L\u00eb\3\2\2\2N\u00ed\3\2\2\2P\u00f2\3\2"+
		"\2\2R\u00fa\3\2\2\2T\u00ff\3\2\2\2V\u0104\3\2\2\2X\u0109\3\2\2\2Z\u011a"+
		"\3\2\2\2\\\u0150\3\2\2\2^\u0159\3\2\2\2`\u0169\3\2\2\2b\u016b\3\2\2\2"+
		"d\u0170\3\2\2\2f\u0174\3\2\2\2h\u018e\3\2\2\2j\u0194\3\2\2\2l\u0196\3"+
		"\2\2\2n\u01b8\3\2\2\2p\u01ce\3\2\2\2r\u01d8\3\2\2\2t\u01f5\3\2\2\2v\u01f7"+
		"\3\2\2\2x\u01f9\3\2\2\2z\u01fb\3\2\2\2|\u01fd\3\2\2\2~\u01ff\3\2\2\2\u0080"+
		"\u0203\3\2\2\2\u0082\u0205\3\2\2\2\u0084\u0210\3\2\2\2\u0086\u021b\3\2"+
		"\2\2\u0088\u0227\3\2\2\2\u008a\u0233\3\2\2\2\u008c\u023d\3\2\2\2\u008e"+
		"\u0247\3\2\2\2\u0090\u0091\t\2\2\2\u0091\3\3\2\2\2\u0092\u0093\t\3\2\2"+
		"\u0093\5\3\2\2\2\u0094\u0095\t\4\2\2\u0095\7\3\2\2\2\u0096\u0097\t\5\2"+
		"\2\u0097\t\3\2\2\2\u0098\u0099\t\6\2\2\u0099\13\3\2\2\2\u009a\u009b\t"+
		"\7\2\2\u009b\r\3\2\2\2\u009c\u009d\t\b\2\2\u009d\17\3\2\2\2\u009e\u009f"+
		"\t\t\2\2\u009f\21\3\2\2\2\u00a0\u00a1\t\n\2\2\u00a1\23\3\2\2\2\u00a2\u00a3"+
		"\t\13\2\2\u00a3\25\3\2\2\2\u00a4\u00a5\t\f\2\2\u00a5\27\3\2\2\2\u00a6"+
		"\u00a7\t\r\2\2\u00a7\31\3\2\2\2\u00a8\u00a9\t\16\2\2\u00a9\33\3\2\2\2"+
		"\u00aa\u00ab\t\17\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\t\20\2\2\u00ad\37\3"+
		"\2\2\2\u00ae\u00af\t\21\2\2\u00af!\3\2\2\2\u00b0\u00b1\t\22\2\2\u00b1"+
		"#\3\2\2\2\u00b2\u00b3\t\23\2\2\u00b3%\3\2\2\2\u00b4\u00b5\t\24\2\2\u00b5"+
		"\'\3\2\2\2\u00b6\u00b7\t\25\2\2\u00b7)\3\2\2\2\u00b8\u00b9\t\26\2\2\u00b9"+
		"+\3\2\2\2\u00ba\u00bb\t\27\2\2\u00bb-\3\2\2\2\u00bc\u00bd\t\30\2\2\u00bd"+
		"/\3\2\2\2\u00be\u00bf\t\31\2\2\u00bf\61\3\2\2\2\u00c0\u00c1\t\32\2\2\u00c1"+
		"\63\3\2\2\2\u00c2\u00c3\t\33\2\2\u00c3\65\3\2\2\2\u00c4\u00c5\t\34\2\2"+
		"\u00c5\67\3\2\2\2\u00c6\u00c7\t\35\2\2\u00c79\3\2\2\2\u00c8\u00c9\t\36"+
		"\2\2\u00c9;\3\2\2\2\u00ca\u00cb\t\37\2\2\u00cb=\3\2\2\2\u00cc\u00cd\t"+
		" \2\2\u00cd?\3\2\2\2\u00ce\u00cf\t!\2\2\u00cfA\3\2\2\2\u00d0\u00d1\t\""+
		"\2\2\u00d1C\3\2\2\2\u00d2\u00d4\5F$\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6E\3\2\2\2\u00d7"+
		"\u00da\5H%\2\u00d8\u00da\5j\66\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2"+
		"\2\u00daG\3\2\2\2\u00db\u00de\5J&\2\u00dc\u00de\5L\'\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00dc\3\2\2\2\u00deI\3\2\2\2\u00df\u00e5\5N(\2\u00e0\u00e5"+
		"\5P)\2\u00e1\u00e5\5R*\2\u00e2\u00e5\5T+\2\u00e3\u00e5\5V,\2\u00e4\u00df"+
		"\3\2\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5K\3\2\2\2\u00e6\u00ec\5X-\2\u00e7\u00ec\5`\61\2\u00e8"+
		"\u00ec\5b\62\2\u00e9\u00ec\5d\63\2\u00ea\u00ec\5f\64\2\u00eb\u00e6\3\2"+
		"\2\2\u00eb\u00e7\3\2\2\2\u00eb\u00e8\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ecM\3\2\2\2\u00ed\u00ee\5\2\2\2\u00ee\u00ef\5\4\3\2"+
		"\u00ef\u00f0\7\u0083\2\2\u00f0\u00f1\7\u008a\2\2\u00f1O\3\2\2\2\u00f2"+
		"\u00f3\5\24\13\2\u00f3\u00f4\5\4\3\2\u00f4\u00f5\7\u0083\2\2\u00f5\u00f6"+
		"\5\30\r\2\u00f6\u00f7\5.\30\2\u00f7\u00f8\7\u0083\2\2\u00f8\u00f9\7\u008a"+
		"\2\2\u00f9Q\3\2\2\2\u00fa\u00fb\5\22\n\2\u00fb\u00fc\5\4\3\2\u00fc\u00fd"+
		"\7\u0083\2\2\u00fd\u00fe\7\u008a\2\2\u00feS\3\2\2\2\u00ff\u0100\5\20\t"+
		"\2\u0100\u0101\5\6\4\2\u0101\u0102\7\u0083\2\2\u0102\u0103\7\u008a\2\2"+
		"\u0103U\3\2\2\2\u0104\u0105\5\26\f\2\u0105\u0106\5\4\3\2\u0106\u0107\7"+
		"\u0083\2\2\u0107\u0108\7\u008a\2\2\u0108W\3\2\2\2\u0109\u010a\5\2\2\2"+
		"\u010a\u010b\5\b\5\2\u010b\u010c\7\u0083\2\2\u010c\u010e\7v\2\2\u010d"+
		"\u010f\5\f\7\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\7w\2\2\u0113"+
		"\u0114\7\u008a\2\2\u0114Y\3\2\2\2\u0115\u0116\7\u0083\2\2\u0116\u0117"+
		"\5^\60\2\u0117\u0118\7\u008b\2\2\u0118\u011b\3\2\2\2\u0119\u011b\5\32"+
		"\16\2\u011a\u0115\3\2\2\2\u011a\u0119\3\2\2\2\u011b[\3\2\2\2\u011c\u011d"+
		"\5\32\16\2\u011d\u011e\7e\2\2\u011e\u011f\7\u0083\2\2\u011f\u0120\5\36"+
		"\20\2\u0120\u0121\5\34\17\2\u0121\u0122\7v\2\2\u0122\u0127\7\u0083\2\2"+
		"\u0123\u0124\7\u008b\2\2\u0124\u0126\7\u0083\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7w\2\2\u012b\u0151\3\2\2\2\u012c"+
		"\u012d\5\32\16\2\u012d\u012e\7f\2\2\u012e\u012f\7\u0083\2\2\u012f\u0130"+
		"\5 \21\2\u0130\u0131\5\34\17\2\u0131\u0132\7v\2\2\u0132\u0137\7\u0083"+
		"\2\2\u0133\u0134\7\u008b\2\2\u0134\u0136\7\u0083\2\2\u0135\u0133\3\2\2"+
		"\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7w\2\2\u013b\u013c\5\60\31\2"+
		"\u013c\u013d\7\u0083\2\2\u013d\u013e\7w\2\2\u013e\u0143\7\u0083\2\2\u013f"+
		"\u0140\7\u008b\2\2\u0140\u0142\7\u0083\2\2\u0141\u013f\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0147\7v\2\2\u0147\u0151\3\2\2\2\u0148\u0149\5\32"+
		"\16\2\u0149\u014a\7g\2\2\u014a\u014b\7\u0083\2\2\u014b\u014c\5\"\22\2"+
		"\u014c\u014d\7w\2\2\u014d\u014e\5\u0082B\2\u014e\u014f\7v\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u011c\3\2\2\2\u0150\u012c\3\2\2\2\u0150\u0148\3\2\2\2\u0151"+
		"]\3\2\2\2\u0152\u015a\7|\2\2\u0153\u015a\7\u0085\2\2\u0154\u015a\7\u0087"+
		"\2\2\u0155\u0156\7}\2\2\u0156\u0157\7v\2\2\u0157\u0158\7\u0084\2\2\u0158"+
		"\u015a\7w\2\2\u0159\u0152\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u0154\3\2"+
		"\2\2\u0159\u0155\3\2\2\2\u015a_\3\2\2\2\u015b\u015c\5\24\13\2\u015c\u015d"+
		"\5\b\5\2\u015d\u015e\7\u0083\2\2\u015e\u015f\5\30\r\2\u015f\u0160\5.\30"+
		"\2\u0160\u0161\7\u0083\2\2\u0161\u0162\7\u008a\2\2\u0162\u016a\3\2\2\2"+
		"\u0163\u0164\5\24\13\2\u0164\u0165\5\b\5\2\u0165\u0166\7\u0083\2\2\u0166"+
		"\u0167\5h\65\2\u0167\u0168\7\u008a\2\2\u0168\u016a\3\2\2\2\u0169\u015b"+
		"\3\2\2\2\u0169\u0163\3\2\2\2\u016aa\3\2\2\2\u016b\u016c\5\22\n\2\u016c"+
		"\u016d\5\4\3\2\u016d\u016e\7\u0083\2\2\u016e\u016f\7\u008a\2\2\u016fc"+
		"\3\2\2\2\u0170\u0171\5\20\t\2\u0171\u0172\5\n\6\2\u0172\u0173\7\u008a"+
		"\2\2\u0173e\3\2\2\2\u0174\u0175\5\20\t\2\u0175\u0176\5\16\b\2\u0176\u0177"+
		"\5&\24\2\u0177\u0178\7\u0083\2\2\u0178\u0179\7\u008a\2\2\u0179g\3\2\2"+
		"\2\u017a\u017b\5\62\32\2\u017b\u017c\5\f\7\2\u017c\u017d\7\u0083\2\2\u017d"+
		"\u017f\5^\60\2\u017e\u0180\5\32\16\2\u017f\u017e\3\2\2\2\u0180\u0181\3"+
		"\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u018f\3\2\2\2\u0183"+
		"\u0184\5\62\32\2\u0184\u0185\5\32\16\2\u0185\u018f\3\2\2\2\u0186\u0187"+
		"\5\22\n\2\u0187\u0188\5\f\7\2\u0188\u0189\7\u0083\2\2\u0189\u018f\3\2"+
		"\2\2\u018a\u018b\5\22\n\2\u018b\u018c\5\32\16\2\u018c\u018d\7\u0083\2"+
		"\2\u018d\u018f\3\2\2\2\u018e\u017a\3\2\2\2\u018e\u0183\3\2\2\2\u018e\u0186"+
		"\3\2\2\2\u018e\u018a\3\2\2\2\u018fi\3\2\2\2\u0190\u0195\5l\67\2\u0191"+
		"\u0195\5n8\2\u0192\u0195\5p9\2\u0193\u0195\5r:\2\u0194\u0190\3\2\2\2\u0194"+
		"\u0191\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195k\3\2\2\2"+
		"\u0196\u0197\5\64\33\2\u0197\u0198\5\66\34\2\u0198\u01a5\7\u0083\2\2\u0199"+
		"\u01a2\7v\2\2\u019a\u019f\7\u0083\2\2\u019b\u019c\7\u008b\2\2\u019c\u019e"+
		"\7\u0083\2\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2"+
		"\2\u019f\u01a0\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u019a"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\7w\2\2\u01a5"+
		"\u0199\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01b4\58"+
		"\35\2\u01a8\u01b1\7v\2\2\u01a9\u01ae\5t;\2\u01aa\u01ab\7\u008b\2\2\u01ab"+
		"\u01ad\5t;\2\u01ac\u01aa\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2"+
		"\2\u01ae\u01af\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01a9"+
		"\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\7w\2\2\u01b4"+
		"\u01a8\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\7\u008a"+
		"\2\2\u01b7m\3\2\2\2\u01b8\u01b9\5:\36\2\u01b9\u01ba\7\u0083\2\2\u01ba"+
		"\u01bb\5<\37\2\u01bb\u01bc\7\u0083\2\2\u01bc\u01bd\7z\2\2\u01bd\u01c4"+
		"\5t;\2\u01be\u01bf\7\u008b\2\2\u01bf\u01c0\7\u0083\2\2\u01c0\u01c1\7z"+
		"\2\2\u01c1\u01c3\5t;\2\u01c2\u01be\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01ca\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7"+
		"\u01c8\5(\25\2\u01c8\u01c9\5\u0082B\2\u01c9\u01cb\3\2\2\2\u01ca\u01c7"+
		"\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\u008a\2"+
		"\2\u01cdo\3\2\2\2\u01ce\u01cf\5> \2\u01cf\u01d0\5&\24\2\u01d0\u01d4\7"+
		"\u0083\2\2\u01d1\u01d2\5(\25\2\u01d2\u01d3\5\u0082B\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\7\u008a\2\2\u01d7q\3\2\2\2\u01d8\u01e2\5$\23\2\u01d9\u01e3\7{\2"+
		"\2\u01da\u01df\7\u0083\2\2\u01db\u01dc\7\u008b\2\2\u01dc\u01de\7\u0083"+
		"\2\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01d9\3\2"+
		"\2\2\u01e2\u01da\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\5&\24\2\u01e5"+
		"\u01e9\7\u0083\2\2\u01e6\u01e7\5(\25\2\u01e7\u01e8\5\u0082B\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01f1\3\2\2\2\u01eb"+
		"\u01ec\5@!\2\u01ec\u01ef\5B\"\2\u01ed\u01f0\5*\26\2\u01ee\u01f0\5,\27"+
		"\2\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f2\3\2\2\2\u01f1\u01eb"+
		"\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f4\7\u008a\2"+
		"\2\u01f4s\3\2\2\2\u01f5\u01f6\t#\2\2\u01f6u\3\2\2\2\u01f7\u01f8\t$\2\2"+
		"\u01f8w\3\2\2\2\u01f9\u01fa\t%\2\2\u01fay\3\2\2\2\u01fb\u01fc\t&\2\2\u01fc"+
		"{\3\2\2\2\u01fd\u01fe\t\'\2\2\u01fe}\3\2\2\2\u01ff\u0200\t(\2\2\u0200"+
		"\177\3\2\2\2\u0201\u0204\5\u0082B\2\u0202\u0204\3\2\2\2\u0203\u0201\3"+
		"\2\2\2\u0203\u0202\3\2\2\2\u0204\u0081\3\2\2\2\u0205\u0206\bB\1\2\u0206"+
		"\u0207\5\u0084C\2\u0207\u020d\3\2\2\2\u0208\u0209\f\3\2\2\u0209\u020a"+
		"\7\177\2\2\u020a\u020c\5\u0084C\2\u020b\u0208\3\2\2\2\u020c\u020f\3\2"+
		"\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0083\3\2\2\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0211\bC\1\2\u0211\u0212\5\u0086D\2\u0212\u0218\3"+
		"\2\2\2\u0213\u0214\f\3\2\2\u0214\u0215\7~\2\2\u0215\u0217\5\u0086D\2\u0216"+
		"\u0213\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u0085\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\bD\1\2\u021c"+
		"\u021d\5\u0088E\2\u021d\u0224\3\2\2\2\u021e\u021f\f\3\2\2\u021f\u0220"+
		"\5z>\2\u0220\u0221\5\u0088E\2\u0221\u0223\3\2\2\2\u0222\u021e\3\2\2\2"+
		"\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0087"+
		"\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u0228\bE\1\2\u0228\u0229\5\u008aF\2"+
		"\u0229\u0230\3\2\2\2\u022a\u022b\f\3\2\2\u022b\u022c\5v<\2\u022c\u022d"+
		"\5\u008aF\2\u022d\u022f\3\2\2\2\u022e\u022a\3\2\2\2\u022f\u0232\3\2\2"+
		"\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0089\3\2\2\2\u0232\u0230"+
		"\3\2\2\2\u0233\u0235\7v\2\2\u0234\u0236\7\u0080\2\2\u0235\u0234\3\2\2"+
		"\2\u0235\u0236\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0238\7\u0083\2\2\u0238"+
		"\u0239\7w\2\2\u0239\u008b\3\2\2\2\u023a\u023b\7u\2\2\u023b\u023e\5\u008e"+
		"H\2\u023c\u023e\5\u008eH\2\u023d\u023a\3\2\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\u008d\3\2\2\2\u023f\u0240\7v\2\2\u0240\u0241\5\u0082B\2\u0241\u0242\7"+
		"w\2\2\u0242\u0248\3\2\2\2\u0243\u0248\7\u0083\2\2\u0244\u0245\7\u0083"+
		"\2\2\u0245\u0246\13\2\2\2\u0246\u0248\7\u0083\2\2\u0247\u023f\3\2\2\2"+
		"\u0247\u0243\3\2\2\2\u0247\u0244\3\2\2\2\u0248\u008f\3\2\2\2(\u00d5\u00d9"+
		"\u00dd\u00e4\u00eb\u0110\u011a\u0127\u0137\u0143\u0150\u0159\u0169\u0181"+
		"\u018e\u0194\u019f\u01a2\u01a5\u01ae\u01b1\u01b4\u01c4\u01ca\u01d4\u01df"+
		"\u01e2\u01e9\u01ef\u01f1\u0203\u020d\u0218\u0224\u0230\u0235\u023d\u0247";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}