package application.model;
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
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, LPAREN=119, 
		RPAREN=120, LBRACKET=121, RBRACKET=122, EQ=123, KL=124, INT=125, FLOATS=126, 
		DATES=127, CHAR=128, BOOLEAN=129, DATETIME=130, ID=131, NUM=132, FLOAT=133, 
		CHARX=134, DATE=135, WS=136, COMMENT=137, END_SQL=138, COMMA=139;
	public static final int
		RULE_and = 0, RULE_or = 1, RULE_not = 2, RULE_create = 3, RULE_database = 4, 
		RULE_databases = 5, RULE_table = 6, RULE_tables = 7, RULE_column = 8, 
		RULE_columns = 9, RULE_show = 10, RULE_drop = 11, RULE_alter = 12, RULE_use = 13, 
		RULE_rename = 14, RULE_constraint = 15, RULE_key = 16, RULE_primary = 17, 
		RULE_foreign = 18, RULE_check = 19, RULE_select = 20, RULE_from = 21, 
		RULE_where = 22, RULE_asc = 23, RULE_desc = 24, RULE_to = 25, RULE_references = 26, 
		RULE_add = 27, RULE_insert = 28, RULE_into = 29, RULE_values = 30, RULE_update = 31, 
		RULE_set = 32, RULE_delete = 33, RULE_order = 34, RULE_by = 35, RULE_sql = 36, 
		RULE_sql_executable = 37, RULE_sql_ddl = 38, RULE_database_statement = 39, 
		RULE_table_statement = 40, RULE_comma_id_k = 41, RULE_comma_literal_k = 42, 
		RULE_comma_id_eq_literal_k = 43, RULE_comma_action_k = 44, RULE_create_database = 45, 
		RULE_alter_database = 46, RULE_drop_database = 47, RULE_show_database = 48, 
		RULE_use_database = 49, RULE_comma_id_type_k = 50, RULE_comma_constraint_constraintAt_k = 51, 
		RULE_create_table = 52, RULE_constraintAt = 53, RULE_primaryKey = 54, 
		RULE_foreignKey = 55, RULE_checks = 56, RULE_type = 57, RULE_alter_table = 58, 
		RULE_drop_table = 59, RULE_show_tables = 60, RULE_show_columns = 61, RULE_action = 62, 
		RULE_sql_dml = 63, RULE_some_order = 64, RULE_insert_value = 65, RULE_update_value = 66, 
		RULE_delete_value = 67, RULE_select_value = 68, RULE_where_exp = 69, RULE_literal = 70, 
		RULE_rel_op = 71, RULE_cond_op = 72, RULE_eq_op = 73, RULE_add_op = 74, 
		RULE_mult_op = 75, RULE_exp = 76, RULE_expression = 77, RULE_andExpr = 78, 
		RULE_eqExpr = 79, RULE_relationExpr = 80, RULE_unaryExpr = 81, RULE_unifactor = 82, 
		RULE_factor = 83;
	public static final String[] ruleNames = {
		"and", "or", "not", "create", "database", "databases", "table", "tables", 
		"column", "columns", "show", "drop", "alter", "use", "rename", "constraint", 
		"key", "primary", "foreign", "check", "select", "from", "where", "asc", 
		"desc", "to", "references", "add", "insert", "into", "values", "update", 
		"set", "delete", "order", "by", "sql", "sql_executable", "sql_ddl", "database_statement", 
		"table_statement", "comma_id_k", "comma_literal_k", "comma_id_eq_literal_k", 
		"comma_action_k", "create_database", "alter_database", "drop_database", 
		"show_database", "use_database", "comma_id_type_k", "comma_constraint_constraintAt_k", 
		"create_table", "constraintAt", "primaryKey", "foreignKey", "checks", 
		"type", "alter_table", "drop_table", "show_tables", "show_columns", "action", 
		"sql_dml", "some_order", "insert_value", "update_value", "delete_value", 
		"select_value", "where_exp", "literal", "rel_op", "cond_op", "eq_op", 
		"add_op", "mult_op", "exp", "expression", "andExpr", "eqExpr", "relationExpr", 
		"unaryExpr", "unifactor", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'AND'", "'And'", "'or'", "'OR'", "'Or'", "'not'", "'NOT'", 
		"'Not'", "'CREATE'", "'Create'", "'create'", "'DATABASE'", "'Database'", 
		"'database'", "'DATABASES'", "'Databases'", "'databases'", "'TABLE'", 
		"'Table'", "'table'", "'TABLES'", "'Tables'", "'tables'", "'COLUMN'", 
		"'Column'", "'column'", "'COLUMNS'", "'Columns'", "'SHOW'", "'Show'", 
		"'show'", "'DROP'", "'Drop'", "'drop'", "'ALTER'", "'Alter'", "'alter'", 
		"'USE'", "'Use'", "'use'", "'RENAME'", "'Rename'", "'rename'", "'CONSTRAINT'", 
		"'Constraint'", "'constraint'", "'KEY'", "'Key'", "'key'", "'PRIMARY'", 
		"'Primary'", "'primary'", "'FOREIGN'", "'Foreign'", "'foreign'", "'CHECK'", 
		"'Check'", "'check'", "'SELECT'", "'Select'", "'select'", "'FROM'", "'From'", 
		"'from'", "'WHERE'", "'Where'", "'where'", "'ASC'", "'Asc'", "'asc'", 
		"'DESC'", "'Desc'", "'desc'", "'TO'", "'To'", "'to'", "'REFERENCES'", 
		"'References'", "'references'", "'ADD'", "'Add'", "'add'", "'INSERT'", 
		"'Insert'", "'insert'", "'INTO'", "'Into'", "'into'", "'VALUES'", "'Values'", 
		"'values'", "'UPDATE'", "'Update'", "'update'", "'SET'", "'Set'", "'set'", 
		"'DELETE'", "'Delete'", "'delete'", "'ORDER'", "'Order'", "'order'", "'BY'", 
		"'By'", "'by'", "'<'", "'>'", "'<='", "'>='", "'<>'", "'=='", "'!='", 
		"'+'", "'-'", "'/'", "'%'", "'('", "')'", "'['", "']'", "'='", "'*'", 
		"'int'", "'float'", "'date'", "'char'", "'boolean'", "'datetime'", null, 
		null, null, null, null, null, null, "';'", "','"
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
		null, null, null, null, null, null, null, null, null, null, null, "LPAREN", 
		"RPAREN", "LBRACKET", "RBRACKET", "EQ", "KL", "INT", "FLOATS", "DATES", 
		"CHAR", "BOOLEAN", "DATETIME", "ID", "NUM", "FLOAT", "CHARX", "DATE", 
		"WS", "COMMENT", "END_SQL", "COMMA"
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
	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_and);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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

	public static class OrContext extends ParserRuleContext {
		public OrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrContext or() throws RecognitionException {
		OrContext _localctx = new OrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_or);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_not);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
		enterRule(_localctx, 6, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		enterRule(_localctx, 8, RULE_database);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
		enterRule(_localctx, 10, RULE_databases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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
		enterRule(_localctx, 12, RULE_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_tables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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
		enterRule(_localctx, 16, RULE_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		enterRule(_localctx, 20, RULE_show);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
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
		enterRule(_localctx, 22, RULE_drop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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
		enterRule(_localctx, 24, RULE_alter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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
		enterRule(_localctx, 26, RULE_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
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
		enterRule(_localctx, 28, RULE_rename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
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
		enterRule(_localctx, 30, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
		enterRule(_localctx, 32, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 34, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 36, RULE_foreign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
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
		enterRule(_localctx, 38, RULE_check);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		enterRule(_localctx, 40, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 42, RULE_from);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 44, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		enterRule(_localctx, 46, RULE_asc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		enterRule(_localctx, 48, RULE_desc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 50, RULE_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		enterRule(_localctx, 52, RULE_references);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
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
		enterRule(_localctx, 54, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 56, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 58, RULE_into);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 60, RULE_values);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
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
		enterRule(_localctx, 62, RULE_update);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
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
		enterRule(_localctx, 64, RULE_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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
		enterRule(_localctx, 66, RULE_delete);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (T__98 - 99)) | (1L << (T__99 - 99)) | (1L << (T__100 - 99)))) != 0)) ) {
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
		enterRule(_localctx, 68, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (T__101 - 102)) | (1L << (T__102 - 102)) | (1L << (T__103 - 102)))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (T__104 - 105)) | (1L << (T__105 - 105)) | (1L << (T__106 - 105)))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_sql);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				sql_executable();
				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__59) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__84 - 84)) | (1L << (T__85 - 84)) | (1L << (T__92 - 84)) | (1L << (T__93 - 84)) | (1L << (T__94 - 84)) | (1L << (T__98 - 84)) | (1L << (T__99 - 84)) | (1L << (T__100 - 84)))) != 0) );
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
		enterRule(_localctx, 74, RULE_sql_executable);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				sql_ddl();
				}
				break;
			case T__59:
			case T__60:
			case T__61:
			case T__83:
			case T__84:
			case T__85:
			case T__92:
			case T__93:
			case T__94:
			case T__98:
			case T__99:
			case T__100:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
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
		enterRule(_localctx, 76, RULE_sql_ddl);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				database_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
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
		enterRule(_localctx, 78, RULE_database_statement);
		try {
			setState(258);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				create_database();
				}
				break;
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				alter_database();
				}
				break;
			case T__32:
			case T__33:
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				drop_database();
				}
				break;
			case T__29:
			case T__30:
			case T__31:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				show_database();
				}
				break;
			case T__38:
			case T__39:
			case T__40:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
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
		enterRule(_localctx, 80, RULE_table_statement);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				create_table();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				alter_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				drop_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				show_tables();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
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

	public static class Comma_id_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public Comma_id_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_id_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_id_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_id_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_id_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_id_kContext comma_id_k() throws RecognitionException {
		Comma_id_kContext _localctx = new Comma_id_kContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_comma_id_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(267);
				match(COMMA);
				setState(268);
				match(ID);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Comma_literal_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public Comma_literal_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_literal_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_literal_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_literal_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_literal_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_literal_kContext comma_literal_k() throws RecognitionException {
		Comma_literal_kContext _localctx = new Comma_literal_kContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_comma_literal_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(274);
				match(COMMA);
				setState(275);
				literal();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Comma_id_eq_literal_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
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
		public Comma_id_eq_literal_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_id_eq_literal_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_id_eq_literal_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_id_eq_literal_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_id_eq_literal_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_id_eq_literal_kContext comma_id_eq_literal_k() throws RecognitionException {
		Comma_id_eq_literal_kContext _localctx = new Comma_id_eq_literal_kContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_comma_id_eq_literal_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(281);
				match(COMMA);
				setState(282);
				match(ID);
				setState(283);
				match(EQ);
				setState(284);
				literal();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Comma_action_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public Comma_action_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_action_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_action_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_action_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_action_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_action_kContext comma_action_k() throws RecognitionException {
		Comma_action_kContext _localctx = new Comma_action_kContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_comma_action_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(290);
				match(COMMA);
				setState(291);
				action();
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 90, RULE_create_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			create();
			setState(298);
			database();
			setState(299);
			match(ID);
			setState(300);
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
		enterRule(_localctx, 92, RULE_alter_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			alter();
			setState(303);
			database();
			setState(304);
			match(ID);
			setState(305);
			rename();
			setState(306);
			to();
			setState(307);
			match(ID);
			setState(308);
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
		enterRule(_localctx, 94, RULE_drop_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			drop();
			setState(311);
			database();
			setState(312);
			match(ID);
			setState(313);
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
		enterRule(_localctx, 96, RULE_show_database);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				show();
				setState(316);
				databases();
				setState(317);
				match(ID);
				setState(318);
				match(END_SQL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				show();
				setState(321);
				databases();
				setState(322);
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
		enterRule(_localctx, 98, RULE_use_database);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			use();
			setState(327);
			database();
			setState(328);
			match(ID);
			setState(329);
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

	public static class Comma_id_type_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Comma_id_type_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_id_type_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_id_type_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_id_type_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_id_type_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_id_type_kContext comma_id_type_k() throws RecognitionException {
		Comma_id_type_kContext _localctx = new Comma_id_type_kContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_comma_id_type_k);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					match(COMMA);
					setState(332);
					match(ID);
					setState(333);
					type();
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Comma_constraint_constraintAt_kContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public List<ConstraintAtContext> constraintAt() {
			return getRuleContexts(ConstraintAtContext.class);
		}
		public ConstraintAtContext constraintAt(int i) {
			return getRuleContext(ConstraintAtContext.class,i);
		}
		public Comma_constraint_constraintAt_kContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma_constraint_constraintAt_k; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterComma_constraint_constraintAt_k(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitComma_constraint_constraintAt_k(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitComma_constraint_constraintAt_k(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comma_constraint_constraintAt_kContext comma_constraint_constraintAt_k() throws RecognitionException {
		Comma_constraint_constraintAt_kContext _localctx = new Comma_constraint_constraintAt_kContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_comma_constraint_constraintAt_k);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(339);
				match(COMMA);
				setState(340);
				constraint();
				setState(341);
				constraintAt();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Create_tableContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Comma_id_type_kContext comma_id_type_k() {
			return getRuleContext(Comma_id_type_kContext.class,0);
		}
		public Comma_constraint_constraintAt_kContext comma_constraint_constraintAt_k() {
			return getRuleContext(Comma_constraint_constraintAt_kContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
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
		enterRule(_localctx, 104, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			create();
			setState(349);
			table();
			setState(350);
			match(ID);
			setState(351);
			match(LPAREN);
			setState(352);
			match(ID);
			setState(353);
			type();
			setState(354);
			comma_id_type_k();
			setState(355);
			comma_constraint_constraintAt_k();
			setState(356);
			match(RPAREN);
			setState(357);
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

	public static class ConstraintAtContext extends ParserRuleContext {
		public PrimaryKeyContext primaryKey() {
			return getRuleContext(PrimaryKeyContext.class,0);
		}
		public ForeignKeyContext foreignKey() {
			return getRuleContext(ForeignKeyContext.class,0);
		}
		public ChecksContext checks() {
			return getRuleContext(ChecksContext.class,0);
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
		enterRule(_localctx, 106, RULE_constraintAt);
		try {
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				primaryKey();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				foreignKey();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				checks();
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

	public static class PrimaryKeyContext extends ParserRuleContext {
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
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public Comma_id_kContext comma_id_k() {
			return getRuleContext(Comma_id_kContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public PrimaryKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterPrimaryKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitPrimaryKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitPrimaryKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryKeyContext primaryKey() throws RecognitionException {
		PrimaryKeyContext _localctx = new PrimaryKeyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_primaryKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			match(ID);
			setState(365);
			primary();
			setState(366);
			key();
			setState(367);
			match(LPAREN);
			setState(368);
			match(ID);
			setState(369);
			comma_id_k();
			setState(370);
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

	public static class ForeignKeyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(DBMSParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(DBMSParser.ID, i);
		}
		public ForeignContext foreign() {
			return getRuleContext(ForeignContext.class,0);
		}
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(DBMSParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(DBMSParser.LPAREN, i);
		}
		public List<Comma_id_kContext> comma_id_k() {
			return getRuleContexts(Comma_id_kContext.class);
		}
		public Comma_id_kContext comma_id_k(int i) {
			return getRuleContext(Comma_id_kContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(DBMSParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(DBMSParser.RPAREN, i);
		}
		public ReferencesContext references() {
			return getRuleContext(ReferencesContext.class,0);
		}
		public ForeignKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreignKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterForeignKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitForeignKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitForeignKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeignKeyContext foreignKey() throws RecognitionException {
		ForeignKeyContext _localctx = new ForeignKeyContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_foreignKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(ID);
			setState(373);
			foreign();
			setState(374);
			key();
			setState(375);
			match(LPAREN);
			setState(376);
			match(ID);
			setState(377);
			comma_id_k();
			setState(378);
			match(RPAREN);
			setState(379);
			references();
			setState(380);
			match(ID);
			setState(381);
			match(LPAREN);
			setState(382);
			match(ID);
			setState(383);
			comma_id_k();
			setState(384);
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

	public static class ChecksContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public ChecksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterChecks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitChecks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitChecks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChecksContext checks() throws RecognitionException {
		ChecksContext _localctx = new ChecksContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_checks);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(ID);
			setState(387);
			check();
			setState(388);
			match(LPAREN);
			setState(389);
			exp();
			setState(390);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DBMSParser.INT, 0); }
		public TerminalNode FLOATS() { return getToken(DBMSParser.FLOATS, 0); }
		public TerminalNode DATES() { return getToken(DBMSParser.DATES, 0); }
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
		enterRule(_localctx, 114, RULE_type);
		try {
			setState(399);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(INT);
				}
				break;
			case FLOATS:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(FLOATS);
				}
				break;
			case DATES:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(DATES);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				match(CHAR);
				setState(396);
				match(LPAREN);
				setState(397);
				match(NUM);
				setState(398);
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
		public Comma_action_kContext comma_action_k() {
			return getRuleContext(Comma_action_kContext.class,0);
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
		enterRule(_localctx, 116, RULE_alter_table);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				alter();
				setState(402);
				table();
				setState(403);
				match(ID);
				setState(404);
				rename();
				setState(405);
				to();
				setState(406);
				match(ID);
				setState(407);
				match(END_SQL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				alter();
				setState(410);
				table();
				setState(411);
				match(ID);
				setState(412);
				action();
				setState(413);
				comma_action_k();
				setState(414);
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
		enterRule(_localctx, 118, RULE_drop_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			drop();
			setState(419);
			database();
			setState(420);
			match(ID);
			setState(421);
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
		enterRule(_localctx, 120, RULE_show_tables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			show();
			setState(424);
			tables();
			setState(425);
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
		enterRule(_localctx, 122, RULE_show_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			show();
			setState(428);
			columns();
			setState(429);
			from();
			setState(430);
			match(ID);
			setState(431);
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
		public List<ConstraintAtContext> constraintAt() {
			return getRuleContexts(ConstraintAtContext.class);
		}
		public ConstraintAtContext constraintAt(int i) {
			return getRuleContext(ConstraintAtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
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
		enterRule(_localctx, 124, RULE_action);
		int _la;
		try {
			int _alt;
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				add();
				setState(434);
				column();
				setState(435);
				match(ID);
				setState(436);
				type();
				setState(448);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46))) != 0)) {
					{
					setState(437);
					constraint();
					setState(438);
					constraintAt();
					setState(445);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(439);
							match(COMMA);
							setState(440);
							constraint();
							setState(441);
							constraintAt();
							}
							} 
						}
						setState(447);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				add();
				setState(451);
				constraint();
				setState(452);
				constraintAt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				drop();
				setState(455);
				column();
				setState(456);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(458);
				drop();
				setState(459);
				constraint();
				setState(460);
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
		enterRule(_localctx, 126, RULE_sql_dml);
		try {
			setState(468);
			switch (_input.LA(1)) {
			case T__83:
			case T__84:
			case T__85:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				insert_value();
				}
				break;
			case T__92:
			case T__93:
			case T__94:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				update_value();
				}
				break;
			case T__98:
			case T__99:
			case T__100:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				delete_value();
				}
				break;
			case T__59:
			case T__60:
			case T__61:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
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

	public static class Some_orderContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public Comma_id_kContext comma_id_k() {
			return getRuleContext(Comma_id_kContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public Some_orderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_some_order; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterSome_order(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitSome_order(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitSome_order(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Some_orderContext some_order() throws RecognitionException {
		Some_orderContext _localctx = new Some_orderContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_some_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(470);
				match(LPAREN);
				setState(471);
				match(ID);
				setState(472);
				comma_id_k();
				setState(473);
				match(RPAREN);
				}
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

	public static class Insert_valueContext extends ParserRuleContext {
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public IntoContext into() {
			return getRuleContext(IntoContext.class,0);
		}
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public Some_orderContext some_order() {
			return getRuleContext(Some_orderContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(DBMSParser.LPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Comma_literal_kContext comma_literal_k() {
			return getRuleContext(Comma_literal_kContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(DBMSParser.RPAREN, 0); }
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
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
		enterRule(_localctx, 130, RULE_insert_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			insert();
			setState(478);
			into();
			setState(479);
			match(ID);
			setState(480);
			some_order();
			setState(481);
			values();
			setState(482);
			match(LPAREN);
			setState(483);
			literal();
			setState(484);
			comma_literal_k();
			setState(485);
			match(RPAREN);
			setState(486);
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
		public TerminalNode EQ() { return getToken(DBMSParser.EQ, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Comma_id_eq_literal_kContext comma_id_eq_literal_k() {
			return getRuleContext(Comma_id_eq_literal_kContext.class,0);
		}
		public Where_expContext where_exp() {
			return getRuleContext(Where_expContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
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
		enterRule(_localctx, 132, RULE_update_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			update();
			setState(489);
			match(ID);
			setState(490);
			set();
			setState(491);
			match(ID);
			setState(492);
			match(EQ);
			setState(493);
			literal();
			setState(494);
			comma_id_eq_literal_k();
			setState(495);
			where_exp();
			setState(496);
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
		public Where_expContext where_exp() {
			return getRuleContext(Where_expContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
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
		enterRule(_localctx, 134, RULE_delete_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			delete();
			setState(499);
			from();
			setState(500);
			match(ID);
			setState(501);
			where_exp();
			setState(502);
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
		public Where_expContext where_exp() {
			return getRuleContext(Where_expContext.class,0);
		}
		public TerminalNode END_SQL() { return getToken(DBMSParser.END_SQL, 0); }
		public TerminalNode KL() { return getToken(DBMSParser.KL, 0); }
		public Comma_id_kContext comma_id_k() {
			return getRuleContext(Comma_id_kContext.class,0);
		}
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public ByContext by() {
			return getRuleContext(ByContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<AscContext> asc() {
			return getRuleContexts(AscContext.class);
		}
		public AscContext asc(int i) {
			return getRuleContext(AscContext.class,i);
		}
		public List<DescContext> desc() {
			return getRuleContexts(DescContext.class);
		}
		public DescContext desc(int i) {
			return getRuleContext(DescContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DBMSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DBMSParser.COMMA, i);
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
		enterRule(_localctx, 136, RULE_select_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			select();
			setState(508);
			switch (_input.LA(1)) {
			case KL:
				{
				setState(505);
				match(KL);
				}
				break;
			case ID:
				{
				setState(506);
				match(ID);
				setState(507);
				comma_id_k();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(510);
			from();
			setState(511);
			match(ID);
			setState(512);
			where_exp();
			setState(531);
			_la = _input.LA(1);
			if (((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (T__101 - 102)) | (1L << (T__102 - 102)) | (1L << (T__103 - 102)))) != 0)) {
				{
				setState(513);
				order();
				setState(514);
				by();
				setState(515);
				exp();
				setState(518);
				switch (_input.LA(1)) {
				case T__68:
				case T__69:
				case T__70:
					{
					setState(516);
					asc();
					}
					break;
				case T__71:
				case T__72:
				case T__73:
					{
					setState(517);
					desc();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(520);
					match(COMMA);
					setState(521);
					exp();
					setState(524);
					switch (_input.LA(1)) {
					case T__68:
					case T__69:
					case T__70:
						{
						setState(522);
						asc();
						}
						break;
					case T__71:
					case T__72:
					case T__73:
						{
						setState(523);
						desc();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(533);
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

	public static class Where_expContext extends ParserRuleContext {
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Where_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).enterWhere_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DBMSListener ) ((DBMSListener)listener).exitWhere_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DBMSVisitor ) return ((DBMSVisitor<? extends T>)visitor).visitWhere_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_expContext where_exp() throws RecognitionException {
		Where_expContext _localctx = new Where_expContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_where_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (T__65 - 66)) | (1L << (T__66 - 66)) | (1L << (T__67 - 66)))) != 0)) {
				{
				setState(535);
				where();
				setState(536);
				exp();
				}
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(DBMSParser.NUM, 0); }
		public TerminalNode FLOAT() { return getToken(DBMSParser.FLOAT, 0); }
		public TerminalNode DATE() { return getToken(DBMSParser.DATE, 0); }
		public TerminalNode CHARX() { return getToken(DBMSParser.CHARX, 0); }
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
		enterRule(_localctx, 140, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (NUM - 132)) | (1L << (FLOAT - 132)) | (1L << (CHARX - 132)) | (1L << (DATE - 132)))) != 0)) ) {
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
		enterRule(_localctx, 142, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !(((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & ((1L << (T__107 - 108)) | (1L << (T__108 - 108)) | (1L << (T__109 - 108)) | (1L << (T__110 - 108)) | (1L << (T__111 - 108)) | (1L << (EQ - 108)))) != 0)) ) {
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
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
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
		enterRule(_localctx, 144, RULE_cond_op);
		try {
			setState(546);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				and();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(545);
				or();
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
		enterRule(_localctx, 146, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_la = _input.LA(1);
			if ( !(_la==T__112 || _la==T__113) ) {
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
		enterRule(_localctx, 148, RULE_add_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_la = _input.LA(1);
			if ( !(_la==T__114 || _la==T__115) ) {
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
		enterRule(_localctx, 150, RULE_mult_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (T__116 - 117)) | (1L << (T__117 - 117)) | (1L << (KL - 117)))) != 0)) ) {
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
		enterRule(_localctx, 152, RULE_exp);
		try {
			setState(556);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case LPAREN:
			case ID:
			case NUM:
			case FLOAT:
			case CHARX:
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				expression(0);
				}
				break;
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__101:
			case T__102:
			case T__103:
			case RPAREN:
			case END_SQL:
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
		public OrContext or() {
			return getRuleContext(OrContext.class,0);
		}
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
		int _startState = 154;
		enterRecursionRule(_localctx, 154, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(559);
			andExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(561);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(562);
					or();
					setState(563);
					andExpr(0);
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
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
		int _startState = 156;
		enterRecursionRule(_localctx, 156, RULE_andExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(571);
			eqExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpr);
					setState(573);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(574);
					and();
					setState(575);
					eqExpr(0);
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		int _startState = 158;
		enterRecursionRule(_localctx, 158, RULE_eqExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(583);
			relationExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(591);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EqExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_eqExpr);
					setState(585);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(586);
					eq_op();
					setState(587);
					relationExpr(0);
					}
					} 
				}
				setState(593);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_relationExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(595);
			unaryExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(603);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RelationExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_relationExpr);
					setState(597);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(598);
					rel_op();
					setState(599);
					unaryExpr();
					}
					} 
				}
				setState(605);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DBMSParser.ID, 0); }
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
		enterRule(_localctx, 162, RULE_unaryExpr);
		int _la;
		try {
			setState(617);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				match(LPAREN);
				setState(608);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(607);
					not();
					}
				}

				setState(610);
				match(ID);
				setState(611);
				match(RPAREN);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
					{
					setState(612);
					not();
					}
				}

				setState(615);
				match(ID);
				}
				break;
			case NUM:
			case FLOAT:
			case CHARX:
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				literal();
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

	public static class UnifactorContext extends ParserRuleContext {
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
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
		enterRule(_localctx, 164, RULE_unifactor);
		try {
			setState(623);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				not();
				setState(620);
				factor();
				}
				break;
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(622);
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
		enterRule(_localctx, 166, RULE_factor);
		try {
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(625);
				match(LPAREN);
				setState(626);
				expression(0);
				setState(627);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(630);
				match(ID);
				setState(631);
				matchWildcard();
				setState(632);
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
		case 77:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 78:
			return andExpr_sempred((AndExprContext)_localctx, predIndex);
		case 79:
			return eqExpr_sempred((EqExprContext)_localctx, predIndex);
		case 80:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u008d\u027e\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\6&\u00f4\n&\r&\16&\u00f5"+
		"\3\'\3\'\5\'\u00fa\n\'\3(\3(\5(\u00fe\n(\3)\3)\3)\3)\3)\5)\u0105\n)\3"+
		"*\3*\3*\3*\3*\5*\u010c\n*\3+\3+\7+\u0110\n+\f+\16+\u0113\13+\3,\3,\7,"+
		"\u0117\n,\f,\16,\u011a\13,\3-\3-\3-\3-\7-\u0120\n-\f-\16-\u0123\13-\3"+
		".\3.\7.\u0127\n.\f.\16.\u012a\13.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u0147\n\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\7\64\u0151\n\64\f\64\16\64\u0154\13\64\3\65\3\65\3\65\3\65\7\65"+
		"\u015a\n\65\f\65\16\65\u015d\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\5\67\u016d\n\67\38\38\38\38\38\38"+
		"\38\38\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3;"+
		"\3;\3;\3;\3;\3;\3;\5;\u0192\n;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\5<\u01a3\n<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\7@\u01be\n@\f@\16@\u01c1\13@\5@\u01c3\n@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u01d1\n@\3A\3A\3A\3A\5A\u01d7\nA\3"+
		"B\3B\3B\3B\3B\5B\u01de\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\5F\u01ff\nF\3F\3F\3"+
		"F\3F\3F\3F\3F\3F\5F\u0209\nF\3F\3F\3F\3F\5F\u020f\nF\7F\u0211\nF\fF\16"+
		"F\u0214\13F\5F\u0216\nF\3F\3F\3G\3G\3G\5G\u021d\nG\3H\3H\3I\3I\3J\3J\5"+
		"J\u0225\nJ\3K\3K\3L\3L\3M\3M\3N\3N\5N\u022f\nN\3O\3O\3O\3O\3O\3O\3O\7"+
		"O\u0238\nO\fO\16O\u023b\13O\3P\3P\3P\3P\3P\3P\3P\7P\u0244\nP\fP\16P\u0247"+
		"\13P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\7Q\u0250\nQ\fQ\16Q\u0253\13Q\3R\3R\3R\3R\3R"+
		"\3R\3R\7R\u025c\nR\fR\16R\u025f\13R\3S\3S\5S\u0263\nS\3S\3S\3S\5S\u0268"+
		"\nS\3S\3S\5S\u026c\nS\3T\3T\3T\3T\5T\u0272\nT\3U\3U\3U\3U\3U\3U\3U\3U"+
		"\5U\u027c\nU\3U\2\6\u009c\u009e\u00a0\u00a2V\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\2+\3\2\3\5\3\2"+
		"\6\b\3\2\t\13\3\2\f\16\3\2\17\21\3\2\22\24\3\2\25\27\3\2\30\32\3\2\33"+
		"\35\3\2\35\37\3\2 \"\3\2#%\3\2&(\3\2)+\3\2,.\3\2/\61\3\2\62\64\3\2\65"+
		"\67\3\28:\3\2;=\3\2>@\3\2AC\3\2DF\3\2GI\3\2JL\3\2MO\3\2PR\3\2SU\3\2VX"+
		"\3\2Y[\3\2\\^\3\2_a\3\2bd\3\2eg\3\2hj\3\2km\3\2\u0086\u0089\4\2nr}}\3"+
		"\2st\3\2uv\4\2wx~~\u025d\2\u00aa\3\2\2\2\4\u00ac\3\2\2\2\6\u00ae\3\2\2"+
		"\2\b\u00b0\3\2\2\2\n\u00b2\3\2\2\2\f\u00b4\3\2\2\2\16\u00b6\3\2\2\2\20"+
		"\u00b8\3\2\2\2\22\u00ba\3\2\2\2\24\u00bc\3\2\2\2\26\u00be\3\2\2\2\30\u00c0"+
		"\3\2\2\2\32\u00c2\3\2\2\2\34\u00c4\3\2\2\2\36\u00c6\3\2\2\2 \u00c8\3\2"+
		"\2\2\"\u00ca\3\2\2\2$\u00cc\3\2\2\2&\u00ce\3\2\2\2(\u00d0\3\2\2\2*\u00d2"+
		"\3\2\2\2,\u00d4\3\2\2\2.\u00d6\3\2\2\2\60\u00d8\3\2\2\2\62\u00da\3\2\2"+
		"\2\64\u00dc\3\2\2\2\66\u00de\3\2\2\28\u00e0\3\2\2\2:\u00e2\3\2\2\2<\u00e4"+
		"\3\2\2\2>\u00e6\3\2\2\2@\u00e8\3\2\2\2B\u00ea\3\2\2\2D\u00ec\3\2\2\2F"+
		"\u00ee\3\2\2\2H\u00f0\3\2\2\2J\u00f3\3\2\2\2L\u00f9\3\2\2\2N\u00fd\3\2"+
		"\2\2P\u0104\3\2\2\2R\u010b\3\2\2\2T\u0111\3\2\2\2V\u0118\3\2\2\2X\u0121"+
		"\3\2\2\2Z\u0128\3\2\2\2\\\u012b\3\2\2\2^\u0130\3\2\2\2`\u0138\3\2\2\2"+
		"b\u0146\3\2\2\2d\u0148\3\2\2\2f\u0152\3\2\2\2h\u015b\3\2\2\2j\u015e\3"+
		"\2\2\2l\u016c\3\2\2\2n\u016e\3\2\2\2p\u0176\3\2\2\2r\u0184\3\2\2\2t\u0191"+
		"\3\2\2\2v\u01a2\3\2\2\2x\u01a4\3\2\2\2z\u01a9\3\2\2\2|\u01ad\3\2\2\2~"+
		"\u01d0\3\2\2\2\u0080\u01d6\3\2\2\2\u0082\u01dd\3\2\2\2\u0084\u01df\3\2"+
		"\2\2\u0086\u01ea\3\2\2\2\u0088\u01f4\3\2\2\2\u008a\u01fa\3\2\2\2\u008c"+
		"\u021c\3\2\2\2\u008e\u021e\3\2\2\2\u0090\u0220\3\2\2\2\u0092\u0224\3\2"+
		"\2\2\u0094\u0226\3\2\2\2\u0096\u0228\3\2\2\2\u0098\u022a\3\2\2\2\u009a"+
		"\u022e\3\2\2\2\u009c\u0230\3\2\2\2\u009e\u023c\3\2\2\2\u00a0\u0248\3\2"+
		"\2\2\u00a2\u0254\3\2\2\2\u00a4\u026b\3\2\2\2\u00a6\u0271\3\2\2\2\u00a8"+
		"\u027b\3\2\2\2\u00aa\u00ab\t\2\2\2\u00ab\3\3\2\2\2\u00ac\u00ad\t\3\2\2"+
		"\u00ad\5\3\2\2\2\u00ae\u00af\t\4\2\2\u00af\7\3\2\2\2\u00b0\u00b1\t\5\2"+
		"\2\u00b1\t\3\2\2\2\u00b2\u00b3\t\6\2\2\u00b3\13\3\2\2\2\u00b4\u00b5\t"+
		"\7\2\2\u00b5\r\3\2\2\2\u00b6\u00b7\t\b\2\2\u00b7\17\3\2\2\2\u00b8\u00b9"+
		"\t\t\2\2\u00b9\21\3\2\2\2\u00ba\u00bb\t\n\2\2\u00bb\23\3\2\2\2\u00bc\u00bd"+
		"\t\13\2\2\u00bd\25\3\2\2\2\u00be\u00bf\t\f\2\2\u00bf\27\3\2\2\2\u00c0"+
		"\u00c1\t\r\2\2\u00c1\31\3\2\2\2\u00c2\u00c3\t\16\2\2\u00c3\33\3\2\2\2"+
		"\u00c4\u00c5\t\17\2\2\u00c5\35\3\2\2\2\u00c6\u00c7\t\20\2\2\u00c7\37\3"+
		"\2\2\2\u00c8\u00c9\t\21\2\2\u00c9!\3\2\2\2\u00ca\u00cb\t\22\2\2\u00cb"+
		"#\3\2\2\2\u00cc\u00cd\t\23\2\2\u00cd%\3\2\2\2\u00ce\u00cf\t\24\2\2\u00cf"+
		"\'\3\2\2\2\u00d0\u00d1\t\25\2\2\u00d1)\3\2\2\2\u00d2\u00d3\t\26\2\2\u00d3"+
		"+\3\2\2\2\u00d4\u00d5\t\27\2\2\u00d5-\3\2\2\2\u00d6\u00d7\t\30\2\2\u00d7"+
		"/\3\2\2\2\u00d8\u00d9\t\31\2\2\u00d9\61\3\2\2\2\u00da\u00db\t\32\2\2\u00db"+
		"\63\3\2\2\2\u00dc\u00dd\t\33\2\2\u00dd\65\3\2\2\2\u00de\u00df\t\34\2\2"+
		"\u00df\67\3\2\2\2\u00e0\u00e1\t\35\2\2\u00e19\3\2\2\2\u00e2\u00e3\t\36"+
		"\2\2\u00e3;\3\2\2\2\u00e4\u00e5\t\37\2\2\u00e5=\3\2\2\2\u00e6\u00e7\t"+
		" \2\2\u00e7?\3\2\2\2\u00e8\u00e9\t!\2\2\u00e9A\3\2\2\2\u00ea\u00eb\t\""+
		"\2\2\u00ebC\3\2\2\2\u00ec\u00ed\t#\2\2\u00edE\3\2\2\2\u00ee\u00ef\t$\2"+
		"\2\u00efG\3\2\2\2\u00f0\u00f1\t%\2\2\u00f1I\3\2\2\2\u00f2\u00f4\5L\'\2"+
		"\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6"+
		"\3\2\2\2\u00f6K\3\2\2\2\u00f7\u00fa\5N(\2\u00f8\u00fa\5\u0080A\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00faM\3\2\2\2\u00fb\u00fe\5P)\2\u00fc"+
		"\u00fe\5R*\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00feO\3\2\2\2\u00ff"+
		"\u0105\5\\/\2\u0100\u0105\5^\60\2\u0101\u0105\5`\61\2\u0102\u0105\5b\62"+
		"\2\u0103\u0105\5d\63\2\u0104\u00ff\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0101"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105Q\3\2\2\2\u0106"+
		"\u010c\5j\66\2\u0107\u010c\5v<\2\u0108\u010c\5x=\2\u0109\u010c\5z>\2\u010a"+
		"\u010c\5|?\2\u010b\u0106\3\2\2\2\u010b\u0107\3\2\2\2\u010b\u0108\3\2\2"+
		"\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010cS\3\2\2\2\u010d\u010e"+
		"\7\u008d\2\2\u010e\u0110\7\u0085\2\2\u010f\u010d\3\2\2\2\u0110\u0113\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112U\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0115\7\u008d\2\2\u0115\u0117\5\u008eH\2\u0116\u0114\3"+
		"\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"W\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\7\u008d\2\2\u011c\u011d\7\u0085"+
		"\2\2\u011d\u011e\7}\2\2\u011e\u0120\5\u008eH\2\u011f\u011b\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122Y\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0124\u0125\7\u008d\2\2\u0125\u0127\5~@\2\u0126\u0124"+
		"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"[\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012c\5\b\5\2\u012c\u012d\5\n\6\2"+
		"\u012d\u012e\7\u0085\2\2\u012e\u012f\7\u008c\2\2\u012f]\3\2\2\2\u0130"+
		"\u0131\5\32\16\2\u0131\u0132\5\n\6\2\u0132\u0133\7\u0085\2\2\u0133\u0134"+
		"\5\36\20\2\u0134\u0135\5\64\33\2\u0135\u0136\7\u0085\2\2\u0136\u0137\7"+
		"\u008c\2\2\u0137_\3\2\2\2\u0138\u0139\5\30\r\2\u0139\u013a\5\n\6\2\u013a"+
		"\u013b\7\u0085\2\2\u013b\u013c\7\u008c\2\2\u013ca\3\2\2\2\u013d\u013e"+
		"\5\26\f\2\u013e\u013f\5\f\7\2\u013f\u0140\7\u0085\2\2\u0140\u0141\7\u008c"+
		"\2\2\u0141\u0147\3\2\2\2\u0142\u0143\5\26\f\2\u0143\u0144\5\f\7\2\u0144"+
		"\u0145\7\u008c\2\2\u0145\u0147\3\2\2\2\u0146\u013d\3\2\2\2\u0146\u0142"+
		"\3\2\2\2\u0147c\3\2\2\2\u0148\u0149\5\34\17\2\u0149\u014a\5\n\6\2\u014a"+
		"\u014b\7\u0085\2\2\u014b\u014c\7\u008c\2\2\u014ce\3\2\2\2\u014d\u014e"+
		"\7\u008d\2\2\u014e\u014f\7\u0085\2\2\u014f\u0151\5t;\2\u0150\u014d\3\2"+
		"\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"g\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7\u008d\2\2\u0156\u0157\5 \21"+
		"\2\u0157\u0158\5l\67\2\u0158\u015a\3\2\2\2\u0159\u0155\3\2\2\2\u015a\u015d"+
		"\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015ci\3\2\2\2\u015d"+
		"\u015b\3\2\2\2\u015e\u015f\5\b\5\2\u015f\u0160\5\16\b\2\u0160\u0161\7"+
		"\u0085\2\2\u0161\u0162\7y\2\2\u0162\u0163\7\u0085\2\2\u0163\u0164\5t;"+
		"\2\u0164\u0165\5f\64\2\u0165\u0166\5h\65\2\u0166\u0167\7z\2\2\u0167\u0168"+
		"\7\u008c\2\2\u0168k\3\2\2\2\u0169\u016d\5n8\2\u016a\u016d\5p9\2\u016b"+
		"\u016d\5r:\2\u016c\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2"+
		"\2\u016dm\3\2\2\2\u016e\u016f\7\u0085\2\2\u016f\u0170\5$\23\2\u0170\u0171"+
		"\5\"\22\2\u0171\u0172\7y\2\2\u0172\u0173\7\u0085\2\2\u0173\u0174\5T+\2"+
		"\u0174\u0175\7z\2\2\u0175o\3\2\2\2\u0176\u0177\7\u0085\2\2\u0177\u0178"+
		"\5&\24\2\u0178\u0179\5\"\22\2\u0179\u017a\7y\2\2\u017a\u017b\7\u0085\2"+
		"\2\u017b\u017c\5T+\2\u017c\u017d\7z\2\2\u017d\u017e\5\66\34\2\u017e\u017f"+
		"\7\u0085\2\2\u017f\u0180\7y\2\2\u0180\u0181\7\u0085\2\2\u0181\u0182\5"+
		"T+\2\u0182\u0183\7z\2\2\u0183q\3\2\2\2\u0184\u0185\7\u0085\2\2\u0185\u0186"+
		"\5(\25\2\u0186\u0187\7y\2\2\u0187\u0188\5\u009aN\2\u0188\u0189\7z\2\2"+
		"\u0189s\3\2\2\2\u018a\u0192\7\177\2\2\u018b\u0192\7\u0080\2\2\u018c\u0192"+
		"\7\u0081\2\2\u018d\u018e\7\u0082\2\2\u018e\u018f\7y\2\2\u018f\u0190\7"+
		"\u0086\2\2\u0190\u0192\7z\2\2\u0191\u018a\3\2\2\2\u0191\u018b\3\2\2\2"+
		"\u0191\u018c\3\2\2\2\u0191\u018d\3\2\2\2\u0192u\3\2\2\2\u0193\u0194\5"+
		"\32\16\2\u0194\u0195\5\16\b\2\u0195\u0196\7\u0085\2\2\u0196\u0197\5\36"+
		"\20\2\u0197\u0198\5\64\33\2\u0198\u0199\7\u0085\2\2\u0199\u019a\7\u008c"+
		"\2\2\u019a\u01a3\3\2\2\2\u019b\u019c\5\32\16\2\u019c\u019d\5\16\b\2\u019d"+
		"\u019e\7\u0085\2\2\u019e\u019f\5~@\2\u019f\u01a0\5Z.\2\u01a0\u01a1\7\u008c"+
		"\2\2\u01a1\u01a3\3\2\2\2\u01a2\u0193\3\2\2\2\u01a2\u019b\3\2\2\2\u01a3"+
		"w\3\2\2\2\u01a4\u01a5\5\30\r\2\u01a5\u01a6\5\n\6\2\u01a6\u01a7\7\u0085"+
		"\2\2\u01a7\u01a8\7\u008c\2\2\u01a8y\3\2\2\2\u01a9\u01aa\5\26\f\2\u01aa"+
		"\u01ab\5\20\t\2\u01ab\u01ac\7\u008c\2\2\u01ac{\3\2\2\2\u01ad\u01ae\5\26"+
		"\f\2\u01ae\u01af\5\24\13\2\u01af\u01b0\5,\27\2\u01b0\u01b1\7\u0085\2\2"+
		"\u01b1\u01b2\7\u008c\2\2\u01b2}\3\2\2\2\u01b3\u01b4\58\35\2\u01b4\u01b5"+
		"\5\22\n\2\u01b5\u01b6\7\u0085\2\2\u01b6\u01c2\5t;\2\u01b7\u01b8\5 \21"+
		"\2\u01b8\u01bf\5l\67\2\u01b9\u01ba\7\u008d\2\2\u01ba\u01bb\5 \21\2\u01bb"+
		"\u01bc\5l\67\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\u01c1\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1"+
		"\u01bf\3\2\2\2\u01c2\u01b7\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01d1\3\2"+
		"\2\2\u01c4\u01c5\58\35\2\u01c5\u01c6\5 \21\2\u01c6\u01c7\5l\67\2\u01c7"+
		"\u01d1\3\2\2\2\u01c8\u01c9\5\30\r\2\u01c9\u01ca\5\22\n\2\u01ca\u01cb\7"+
		"\u0085\2\2\u01cb\u01d1\3\2\2\2\u01cc\u01cd\5\30\r\2\u01cd\u01ce\5 \21"+
		"\2\u01ce\u01cf\7\u0085\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01b3\3\2\2\2\u01d0"+
		"\u01c4\3\2\2\2\u01d0\u01c8\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d1\177\3\2\2"+
		"\2\u01d2\u01d7\5\u0084C\2\u01d3\u01d7\5\u0086D\2\u01d4\u01d7\5\u0088E"+
		"\2\u01d5\u01d7\5\u008aF\2\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7\u0081\3\2\2\2\u01d8\u01d9\7y"+
		"\2\2\u01d9\u01da\7\u0085\2\2\u01da\u01db\5T+\2\u01db\u01dc\7z\2\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01d8\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u0083\3\2"+
		"\2\2\u01df\u01e0\5:\36\2\u01e0\u01e1\5<\37\2\u01e1\u01e2\7\u0085\2\2\u01e2"+
		"\u01e3\5\u0082B\2\u01e3\u01e4\5> \2\u01e4\u01e5\7y\2\2\u01e5\u01e6\5\u008e"+
		"H\2\u01e6\u01e7\5V,\2\u01e7\u01e8\7z\2\2\u01e8\u01e9\7\u008c\2\2\u01e9"+
		"\u0085\3\2\2\2\u01ea\u01eb\5@!\2\u01eb\u01ec\7\u0085\2\2\u01ec\u01ed\5"+
		"B\"\2\u01ed\u01ee\7\u0085\2\2\u01ee\u01ef\7}\2\2\u01ef\u01f0\5\u008eH"+
		"\2\u01f0\u01f1\5X-\2\u01f1\u01f2\5\u008cG\2\u01f2\u01f3\7\u008c\2\2\u01f3"+
		"\u0087\3\2\2\2\u01f4\u01f5\5D#\2\u01f5\u01f6\5,\27\2\u01f6\u01f7\7\u0085"+
		"\2\2\u01f7\u01f8\5\u008cG\2\u01f8\u01f9\7\u008c\2\2\u01f9\u0089\3\2\2"+
		"\2\u01fa\u01fe\5*\26\2\u01fb\u01ff\7~\2\2\u01fc\u01fd\7\u0085\2\2\u01fd"+
		"\u01ff\5T+\2\u01fe\u01fb\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\3\2\2"+
		"\2\u0200\u0201\5,\27\2\u0201\u0202\7\u0085\2\2\u0202\u0215\5\u008cG\2"+
		"\u0203\u0204\5F$\2\u0204\u0205\5H%\2\u0205\u0208\5\u009aN\2\u0206\u0209"+
		"\5\60\31\2\u0207\u0209\5\62\32\2\u0208\u0206\3\2\2\2\u0208\u0207\3\2\2"+
		"\2\u0209\u0212\3\2\2\2\u020a\u020b\7\u008d\2\2\u020b\u020e\5\u009aN\2"+
		"\u020c\u020f\5\60\31\2\u020d\u020f\5\62\32\2\u020e\u020c\3\2\2\2\u020e"+
		"\u020d\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u020a\3\2\2\2\u0211\u0214\3\2"+
		"\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0216\3\2\2\2\u0214"+
		"\u0212\3\2\2\2\u0215\u0203\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2"+
		"\2\2\u0217\u0218\7\u008c\2\2\u0218\u008b\3\2\2\2\u0219\u021a\5.\30\2\u021a"+
		"\u021b\5\u009aN\2\u021b\u021d\3\2\2\2\u021c\u0219\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u008d\3\2\2\2\u021e\u021f\t&\2\2\u021f\u008f\3\2\2\2\u0220"+
		"\u0221\t\'\2\2\u0221\u0091\3\2\2\2\u0222\u0225\5\2\2\2\u0223\u0225\5\4"+
		"\3\2\u0224\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u0093\3\2\2\2\u0226"+
		"\u0227\t(\2\2\u0227\u0095\3\2\2\2\u0228\u0229\t)\2\2\u0229\u0097\3\2\2"+
		"\2\u022a\u022b\t*\2\2\u022b\u0099\3\2\2\2\u022c\u022f\5\u009cO\2\u022d"+
		"\u022f\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f\u009b\3\2"+
		"\2\2\u0230\u0231\bO\1\2\u0231\u0232\5\u009eP\2\u0232\u0239\3\2\2\2\u0233"+
		"\u0234\f\3\2\2\u0234\u0235\5\4\3\2\u0235\u0236\5\u009eP\2\u0236\u0238"+
		"\3\2\2\2\u0237\u0233\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\u009d\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\bP"+
		"\1\2\u023d\u023e\5\u00a0Q\2\u023e\u0245\3\2\2\2\u023f\u0240\f\3\2\2\u0240"+
		"\u0241\5\2\2\2\u0241\u0242\5\u00a0Q\2\u0242\u0244\3\2\2\2\u0243\u023f"+
		"\3\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u009f\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\bQ\1\2\u0249\u024a\5\u00a2"+
		"R\2\u024a\u0251\3\2\2\2\u024b\u024c\f\3\2\2\u024c\u024d\5\u0094K\2\u024d"+
		"\u024e\5\u00a2R\2\u024e\u0250\3\2\2\2\u024f\u024b\3\2\2\2\u0250\u0253"+
		"\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u00a1\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0254\u0255\bR\1\2\u0255\u0256\5\u00a4S\2\u0256\u025d\3"+
		"\2\2\2\u0257\u0258\f\3\2\2\u0258\u0259\5\u0090I\2\u0259\u025a\5\u00a4"+
		"S\2\u025a\u025c\3\2\2\2\u025b\u0257\3\2\2\2\u025c\u025f\3\2\2\2\u025d"+
		"\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u00a3\3\2\2\2\u025f\u025d\3\2"+
		"\2\2\u0260\u0262\7y\2\2\u0261\u0263\5\6\4\2\u0262\u0261\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\7\u0085\2\2\u0265\u026c"+
		"\7z\2\2\u0266\u0268\5\6\4\2\u0267\u0266\3\2\2\2\u0267\u0268\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026c\7\u0085\2\2\u026a\u026c\5\u008eH\2\u026b\u0260"+
		"\3\2\2\2\u026b\u0267\3\2\2\2\u026b\u026a\3\2\2\2\u026c\u00a5\3\2\2\2\u026d"+
		"\u026e\5\6\4\2\u026e\u026f\5\u00a8U\2\u026f\u0272\3\2\2\2\u0270\u0272"+
		"\5\u00a8U\2\u0271\u026d\3\2\2\2\u0271\u0270\3\2\2\2\u0272\u00a7\3\2\2"+
		"\2\u0273\u0274\7y\2\2\u0274\u0275\5\u009cO\2\u0275\u0276\7z\2\2\u0276"+
		"\u027c\3\2\2\2\u0277\u027c\7\u0085\2\2\u0278\u0279\7\u0085\2\2\u0279\u027a"+
		"\13\2\2\2\u027a\u027c\7\u0085\2\2\u027b\u0273\3\2\2\2\u027b\u0277\3\2"+
		"\2\2\u027b\u0278\3\2\2\2\u027c\u00a9\3\2\2\2\'\u00f5\u00f9\u00fd\u0104"+
		"\u010b\u0111\u0118\u0121\u0128\u0146\u0152\u015b\u016c\u0191\u01a2\u01bf"+
		"\u01c2\u01d0\u01d6\u01dd\u01fe\u0208\u020e\u0212\u0215\u021c\u0224\u022e"+
		"\u0239\u0245\u0251\u025d\u0262\u0267\u026b\u0271\u027b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}