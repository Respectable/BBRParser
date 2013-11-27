package antlrParsers;

// Generated from BBRLexer.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BBRLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START_PBP=1, TAG=2, JUNK_TEXT=3, END_PBP=4, TAG_ALT=5, TEXT=6;
	public static final int PBP = 1;
	public static String[] modeNames = {
		"DEFAULT_MODE", "PBP"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<table class=\"no_highlight stats_table\">'", "TAG", "JUNK_TEXT", "'</table>'", 
		"TAG_ALT", "TEXT"
	};
	public static final String[] ruleNames = {
		"START_PBP", "TAG", "JUNK_TEXT", "END_PBP", "TAG_ALT", "TEXT"
	};


	public BBRLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BBRLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: START_PBP_action((RuleContext)_localctx, actionIndex); break;

		case 1: TAG_action((RuleContext)_localctx, actionIndex); break;

		case 2: JUNK_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 3: END_PBP_action((RuleContext)_localctx, actionIndex); break;

		case 4: TAG_ALT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void START_PBP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: pushMode(PBP); skip();  break;
		}
	}
	private void TAG_ALT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: skip();  break;
		}
	}
	private void END_PBP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: skip(); popMode();  break;
		}
	}
	private void JUNK_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void TAG_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\bh\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\3\3\3\3\3\3\3\3\4\6\4H\n\4\r\4"+
		"\16\4I\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6"+
		"[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\3\6\3\7\6\7e\n\7\r\7\16\7f\4?\\\b\4\3"+
		"\2\6\4\3\b\5\4\n\6\5\f\7\6\16\b\1\4\2\3\3\3\2>>j\2\4\3\2\2\2\2\6\3\2\2"+
		"\2\2\b\3\2\2\2\3\n\3\2\2\2\3\f\3\2\2\2\3\16\3\2\2\2\4\20\3\2\2\2\6;\3"+
		"\2\2\2\bG\3\2\2\2\nM\3\2\2\2\fX\3\2\2\2\16d\3\2\2\2\20\21\7>\2\2\21\22"+
		"\7v\2\2\22\23\7c\2\2\23\24\7d\2\2\24\25\7n\2\2\25\26\7g\2\2\26\27\7\""+
		"\2\2\27\30\7e\2\2\30\31\7n\2\2\31\32\7c\2\2\32\33\7u\2\2\33\34\7u\2\2"+
		"\34\35\7?\2\2\35\36\7$\2\2\36\37\7p\2\2\37 \7q\2\2 !\7a\2\2!\"\7j\2\2"+
		"\"#\7k\2\2#$\7i\2\2$%\7j\2\2%&\7n\2\2&\'\7k\2\2\'(\7i\2\2()\7j\2\2)*\7"+
		"v\2\2*+\7\"\2\2+,\7u\2\2,-\7v\2\2-.\7c\2\2./\7v\2\2/\60\7u\2\2\60\61\7"+
		"a\2\2\61\62\7v\2\2\62\63\7c\2\2\63\64\7d\2\2\64\65\7n\2\2\65\66\7g\2\2"+
		"\66\67\7$\2\2\678\7@\2\289\3\2\2\29:\b\2\2\2:\5\3\2\2\2;?\7>\2\2<>\13"+
		"\2\2\2=<\3\2\2\2>A\3\2\2\2?@\3\2\2\2?=\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7"+
		"@\2\2CD\3\2\2\2DE\b\3\3\2E\7\3\2\2\2FH\n\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3"+
		"\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\b\4\4\2L\t\3\2\2\2MN\7>\2\2NO\7\61\2\2OP"+
		"\7v\2\2PQ\7c\2\2QR\7d\2\2RS\7n\2\2ST\7g\2\2TU\7@\2\2UV\3\2\2\2VW\b\5\5"+
		"\2W\13\3\2\2\2X\\\7>\2\2Y[\13\2\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z"+
		"\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7@\2\2`a\3\2\2\2ab\b\6\6\2b\r\3\2\2\2"+
		"ce\n\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\17\3\2\2\2\b\2\3?"+
		"I\\f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}