package org.sonar.plugins.sql.fillers;

import java.util.List;
import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.Token;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.measures.CoreMetrics;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class LineMetricsFiller implements Filler {
    private static final Logger LOGGER = Loggers.get(LineMetricsFiller.class);

    private static final int COMMENT = 1;
    private static final int CODE = 2;

    public void fill(
            final InputFile file, final SensorContext context, final AntlrContext antlrContext) {
        try {
            final long[] lines = new long[file.lines() + 1];

            final List<? extends Token> tokens = antlrContext.getAllTokens();
            for (final Token token : tokens) {
                if (token.getStopIndex() <= token.getStartIndex()) {
                    continue;
                }
                final int start = token.getLine();
                final int end = start + StringUtils.countMatches(token.getText(), '\r');
                final int type = antlrContext.isComment(token) ? COMMENT : CODE;

                for (int i = start; i <= end; i++) {
                    lines[i] |= type;
                }
            }
            int commentLineCount = 0;
            int nonCommentLineCount = 0;
            for (int i = 0; i < lines.length; i++) {
                if ((lines[i] == COMMENT)) {
                    commentLineCount++;
                    continue;
                }
                if ((lines[i] & CODE) == CODE) {
                    nonCommentLineCount++;
                }
            }
            synchronized (context) {
                context.<Integer>newMeasure()
                        .on(file)
                        .forMetric(CoreMetrics.COMMENT_LINES)
                        .withValue(commentLineCount)
                        .save();
                context.<Integer>newMeasure()
                        .on(file)
                        .forMetric(CoreMetrics.NCLOC)
                        .withValue(nonCommentLineCount)
                        .save();
            }

        } catch (Throwable e) {
            LOGGER.warn("Unexpected error adding line counts metrics on: " + file, e);
        }
    }
}
