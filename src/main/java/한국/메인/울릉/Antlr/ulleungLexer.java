package 한국.메인.울릉.Antlr;// Generated from ulleung.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ulleungLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "PUBLIC", "PROTECTED", "PRIVATE", "STATIC", 
		"CLASS", "FUNCTION", "REQUIRE", "RETURN", "CREATE", "ADD", "SUBTRACT", 
		"MULTIPLY", "DIVIDE", "MODULAR", "IF", "TRUE", "FALSE", "BIGGER", "NOT_BIGGER", 
		"SMALLER", "NOT_SMALLER", "EQUAL", "AND", "OR", "FOR", "FORCONNECTOR1", 
		"FORCONNECTOR2", "PACKAGE_STATE", "PACKAGE_IMPORT", "WHITESPACE", "NEWLINE", 
		"DIGIT", "ALPHABET_LOWERCASE", "ALPHABET_UPPERCASE", "ALPHABET", "SPECIAL_CHAR1", 
		"SPECIAL_CHAR2", "SPECIAL_CHAR3", "SPECIAL_CHAR4", "SPECIAL_CHAR", "HANGEUL_FULL", 
		"HANGEUL_ALPAHBET", "HANGEUL", "ID_SOURCES", "IDENTIFIER", "VALUE_CHAR", 
		"VALUE_STRING", "VALUE_INT", "VALUE_FLOAT", "VAR_VALUE", "COLON", "SEMICOLON", 
		"SINGLEQOUTE", "DOUBLEQOUTE", "EQUALS", "ARRAY"
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


	public ulleungLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ulleung.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0140\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\5#\u00dc\n#\3#\3#\3$\3$\3$\5$\u00e3\n$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\5(\u00ed\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3-\5-\u00fb\n-\3.\3.\3"+
		"/\3/\3\60\3\60\5\60\u0103\n\60\3\61\3\61\3\61\3\61\5\61\u0109\n\61\3\62"+
		"\6\62\u010c\n\62\r\62\16\62\u010d\3\63\3\63\3\63\3\63\5\63\u0114\n\63"+
		"\3\64\3\64\3\64\3\64\7\64\u011a\n\64\f\64\16\64\u011d\13\64\3\65\3\65"+
		"\3\66\3\66\3\66\5\66\u0124\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\5\67\u0130\n\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3=\3=\3"+
		"=\2\2>\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c%e\2g\2"+
		"i\2k\2m&o\'q(s)u*w+y,\3\2\r\4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;\3\2c|"+
		"\3\2C\\\3\2\"\61\3\2<B\3\2]b\3\2}\u0080\3\2\uac02\ud7b1\3\2\u3133\u31a0"+
		"\2\u0144\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2c\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5~\3\2\2\2\7\u0080\3\2\2\2\t\u0082\3\2"+
		"\2\2\13\u0084\3\2\2\2\r\u0088\3\2\2\2\17\u008c\3\2\2\2\21\u0090\3\2\2"+
		"\2\23\u0093\3\2\2\2\25\u0096\3\2\2\2\27\u0099\3\2\2\2\31\u009c\3\2\2\2"+
		"\33\u00a1\3\2\2\2\35\u00a4\3\2\2\2\37\u00a6\3\2\2\2!\u00a8\3\2\2\2#\u00aa"+
		"\3\2\2\2%\u00ac\3\2\2\2\'\u00ae\3\2\2\2)\u00b1\3\2\2\2+\u00b3\3\2\2\2"+
		"-\u00b6\3\2\2\2/\u00b8\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00c0"+
		"\3\2\2\2\67\u00c3\3\2\2\29\u00c6\3\2\2\2;\u00ca\3\2\2\2=\u00cd\3\2\2\2"+
		"?\u00d0\3\2\2\2A\u00d3\3\2\2\2C\u00d6\3\2\2\2E\u00db\3\2\2\2G\u00e2\3"+
		"\2\2\2I\u00e4\3\2\2\2K\u00e6\3\2\2\2M\u00e8\3\2\2\2O\u00ec\3\2\2\2Q\u00ee"+
		"\3\2\2\2S\u00f0\3\2\2\2U\u00f2\3\2\2\2W\u00f4\3\2\2\2Y\u00fa\3\2\2\2["+
		"\u00fc\3\2\2\2]\u00fe\3\2\2\2_\u0102\3\2\2\2a\u0108\3\2\2\2c\u010b\3\2"+
		"\2\2e\u0113\3\2\2\2g\u011b\3\2\2\2i\u011e\3\2\2\2k\u0120\3\2\2\2m\u012f"+
		"\3\2\2\2o\u0131\3\2\2\2q\u0133\3\2\2\2s\u0135\3\2\2\2u\u0137\3\2\2\2w"+
		"\u0139\3\2\2\2y\u013b\3\2\2\2{|\7.\2\2|}\7\"\2\2}\4\3\2\2\2~\177\7*\2"+
		"\2\177\6\3\2\2\2\u0080\u0081\7+\2\2\u0081\b\3\2\2\2\u0082\u0083\7\60\2"+
		"\2\u0083\n\3\2\2\2\u0084\u0085\7\ub4e6\2\2\u0085\u0086\7\ucdb2\2\2\u0086"+
		"\u0087\7\uc9c6\2\2\u0087\f\3\2\2\2\u0088\u0089\7\uac12\2\2\u0089\u008a"+
		"\7\ucdb2\2\2\u008a\u008b\7\uc9c6\2\2\u008b\16\3\2\2\2\u008c\u008d\7\uc22a"+
		"\2\2\u008d\u008e\7\uacaa\2\2\u008e\u008f\7\uc9c6\2\2\u008f\20\3\2\2\2"+
		"\u0090\u0091\7\uc817\2\2\u0091\u0092\7\uc803\2\2\u0092\22\3\2\2\2\u0093"+
		"\u0094\7\uac1f\2\2\u0094\u0095\7\uccb6\2\2\u0095\24\3\2\2\2\u0096\u0097"+
		"\7\ud56a\2\2\u0097\u0098\7\uc21a\2\2\u0098\26\3\2\2\2\u0099\u009a\7\uc696"+
		"\2\2\u009a\u009b\7\uad6e\2\2\u009b\30\3\2\2\2\u009c\u009d\7\ub3ce\2\2"+
		"\u009d\u009e\7\ub826\2\2\u009e\u009f\7\uc8fe\2\2\u009f\u00a0\7\uae32\2"+
		"\2\u00a0\32\3\2\2\2\u00a1\u00a2\7\uc0df\2\2\u00a2\u00a3\7\uc133\2\2\u00a3"+
		"\34\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7"+
		" \3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7\61\2\2\u00ab"+
		"$\3\2\2\2\u00ac\u00ad\7\'\2\2\u00ad&\3\2\2\2\u00ae\u00af\7\ub9ce\2\2\u00af"+
		"\u00b0\7\uc57f\2\2\u00b0(\3\2\2\2\u00b1\u00b2\7\ucc3a\2\2\u00b2*\3\2\2"+
		"\2\u00b3\u00b4\7\uac72\2\2\u00b4\u00b5\7\uc9d5\2\2\u00b5,\3\2\2\2\u00b6"+
		"\u00b7\7@\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7>\2\2\u00b9\u00ba\7?\2\2\u00ba"+
		"\60\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7@\2\2\u00be"+
		"\u00bf\7?\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7?\2\2\u00c1\u00c2\7?\2\2\u00c2"+
		"\66\3\2\2\2\u00c3\u00c4\7\uc776\2\2\u00c4\u00c5\7\uace2\2\2\u00c58\3\2"+
		"\2\2\u00c6\u00c7\7\uc776\2\2\u00c7\u00c8\7\uac72\2\2\u00c8\u00c9\7\ub09a"+
		"\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7\ubc1a\2\2\u00cb\u00cc\7\ubcf7\2\2\u00cc"+
		"<\3\2\2\2\u00cd\u00ce\7\uc73e\2\2\u00ce\u00cf\7\ub85e\2\2\u00cf>\3\2\2"+
		"\2\u00d0\u00d1\7\ub3db\2\2\u00d1\u00d2\7\uc54a\2\2\u00d2@\3\2\2\2\u00d3"+
		"\u00d4\7\uc81e\2\2\u00d4\u00d5\7\uc793\2\2\u00d5B\3\2\2\2\u00d6\u00d7"+
		"\7\ub3c6\2\2\u00d7\u00d8\7\uc787\2\2\u00d8D\3\2\2\2\u00d9\u00dc\t\2\2"+
		"\2\u00da\u00dc\5G$\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\b#\2\2\u00deF\3\2\2\2\u00df\u00e3\t\3\2\2\u00e0\u00e1"+
		"\7\17\2\2\u00e1\u00e3\7\f\2\2\u00e2\u00df\3\2\2\2\u00e2\u00e0\3\2\2\2"+
		"\u00e3H\3\2\2\2\u00e4\u00e5\t\4\2\2\u00e5J\3\2\2\2\u00e6\u00e7\t\5\2\2"+
		"\u00e7L\3\2\2\2\u00e8\u00e9\t\6\2\2\u00e9N\3\2\2\2\u00ea\u00ed\5K&\2\u00eb"+
		"\u00ed\5M\'\2\u00ec\u00ea\3\2\2\2\u00ec\u00eb\3\2\2\2\u00edP\3\2\2\2\u00ee"+
		"\u00ef\t\7\2\2\u00efR\3\2\2\2\u00f0\u00f1\t\b\2\2\u00f1T\3\2\2\2\u00f2"+
		"\u00f3\t\t\2\2\u00f3V\3\2\2\2\u00f4\u00f5\t\n\2\2\u00f5X\3\2\2\2\u00f6"+
		"\u00fb\5Q)\2\u00f7\u00fb\5S*\2\u00f8\u00fb\5U+\2\u00f9\u00fb\5W,\2\u00fa"+
		"\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2"+
		"\2\2\u00fbZ\3\2\2\2\u00fc\u00fd\t\13\2\2\u00fd\\\3\2\2\2\u00fe\u00ff\t"+
		"\f\2\2\u00ff^\3\2\2\2\u0100\u0103\5[.\2\u0101\u0103\5]/\2\u0102\u0100"+
		"\3\2\2\2\u0102\u0101\3\2\2\2\u0103`\3\2\2\2\u0104\u0109\5_\60\2\u0105"+
		"\u0109\5O(\2\u0106\u0109\5I%\2\u0107\u0109\7a\2\2\u0108\u0104\3\2\2\2"+
		"\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109b\3"+
		"\2\2\2\u010a\u010c\5a\61\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010ed\3\2\2\2\u010f\u0114\5_\60\2"+
		"\u0110\u0114\5O(\2\u0111\u0114\5I%\2\u0112\u0114\5Y-\2\u0113\u010f\3\2"+
		"\2\2\u0113\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114f\3\2\2\2\u0115\u011a\5_\60\2\u0116\u011a\5O(\2\u0117"+
		"\u011a\5I%\2\u0118\u011a\5Y-\2\u0119\u0115\3\2\2\2\u0119\u0116\3\2\2\2"+
		"\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011ch\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u011f\5I%\2\u011fj\3\2\2\2\u0120\u0123\5I%\2\u0121\u0122\7\60\2\2\u0122"+
		"\u0124\5I%\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124l\3\2\2\2\u0125"+
		"\u0126\5s:\2\u0126\u0127\5e\63\2\u0127\u0128\5s:\2\u0128\u0130\3\2\2\2"+
		"\u0129\u012a\5u;\2\u012a\u012b\5g\64\2\u012b\u012c\5u;\2\u012c\u0130\3"+
		"\2\2\2\u012d\u0130\5i\65\2\u012e\u0130\5k\66\2\u012f\u0125\3\2\2\2\u012f"+
		"\u0129\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130n\3\2\2\2"+
		"\u0131\u0132\7<\2\2\u0132p\3\2\2\2\u0133\u0134\7=\2\2\u0134r\3\2\2\2\u0135"+
		"\u0136\7)\2\2\u0136t\3\2\2\2\u0137\u0138\7$\2\2\u0138v\3\2\2\2\u0139\u013a"+
		"\7?\2\2\u013ax\3\2\2\2\u013b\u013c\7\uc75a\2\2\u013c\u013d\7\"\2\2\u013d"+
		"\u013e\7\ubc32\2\2\u013e\u013f\7\uc5f6\2\2\u013fz\3\2\2\2\17\2\u00db\u00e2"+
		"\u00ec\u00fa\u0102\u0108\u010d\u0113\u0119\u011b\u0123\u012f\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}