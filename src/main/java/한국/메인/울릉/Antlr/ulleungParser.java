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
		T__0=1, T__1=2, T__2=3, T__3=4, PUBLIC=5, PROTECTED=6, PRIVATE=7, STATIC=8, 
		CLASS=9, FUNCTION=10, REQUIRE=11, RETURN=12, CREATE=13, ADD=14, SUBTRACT=15, 
		MULTIPLY=16, DIVIDE=17, MODULAR=18, IF=19, TRUE=20, FALSE=21, BIGGER=22, 
		NOT_BIGGER=23, SMALLER=24, NOT_SMALLER=25, EQUAL=26, AND=27, OR=28, FOR=29, 
		FORCONNECTOR1=30, FORCONNECTOR2=31, PACKAGE_STATE=32, PACKAGE_IMPORT=33, 
		WHITESPACE=34, IDENTIFIER=35, VAR_VALUE=36, COLON=37, SEMICOLON=38, SINGLEQOUTE=39, 
		DOUBLEQOUTE=40, EQUALS=41, ARRAY=42;
	public static final int
		RULE_program = 0, RULE_define_package = 1, RULE_define_import = 2, RULE_define_class = 3, 
		RULE_define_global_var = 4, RULE_define_function = 5, RULE_public_type = 6, 
		RULE_type_name = 7, RULE_args = 8, RULE_passed_arg = 9, RULE_passed_args = 10, 
		RULE_new_object = 11, RULE_calculation = 12, RULE_method = 13, RULE_equality = 14, 
		RULE_define_var = 15, RULE_statement = 16, RULE_compare = 17, RULE_single_boolean = 18, 
		RULE_booleans = 19, RULE_define_if = 20, RULE_for_start = 21, RULE_for_statement = 22, 
		RULE_define_for = 23, RULE_package_name = 24;
	public static final String[] ruleNames = {
		"program", "define_package", "define_import", "define_class", "define_global_var", 
		"define_function", "public_type", "type_name", "args", "passed_arg", "passed_args", 
		"new_object", "calculation", "method", "equality", "define_var", "statement", 
		"compare", "single_boolean", "booleans", "define_if", "for_start", "for_statement", 
		"define_for", "package_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "', '", "'('", "')'", "'.'", "'\uB4E4\uCDB0\uC9C4'", "'\uAC10\uCDB0\uC9C4'", 
		"'\uC228\uACA8\uC9C4'", "'\uC815\uC801'", "'\uAC1D\uCCB4'", "'\uD568\uC218'", 
		"'\uC694\uAD6C'", "'\uB3CC\uB824\uC8FC\uAE30'", "'\uC0DD\uC131'", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'\uB9CC\uC57D'", "'\uCC38'", "'\uAC70\uC9D3'", 
		"'>'", "'<='", "'<'", "'>='", "'=='", "'\uC774\uACE0'", "'\uC774\uAC70\uB098'", 
		"'\uBC18\uBCF5'", "'\uC73C\uB85C'", "'\uB3D9\uC548'", "'\uC81C\uC791'", 
		"'\uB3C4\uC785'", null, null, null, "':'", "';'", "'''", "'\"'", "'='", 
		"'\uC758 \uBC30\uC5F4'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "PUBLIC", "PROTECTED", "PRIVATE", "STATIC", 
		"CLASS", "FUNCTION", "REQUIRE", "RETURN", "CREATE", "ADD", "SUBTRACT", 
		"MULTIPLY", "DIVIDE", "MODULAR", "IF", "TRUE", "FALSE", "BIGGER", "NOT_BIGGER", 
		"SMALLER", "NOT_SMALLER", "EQUAL", "AND", "OR", "FOR", "FORCONNECTOR1", 
		"FORCONNECTOR2", "PACKAGE_STATE", "PACKAGE_IMPORT", "WHITESPACE", "IDENTIFIER", 
		"VAR_VALUE", "COLON", "SEMICOLON", "SINGLEQOUTE", "DOUBLEQOUTE", "EQUALS", 
		"ARRAY"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			define_package();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(51);
				define_import();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << CLASS))) != 0)) {
				{
				{
				setState(57);
				define_class();
				}
				}
				setState(62);
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
			setState(63);
			package_name();
			setState(64);
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
			setState(66);
			package_name();
			setState(67);
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
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(69);
				public_type();
				}
			}

			setState(72);
			match(CLASS);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(COLON);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE) | (1L << STATIC) | (1L << FUNCTION) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(77);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(75);
					define_global_var();
					}
					break;
				case 2:
					{
					setState(76);
					define_function();
					}
					break;
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
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
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(84);
				public_type();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(87);
				match(STATIC);
				}
			}

			setState(90);
			package_name();
			setState(91);
			match(IDENTIFIER);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(92);
				match(EQUALS);
				setState(93);
				new_object();
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
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PROTECTED) | (1L << PRIVATE))) != 0)) {
				{
				setState(96);
				public_type();
				}
			}

			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STATIC) {
				{
				setState(99);
				match(STATIC);
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(102);
				package_name();
				}
			}

			setState(105);
			match(FUNCTION);
			setState(106);
			match(IDENTIFIER);
			setState(107);
			match(COLON);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(108);
				args();
				setState(109);
				match(REQUIRE);
				}
				break;
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(113);
				statement();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(119);
				match(COLON);
				setState(120);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==VAR_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				match(RETURN);
				}
			}

			setState(124);
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
			setState(126);
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
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public TerminalNode ARRAY() { return getToken(ulleungParser.ARRAY, 0); }
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
			setState(128);
			package_name();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARRAY) {
				{
				setState(129);
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
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
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
		enterRule(_localctx, 16, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			type_name();
			setState(133);
			match(IDENTIFIER);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(134);
				match(T__0);
				setState(135);
				type_name();
				setState(136);
				match(IDENTIFIER);
				}
				}
				setState(142);
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
		enterRule(_localctx, 18, RULE_passed_arg);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(VAR_VALUE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
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
		enterRule(_localctx, 20, RULE_passed_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			passed_arg();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(150);
				match(T__0);
				setState(151);
				passed_arg();
				}
				}
				setState(156);
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
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
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
		enterRule(_localctx, 22, RULE_new_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			package_name();
			setState(158);
			match(T__1);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==VAR_VALUE) {
				{
				setState(159);
				passed_args();
				}
			}

			setState(162);
			match(T__2);
			setState(163);
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
		enterRule(_localctx, 24, RULE_calculation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(165);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(166);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(167);
				method();
				}
				break;
			}
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(171);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(172);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(173);
				method();
				}
				break;
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) {
				{
				{
				setState(176);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUBTRACT) | (1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULAR))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(177);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(178);
					match(VAR_VALUE);
					}
					break;
				case 3:
					{
					setState(179);
					method();
					}
					break;
				}
				}
				}
				setState(186);
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

	public static class MethodContext extends ParserRuleContext {
		public Package_nameContext package_name() {
			return getRuleContext(Package_nameContext.class,0);
		}
		public List<Passed_argsContext> passed_args() {
			return getRuleContexts(Passed_argsContext.class);
		}
		public Passed_argsContext passed_args(int i) {
			return getRuleContext(Passed_argsContext.class,i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ulleungParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ulleungParser.IDENTIFIER, i);
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
		enterRule(_localctx, 26, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			package_name();
			setState(188);
			match(T__1);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER || _la==VAR_VALUE) {
				{
				setState(189);
				passed_args();
				}
			}

			setState(192);
			match(T__2);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(193);
				match(T__3);
				setState(194);
				match(IDENTIFIER);
				setState(195);
				match(T__1);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER || _la==VAR_VALUE) {
					{
					setState(196);
					passed_args();
					}
				}

				setState(199);
				match(T__2);
				}
				}
				setState(204);
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
			setState(205);
			match(IDENTIFIER);
			setState(206);
			match(EQUALS);
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(207);
				calculation();
				}
				break;
			case 2:
				{
				setState(208);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(209);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(210);
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
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
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
			setState(213);
			type_name();
			setState(214);
			match(IDENTIFIER);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(215);
				match(EQUALS);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(216);
					new_object();
					}
					break;
				case 2:
					{
					setState(217);
					calculation();
					}
					break;
				case 3:
					{
					setState(218);
					match(VAR_VALUE);
					}
					break;
				case 4:
					{
					setState(219);
					match(IDENTIFIER);
					}
					break;
				case 5:
					{
					setState(220);
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

	public static class StatementContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public Define_varContext define_var() {
			return getRuleContext(Define_varContext.class,0);
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
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				method();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				equality();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				define_var();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				define_for();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
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
		enterRule(_localctx, 34, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(232);
				calculation();
				}
				break;
			case 2:
				{
				setState(233);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(234);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(235);
				method();
				}
				break;
			}
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BIGGER) | (1L << NOT_BIGGER) | (1L << SMALLER) | (1L << NOT_SMALLER) | (1L << EQUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(239);
				calculation();
				}
				break;
			case 2:
				{
				setState(240);
				match(VAR_VALUE);
				}
				break;
			case 3:
				{
				setState(241);
				match(IDENTIFIER);
				}
				break;
			case 4:
				{
				setState(242);
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
		enterRule(_localctx, 36, RULE_single_boolean);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				compare();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(248);
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
		enterRule(_localctx, 38, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			single_boolean();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(253);
				single_boolean();
				}
				}
				setState(258);
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
		enterRule(_localctx, 40, RULE_define_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(IF);
			setState(260);
			match(COLON);
			setState(261);
			booleans();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(262);
				statement();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
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
		enterRule(_localctx, 42, RULE_for_start);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
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
		enterRule(_localctx, 44, RULE_for_statement);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				equality();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
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
		enterRule(_localctx, 46, RULE_define_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(FOR);
			setState(279);
			match(COLON);
			setState(280);
			for_start();
			setState(281);
			match(FORCONNECTOR1);
			setState(282);
			booleans();
			setState(283);
			match(FORCONNECTOR2);
			setState(284);
			for_statement();
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(285);
				statement();
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
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
		enterRule(_localctx, 48, RULE_package_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(IDENTIFIER);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(294);
				match(T__3);
				setState(295);
				match(IDENTIFIER);
				}
				}
				setState(300);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0130\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\5\5I\n\5\3\5\3\5\3\5\3\5\3\5\7\5P\n\5\f"+
		"\5\16\5S\13\5\3\5\3\5\3\6\5\6X\n\6\3\6\5\6[\n\6\3\6\3\6\3\6\3\6\5\6a\n"+
		"\6\3\7\5\7d\n\7\3\7\5\7g\n\7\3\7\5\7j\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"r\n\7\3\7\7\7u\n\7\f\7\16\7x\13\7\3\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\5\t\u0085\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n"+
		"\u0090\13\n\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\f\3\f\3\f\7\f\u009b"+
		"\n\f\f\f\16\f\u009e\13\f\3\r\3\r\3\r\5\r\u00a3\n\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\5\16\u00ab\n\16\3\16\3\16\3\16\3\16\5\16\u00b1\n\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00b7\n\16\7\16\u00b9\n\16\f\16\16\16\u00bc\13\16\3\17"+
		"\3\17\3\17\5\17\u00c1\n\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c8\n\17\3"+
		"\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u00d6\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e0"+
		"\n\21\5\21\u00e2\n\21\3\22\3\22\3\22\3\22\3\22\5\22\u00e9\n\22\3\23\3"+
		"\23\3\23\3\23\5\23\u00ef\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f6\n\23"+
		"\3\24\3\24\3\24\3\24\5\24\u00fc\n\24\3\25\3\25\3\25\7\25\u0101\n\25\f"+
		"\25\16\25\u0104\13\25\3\26\3\26\3\26\3\26\7\26\u010a\n\26\f\26\16\26\u010d"+
		"\13\26\3\26\3\26\3\27\3\27\5\27\u0113\n\27\3\30\3\30\5\30\u0117\n\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0121\n\31\f\31\16\31\u0124"+
		"\13\31\3\31\3\31\3\32\3\32\3\32\7\32\u012b\n\32\f\32\16\32\u012e\13\32"+
		"\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7"+
		"\3\2%&\3\2\7\t\3\2\20\24\3\2\30\34\3\2\35\36\2\u0150\2\64\3\2\2\2\4A\3"+
		"\2\2\2\6D\3\2\2\2\bH\3\2\2\2\nW\3\2\2\2\fc\3\2\2\2\16\u0080\3\2\2\2\20"+
		"\u0082\3\2\2\2\22\u0086\3\2\2\2\24\u0095\3\2\2\2\26\u0097\3\2\2\2\30\u009f"+
		"\3\2\2\2\32\u00aa\3\2\2\2\34\u00bd\3\2\2\2\36\u00cf\3\2\2\2 \u00d7\3\2"+
		"\2\2\"\u00e8\3\2\2\2$\u00ee\3\2\2\2&\u00fb\3\2\2\2(\u00fd\3\2\2\2*\u0105"+
		"\3\2\2\2,\u0112\3\2\2\2.\u0116\3\2\2\2\60\u0118\3\2\2\2\62\u0127\3\2\2"+
		"\2\648\5\4\3\2\65\67\5\6\4\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3"+
		"\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\b\5\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3"+
		"\2\2\2?\3\3\2\2\2@>\3\2\2\2AB\5\62\32\2BC\7\"\2\2C\5\3\2\2\2DE\5\62\32"+
		"\2EF\7#\2\2F\7\3\2\2\2GI\5\16\b\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\13"+
		"\2\2KL\7%\2\2LQ\7\'\2\2MP\5\n\6\2NP\5\f\7\2OM\3\2\2\2ON\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7(\2\2U\t\3\2\2\2VX\5\16"+
		"\b\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\7\n\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3"+
		"\2\2\2\\]\5\62\32\2]`\7%\2\2^_\7+\2\2_a\5\30\r\2`^\3\2\2\2`a\3\2\2\2a"+
		"\13\3\2\2\2bd\5\16\b\2cb\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\7\n\2\2fe\3\2\2"+
		"\2fg\3\2\2\2gi\3\2\2\2hj\5\62\32\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\f"+
		"\2\2lm\7%\2\2mq\7\'\2\2no\5\22\n\2op\7\r\2\2pr\3\2\2\2qn\3\2\2\2qr\3\2"+
		"\2\2rv\3\2\2\2su\5\"\22\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w|\3"+
		"\2\2\2xv\3\2\2\2yz\7\'\2\2z{\t\2\2\2{}\7\16\2\2|y\3\2\2\2|}\3\2\2\2}~"+
		"\3\2\2\2~\177\7(\2\2\177\r\3\2\2\2\u0080\u0081\t\3\2\2\u0081\17\3\2\2"+
		"\2\u0082\u0084\5\62\32\2\u0083\u0085\7,\2\2\u0084\u0083\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087\5\20\t\2\u0087\u008e\7%\2"+
		"\2\u0088\u0089\7\3\2\2\u0089\u008a\5\20\t\2\u008a\u008b\7%\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096\5\34\17"+
		"\2\u0092\u0096\7&\2\2\u0093\u0096\7%\2\2\u0094\u0096\5\32\16\2\u0095\u0091"+
		"\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\25\3\2\2\2\u0097\u009c\5\24\13\2\u0098\u0099\7\3\2\2\u0099\u009b\5\24"+
		"\13\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\27\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\62\32"+
		"\2\u00a0\u00a2\7\4\2\2\u00a1\u00a3\5\26\f\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\5\2\2\u00a5\u00a6\7\17"+
		"\2\2\u00a6\31\3\2\2\2\u00a7\u00ab\7%\2\2\u00a8\u00ab\7&\2\2\u00a9\u00ab"+
		"\5\34\17\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\u00b0\t\4\2\2\u00ad\u00b1\7%\2\2\u00ae\u00b1"+
		"\7&\2\2\u00af\u00b1\5\34\17\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1\u00ba\3\2\2\2\u00b2\u00b6\t\4\2\2\u00b3\u00b7"+
		"\7%\2\2\u00b4\u00b7\7&\2\2\u00b5\u00b7\5\34\17\2\u00b6\u00b3\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b2\3\2"+
		"\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\33\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5\62\32\2\u00be\u00c0\7\4"+
		"\2\2\u00bf\u00c1\5\26\f\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00cc\7\5\2\2\u00c3\u00c4\7\6\2\2\u00c4\u00c5\7%"+
		"\2\2\u00c5\u00c7\7\4\2\2\u00c6\u00c8\5\26\f\2\u00c7\u00c6\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\7\5\2\2\u00ca\u00c3\3\2"+
		"\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\35\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7%\2\2\u00d0\u00d5\7+\2\2"+
		"\u00d1\u00d6\5\32\16\2\u00d2\u00d6\7&\2\2\u00d3\u00d6\7%\2\2\u00d4\u00d6"+
		"\5\34\17\2\u00d5\u00d1\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2\2"+
		"\u00d5\u00d4\3\2\2\2\u00d6\37\3\2\2\2\u00d7\u00d8\5\20\t\2\u00d8\u00e1"+
		"\7%\2\2\u00d9\u00df\7+\2\2\u00da\u00e0\5\30\r\2\u00db\u00e0\5\32\16\2"+
		"\u00dc\u00e0\7&\2\2\u00dd\u00e0\7%\2\2\u00de\u00e0\5\34\17\2\u00df\u00da"+
		"\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2!\3\2\2\2\u00e3\u00e9\5\34\17\2\u00e4\u00e9\5\36\20\2\u00e5"+
		"\u00e9\5 \21\2\u00e6\u00e9\5\60\31\2\u00e7\u00e9\5*\26\2\u00e8\u00e3\3"+
		"\2\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e7\3\2\2\2\u00e9#\3\2\2\2\u00ea\u00ef\5\32\16\2\u00eb\u00ef\7&\2\2"+
		"\u00ec\u00ef\7%\2\2\u00ed\u00ef\5\34\17\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f5\t\5\2\2\u00f1\u00f6\5\32\16\2\u00f2\u00f6\7&\2\2\u00f3\u00f6\7"+
		"%\2\2\u00f4\u00f6\5\34\17\2\u00f5\u00f1\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6%\3\2\2\2\u00f7\u00fc\7\26\2\2"+
		"\u00f8\u00fc\7\27\2\2\u00f9\u00fc\5$\23\2\u00fa\u00fc\5\34\17\2\u00fb"+
		"\u00f7\3\2\2\2\u00fb\u00f8\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fc\'\3\2\2\2\u00fd\u0102\5&\24\2\u00fe\u00ff\t\6\2\2\u00ff\u0101"+
		"\5&\24\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103)\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\25\2\2"+
		"\u0106\u0107\7\'\2\2\u0107\u010b\5(\25\2\u0108\u010a\5\"\22\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7(\2\2\u010f+\3\2\2\2\u0110"+
		"\u0113\7%\2\2\u0111\u0113\5 \21\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2"+
		"\2\2\u0113-\3\2\2\2\u0114\u0117\5\36\20\2\u0115\u0117\5\34\17\2\u0116"+
		"\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117/\3\2\2\2\u0118\u0119\7\37\2\2"+
		"\u0119\u011a\7\'\2\2\u011a\u011b\5,\27\2\u011b\u011c\7 \2\2\u011c\u011d"+
		"\5(\25\2\u011d\u011e\7!\2\2\u011e\u0122\5.\30\2\u011f\u0121\5\"\22\2\u0120"+
		"\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126\7(\2\2\u0126"+
		"\61\3\2\2\2\u0127\u012c\7%\2\2\u0128\u0129\7\6\2\2\u0129\u012b\7%\2\2"+
		"\u012a\u0128\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\63\3\2\2\2\u012e\u012c\3\2\2\2)8>HOQWZ`cfiqv|\u0084\u008e"+
		"\u0095\u009c\u00a2\u00aa\u00b0\u00b6\u00ba\u00c0\u00c7\u00cc\u00d5\u00df"+
		"\u00e1\u00e8\u00ee\u00f5\u00fb\u0102\u010b\u0112\u0116\u0122\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}