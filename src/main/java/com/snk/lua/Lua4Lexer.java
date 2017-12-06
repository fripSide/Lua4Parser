// Generated from /Users/fripside/IdeaProjects/LuaParser/src/main/resources/Lua4.g4 by ANTLR 4.7
package com.snk.lua;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Lua4Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		If=1, Else=2, Elif=3, Do=4, End=5, Break=6, For=7, In=8, Local=9, Nil=10, 
		Not=11, Repeat=12, Return=13, Then=14, Until=15, While=16, Func=17, And=18, 
		Or=19, Equals=20, NEquals=21, GTEquals=22, LTEquals=23, GT=24, LT=25, 
		Add=26, Subtract=27, Multiply=28, Divide=29, Modulus=30, Pow=31, OBrace=32, 
		CBrace=33, OBracket=34, CBracket=35, OParen=36, CParen=37, SColon=38, 
		Assign=39, Comma=40, Colon=41, DOT=42, Conact=43, Args=44, String=45, 
		Name=46, WS=47, Number=48, Comment=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"If", "Else", "Elif", "Do", "End", "Break", "For", "In", "Local", "Nil", 
		"Not", "Repeat", "Return", "Then", "Until", "While", "Func", "And", "Or", 
		"Equals", "NEquals", "GTEquals", "LTEquals", "GT", "LT", "Add", "Subtract", 
		"Multiply", "Divide", "Modulus", "Pow", "OBrace", "CBrace", "OBracket", 
		"CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "Colon", 
		"DOT", "Conact", "Args", "String", "EscapeChar", "SlashChar", "UnicodeChar", 
		"DigitChar", "HexChar", "Name", "WS", "Number", "Hex", "Int", "Double", 
		"HexDouble", "ExpPart", "HexExpPart", "Digit", "HexDigit", "Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'else'", "'elseif'", "'do'", "'end'", "'break'", "'for'", 
		"'in'", "'local'", "'nil'", "'not'", "'repeat'", "'return'", "'then'", 
		"'until'", "'while'", "'function'", "'and'", "'or'", "'=='", "'~='", "'>='", 
		"'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'{'", 
		"'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "':'", "'.'", 
		"'..'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "If", "Else", "Elif", "Do", "End", "Break", "For", "In", "Local", 
		"Nil", "Not", "Repeat", "Return", "Then", "Until", "While", "Func", "And", 
		"Or", "Equals", "NEquals", "GTEquals", "LTEquals", "GT", "LT", "Add", 
		"Subtract", "Multiply", "Divide", "Modulus", "Pow", "OBrace", "CBrace", 
		"OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", 
		"Colon", "DOT", "Conact", "Args", "String", "Name", "WS", "Number", "Comment"
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
	 public void recover(RecognitionException e) {
	       System.out.println("Debug Exit");
	       throw new RuntimeException(e);
	       }

	 	@Override
	 	public void recover(LexerNoViableAltException e) {
	 		System.out.println("Debug Exit");
	       throw new RuntimeException(e);
	    }


	public Lua4Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lua4.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u01f3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3"+
		"(\3)\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\7.\u011c\n.\f.\16.\u011f"+
		"\13.\3.\3.\3.\3.\7.\u0125\n.\f.\16.\u0128\13.\3.\3.\3.\3.\3.\7.\u012f"+
		"\n.\f.\16.\u0132\13.\3.\3.\5.\u0136\n.\3/\3/\3/\3/\5/\u013c\n/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\3\61\6\61\u0146\n\61\r\61\16\61\u0147\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0157"+
		"\n\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u0160\n\64\f\64\16\64\u0163"+
		"\13\64\3\65\6\65\u0166\n\65\r\65\16\65\u0167\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\5\66\u0170\n\66\3\67\3\67\3\67\6\67\u0175\n\67\r\67\16\67\u0176"+
		"\38\68\u017a\n8\r8\168\u017b\39\69\u017f\n9\r9\169\u0180\39\39\79\u0185"+
		"\n9\f9\169\u0188\139\39\59\u018b\n9\39\39\69\u018f\n9\r9\169\u0190\39"+
		"\59\u0194\n9\39\69\u0197\n9\r9\169\u0198\39\39\59\u019d\n9\3:\3:\3:\6"+
		":\u01a2\n:\r:\16:\u01a3\3:\3:\7:\u01a8\n:\f:\16:\u01ab\13:\3:\5:\u01ae"+
		"\n:\3:\3:\3:\3:\6:\u01b4\n:\r:\16:\u01b5\3:\5:\u01b9\n:\3:\3:\3:\6:\u01be"+
		"\n:\r:\16:\u01bf\3:\3:\5:\u01c4\n:\3;\3;\5;\u01c8\n;\3;\6;\u01cb\n;\r"+
		";\16;\u01cc\3<\3<\5<\u01d1\n<\3<\6<\u01d4\n<\r<\16<\u01d5\3=\3=\3>\3>"+
		"\3?\3?\3?\3?\7?\u01e0\n?\f?\16?\u01e3\13?\3?\3?\3?\3?\7?\u01e9\n?\f?\16"+
		"?\u01ec\13?\3?\3?\5?\u01f0\n?\3?\3?\4\u0130\u01ea\2@\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\2_\2a\2c\2e\2g\60i\61k\62m\2o\2q\2s\2u\2w\2y\2{\2}\63"+
		"\3\2\21\3\2$$\4\2$$^^\3\2))\4\2))^^\3\2\62\64\5\2C\\aac|\6\2\62;C\\aa"+
		"c|\5\2\13\f\16\17\"\"\4\2ZZzz\4\2GGgg\4\2--//\4\2RRrr\3\2\62;\5\2\62;"+
		"CHch\4\2\f\f\17\17\2\u0210\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2g"+
		"\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0082\3\2\2"+
		"\2\7\u0087\3\2\2\2\t\u008e\3\2\2\2\13\u0091\3\2\2\2\r\u0095\3\2\2\2\17"+
		"\u009b\3\2\2\2\21\u009f\3\2\2\2\23\u00a2\3\2\2\2\25\u00a8\3\2\2\2\27\u00ac"+
		"\3\2\2\2\31\u00b0\3\2\2\2\33\u00b7\3\2\2\2\35\u00be\3\2\2\2\37\u00c3\3"+
		"\2\2\2!\u00c9\3\2\2\2#\u00cf\3\2\2\2%\u00d8\3\2\2\2\'\u00dc\3\2\2\2)\u00df"+
		"\3\2\2\2+\u00e2\3\2\2\2-\u00e5\3\2\2\2/\u00e8\3\2\2\2\61\u00eb\3\2\2\2"+
		"\63\u00ed\3\2\2\2\65\u00ef\3\2\2\2\67\u00f1\3\2\2\29\u00f3\3\2\2\2;\u00f5"+
		"\3\2\2\2=\u00f7\3\2\2\2?\u00f9\3\2\2\2A\u00fb\3\2\2\2C\u00fd\3\2\2\2E"+
		"\u00ff\3\2\2\2G\u0101\3\2\2\2I\u0103\3\2\2\2K\u0105\3\2\2\2M\u0107\3\2"+
		"\2\2O\u0109\3\2\2\2Q\u010b\3\2\2\2S\u010d\3\2\2\2U\u010f\3\2\2\2W\u0111"+
		"\3\2\2\2Y\u0114\3\2\2\2[\u0135\3\2\2\2]\u013b\3\2\2\2_\u013d\3\2\2\2a"+
		"\u0140\3\2\2\2c\u0156\3\2\2\2e\u0158\3\2\2\2g\u015d\3\2\2\2i\u0165\3\2"+
		"\2\2k\u016f\3\2\2\2m\u0171\3\2\2\2o\u0179\3\2\2\2q\u019c\3\2\2\2s\u01c3"+
		"\3\2\2\2u\u01c5\3\2\2\2w\u01ce\3\2\2\2y\u01d7\3\2\2\2{\u01d9\3\2\2\2}"+
		"\u01ef\3\2\2\2\177\u0080\7k\2\2\u0080\u0081\7h\2\2\u0081\4\3\2\2\2\u0082"+
		"\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085\u0086\7g\2\2"+
		"\u0086\6\3\2\2\2\u0087\u0088\7g\2\2\u0088\u0089\7n\2\2\u0089\u008a\7u"+
		"\2\2\u008a\u008b\7g\2\2\u008b\u008c\7k\2\2\u008c\u008d\7h\2\2\u008d\b"+
		"\3\2\2\2\u008e\u008f\7f\2\2\u008f\u0090\7q\2\2\u0090\n\3\2\2\2\u0091\u0092"+
		"\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094\f\3\2\2\2\u0095\u0096"+
		"\7d\2\2\u0096\u0097\7t\2\2\u0097\u0098\7g\2\2\u0098\u0099\7c\2\2\u0099"+
		"\u009a\7m\2\2\u009a\16\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7q\2\2\u009d"+
		"\u009e\7t\2\2\u009e\20\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\22\3\2\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7e\2\2\u00a5"+
		"\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7\24\3\2\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7n\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7p\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7v\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7t\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7c\2\2"+
		"\u00b5\u00b6\7v\2\2\u00b6\32\3\2\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7"+
		"g\2\2\u00b9\u00ba\7v\2\2\u00ba\u00bb\7w\2\2\u00bb\u00bc\7t\2\2\u00bc\u00bd"+
		"\7p\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7p\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\7w\2\2\u00c4\u00c5"+
		"\7p\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		" \3\2\2\2\u00c9\u00ca\7y\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc\7k\2\2\u00cc"+
		"\u00cd\7n\2\2\u00cd\u00ce\7g\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7h\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7v\2\2"+
		"\u00d4\u00d5\7k\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7p\2\2\u00d7$\3\2\2"+
		"\2\u00d8\u00d9\7c\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7f\2\2\u00db&\3\2"+
		"\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de(\3\2\2\2\u00df\u00e0"+
		"\7?\2\2\u00e0\u00e1\7?\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7\u0080\2\2\u00e3"+
		"\u00e4\7?\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7@\2\2\u00e6\u00e7\7?\2\2\u00e7"+
		".\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\u00ea\7?\2\2\u00ea\60\3\2\2\2\u00eb"+
		"\u00ec\7@\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\64\3\2\2\2\u00ef"+
		"\u00f0\7-\2\2\u00f0\66\3\2\2\2\u00f1\u00f2\7/\2\2\u00f28\3\2\2\2\u00f3"+
		"\u00f4\7,\2\2\u00f4:\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6<\3\2\2\2\u00f7"+
		"\u00f8\7\'\2\2\u00f8>\3\2\2\2\u00f9\u00fa\7`\2\2\u00fa@\3\2\2\2\u00fb"+
		"\u00fc\7}\2\2\u00fcB\3\2\2\2\u00fd\u00fe\7\177\2\2\u00feD\3\2\2\2\u00ff"+
		"\u0100\7]\2\2\u0100F\3\2\2\2\u0101\u0102\7_\2\2\u0102H\3\2\2\2\u0103\u0104"+
		"\7*\2\2\u0104J\3\2\2\2\u0105\u0106\7+\2\2\u0106L\3\2\2\2\u0107\u0108\7"+
		"=\2\2\u0108N\3\2\2\2\u0109\u010a\7?\2\2\u010aP\3\2\2\2\u010b\u010c\7."+
		"\2\2\u010cR\3\2\2\2\u010d\u010e\7<\2\2\u010eT\3\2\2\2\u010f\u0110\7\60"+
		"\2\2\u0110V\3\2\2\2\u0111\u0112\7\60\2\2\u0112\u0113\7\60\2\2\u0113X\3"+
		"\2\2\2\u0114\u0115\7\60\2\2\u0115\u0116\7\60\2\2\u0116\u0117\7\60\2\2"+
		"\u0117Z\3\2\2\2\u0118\u011d\t\2\2\2\u0119\u011c\5]/\2\u011a\u011c\n\3"+
		"\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u0120\u0136\t\2\2\2\u0121\u0126\t\4\2\2\u0122\u0125\5]/\2\u0123\u0125"+
		"\n\5\2\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0129\u0136\t\4\2\2\u012a\u012b\7]\2\2\u012b\u012c\7]\2\2\u012c\u0130"+
		"\3\2\2\2\u012d\u012f\13\2\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2"+
		"\u0130\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0133\u0134\7_\2\2\u0134\u0136\7_\2\2\u0135\u0118\3\2\2\2\u0135"+
		"\u0121\3\2\2\2\u0135\u012a\3\2\2\2\u0136\\\3\2\2\2\u0137\u013c\5_\60\2"+
		"\u0138\u013c\5a\61\2\u0139\u013c\5c\62\2\u013a\u013c\5e\63\2\u013b\u0137"+
		"\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013a\3\2\2\2\u013c"+
		"^\3\2\2\2\u013d\u013e\7^\2\2\u013e\u013f\13\2\2\2\u013f`\3\2\2\2\u0140"+
		"\u0141\7^\2\2\u0141\u0142\7w\2\2\u0142\u0143\7}\2\2\u0143\u0145\3\2\2"+
		"\2\u0144\u0146\5{>\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\177\2\2"+
		"\u014ab\3\2\2\2\u014b\u014c\7^\2\2\u014c\u0157\5y=\2\u014d\u014e\7^\2"+
		"\2\u014e\u014f\5y=\2\u014f\u0150\5y=\2\u0150\u0157\3\2\2\2\u0151\u0152"+
		"\7^\2\2\u0152\u0153\t\6\2\2\u0153\u0154\5y=\2\u0154\u0155\5y=\2\u0155"+
		"\u0157\3\2\2\2\u0156\u014b\3\2\2\2\u0156\u014d\3\2\2\2\u0156\u0151\3\2"+
		"\2\2\u0157d\3\2\2\2\u0158\u0159\7^\2\2\u0159\u015a\7z\2\2\u015a\u015b"+
		"\5{>\2\u015b\u015c\5{>\2\u015cf\3\2\2\2\u015d\u0161\t\7\2\2\u015e\u0160"+
		"\t\b\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162h\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166\t\t\2\2"+
		"\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b\65\2\2\u016aj\3\2\2\2\u016b"+
		"\u0170\5o8\2\u016c\u0170\5m\67\2\u016d\u0170\5q9\2\u016e\u0170\5s:\2\u016f"+
		"\u016b\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2"+
		"\2\2\u0170l\3\2\2\2\u0171\u0172\7\62\2\2\u0172\u0174\t\n\2\2\u0173\u0175"+
		"\5{>\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177n\3\2\2\2\u0178\u017a\5y=\2\u0179\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017cp\3\2\2\2"+
		"\u017d\u017f\5y=\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0186\7\60\2\2"+
		"\u0183\u0185\5y=\2\u0184\u0183\3\2\2\2\u0185\u0188\3\2\2\2\u0186\u0184"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0189"+
		"\u018b\5u;\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u019d\3\2\2"+
		"\2\u018c\u018e\7\60\2\2\u018d\u018f\5y=\2\u018e\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0194\5u;\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u019d\3\2\2"+
		"\2\u0195\u0197\5y=\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0196"+
		"\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\5u;\2\u019b"+
		"\u019d\3\2\2\2\u019c\u017e\3\2\2\2\u019c\u018c\3\2\2\2\u019c\u0196\3\2"+
		"\2\2\u019dr\3\2\2\2\u019e\u019f\7\62\2\2\u019f\u01a1\t\n\2\2\u01a0\u01a2"+
		"\5{>\2\u01a1\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a9\7\60\2\2\u01a6\u01a8\5"+
		"{>\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ae\5w"+
		"<\2\u01ad\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01c4\3\2\2\2\u01af"+
		"\u01b0\7\62\2\2\u01b0\u01b1\t\n\2\2\u01b1\u01b3\7\60\2\2\u01b2\u01b4\5"+
		"{>\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b9\5w<\2\u01b8\u01b7\3\2\2"+
		"\2\u01b8\u01b9\3\2\2\2\u01b9\u01c4\3\2\2\2\u01ba\u01bb\7\62\2\2\u01bb"+
		"\u01bd\t\n\2\2\u01bc\u01be\5{>\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2"+
		"\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2"+
		"\5w<\2\u01c2\u01c4\3\2\2\2\u01c3\u019e\3\2\2\2\u01c3\u01af\3\2\2\2\u01c3"+
		"\u01ba\3\2\2\2\u01c4t\3\2\2\2\u01c5\u01c7\t\13\2\2\u01c6\u01c8\t\f\2\2"+
		"\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01cb"+
		"\5y=\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cdv\3\2\2\2\u01ce\u01d0\t\r\2\2\u01cf\u01d1\t\f\2\2"+
		"\u01d0\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4"+
		"\5y=\2\u01d3\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6x\3\2\2\2\u01d7\u01d8\t\16\2\2\u01d8z\3\2\2\2\u01d9"+
		"\u01da\t\17\2\2\u01da|\3\2\2\2\u01db\u01dc\7/\2\2\u01dc\u01dd\7/\2\2\u01dd"+
		"\u01e1\3\2\2\2\u01de\u01e0\n\20\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3"+
		"\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01f0\3\2\2\2\u01e3"+
		"\u01e1\3\2\2\2\u01e4\u01e5\7\61\2\2\u01e5\u01e6\7,\2\2\u01e6\u01ea\3\2"+
		"\2\2\u01e7\u01e9\13\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ed\u01ee\7,\2\2\u01ee\u01f0\7\61\2\2\u01ef\u01db\3\2\2\2\u01ef"+
		"\u01e4\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\b?\3\2\u01f2~\3\2\2\2&"+
		"\2\u011b\u011d\u0124\u0126\u0130\u0135\u013b\u0147\u0156\u0161\u0167\u016f"+
		"\u0176\u017b\u0180\u0186\u018a\u0190\u0193\u0198\u019c\u01a3\u01a9\u01ad"+
		"\u01b5\u01b8\u01bf\u01c3\u01c7\u01cc\u01d0\u01d5\u01e1\u01ea\u01ef\4\b"+
		"\2\2\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}