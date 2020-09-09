package 한국.메인.울릉.Antlr;// Generated from ulleung.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ulleungParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PUBLIC=6, PROTECTED=7, PRIVATE=8, 
		STATIC=9, ABSTRACT=10, CLASS=11, EXTEND=12, OVERRIDE=13, INTERFACE=14, 
		IMPLEMENT=15, FUNCTION=16, REQUIRE=17, RETURN=18, CREATE=19, ADD=20, SUBTRACT=21, 
		MULTIPLY=22, DIVIDE=23, MODULAR=24, IF=25, TRUE=26, FALSE=27, BIGGER=28, 
		NOT_BIGGER=29, SMALLER=30, NOT_SMALLER=31, EQUAL=32, AND=33, OR=34, FOR=35, 
		FORCONNECTOR1=36, FORCONNECTOR2=37, PACKAGE_STATE=38, PACKAGE_IMPORT=39, 
		WHITESPACE=40, IDENTIFIER=41, VAR_VALUE=42, COLON=43, SEMICOLON=44, SINGLEQOUTE=45, 
		DOUBLEQOUTE=46, EQUALS=47, ARRAY=48;
	public static final int
		RULE_program = 0, RULE_define_package = 1, RULE_define_import = 2, RULE_define_class = 3, 
		RULE_define_interface = 4, RULE_define_global_var = 5, RULE_define_function = 6, 
		RULE_public_type = 7, RULE_type_name = 8, RULE_type_name_array = 9, RULE_args = 10, 
		RULE_passed_arg = 11, RULE_passed_args = 12, RULE_new_object = 13, RULE_calculation = 14, 
		RULE_change_type = 15, RULE_equality = 16, RULE_define_var = 17, RULE_method = 18, 
		RULE_first_passed_args = 19, RULE_statement = 20, RULE_compare = 21, RULE_single_boolean = 22, 
		RULE_booleans = 23, RULE_define_if = 24, RULE_for_start = 25, RULE_for_statement = 26, 
		RULE_define_for = 27, RULE_package_name = 28;
	public static final String[] ruleNames = {
		"program", "define_package", "define_import", "define_class", "define_interface", 
		"define_global_var", "define_function", "public_type", "type_name", "type_name_array", 
		"args", "passed_arg", "passed_args", "new_object", "calculation", "change_type", 
		"equality", "define_var", "method", "first_passed_args", "statement", 
		"compare", "single_boolean", "booleans", "define_if", "for_start", "for_statement", 
		"define_for", "package_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "', '", "'('", "'.)'", "')'", "'.'", "'\uB4E4\uCDB0\uC9C4'", "'\uAC10\uCDB0\uC9C4'", 
		"'\uC228\uACA8\uC9C4'", "'\uC815\uC801'", "'\uCD94\uC0C1\uC801'", "'\uAC1D\uCCB4'", 
		null, "'\uB367\uC50C\uC6B4'", "'\uD2C0'", null, "'\uD568\uC218'", "'\uC694\uAD6C'", 
		"'\uB3CC\uB824\uC8FC\uAE30'", "'\uC0DD\uC131'", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'\uB9CC\uC57D'", "'\uCC38'", "'\uAC70\uC9D3'", "'>'", "'<='", 
		"'<'", "'>='", "'=='", "'\uC774\uACE0'", "'\uC774\uAC70\uB098'", "'\uBC18\uBCF5'", 
		"'\uC73C\uB85C'", "'\uB3D9\uC548'", "'\uC81C\uC791'", "'\uB3C4\uC785'", 
		null, null, null, "':'", "';'", "'''", "'\"'", "'='", "'\uC758 \uBC30\uC5F4'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "PUBLIC", "PROTECTED", "PRIVATE", 
		"STATIC", "ABSTRACT", "CLASS", "EXTEND", "OVERRIDE", "INTERFACE", "IMPLEMENT", 
		"FUNCTION", "REQUIRE", "RETURN", "CREATE", "ADD", "SUBTRACT", "MULTIPLY", 
		"DIVIDE", "MODULAR", "IF", "TRUE", "FALSE", "BIGGER", "NOT_BIGGER", "SMALLER", 
		"NOT_SMALLER", "EQUAL", "AND", "OR", "FOR", "FORCONNECTOR1", "FORCONNECTOR2", 
		"PACKAGE_STATE", "PACKAGE_IMPORT", "WHITESPACE", "IDENTIFIER", "VAR_VALUE", 
		"COLON", "SEMICOLON", "SINGLEQOUTE", "DOUBLEQOUTE", "EQUALS", "ARRAY"
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
	public String getGrammarFileName() { return "ulleung.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ulleungParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Define_packageContext define_package() {
			return getRuleContext(Define_packageContext.class,0);
		}
		public List<Define_importContext> define_import() {
			return getRuleContexts(Define_importContext.class);
		}
		public Define_importContext define_import(int i) {
			return getRuleContext(Define_importContext.class,i);
		}
		public List<Define_classContext> define_class() {
			return getRuleContexts(Define_classContext.class);
		}
		public Define_classContext define_class(int i) {
			return getRuleContext(Define_classContext.class,i);
		}
		public List<Define_interfaceContext> define_interface() {
			return getRuleContexts(Define_interfaceContext.class);
		}
		public Define_interfaceContext define_interface(int i) {
			return getRuleContext(Define_interfaceContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			define_package();
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					define_import();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << CLASS) | (1L << INTERFACE) | (1L << IMPLEMENT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(65);
					define_class();
					}
					break;
				case 2:
					{
					setState(66);
					define_interface();
					}
					break;
				}
				}
				setState(71);
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

	public static class Define_packageContext extends ParserRuleContext {
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public TerminalNode PACKAGE_STATE() { return getToken(ulleungParser.PACKAGE_STATE, 0); }
		public Define_packageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_package; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_package(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_package(this);
		}
	}

	public final Define_packageContext define_package() throws RecognitionException {
		Define_packageContext _localctx = new Define_packageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_define_package);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			package_name();
			setState(73);
			match(PACKAGE_STATE);
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

	public static class Define_importContext extends ParserRuleContext {
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public TerminalNode PACKAGE_IMPORT() { return getToken(ulleungParser.PACKAGE_IMPORT, 0); }
		public Define_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_import(this);
		}
	}

	public final Define_importContext define_import() throws RecognitionException {
		Define_importContext _localctx = new Define_importContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_define_import);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			package_name();
			setState(76);
			match(PACKAGE_IMPORT);
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

	public static class Define_classContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(ulleungParser.CLASS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ulleungParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ulleungParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ulleungParser.SEMICOLON, 0); }
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public TerminalNode EXTEND() { return getToken(ulleungParser.EXTEND, 0); }
		public TerminalNode IMPLEMENT() { return getToken(ulleungParser.IMPLEMENT, 0); }
		public Public_typeContext public_type() {
			return getRuleContext(Public_typeContext.class,0);
		}
		public List<Define_global_varContext> define_global_var() {
			return getRuleContexts(Define_global_varContext.class);
		}
		public Define_global_varContext define_global_var(int i) {
			return getRuleContext(Define_global_varContext.class,i);
		}
		public List<Define_functionContext> define_function() {
			return getRuleContexts(Define_functionContext.class);
		}
		public Define_functionContext define_function(int i) {
			return getRuleContext(Define_functionContext.class,i);
		}
		public Define_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_class(this);
		}
	}

	public final Define_classContext define_class() throws RecognitionException {
		Define_classContext _localctx = new Define_classContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_define_class);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(78);
				type_name();
				setState(79);
				match(EXTEND);
				}
				break;
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << IMPLEMENT) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1 || _la==IDENTIFIER) {
					{
					setState(83);
					type_name();
					}
				}

				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(86);
					match(T__0);
					setState(87);
					type_name();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(IMPLEMENT);
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(96);
				public_type();
				}
			}

			setState(99);
			match(CLASS);
			setState(100);
			match(IDENTIFIER);
			setState(101);
			match(COLON);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC) | (1L << ABSTRACT) | (1L << OVERRIDE) | (1L << FUNCTION) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(102);
					define_global_var();
					}
					break;
				case 2:
					{
					setState(103);
					define_function();
					}
					break;
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(SEMICOLON);
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

	public static class Define_interfaceContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ulleungParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ulleungParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ulleungParser.COLON, 0); }
		public TerminalNode SEMICOLON() { return getToken(ulleungParser.SEMICOLON, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode EXTEND() { return getToken(ulleungParser.EXTEND, 0); }
		public Public_typeContext public_type() {
			return getRuleContext(Public_typeContext.class,0);
		}
		public List<Define_global_varContext> define_global_var() {
			return getRuleContexts(Define_global_varContext.class);
		}
		public Define_global_varContext define_global_var(int i) {
			return getRuleContext(Define_global_varContext.class,i);
		}
		public List<Define_functionContext> define_function() {
			return getRuleContexts(Define_functionContext.class);
		}
		public Define_functionContext define_function(int i) {
			return getRuleContext(Define_functionContext.class,i);
		}
		public Define_interfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_interface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_interface(this);
		}
	}

	public final Define_interfaceContext define_interface() throws RecognitionException {
		Define_interfaceContext _localctx = new Define_interfaceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_define_interface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==IDENTIFIER) {
				{
				setState(111);
				type_name();
				setState(112);
				match(EXTEND);
				}
			}

			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(116);
				public_type();
				}
			}

			setState(119);
			match(INTERFACE);
			setState(120);
			match(IDENTIFIER);
			setState(121);
			match(COLON);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC) | (1L << ABSTRACT) | (1L << OVERRIDE) | (1L << FUNCTION) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(124);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(122);
					define_global_var();
					}
					break;
				case 2:
					{
					setState(123);
					define_function();
					}
					break;
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(SEMICOLON);
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

	public static class Define_global_varContext extends ParserRuleContext {
		public Type_name_arrayContext type_name_array() {
			return getRuleContext(Type_name_arrayContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ulleungParser.IDENTIFIER, 0); }
		public TerminalNode OVERRIDE() { return getToken(ulleungParser.OVERRIDE, 0); }
		public Public_typeContext public_type() {
			return getRuleContext(Public_typeContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ulleungParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ulleungParser.ABSTRACT, 0); }
		public TerminalNode EQUALS() { return getToken(ulleungParser.EQUALS, 0); }
		public New_objectContext new_object() {
			return getRuleContext(New_objectContext.class,0);
		}
		public TerminalNode VAR_VALUE() { return getToken(ulleungParser.VAR_VALUE, 0); }
		public Define_global_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_global_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_global_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_global_var(this);
		}
	}

	public final Define_global_varContext define_global_var() throws RecognitionException {
		Define_global_varContext _localctx = new Define_global_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_define_global_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(131);
				match(OVERRIDE);
				}
			}

			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(134);
				public_type();
				}
			}

			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(137);
				match(STATIC);
				}
			}

			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(140);
				match(ABSTRACT);
				}
			}

			setState(143);
			type_name_array();
			setState(144);
			match(IDENTIFIER);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(145);
				match(EQUALS);
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case IDENTIFIER:
					{
					setState(146);
					new_object();
					}
					break;
				case VAR_VALUE:
					{
					setState(147);
					match(VAR_VALUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class Define_functionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ulleungParser.FUNCTION, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ulleungParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ulleungParser.COLON, i);
		}
		public TerminalNode SEMICOLON() { return getToken(ulleungParser.SEMICOLON, 0); }
		public TerminalNode OVERRIDE() { return getToken(ulleungParser.OVERRIDE, 0); }
		public Public_typeContext public_type() {
			return getRuleContext(Public_typeContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ulleungParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ulleungParser.ABSTRACT, 0); }
		public Type_name_arrayContext type_name_array() {
			return getRuleContext(Type_name_arrayContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode REQUIRE() { return getToken(ulleungParser.REQUIRE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(ulleungParser.RETURN, 0); }
		public TerminalNode VAR_VALUE() { return getToken(ulleungParser.VAR_VALUE, 0); }
		public Define_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_function(this);
		}
	}

	public final Define_functionContext define_function() throws RecognitionException {
		Define_functionContext _localctx = new Define_functionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_define_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OVERRIDE) {
				{
				setState(152);
				match(OVERRIDE);
				}
			}

			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(155);
				public_type();
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(158);
				match(STATIC);
				}
			}

			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ABSTRACT) {
				{
				setState(161);
				match(ABSTRACT);
				}
			}

			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1 || _la==IDENTIFIER) {
				{
				setState(164);
				type_name_array();
				}
			}

			setState(167);
			match(FUNCTION);
			setState(168);
			match(IDENTIFIER);
			setState(169);
			match(COLON);
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(170);
				args();
				setState(171);
				match(REQUIRE);
				}
				break;
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(175);
				statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(181);
				match(COLON);
				setState(182);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==VAR_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				match(RETURN);
				}
			}

			setState(186);
			match(SEMICOLON);
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

	public static class Public_typeContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ulleungParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ulleungParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ulleungParser.PRIVATE, 0); }
		public Public_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_public_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterPublic_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitPublic_type(this);
		}
	}

	public final Public_typeContext public_type() throws RecognitionException {
		Public_typeContext _localctx = new Public_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_public_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Type_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ulleungParser.IDENTIFIER, 0); }
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitType_name(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(190);
				match(T__1);
				setState(191);
				package_name();
				setState(192);
				match(T__2);
				}
			}

			setState(196);
			match(IDENTIFIER);
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

	public static class Type_name_arrayContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ulleungParser.IDENTIFIER, 0); }
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(ulleungParser.ARRAY, 0); }
		public Type_name_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterType_name_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitType_name_array(this);
		}
	}

	public final Type_name_arrayContext type_name_array() throws RecognitionException {
		Type_name_arrayContext _localctx = new Type_name_arrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type_name_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(198);
				match(T__1);
				setState(199);
				package_name();
				setState(200);
				match(T__2);
				}
			}

			setState(204);
			match(IDENTIFIER);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(205);
				match(ARRAY);
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

	public static class ArgsContext extends ParserRuleContext {
		public List<Type_name_arrayContext> type_name_array() {
			return getRuleContexts(Type_name_arrayContext.class);
		}
		public Type_name_arrayContext type_name_array(int i) {
			return getRuleContext(Type_name_arrayContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitArgs(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			type_name_array();
			setState(209);
			match(IDENTIFIER);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(210);
				match(T__0);
				setState(211);
				type_name_array();
				setState(212);
				match(IDENTIFIER);
				}
				}
				setState(218);
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

	public static class Passed_argContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode VAR_VALUE() { return getToken(ulleungParser.VAR_VALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ulleungParser.IDENTIFIER, 0); }
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public Passed_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passed_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterPassed_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitPassed_arg(this);
		}
	}

	public final Passed_argContext passed_arg() throws RecognitionException {
		Passed_argContext _localctx = new Passed_argContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_passed_arg);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(VAR_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(222);
				calculation();
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

	public static class Passed_argsContext extends ParserRuleContext {
		public List<Passed_argContext> passed_arg() {
			return getRuleContexts(Passed_argContext.class);
		}
		public Passed_argContext passed_arg(int i) {
			return getRuleContext(Passed_argContext.class,i);
		}
		public Passed_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passed_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterPassed_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitPassed_args(this);
		}
	}

	public final Passed_argsContext passed_args() throws RecognitionException {
		Passed_argsContext _localctx = new Passed_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_passed_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			passed_arg();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(226);
				match(T__0);
				setState(227);
				passed_arg();
				}
				}
				setState(232);
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

	public static class New_objectContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(ulleungParser.CREATE, 0); }
		public Passed_argsContext passed_args() {
			return getRuleContext(Passed_argsContext.class,0);
		}
		public New_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterNew_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitNew_object(this);
		}
	}

	public final New_objectContext new_object() throws RecognitionException {
		New_objectContext _localctx = new New_objectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_new_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			type_name();
			setState(234);
			match(T__1);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << VAR_VALUE))) != 0)) {
				{
				setState(235);
				passed_args();
				}
			}

			setState(238);
			match(T__3);
			setState(239);
			match(CREATE);
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

	public static class CalculationContext extends ParserRuleContext {
		public List<TerminalNode> ADD() { return getTokens(ulleungParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ulleungParser.ADD, i);
		}
		public List<TerminalNode> SUBTRACT() { return getTokens(ulleungParser.SUBTRACT); }
		public TerminalNode SUBTRACT(int i) {
			return getToken(ulleungParser.SUBTRACT, i);
		}
		public List<TerminalNode> MULTIPLY() { return getTokens(ulleungParser.MULTIPLY); }
		public TerminalNode MULTIPLY(int i) {
			return getToken(ulleungParser.MULTIPLY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(ulleungParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(ulleungParser.DIVIDE, i);
		}
		public List<TerminalNode> MODULAR() { return getTokens(ulleungParser.MODULAR); }
		public TerminalNode MODULAR(int i) {
			return getToken(ulleungParser.MODULAR, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public List<TerminalNode> VAR_VALUE() { return getTokens(ulleungParser.VAR_VALUE); }
		public TerminalNode VAR_VALUE(int i) {
			return getToken(ulleungParser.VAR_VALUE, i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public CalculationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calculation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterCalculation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitCalculation(this);
		}
	}

	public final CalculationContext calculation() throws RecognitionException {
		CalculationContext _localctx = new CalculationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_calculation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(241);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(242);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(243);
				method();
				}
				break;
			}
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(247);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(248);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(249);
				method();
				}
				break;
			}
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) {
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(253);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(254);
					match(VAR_VALUE);
					}
					break;
				case 3:
					{
					setState(255);
					method();
					}
					break;
				}
				}
				}
				setState(262);
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

	public static class Change_typeContext extends ParserRuleContext {
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public TerminalNode VAR_VALUE() { return getToken(ulleungParser.VAR_VALUE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ulleungParser.IDENTIFIER, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Change_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_change_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterChange_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitChange_type(this);
		}
	}

	public final Change_typeContext change_type() throws RecognitionException {
		Change_typeContext _localctx = new Change_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_change_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__1);
			setState(264);
			type_name();
			setState(265);
			match(T__3);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(266);
				calculation();
				}
				break;
			case 2:
				{
				setState(267);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(268);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(269);
				method();
				}
				break;
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

	public static class EqualityContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(ulleungParser.EQUALS, 0); }
		public Change_typeContext change_type() {
			return getRuleContext(Change_typeContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public TerminalNode VAR_VALUE() { return getToken(ulleungParser.VAR_VALUE, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitEquality(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(IDENTIFIER);
			setState(273);
			match(EQUALS);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(274);
				change_type();
				}
				break;
			case 2:
				{
				setState(275);
				calculation();
				}
				break;
			case 3:
				{
				setState(276);
				match(VAR_VALUE);
				}
				break;
			case 4:
				{
				setState(277);
				match(IDENTIFIER);
				}
				break;
			case 5:
				{
				setState(278);
				method();
				}
				break;
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

	public static class Define_varContext extends ParserRuleContext {
		public Type_name_arrayContext type_name_array() {
			return getRuleContext(Type_name_arrayContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(ulleungParser.EQUALS, 0); }
		public New_objectContext new_object() {
			return getRuleContext(New_objectContext.class,0);
		}
		public Change_typeContext change_type() {
			return getRuleContext(Change_typeContext.class,0);
		}
		public CalculationContext calculation() {
			return getRuleContext(CalculationContext.class,0);
		}
		public TerminalNode VAR_VALUE() { return getToken(ulleungParser.VAR_VALUE, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Define_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_var(this);
		}
	}

	public final Define_varContext define_var() throws RecognitionException {
		Define_varContext _localctx = new Define_varContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_define_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			type_name_array();
			setState(282);
			match(IDENTIFIER);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(283);
				match(EQUALS);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(284);
					new_object();
					}
					break;
				case 2:
					{
					setState(285);
					change_type();
					}
					break;
				case 3:
					{
					setState(286);
					calculation();
					}
					break;
				case 4:
					{
					setState(287);
					match(VAR_VALUE);
					}
					break;
				case 5:
					{
					setState(288);
					match(IDENTIFIER);
					}
					break;
				case 6:
					{
					setState(289);
					method();
					}
					break;
				}
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

	public static class MethodContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public First_passed_argsContext first_passed_args() {
			return getRuleContext(First_passed_argsContext.class,0);
		}
		public List<Passed_argsContext> passed_args() {
			return getRuleContexts(Passed_argsContext.class);
		}
		public Passed_argsContext passed_args(int i) {
			return getRuleContext(Passed_argsContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(294);
				type_name();
				setState(295);
				match(T__4);
				}
				break;
			}
			setState(299);
			match(IDENTIFIER);
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(300);
				first_passed_args();
				}
				break;
			}
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(303);
				match(T__4);
				setState(304);
				match(IDENTIFIER);
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(305);
					match(T__1);
					setState(307);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << VAR_VALUE))) != 0)) {
						{
						setState(306);
						passed_args();
						}
					}

					setState(309);
					match(T__3);
					}
					break;
				}
				}
				}
				setState(316);
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

	public static class First_passed_argsContext extends ParserRuleContext {
		public Passed_argsContext passed_args() {
			return getRuleContext(Passed_argsContext.class,0);
		}
		public First_passed_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_first_passed_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterFirst_passed_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitFirst_passed_args(this);
		}
	}

	public final First_passed_argsContext first_passed_args() throws RecognitionException {
		First_passed_argsContext _localctx = new First_passed_argsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_first_passed_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__1);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IDENTIFIER) | (1L << VAR_VALUE))) != 0)) {
				{
				setState(318);
				passed_args();
				}
			}

			setState(321);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public Define_varContext define_var() {
			return getRuleContext(Define_varContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Define_forContext define_for() {
			return getRuleContext(Define_forContext.class,0);
		}
		public Define_ifContext define_if() {
			return getRuleContext(Define_ifContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statement);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				define_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				equality();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(325);
				method();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				define_for();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(327);
				define_if();
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode BIGGER() { return getToken(ulleungParser.BIGGER, 0); }
		public TerminalNode NOT_BIGGER() { return getToken(ulleungParser.NOT_BIGGER, 0); }
		public TerminalNode SMALLER() { return getToken(ulleungParser.SMALLER, 0); }
		public TerminalNode NOT_SMALLER() { return getToken(ulleungParser.NOT_SMALLER, 0); }
		public TerminalNode EQUAL() { return getToken(ulleungParser.EQUAL, 0); }
		public List<CalculationContext> calculation() {
			return getRuleContexts(CalculationContext.class);
		}
		public CalculationContext calculation(int i) {
			return getRuleContext(CalculationContext.class,i);
		}
		public List<TerminalNode> VAR_VALUE() { return getTokens(ulleungParser.VAR_VALUE); }
		public TerminalNode VAR_VALUE(int i) {
			return getToken(ulleungParser.VAR_VALUE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitCompare(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(330);
				calculation();
				}
				break;
			case 2:
				{
				setState(331);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(332);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(333);
				method();
				}
				break;
			}
			setState(336);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGER) | (1L << NOT_BIGGER) | (1L << SMALLER) | (1L << NOT_SMALLER) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(337);
				calculation();
				}
				break;
			case 2:
				{
				setState(338);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(339);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(340);
				method();
				}
				break;
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

	public static class Single_booleanContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(ulleungParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ulleungParser.FALSE, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public Single_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterSingle_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitSingle_boolean(this);
		}
	}

	public final Single_booleanContext single_boolean() throws RecognitionException {
		Single_booleanContext _localctx = new Single_booleanContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_single_boolean);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				compare();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				method();
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

	public static class BooleansContext extends ParserRuleContext {
		public List<Single_booleanContext> single_boolean() {
			return getRuleContexts(Single_booleanContext.class);
		}
		public Single_booleanContext single_boolean(int i) {
			return getRuleContext(Single_booleanContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ulleungParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ulleungParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ulleungParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ulleungParser.OR, i);
		}
		public BooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitBooleans(this);
		}
	}

	public final BooleansContext booleans() throws RecognitionException {
		BooleansContext _localctx = new BooleansContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			single_boolean();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(350);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(351);
				single_boolean();
				}
				}
				setState(356);
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

	public static class Define_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ulleungParser.IF, 0); }
		public TerminalNode COLON() { return getToken(ulleungParser.COLON, 0); }
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ulleungParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Define_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_if(this);
		}
	}

	public final Define_ifContext define_if() throws RecognitionException {
		Define_ifContext _localctx = new Define_ifContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_define_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(IF);
			setState(358);
			match(COLON);
			setState(359);
			booleans();
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(360);
				statement();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(SEMICOLON);
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

	public static class For_startContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ulleungParser.IDENTIFIER, 0); }
		public Define_varContext define_var() {
			return getRuleContext(Define_varContext.class,0);
		}
		public For_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterFor_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitFor_start(this);
		}
	}

	public final For_startContext for_start() throws RecognitionException {
		For_startContext _localctx = new For_startContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_start);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				define_var();
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

	public static class For_statementContext extends ParserRuleContext {
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitFor_statement(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_for_statement);
		try {
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				equality();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				method();
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

	public static class Define_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ulleungParser.FOR, 0); }
		public TerminalNode COLON() { return getToken(ulleungParser.COLON, 0); }
		public For_startContext for_start() {
			return getRuleContext(For_startContext.class,0);
		}
		public TerminalNode FORCONNECTOR1() { return getToken(ulleungParser.FORCONNECTOR1, 0); }
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public TerminalNode FORCONNECTOR2() { return getToken(ulleungParser.FORCONNECTOR2, 0); }
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(ulleungParser.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Define_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterDefine_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitDefine_for(this);
		}
	}

	public final Define_forContext define_for() throws RecognitionException {
		Define_forContext _localctx = new Define_forContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_define_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(FOR);
			setState(377);
			match(COLON);
			setState(378);
			for_start();
			setState(379);
			match(FORCONNECTOR1);
			setState(380);
			booleans();
			setState(381);
			match(FORCONNECTOR2);
			setState(382);
			for_statement();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(383);
				statement();
				}
				}
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(389);
			match(SEMICOLON);
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

	public static class Package_nameContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public Package_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).enterPackage_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ulleungListener ) ((ulleungListener)listener).exitPackage_name(this);
		}
	}

	public final Package_nameContext package_name() throws RecognitionException {
		Package_nameContext _localctx = new Package_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_package_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(IDENTIFIER);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(392);
				match(T__4);
				setState(393);
				match(IDENTIFIER);
				}
				}
				setState(398);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0192\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\5\5T\n\5\3\5\5\5W\n\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5"+
		"\5\5a\n\5\3\5\5\5d\n\5\3\5\3\5\3\5\3\5\3\5\7\5k\n\5\f\5\16\5n\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\5\6u\n\6\3\6\5\6x\n\6\3\6\3\6\3\6\3\6\3\6\7\6\177\n\6"+
		"\f\6\16\6\u0082\13\6\3\6\3\6\3\7\5\7\u0087\n\7\3\7\5\7\u008a\n\7\3\7\5"+
		"\7\u008d\n\7\3\7\5\7\u0090\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u0097\n\7\5\7\u0099"+
		"\n\7\3\b\5\b\u009c\n\b\3\b\5\b\u009f\n\b\3\b\5\b\u00a2\n\b\3\b\5\b\u00a5"+
		"\n\b\3\b\5\b\u00a8\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\b\7\b\u00b3"+
		"\n\b\f\b\16\b\u00b6\13\b\3\b\3\b\3\b\5\b\u00bb\n\b\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\5\n\u00c5\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00cd\n\13"+
		"\3\13\3\13\5\13\u00d1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d9\n\f\f\f\16"+
		"\f\u00dc\13\f\3\r\3\r\3\r\3\r\5\r\u00e2\n\r\3\16\3\16\3\16\7\16\u00e7"+
		"\n\16\f\16\16\16\u00ea\13\16\3\17\3\17\3\17\5\17\u00ef\n\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\5\20\u00f7\n\20\3\20\3\20\3\20\3\20\5\20\u00fd\n"+
		"\20\3\20\3\20\3\20\3\20\5\20\u0103\n\20\7\20\u0105\n\20\f\20\16\20\u0108"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0111\n\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u011a\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0125\n\23\5\23\u0127\n\23\3\24\3\24\3\24\5\24\u012c"+
		"\n\24\3\24\3\24\5\24\u0130\n\24\3\24\3\24\3\24\3\24\5\24\u0136\n\24\3"+
		"\24\5\24\u0139\n\24\7\24\u013b\n\24\f\24\16\24\u013e\13\24\3\25\3\25\5"+
		"\25\u0142\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u014b\n\26\3\27"+
		"\3\27\3\27\3\27\5\27\u0151\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u0158\n"+
		"\27\3\30\3\30\3\30\3\30\5\30\u015e\n\30\3\31\3\31\3\31\7\31\u0163\n\31"+
		"\f\31\16\31\u0166\13\31\3\32\3\32\3\32\3\32\7\32\u016c\n\32\f\32\16\32"+
		"\u016f\13\32\3\32\3\32\3\33\3\33\5\33\u0175\n\33\3\34\3\34\5\34\u0179"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u0183\n\35\f\35\16"+
		"\35\u0186\13\35\3\35\3\35\3\36\3\36\3\36\7\36\u018d\n\36\f\36\16\36\u0190"+
		"\13\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:\2\7\3\2+,\3\2\b\n\3\2\26\32\3\2\36\"\3\2#$\2\u01c6\2<\3\2"+
		"\2\2\4J\3\2\2\2\6M\3\2\2\2\bS\3\2\2\2\nt\3\2\2\2\f\u0086\3\2\2\2\16\u009b"+
		"\3\2\2\2\20\u00be\3\2\2\2\22\u00c4\3\2\2\2\24\u00cc\3\2\2\2\26\u00d2\3"+
		"\2\2\2\30\u00e1\3\2\2\2\32\u00e3\3\2\2\2\34\u00eb\3\2\2\2\36\u00f6\3\2"+
		"\2\2 \u0109\3\2\2\2\"\u0112\3\2\2\2$\u011b\3\2\2\2&\u012b\3\2\2\2(\u013f"+
		"\3\2\2\2*\u014a\3\2\2\2,\u0150\3\2\2\2.\u015d\3\2\2\2\60\u015f\3\2\2\2"+
		"\62\u0167\3\2\2\2\64\u0174\3\2\2\2\66\u0178\3\2\2\28\u017a\3\2\2\2:\u0189"+
		"\3\2\2\2<@\5\4\3\2=?\5\6\4\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2A"+
		"G\3\2\2\2B@\3\2\2\2CF\5\b\5\2DF\5\n\6\2EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JK\5:\36\2KL\7(\2\2L\5\3\2\2"+
		"\2MN\5:\36\2NO\7)\2\2O\7\3\2\2\2PQ\5\22\n\2QR\7\16\2\2RT\3\2\2\2SP\3\2"+
		"\2\2ST\3\2\2\2T`\3\2\2\2UW\5\22\n\2VU\3\2\2\2VW\3\2\2\2W\\\3\2\2\2XY\7"+
		"\3\2\2Y[\5\22\n\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2"+
		"^\\\3\2\2\2_a\7\21\2\2`V\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\5\20\t\2cb\3\2"+
		"\2\2cd\3\2\2\2de\3\2\2\2ef\7\r\2\2fg\7+\2\2gl\7-\2\2hk\5\f\7\2ik\5\16"+
		"\b\2jh\3\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2"+
		"\2\2op\7.\2\2p\t\3\2\2\2qr\5\22\n\2rs\7\16\2\2su\3\2\2\2tq\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vx\5\20\t\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\20\2\2z"+
		"{\7+\2\2{\u0080\7-\2\2|\177\5\f\7\2}\177\5\16\b\2~|\3\2\2\2~}\3\2\2\2"+
		"\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2"+
		"\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7.\2\2\u0084\13\3\2\2\2\u0085\u0087"+
		"\7\17\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2"+
		"\u0088\u008a\5\20\t\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c"+
		"\3\2\2\2\u008b\u008d\7\13\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u008f\3\2\2\2\u008e\u0090\7\f\2\2\u008f\u008e\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\5\24\13\2\u0092\u0098\7+\2\2"+
		"\u0093\u0096\7\61\2\2\u0094\u0097\5\34\17\2\u0095\u0097\7,\2\2\u0096\u0094"+
		"\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0093\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\r\3\2\2\2\u009a\u009c\7\17\2\2\u009b\u009a\3\2\2"+
		"\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\5\20\t\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2\7\13"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a5\7\f\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3\2"+
		"\2\2\u00a6\u00a8\5\24\13\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\7+\2\2\u00ab\u00af\7-"+
		"\2\2\u00ac\u00ad\5\26\f\2\u00ad\u00ae\7\23\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00b3\5*"+
		"\26\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7-"+
		"\2\2\u00b8\u00b9\t\2\2\2\u00b9\u00bb\7\24\2\2\u00ba\u00b7\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7.\2\2\u00bd\17\3\2\2\2"+
		"\u00be\u00bf\t\3\2\2\u00bf\21\3\2\2\2\u00c0\u00c1\7\4\2\2\u00c1\u00c2"+
		"\5:\36\2\u00c2\u00c3\7\5\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7+\2\2\u00c7\23\3\2\2\2"+
		"\u00c8\u00c9\7\4\2\2\u00c9\u00ca\5:\36\2\u00ca\u00cb\7\5\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"+
		"\u00d0\7+\2\2\u00cf\u00d1\7\62\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\25\3\2\2\2\u00d2\u00d3\5\24\13\2\u00d3\u00da\7+\2\2\u00d4\u00d5"+
		"\7\3\2\2\u00d5\u00d6\5\24\13\2\u00d6\u00d7\7+\2\2\u00d7\u00d9\3\2\2\2"+
		"\u00d8\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\27\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e2\5&\24\2\u00de"+
		"\u00e2\7,\2\2\u00df\u00e2\7+\2\2\u00e0\u00e2\5\36\20\2\u00e1\u00dd\3\2"+
		"\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2"+
		"\31\3\2\2\2\u00e3\u00e8\5\30\r\2\u00e4\u00e5\7\3\2\2\u00e5\u00e7\5\30"+
		"\r\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\33\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec\5\22\n"+
		"\2\u00ec\u00ee\7\4\2\2\u00ed\u00ef\5\32\16\2\u00ee\u00ed\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\7\6\2\2\u00f1\u00f2\7\25"+
		"\2\2\u00f2\35\3\2\2\2\u00f3\u00f7\7+\2\2\u00f4\u00f7\7,\2\2\u00f5\u00f7"+
		"\5&\24\2\u00f6\u00f3\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00fc\t\4\2\2\u00f9\u00fd\7+\2\2\u00fa\u00fd\7,\2"+
		"\2\u00fb\u00fd\5&\24\2\u00fc\u00f9\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0106\3\2\2\2\u00fe\u0102\t\4\2\2\u00ff\u0103\7+\2\2\u0100"+
		"\u0103\7,\2\2\u0101\u0103\5&\24\2\u0102\u00ff\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0101\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u00fe\3\2\2\2\u0105"+
		"\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\37\3\2\2"+
		"\2\u0108\u0106\3\2\2\2\u0109\u010a\7\4\2\2\u010a\u010b\5\22\n\2\u010b"+
		"\u0110\7\6\2\2\u010c\u0111\5\36\20\2\u010d\u0111\7,\2\2\u010e\u0111\7"+
		"+\2\2\u010f\u0111\5&\24\2\u0110\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111!\3\2\2\2\u0112\u0113\7+\2\2\u0113"+
		"\u0119\7\61\2\2\u0114\u011a\5 \21\2\u0115\u011a\5\36\20\2\u0116\u011a"+
		"\7,\2\2\u0117\u011a\7+\2\2\u0118\u011a\5&\24\2\u0119\u0114\3\2\2\2\u0119"+
		"\u0115\3\2\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2"+
		"\2\2\u011a#\3\2\2\2\u011b\u011c\5\24\13\2\u011c\u0126\7+\2\2\u011d\u0124"+
		"\7\61\2\2\u011e\u0125\5\34\17\2\u011f\u0125\5 \21\2\u0120\u0125\5\36\20"+
		"\2\u0121\u0125\7,\2\2\u0122\u0125\7+\2\2\u0123\u0125\5&\24\2\u0124\u011e"+
		"\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0127\3\2\2\2\u0126\u011d\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127%\3\2\2\2\u0128\u0129\5\22\n\2\u0129\u012a"+
		"\7\7\2\2\u012a\u012c\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012d\3\2\2\2\u012d\u012f\7+\2\2\u012e\u0130\5(\25\2\u012f\u012e\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u013c\3\2\2\2\u0131\u0132\7\7\2\2\u0132"+
		"\u0138\7+\2\2\u0133\u0135\7\4\2\2\u0134\u0136\5\32\16\2\u0135\u0134\3"+
		"\2\2\2\u0135\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139\7\6\2\2\u0138"+
		"\u0133\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0131\3\2"+
		"\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\'\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\7\4\2\2\u0140\u0142\5\32\16"+
		"\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144"+
		"\7\6\2\2\u0144)\3\2\2\2\u0145\u014b\5$\23\2\u0146\u014b\5\"\22\2\u0147"+
		"\u014b\5&\24\2\u0148\u014b\58\35\2\u0149\u014b\5\62\32\2\u014a\u0145\3"+
		"\2\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u0149\3\2\2\2\u014b+\3\2\2\2\u014c\u0151\5\36\20\2\u014d\u0151\7,\2\2"+
		"\u014e\u0151\7+\2\2\u014f\u0151\5&\24\2\u0150\u014c\3\2\2\2\u0150\u014d"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0157\t\5\2\2\u0153\u0158\5\36\20\2\u0154\u0158\7,\2\2\u0155\u0158\7"+
		"+\2\2\u0156\u0158\5&\24\2\u0157\u0153\3\2\2\2\u0157\u0154\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158-\3\2\2\2\u0159\u015e\7\34\2\2"+
		"\u015a\u015e\7\35\2\2\u015b\u015e\5,\27\2\u015c\u015e\5&\24\2\u015d\u0159"+
		"\3\2\2\2\u015d\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"/\3\2\2\2\u015f\u0164\5.\30\2\u0160\u0161\t\6\2\2\u0161\u0163\5.\30\2"+
		"\u0162\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\61\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\7\33\2\2\u0168"+
		"\u0169\7-\2\2\u0169\u016d\5\60\31\2\u016a\u016c\5*\26\2\u016b\u016a\3"+
		"\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7.\2\2\u0171\63\3\2\2\2"+
		"\u0172\u0175\7+\2\2\u0173\u0175\5$\23\2\u0174\u0172\3\2\2\2\u0174\u0173"+
		"\3\2\2\2\u0175\65\3\2\2\2\u0176\u0179\5\"\22\2\u0177\u0179\5&\24\2\u0178"+
		"\u0176\3\2\2\2\u0178\u0177\3\2\2\2\u0179\67\3\2\2\2\u017a\u017b\7%\2\2"+
		"\u017b\u017c\7-\2\2\u017c\u017d\5\64\33\2\u017d\u017e\7&\2\2\u017e\u017f"+
		"\5\60\31\2\u017f\u0180\7\'\2\2\u0180\u0184\5\66\34\2\u0181\u0183\5*\26"+
		"\2\u0182\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7.\2\2\u0188"+
		"9\3\2\2\2\u0189\u018e\7+\2\2\u018a\u018b\7\7\2\2\u018b\u018d\7+\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f;\3\2\2\2\u0190\u018e\3\2\2\2=@EGSV\\`cjltw~\u0080\u0086\u0089"+
		"\u008c\u008f\u0096\u0098\u009b\u009e\u00a1\u00a4\u00a7\u00af\u00b4\u00ba"+
		"\u00c4\u00cc\u00d0\u00da\u00e1\u00e8\u00ee\u00f6\u00fc\u0102\u0106\u0110"+
		"\u0119\u0124\u0126\u012b\u012f\u0135\u0138\u013c\u0141\u014a\u0150\u0157"+
		"\u015d\u0164\u016d\u0174\u0178\u0184\u018e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}