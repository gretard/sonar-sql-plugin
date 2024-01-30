package org.sonar.plugins.sql.fillers;

import java.util.List;
import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.Token;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextRange;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.highlighting.NewHighlighting;
import org.sonar.api.batch.sensor.highlighting.TypeOfText;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class HighlighterFiller implements Filler {

    private static final Logger LOGGER = Loggers.get(HighlighterFiller.class);

    @Override
    public void fill(InputFile file, SensorContext context, AntlrContext antlrContext) {
        try {
            NewHighlighting newHighlighting = context.newHighlighting().onFile(file);
            List<? extends Token> tokens = antlrContext.getAllTokens();
            for (Token token : tokens) {
                try {

                    final String text = token.getText();
                    if (token.getType() == -1
                            || token.getStartIndex() >= token.getStopIndex()
                            || StringUtils.isEmpty(text)) {
                        continue;
                    }
                    final TextRange range =
                            file.newRange(
                                    token.getLine(),
                                    token.getCharPositionInLine(),
                                    token.getLine(),
                                    token.getCharPositionInLine() + text.length());
                    if (antlrContext.isComment(token)) {
                        newHighlighting.highlight(range, TypeOfText.COMMENT);
                        continue;
                    }
                    if (antlrContext.isString(token)) {
                        newHighlighting.highlight(range, TypeOfText.STRING);
                        continue;
                    }
                    if (antlrContext.isKeyword(token)) {
                        newHighlighting.highlight(range, TypeOfText.KEYWORD);
                        continue;
                    }
                } catch (Exception e) {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug(
                                "Cannot add highlighting: {} on file {} for token {}",
                                e,
                                file,
                                token);
                    }
                }
            }
            synchronized (context) {
                newHighlighting.save();
            }
        } catch (Throwable e) {
            LOGGER.warn("Unexpected error adding highlighting on: " + file, e);
        }
    }
}
