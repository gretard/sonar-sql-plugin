package org.antlr.sql.dialects.psqlv2;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ProxyErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

public class LexerDispatchingErrorListener implements ANTLRErrorListener
{
    Lexer _parent;

    public LexerDispatchingErrorListener(Lexer parent)
    {
        _parent = parent;
    }

    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
    {
    	ProxyErrorListener foo = new ProxyErrorListener(_parent.getErrorListeners());
        foo.syntaxError(recognizer, offendingSymbol, line, charPositionInLine, msg, e);
    }

    public void reportAmbiguity(Parser recognizer,
                                DFA dfa,
                                int startIndex,
                                int stopIndex,
                                boolean exact,
                                BitSet ambigAlts,
                                ATNConfigSet configs)
    {
    	ProxyErrorListener foo = new ProxyErrorListener(_parent.getErrorListeners());
        foo.reportAmbiguity(recognizer, dfa, startIndex, stopIndex, exact, ambigAlts, configs);
    }

    public void reportAttemptingFullContext(Parser recognizer,
                                            DFA dfa,
                                            int startIndex,
                                            int stopIndex,
                                            BitSet conflictingAlts,
                                            ATNConfigSet configs)
    {
    	ProxyErrorListener foo = new ProxyErrorListener(_parent.getErrorListeners());
        foo.reportAttemptingFullContext(recognizer, dfa, startIndex, stopIndex, conflictingAlts, configs);
    }

    public void reportContextSensitivity(Parser recognizer,
                                         DFA dfa,
                                         int startIndex,
                                         int stopIndex,
                                         int prediction,
                                         ATNConfigSet configs)
    {
    	ProxyErrorListener foo = new ProxyErrorListener(_parent.getErrorListeners());
        foo.reportContextSensitivity(recognizer, dfa, startIndex, stopIndex, prediction, configs);
    }
}
