package org.sonar.plugins.sql.fillers;

import java.io.IOException;
import java.util.List;

import org.antlr.sql.comments.CommentsGrammarLexer;
import org.antlr.sql.comments.CommentsGrammarParser;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.IssuesProvider;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.CaseChangingCharStream;
import org.sonar.plugins.sql.issues.RuleToCheck;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.sensors.BaseSensor;

public class CommentIssuesFiller extends BaseSensor implements Filler {
    private static final Logger LOGGER = Loggers.get(CommentIssuesFiller.class);
    private final IssuesProvider issuesProvider = new IssuesProvider();

    @Override
    public void fill(InputFile file, SensorContext context, AntlrContext antlrContext) {

        try {

            SqlIssuesList sqlIssuesList = getIssues(antlrContext);

            try {
                addIssues(context, sqlIssuesList, file);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (IOException e1) {
            LOGGER.warn("Unexpected error adding issues", e1);
        }

    }

    SqlIssuesList getIssues(AntlrContext antlrContext) throws IOException {
        ParseTree root = getRoot(antlrContext);

        List<RuleToCheck> rulesToCheck = RuleToCheck.createCommentsList(antlrContext.rules.toArray(new SqlRules[0]));

        SqlIssuesList sqlIssuesList = issuesProvider.check(rulesToCheck, root);
        return sqlIssuesList;
    }

    ParseTree getRoot(AntlrContext antlrContext) {
        final CharStream charStream = new CaseChangingCharStream(CharStreams.fromString(antlrContext.initialContents),
                true);

        Lexer lexer = new CommentsGrammarLexer(charStream);
        lexer.removeErrorListeners();

        final CommonTokenStream stream = new CommonTokenStream(lexer);
        stream.fill();

        final CommentsGrammarParser p = new CommentsGrammarParser(stream);
        p.removeErrorListeners();
        ParseTree root = p.root();
        return root;
    }

}
