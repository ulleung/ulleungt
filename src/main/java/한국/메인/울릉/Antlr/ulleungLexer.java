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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PUBLIC=6, PROTECTED=7, PRIVATE=8, 
		STATIC=9, ABSTRACT=10, CLASS=11, EXTEND=12, OVERRIDE=13, INTERFACE=14, 
		IMPLEMENT=15, FUNCTION=16, REQUIRE=17, RETURN=18, CREATE=19, ADD=20, SUBTRACT=21, 
		MULTIPLY=22, DIVIDE=23, MODULAR=24, IF=25, TRUE=26, FALSE=27, BIGGER=28, 
		NOT_BIGGER=29, SMALLER=30, NOT_SMALLER=31, EQUAL=32, AND=33, OR=34, FOR=35, 
		FORCONNECTOR1=36, FORCONNECTOR2=37, PACKAGE_STATE=38, PACKAGE_IMPORT=39, 
		WHITESPACE=40, IDENTIFIER=41, VAR_VALUE=42, COLON=43, SEMICOLON=44, SINGLEQOUTE=45, 
		DOUBLEQOUTE=46, EQUALS=47, ARRAY=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "PUBLIC", "PROTECTED", "PRIVATE", 
		"STATIC", "ABSTRACT", "CLASS", "EXTEND", "OVERRIDE", "INTERFACE", "IMPLEMENT", 
		"FUNCTION", "REQUIRE", "RETURN", "CREATE", "ADD", "SUBTRACT", "MULTIPLY", 
		"DIVIDE", "MODULAR", "IF", "TRUE", "FALSE", "BIGGER", "NOT_BIGGER", "SMALLER", 
		"NOT_SMALLER", "EQUAL", "AND", "OR", "FOR", "FORCONNECTOR1", "FORCONNECTOR2", 
		"PACKAGE_STATE", "PACKAGE_IMPORT", "WHITESPACE", "NEWLINE", "DIGIT", "ALPHABET_LOWERCASE", 
		"ALPHABET_UPPERCASE", "ALPHABET", "SPECIAL_CHAR1", "SPECIAL_CHAR2", "SPECIAL_CHAR3", 
		"SPECIAL_CHAR4", "SPECIAL_CHAR", "HANGEUL_FULL", "HANGEUL_ALPAHBET", "HANGEUL", 
		"ID_SOURCES", "IDENTIFIER", "VALUE_CHAR", "VALUE_STRING", "VALUE_INT", 
		"VALUE_FLOAT", "VAR_VALUE", "COLON", "SEMICOLON", "SINGLEQOUTE", "DOUBLEQOUTE", 
		"EQUALS", "ARRAY"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0181\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00b1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\5\r\u00bc\n\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00cb"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00d4\n\20\5\20\u00d6\n"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\5)\u011d\n)\3)\3)\3*\3*\3*\5*\u0124\n*\3+\3+\3,\3,\3-"+
		"\3-\3.\3.\5.\u012e\n.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\63\3\63\5\63\u013c\n\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u0144\n\66"+
		"\3\67\3\67\3\67\3\67\5\67\u014a\n\67\38\68\u014d\n8\r8\168\u014e\39\3"+
		"9\39\39\59\u0155\n9\3:\3:\3:\3:\7:\u015b\n:\f:\16:\u015e\13:\3;\3;\3<"+
		"\3<\3<\5<\u0165\n<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0171\n=\3>\3>\3?"+
		"\3?\3@\3@\3A\3A\3B\3B\3C\3C\3C\3C\3C\2\2D\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S\2"+
		"U\2W\2Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o+q\2s\2u\2w\2y,{-}.\177/\u0081"+
		"\60\u0083\61\u0085\62\3\2\r\4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;\3\2c|"+
		"\3\2C\\\3\2\"\61\3\2<B\3\2]b\3\2}\u0080\3\2\uac02\ud7b1\3\2\u3133\u31a0"+
		"\2\u018b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2o"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u0087\3\2\2\2\5\u008a\3\2\2\2\7\u008c"+
		"\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2\r\u0093\3\2\2\2\17\u0097\3\2"+
		"\2\2\21\u009b\3\2\2\2\23\u009f\3\2\2\2\25\u00a2\3\2\2\2\27\u00a6\3\2\2"+
		"\2\31\u00bb\3\2\2\2\33\u00bd\3\2\2\2\35\u00c1\3\2\2\2\37\u00d5\3\2\2\2"+
		"!\u00d7\3\2\2\2#\u00da\3\2\2\2%\u00dd\3\2\2\2\'\u00e2\3\2\2\2)\u00e5\3"+
		"\2\2\2+\u00e7\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ed\3\2\2\2\63"+
		"\u00ef\3\2\2\2\65\u00f2\3\2\2\2\67\u00f4\3\2\2\29\u00f7\3\2\2\2;\u00f9"+
		"\3\2\2\2=\u00fc\3\2\2\2?\u00fe\3\2\2\2A\u0101\3\2\2\2C\u0104\3\2\2\2E"+
		"\u0107\3\2\2\2G\u010b\3\2\2\2I\u010e\3\2\2\2K\u0111\3\2\2\2M\u0114\3\2"+
		"\2\2O\u0117\3\2\2\2Q\u011c\3\2\2\2S\u0123\3\2\2\2U\u0125\3\2\2\2W\u0127"+
		"\3\2\2\2Y\u0129\3\2\2\2[\u012d\3\2\2\2]\u012f\3\2\2\2_\u0131\3\2\2\2a"+
		"\u0133\3\2\2\2c\u0135\3\2\2\2e\u013b\3\2\2\2g\u013d\3\2\2\2i\u013f\3\2"+
		"\2\2k\u0143\3\2\2\2m\u0149\3\2\2\2o\u014c\3\2\2\2q\u0154\3\2\2\2s\u015c"+
		"\3\2\2\2u\u015f\3\2\2\2w\u0161\3\2\2\2y\u0170\3\2\2\2{\u0172\3\2\2\2}"+
		"\u0174\3\2\2\2\177\u0176\3\2\2\2\u0081\u0178\3\2\2\2\u0083\u017a\3\2\2"+
		"\2\u0085\u017c\3\2\2\2\u0087\u0088\7.\2\2\u0088\u0089\7\"\2\2\u0089\4"+
		"\3\2\2\2\u008a\u008b\7*\2\2\u008b\6\3\2\2\2\u008c\u008d\7\60\2\2\u008d"+
		"\u008e\7+\2\2\u008e\b\3\2\2\2\u008f\u0090\7+\2\2\u0090\n\3\2\2\2\u0091"+
		"\u0092\7\60\2\2\u0092\f\3\2\2\2\u0093\u0094\7\ub4e6\2\2\u0094\u0095\7"+
		"\ucdb2\2\2\u0095\u0096\7\uc9c6\2\2\u0096\16\3\2\2\2\u0097\u0098\7\uac12"+
		"\2\2\u0098\u0099\7\ucdb2\2\2\u0099\u009a\7\uc9c6\2\2\u009a\20\3\2\2\2"+
		"\u009b\u009c\7\uc22a\2\2\u009c\u009d\7\uacaa\2\2\u009d\u009e\7\uc9c6\2"+
		"\2\u009e\22\3\2\2\2\u009f\u00a0\7\uc817\2\2\u00a0\u00a1\7\uc803\2\2\u00a1"+
		"\24\3\2\2\2\u00a2\u00a3\7\ucd96\2\2\u00a3\u00a4\7\uc0c3\2\2\u00a4\u00a5"+
		"\7\uc803\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7\uac1f\2\2\u00a7\u00a8\7\uccb6"+
		"\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7\ub97e\2\2\u00aa\u00ab\7\"\2\2\u00ab"+
		"\u00ac\7\uc0c3\2\2\u00ac\u00ad\7\uc18f\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af"+
		"\7\ud55a\2\2\u00af\u00b1\7\ub296\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3"+
		"\2\2\2\u00b1\u00bc\3\2\2\2\u00b2\u00b3\7\uc746\2\2\u00b3\u00b4\7\"\2\2"+
		"\u00b4\u00b5\7\uc0c3\2\2\u00b5\u00b6\7\uc18f\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b8\7\ud55a\2\2\u00b8\u00ba\7\ub296\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00a9\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bc"+
		"\32\3\2\2\2\u00bd\u00be\7\ub369\2\2\u00be\u00bf\7\uc50e\2\2\u00bf\u00c0"+
		"\7\uc6b6\2\2\u00c0\34\3\2\2\2\u00c1\u00c2\7\ud2c2\2\2\u00c2\36\3\2\2\2"+
		"\u00c3\u00c4\7\uc746\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7\uad6e\2\2\u00c6"+
		"\u00c7\7\ud606\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c9\7\ud55a\2\2\u00c9\u00cb"+
		"\7\ub296\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d6\3\2\2"+
		"\2\u00cc\u00cd\7\ub97e\2\2\u00cd\u00ce\7\"\2\2\u00ce\u00cf\7\uad6e\2\2"+
		"\u00cf\u00d0\7\ud606\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00d2\7\ud55a\2\2\u00d2"+
		"\u00d4\7\ub296\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6"+
		"\3\2\2\2\u00d5\u00c3\3\2\2\2\u00d5\u00cc\3\2\2\2\u00d6 \3\2\2\2\u00d7"+
		"\u00d8\7\ud56a\2\2\u00d8\u00d9\7\uc21a\2\2\u00d9\"\3\2\2\2\u00da\u00db"+
		"\7\uc696\2\2\u00db\u00dc\7\uad6e\2\2\u00dc$\3\2\2\2\u00dd\u00de\7\ub3ce"+
		"\2\2\u00de\u00df\7\ub826\2\2\u00df\u00e0\7\uc8fe\2\2\u00e0\u00e1\7\uae32"+
		"\2\2\u00e1&\3\2\2\2\u00e2\u00e3\7\uc0df\2\2\u00e3\u00e4\7\uc133\2\2\u00e4"+
		"(\3\2\2\2\u00e5\u00e6\7-\2\2\u00e6*\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8,"+
		"\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea.\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec"+
		"\60\3\2\2\2\u00ed\u00ee\7\'\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7\ub9ce\2"+
		"\2\u00f0\u00f1\7\uc57f\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7\ucc3a\2\2\u00f3"+
		"\66\3\2\2\2\u00f4\u00f5\7\uac72\2\2\u00f5\u00f6\7\uc9d5\2\2\u00f68\3\2"+
		"\2\2\u00f7\u00f8\7@\2\2\u00f8:\3\2\2\2\u00f9\u00fa\7>\2\2\u00fa\u00fb"+
		"\7?\2\2\u00fb<\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd>\3\2\2\2\u00fe\u00ff\7"+
		"@\2\2\u00ff\u0100\7?\2\2\u0100@\3\2\2\2\u0101\u0102\7?\2\2\u0102\u0103"+
		"\7?\2\2\u0103B\3\2\2\2\u0104\u0105\7\uc776\2\2\u0105\u0106\7\uace2\2\2"+
		"\u0106D\3\2\2\2\u0107\u0108\7\uc776\2\2\u0108\u0109\7\uac72\2\2\u0109"+
		"\u010a\7\ub09a\2\2\u010aF\3\2\2\2\u010b\u010c\7\ubc1a\2\2\u010c\u010d"+
		"\7\ubcf7\2\2\u010dH\3\2\2\2\u010e\u010f\7\uc73e\2\2\u010f\u0110\7\ub85e"+
		"\2\2\u0110J\3\2\2\2\u0111\u0112\7\ub3db\2\2\u0112\u0113\7\uc54a\2\2\u0113"+
		"L\3\2\2\2\u0114\u0115\7\uc81e\2\2\u0115\u0116\7\uc793\2\2\u0116N\3\2\2"+
		"\2\u0117\u0118\7\ub3c6\2\2\u0118\u0119\7\uc787\2\2\u0119P\3\2\2\2\u011a"+
		"\u011d\t\2\2\2\u011b\u011d\5S*\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2"+
		"\2\u011d\u011e\3\2\2\2\u011e\u011f\b)\2\2\u011fR\3\2\2\2\u0120\u0124\t"+
		"\3\2\2\u0121\u0122\7\17\2\2\u0122\u0124\7\f\2\2\u0123\u0120\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124T\3\2\2\2\u0125\u0126\t\4\2\2\u0126V\3\2\2\2\u0127"+
		"\u0128\t\5\2\2\u0128X\3\2\2\2\u0129\u012a\t\6\2\2\u012aZ\3\2\2\2\u012b"+
		"\u012e\5W,\2\u012c\u012e\5Y-\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2"+
		"\u012e\\\3\2\2\2\u012f\u0130\t\7\2\2\u0130^\3\2\2\2\u0131\u0132\t\b\2"+
		"\2\u0132`\3\2\2\2\u0133\u0134\t\t\2\2\u0134b\3\2\2\2\u0135\u0136\t\n\2"+
		"\2\u0136d\3\2\2\2\u0137\u013c\5]/\2\u0138\u013c\5_\60\2\u0139\u013c\5"+
		"a\61\2\u013a\u013c\5c\62\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013cf\3\2\2\2\u013d\u013e\t\13\2\2"+
		"\u013eh\3\2\2\2\u013f\u0140\t\f\2\2\u0140j\3\2\2\2\u0141\u0144\5g\64\2"+
		"\u0142\u0144\5i\65\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144l\3"+
		"\2\2\2\u0145\u014a\5k\66\2\u0146\u014a\5[.\2\u0147\u014a\5U+\2\u0148\u014a"+
		"\7a\2\2\u0149\u0145\3\2\2\2\u0149\u0146\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014an\3\2\2\2\u014b\u014d\5m\67\2\u014c\u014b\3\2\2\2"+
		"\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014fp\3"+
		"\2\2\2\u0150\u0155\5k\66\2\u0151\u0155\5[.\2\u0152\u0155\5U+\2\u0153\u0155"+
		"\5e\63\2\u0154\u0150\3\2\2\2\u0154\u0151\3\2\2\2\u0154\u0152\3\2\2\2\u0154"+
		"\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155r\3\2\2\2\u0156\u015b\5k\66\2"+
		"\u0157\u015b\5[.\2\u0158\u015b\5U+\2\u0159\u015b\5e\63\2\u015a\u0156\3"+
		"\2\2\2\u015a\u0157\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015dt\3\2\2\2"+
		"\u015e\u015c\3\2\2\2\u015f\u0160\5U+\2\u0160v\3\2\2\2\u0161\u0164\5U+"+
		"\2\u0162\u0163\7\60\2\2\u0163\u0165\5U+\2\u0164\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165x\3\2\2\2\u0166\u0167\5\177@\2\u0167\u0168\5q9\2\u0168\u0169"+
		"\5\177@\2\u0169\u0171\3\2\2\2\u016a\u016b\5\u0081A\2\u016b\u016c\5s:\2"+
		"\u016c\u016d\5\u0081A\2\u016d\u0171\3\2\2\2\u016e\u0171\5u;\2\u016f\u0171"+
		"\5w<\2\u0170\u0166\3\2\2\2\u0170\u016a\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u016f\3\2\2\2\u0171z\3\2\2\2\u0172\u0173\7<\2\2\u0173|\3\2\2\2\u0174"+
		"\u0175\7=\2\2\u0175~\3\2\2\2\u0176\u0177\7)\2\2\u0177\u0080\3\2\2\2\u0178"+
		"\u0179\7$\2\2\u0179\u0082\3\2\2\2\u017a\u017b\7?\2\2\u017b\u0084\3\2\2"+
		"\2\u017c\u017d\7\uc75a\2\2\u017d\u017e\7\"\2\2\u017e\u017f\7\ubc32\2\2"+
		"\u017f\u0180\7\uc5f6\2\2\u0180\u0086\3\2\2\2\25\2\u00b0\u00b9\u00bb\u00ca"+
		"\u00d3\u00d5\u011c\u0123\u012d\u013b\u0143\u0149\u014e\u0154\u015a\u015c"+
		"\u0164\u0170\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}