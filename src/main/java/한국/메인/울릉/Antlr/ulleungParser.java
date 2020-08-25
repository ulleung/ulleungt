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
		STATIC=9, CLASS=10, FUNCTION=11, REQUIRE=12, RETURN=13, CREATE=14, ADD=15, 
		SUBTRACT=16, MULTIPLY=17, DIVIDE=18, MODULAR=19, IF=20, TRUE=21, FALSE=22, 
		BIGGER=23, NOT_BIGGER=24, SMALLER=25, NOT_SMALLER=26, EQUAL=27, AND=28, 
		OR=29, FOR=30, FORCONNECTOR1=31, FORCONNECTOR2=32, PACKAGE_STATE=33, PACKAGE_IMPORT=34, 
		WHITESPACE=35, IDENTIFIER=36, VAR_VALUE=37, COLON=38, SEMICOLON=39, SINGLEQOUTE=40, 
		DOUBLEQOUTE=41, EQUALS=42, ARRAY=43, EXTEND=44;
	public static final int
		RULE_program = 0, RULE_define_package = 1, RULE_define_import = 2, RULE_define_class = 3, 
		RULE_define_global_var = 4, RULE_define_function = 5, RULE_public_type = 6, 
		RULE_type_name = 7, RULE_type_name_array = 8, RULE_args = 9, RULE_passed_arg = 10, 
		RULE_passed_args = 11, RULE_new_object = 12, RULE_calculation = 13, RULE_equality = 14, 
		RULE_define_var = 15, RULE_method = 16, RULE_first_passed_args = 17, RULE_statement = 18, 
		RULE_compare = 19, RULE_single_boolean = 20, RULE_booleans = 21, RULE_define_if = 22, 
		RULE_for_start = 23, RULE_for_statement = 24, RULE_define_for = 25, RULE_package_name = 26;
	public static final String[] ruleNames = {
		"program", "define_package", "define_import", "define_class", "define_global_var", 
		"define_function", "public_type", "type_name", "type_name_array", "args", 
		"passed_arg", "passed_args", "new_object", "calculation", "equality", 
		"define_var", "method", "first_passed_args", "statement", "compare", "single_boolean", 
		"booleans", "define_if", "for_start", "for_statement", "define_for", "package_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "'.)'", "', '", "')'", "'.'", "'\uB4E4\uCDB0\uC9C4'", "'\uAC10\uCDB0\uC9C4'", 
		"'\uC228\uACA8\uC9C4'", "'\uC815\uC801'", "'\uAC1D\uCCB4'", "'\uD568\uC218'", 
		"'\uC694\uAD6C'", "'\uB3CC\uB824\uC8FC\uAE30'", "'\uC0DD\uC131'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'\uB9CC\uC57D'", "'\uCC38'", "'\uAC70\uC9D3'", 
		"'>'", "'<='", "'<'", "'>='", "'=='", "'\uC774\uACE0'", "'\uC774\uAC70\uB098'", 
		"'\uBC18\uBCF5'", "'\uC73C\uB85C'", "'\uB3D9\uC548'", "'\uC81C\uC791'", 
		"'\uB3C4\uC785'", null, null, null, "':'", "';'", "'''", "'\"'", "'='", 
		"'\uC758 \uBC30\uC5F4'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "PUBLIC", "PROTECTED", "PRIVATE", 
		"STATIC", "CLASS", "FUNCTION", "REQUIRE", "RETURN", "CREATE", "ADD", "SUBTRACT", 
		"MULTIPLY", "DIVIDE", "MODULAR", "IF", "TRUE", "FALSE", "BIGGER", "NOT_BIGGER", 
		"SMALLER", "NOT_SMALLER", "EQUAL", "AND", "OR", "FOR", "FORCONNECTOR1", 
		"FORCONNECTOR2", "PACKAGE_STATE", "PACKAGE_IMPORT", "WHITESPACE", "IDENTIFIER", 
		"VAR_VALUE", "COLON", "SEMICOLON", "SINGLEQOUTE", "DOUBLEQOUTE", "EQUALS", 
		"ARRAY", "EXTEND"
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
			setState(54);
			define_package();
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55);
					define_import();
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << CLASS) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(61);
				define_class();
				}
				}
				setState(66);
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
			setState(67);
			package_name();
			setState(68);
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
			setState(70);
			package_name();
			setState(71);
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
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==IDENTIFIER) {
				{
				setState(73);
				type_name();
				setState(74);
				match(EXTEND);
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(78);
				public_type();
				}
			}

			setState(81);
			match(CLASS);
			setState(82);
			match(IDENTIFIER);
			setState(83);
			match(COLON);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC) | (1L << FUNCTION) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(84);
					define_global_var();
					}
					break;
				case 2:
					{
					setState(85);
					define_function();
					}
					break;
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
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
		public Public_typeContext public_type() {
			return getRuleContext(Public_typeContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ulleungParser.STATIC, 0); }
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
		enterRule(_localctx, 8, RULE_define_global_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(93);
				public_type();
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(96);
				match(STATIC);
				}
			}

			setState(99);
			type_name_array();
			setState(100);
			match(IDENTIFIER);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(101);
				match(EQUALS);
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case IDENTIFIER:
					{
					setState(102);
					new_object();
					}
					break;
				case VAR_VALUE:
					{
					setState(103);
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
		public Public_typeContext public_type() {
			return getRuleContext(Public_typeContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ulleungParser.STATIC, 0); }
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
		enterRule(_localctx, 10, RULE_define_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(108);
				public_type();
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(111);
				match(STATIC);
				}
			}

			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==IDENTIFIER) {
				{
				setState(114);
				type_name_array();
				}
			}

			setState(117);
			match(FUNCTION);
			setState(118);
			match(IDENTIFIER);
			setState(119);
			match(COLON);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(120);
				args();
				setState(121);
				match(REQUIRE);
				}
				break;
			}
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(125);
				statement();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(131);
				match(COLON);
				setState(132);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==VAR_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(133);
				match(RETURN);
				}
			}

			setState(136);
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
		enterRule(_localctx, 12, RULE_public_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
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
		enterRule(_localctx, 14, RULE_type_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(140);
				match(T__0);
				setState(141);
				package_name();
				setState(142);
				match(T__1);
				}
			}

			setState(146);
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
		enterRule(_localctx, 16, RULE_type_name_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(148);
				match(T__0);
				setState(149);
				package_name();
				setState(150);
				match(T__1);
				}
			}

			setState(154);
			match(IDENTIFIER);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(155);
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
		enterRule(_localctx, 18, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			type_name_array();
			setState(159);
			match(IDENTIFIER);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(160);
				match(T__2);
				setState(161);
				type_name_array();
				setState(162);
				match(IDENTIFIER);
				}
				}
				setState(168);
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
		enterRule(_localctx, 20, RULE_passed_arg);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(VAR_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
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
		enterRule(_localctx, 22, RULE_passed_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			passed_arg();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(176);
				match(T__2);
				setState(177);
				passed_arg();
				}
				}
				setState(182);
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
		enterRule(_localctx, 24, RULE_new_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			type_name();
			setState(184);
			match(T__0);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << VAR_VALUE))) != 0)) {
				{
				setState(185);
				passed_args();
				}
			}

			setState(188);
			match(T__3);
			setState(189);
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
		enterRule(_localctx, 26, RULE_calculation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(191);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(192);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(193);
				method();
				}
				break;
			}
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(197);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(198);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(199);
				method();
				}
				break;
			}
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) {
				{
				{
				setState(202);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(203);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(204);
					match(VAR_VALUE);
					}
					break;
				case 3:
					{
					setState(205);
					method();
					}
					break;
				}
				}
				}
				setState(212);
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

	public static class EqualityContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
		}
		public TerminalNode EQUALS() { return getToken(ulleungParser.EQUALS, 0); }
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
		enterRule(_localctx, 28, RULE_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IDENTIFIER);
			setState(214);
			match(EQUALS);
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(215);
				calculation();
				}
				break;
			case 2:
				{
				setState(216);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(217);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(218);
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
		enterRule(_localctx, 30, RULE_define_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			type_name_array();
			setState(222);
			match(IDENTIFIER);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(223);
				match(EQUALS);
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(224);
					new_object();
					}
					break;
				case 2:
					{
					setState(225);
					calculation();
					}
					break;
				case 3:
					{
					setState(226);
					match(VAR_VALUE);
					}
					break;
				case 4:
					{
					setState(227);
					match(IDENTIFIER);
					}
					break;
				case 5:
					{
					setState(228);
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
		enterRule(_localctx, 32, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(233);
				type_name();
				setState(234);
				match(T__4);
				}
				break;
			}
			setState(238);
			match(IDENTIFIER);
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(239);
				first_passed_args();
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(242);
				match(T__4);
				setState(243);
				match(IDENTIFIER);
				setState(249);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(244);
					match(T__0);
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << VAR_VALUE))) != 0)) {
						{
						setState(245);
						passed_args();
						}
					}

					setState(248);
					match(T__3);
					}
					break;
				}
				}
				}
				setState(255);
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
		enterRule(_localctx, 34, RULE_first_passed_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__0);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << VAR_VALUE))) != 0)) {
				{
				setState(257);
				passed_args();
				}
			}

			setState(260);
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
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				define_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				equality();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				method();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				define_for();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
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
		enterRule(_localctx, 38, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(269);
				calculation();
				}
				break;
			case 2:
				{
				setState(270);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(271);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(272);
				method();
				}
				break;
			}
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGER) | (1L << NOT_BIGGER) | (1L << SMALLER) | (1L << NOT_SMALLER) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(276);
				calculation();
				}
				break;
			case 2:
				{
				setState(277);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(278);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(279);
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
		enterRule(_localctx, 40, RULE_single_boolean);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				compare();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
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
		enterRule(_localctx, 42, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			single_boolean();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(289);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(290);
				single_boolean();
				}
				}
				setState(295);
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
		enterRule(_localctx, 44, RULE_define_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(IF);
			setState(297);
			match(COLON);
			setState(298);
			booleans();
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(299);
				statement();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
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
		enterRule(_localctx, 46, RULE_for_start);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
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
		enterRule(_localctx, 48, RULE_for_statement);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				equality();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
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
		enterRule(_localctx, 50, RULE_define_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(FOR);
			setState(316);
			match(COLON);
			setState(317);
			for_start();
			setState(318);
			match(FORCONNECTOR1);
			setState(319);
			booleans();
			setState(320);
			match(FORCONNECTOR2);
			setState(321);
			for_statement();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(322);
				statement();
				}
				}
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(328);
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
		enterRule(_localctx, 52, RULE_package_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(IDENTIFIER);
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(331);
				match(T__4);
				setState(332);
				match(IDENTIFIER);
				}
				}
				setState(337);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0155\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\7\2"+
		"A\n\2\f\2\16\2D\13\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\5\5O\n\5\3\5"+
		"\5\5R\n\5\3\5\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\3\5\3\6\5\6"+
		"a\n\6\3\6\5\6d\n\6\3\6\3\6\3\6\3\6\3\6\5\6k\n\6\5\6m\n\6\3\7\5\7p\n\7"+
		"\3\7\5\7s\n\7\3\7\5\7v\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\7\7\7\u0081"+
		"\n\7\f\7\16\7\u0084\13\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\5\t\u0093\n\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u009b\n\n\3\n\3"+
		"\n\5\n\u009f\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a7\n\13\f\13\16"+
		"\13\u00aa\13\13\3\f\3\f\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\r\7\r\u00b5\n"+
		"\r\f\r\16\r\u00b8\13\r\3\16\3\16\3\16\5\16\u00bd\n\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\5\17\u00c5\n\17\3\17\3\17\3\17\3\17\5\17\u00cb\n\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00d1\n\17\7\17\u00d3\n\17\f\17\16\17\u00d6\13\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00e8\n\21\5\21\u00ea\n\21\3\22\3\22\3\22\5\22\u00ef"+
		"\n\22\3\22\3\22\5\22\u00f3\n\22\3\22\3\22\3\22\3\22\5\22\u00f9\n\22\3"+
		"\22\5\22\u00fc\n\22\7\22\u00fe\n\22\f\22\16\22\u0101\13\22\3\23\3\23\5"+
		"\23\u0105\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u010e\n\24\3\25"+
		"\3\25\3\25\3\25\5\25\u0114\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u011b\n"+
		"\25\3\26\3\26\3\26\3\26\5\26\u0121\n\26\3\27\3\27\3\27\7\27\u0126\n\27"+
		"\f\27\16\27\u0129\13\27\3\30\3\30\3\30\3\30\7\30\u012f\n\30\f\30\16\30"+
		"\u0132\13\30\3\30\3\30\3\31\3\31\5\31\u0138\n\31\3\32\3\32\5\32\u013c"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0146\n\33\f\33\16"+
		"\33\u0149\13\33\3\33\3\33\3\34\3\34\3\34\7\34\u0150\n\34\f\34\16\34\u0153"+
		"\13\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\66\2\7\3\2&\'\3\2\b\n\3\2\21\25\3\2\31\35\3\2\36\37\2\u017a\28"+
		"\3\2\2\2\4E\3\2\2\2\6H\3\2\2\2\bN\3\2\2\2\n`\3\2\2\2\fo\3\2\2\2\16\u008c"+
		"\3\2\2\2\20\u0092\3\2\2\2\22\u009a\3\2\2\2\24\u00a0\3\2\2\2\26\u00af\3"+
		"\2\2\2\30\u00b1\3\2\2\2\32\u00b9\3\2\2\2\34\u00c4\3\2\2\2\36\u00d7\3\2"+
		"\2\2 \u00df\3\2\2\2\"\u00ee\3\2\2\2$\u0102\3\2\2\2&\u010d\3\2\2\2(\u0113"+
		"\3\2\2\2*\u0120\3\2\2\2,\u0122\3\2\2\2.\u012a\3\2\2\2\60\u0137\3\2\2\2"+
		"\62\u013b\3\2\2\2\64\u013d\3\2\2\2\66\u014c\3\2\2\28<\5\4\3\29;\5\6\4"+
		"\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\b\5"+
		"\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\3\3\2\2\2DB\3\2\2\2EF\5\66"+
		"\34\2FG\7#\2\2G\5\3\2\2\2HI\5\66\34\2IJ\7$\2\2J\7\3\2\2\2KL\5\20\t\2L"+
		"M\7.\2\2MO\3\2\2\2NK\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\16\b\2QP\3\2\2\2"+
		"QR\3\2\2\2RS\3\2\2\2ST\7\f\2\2TU\7&\2\2UZ\7(\2\2VY\5\n\6\2WY\5\f\7\2X"+
		"V\3\2\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2"+
		"\2]^\7)\2\2^\t\3\2\2\2_a\5\16\b\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2bd\7\13"+
		"\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\5\22\n\2fl\7&\2\2gj\7,\2\2hk\5\32"+
		"\16\2ik\7\'\2\2jh\3\2\2\2ji\3\2\2\2km\3\2\2\2lg\3\2\2\2lm\3\2\2\2m\13"+
		"\3\2\2\2np\5\16\b\2on\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\7\13\2\2rq\3\2\2\2"+
		"rs\3\2\2\2su\3\2\2\2tv\5\22\n\2ut\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\r\2"+
		"\2xy\7&\2\2y}\7(\2\2z{\5\24\13\2{|\7\16\2\2|~\3\2\2\2}z\3\2\2\2}~\3\2"+
		"\2\2~\u0082\3\2\2\2\177\u0081\5&\24\2\u0080\177\3\2\2\2\u0081\u0084\3"+
		"\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0088\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7(\2\2\u0086\u0087\t\2\2\2\u0087\u0089\7\17"+
		"\2\2\u0088\u0085\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\7)\2\2\u008b\r\3\2\2\2\u008c\u008d\t\3\2\2\u008d\17\3\2\2\2\u008e"+
		"\u008f\7\3\2\2\u008f\u0090\5\66\34\2\u0090\u0091\7\4\2\2\u0091\u0093\3"+
		"\2\2\2\u0092\u008e\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\7&\2\2\u0095\21\3\2\2\2\u0096\u0097\7\3\2\2\u0097\u0098\5\66\34"+
		"\2\u0098\u0099\7\4\2\2\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\7&\2\2\u009d\u009f\7-\2\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\23\3\2\2\2\u00a0\u00a1\5\22\n"+
		"\2\u00a1\u00a8\7&\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\5\22\n\2\u00a4\u00a5"+
		"\7&\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\25\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00b0\5\"\22\2\u00ac\u00b0\7\'\2\2\u00ad\u00b0\7&\2\2\u00ae\u00b0"+
		"\5\34\17\2\u00af\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b6\5\26\f\2\u00b2\u00b3"+
		"\7\5\2\2\u00b3\u00b5\5\26\f\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\3\2\2\2"+
		"\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\31\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\5\20\t\2\u00ba\u00bc\7\3\2\2\u00bb\u00bd\5\30\r\2"+
		"\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\7\6\2\2\u00bf\u00c0\7\20\2\2\u00c0\33\3\2\2\2\u00c1\u00c5\7&\2\2\u00c2"+
		"\u00c5\7\'\2\2\u00c3\u00c5\5\"\22\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3"+
		"\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00ca\t\4\2\2\u00c7"+
		"\u00cb\7&\2\2\u00c8\u00cb\7\'\2\2\u00c9\u00cb\5\"\22\2\u00ca\u00c7\3\2"+
		"\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00d4\3\2\2\2\u00cc"+
		"\u00d0\t\4\2\2\u00cd\u00d1\7&\2\2\u00ce\u00d1\7\'\2\2\u00cf\u00d1\5\""+
		"\22\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\35\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8"+
		"\7&\2\2\u00d8\u00dd\7,\2\2\u00d9\u00de\5\34\17\2\u00da\u00de\7\'\2\2\u00db"+
		"\u00de\7&\2\2\u00dc\u00de\5\"\22\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3\2"+
		"\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e0"+
		"\5\22\n\2\u00e0\u00e9\7&\2\2\u00e1\u00e7\7,\2\2\u00e2\u00e8\5\32\16\2"+
		"\u00e3\u00e8\5\34\17\2\u00e4\u00e8\7\'\2\2\u00e5\u00e8\7&\2\2\u00e6\u00e8"+
		"\5\"\22\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7\u00e4\3\2\2\2"+
		"\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e1"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea!\3\2\2\2\u00eb\u00ec\5\20\t\2\u00ec"+
		"\u00ed\7\7\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\7&\2\2\u00f1\u00f3\5$\23\2\u00f2"+
		"\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00ff\3\2\2\2\u00f4\u00f5\7\7"+
		"\2\2\u00f5\u00fb\7&\2\2\u00f6\u00f8\7\3\2\2\u00f7\u00f9\5\30\r\2\u00f8"+
		"\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\7\6"+
		"\2\2\u00fb\u00f6\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00f4\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100#\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0104\7\3\2\2\u0103\u0105"+
		"\5\30\r\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0107\7\6\2\2\u0107%\3\2\2\2\u0108\u010e\5 \21\2\u0109\u010e\5"+
		"\36\20\2\u010a\u010e\5\"\22\2\u010b\u010e\5\64\33\2\u010c\u010e\5.\30"+
		"\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010c\3\2\2\2\u010e\'\3\2\2\2\u010f\u0114\5\34\17\2\u0110"+
		"\u0114\7\'\2\2\u0111\u0114\7&\2\2\u0112\u0114\5\"\22\2\u0113\u010f\3\2"+
		"\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0115\3\2\2\2\u0115\u011a\t\5\2\2\u0116\u011b\5\34\17\2\u0117\u011b\7"+
		"\'\2\2\u0118\u011b\7&\2\2\u0119\u011b\5\"\22\2\u011a\u0116\3\2\2\2\u011a"+
		"\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b)\3\2\2\2"+
		"\u011c\u0121\7\27\2\2\u011d\u0121\7\30\2\2\u011e\u0121\5(\25\2\u011f\u0121"+
		"\5\"\22\2\u0120\u011c\3\2\2\2\u0120\u011d\3\2\2\2\u0120\u011e\3\2\2\2"+
		"\u0120\u011f\3\2\2\2\u0121+\3\2\2\2\u0122\u0127\5*\26\2\u0123\u0124\t"+
		"\6\2\2\u0124\u0126\5*\26\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128-\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u012b\7\26\2\2\u012b\u012c\7(\2\2\u012c\u0130\5,\27\2\u012d\u012f"+
		"\5&\24\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7)"+
		"\2\2\u0134/\3\2\2\2\u0135\u0138\7&\2\2\u0136\u0138\5 \21\2\u0137\u0135"+
		"\3\2\2\2\u0137\u0136\3\2\2\2\u0138\61\3\2\2\2\u0139\u013c\5\36\20\2\u013a"+
		"\u013c\5\"\22\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c\63\3\2\2"+
		"\2\u013d\u013e\7 \2\2\u013e\u013f\7(\2\2\u013f\u0140\5\60\31\2\u0140\u0141"+
		"\7!\2\2\u0141\u0142\5,\27\2\u0142\u0143\7\"\2\2\u0143\u0147\5\62\32\2"+
		"\u0144\u0146\5&\24\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3\2\2\2\u0149\u0147\3\2\2\2\u014a"+
		"\u014b\7)\2\2\u014b\65\3\2\2\2\u014c\u0151\7&\2\2\u014d\u014e\7\7\2\2"+
		"\u014e\u0150\7&\2\2\u014f\u014d\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\67\3\2\2\2\u0153\u0151\3\2\2\2\60<"+
		"BNQXZ`cjloru}\u0082\u0088\u0092\u009a\u009e\u00a8\u00af\u00b6\u00bc\u00c4"+
		"\u00ca\u00d0\u00d4\u00dd\u00e7\u00e9\u00ee\u00f2\u00f8\u00fb\u00ff\u0104"+
		"\u010d\u0113\u011a\u0120\u0127\u0130\u0137\u013b\u0147\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}