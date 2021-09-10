package comments;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.sql.comments.CommentsGrammarLexer;
import org.antlr.sql.comments.CommentsGrammarParser;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class MainTest {

    @Test
    public void test() {
        String text = "/* aaa */\r\n//testas;//tst\r\nselect 1,\"aa\";/*inline*/;;insert 2";
        text = "SELECT/*aa\r\na*/ insert 2\r\n//testas\r\n--testas2\r\n";
        System.out.println(text);
        CodePointCharStream textStream = CharStreams.fromString(text.toUpperCase());
        CommentsGrammarLexer lexer = new CommentsGrammarLexer(textStream);
        CommonTokenStream stream = new CommonTokenStream(lexer);
        CommentsGrammarParser parser = new CommentsGrammarParser(stream);
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line,
                    int charPositionInLine, String msg, RecognitionException e) throws RecognitionException {
                System.out.println("ERROR " + msg);
            }
        });
        ParseTree root = parser.root();
        print(root, 1, stream);

    }

    public static void print(final ParseTree node, final int level, CommonTokenStream stream) {
        final Interval sourceInterval = node.getSourceInterval();
        int line = -1;
        int charStart = -1;
        int endLine = -1;
        int endChar = -1;
        String text = null;
        try {
            final Token firstToken = stream.get(sourceInterval.a);
            line = firstToken.getLine();
            charStart = firstToken.getCharPositionInLine();
            endLine = line;
            endChar = charStart + firstToken.getText().length();
            text = firstToken.getText();
        } catch (Exception e) {

        }

        String data = "@(" + line + ":" + charStart + "," + endLine + ":" + endChar + ") with text: " + text;
        final int tmp = level + 1;
        final StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.repeat("\t", level));
        sb.append(node.getClass().getSimpleName() + ": " + data + " :" + node.getText());
        System.out.println(sb.toString());
        final int n = node.getChildCount();
        for (int i = 0; i < n; i++) {
            final ParseTree c = node.getChild(i);
            print(c, tmp, stream);

        }
    }

}
