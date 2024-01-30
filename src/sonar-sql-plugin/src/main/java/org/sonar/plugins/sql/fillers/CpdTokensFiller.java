package org.sonar.plugins.sql.fillers;

import java.util.List;
import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.Token;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.fs.TextRange;
import org.sonar.api.batch.fs.internal.DefaultInputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.cpd.NewCpdTokens;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class CpdTokensFiller implements Filler {
    private static final Logger LOGGER = Loggers.get(CpdTokensFiller.class);

    @Override
    public void fill(InputFile file, SensorContext context, AntlrContext antlrContext) {
        try {
            if (!(file instanceof DefaultInputFile)) {
                return;
            }
            NewCpdTokens newCpdTokens = context.newCpdTokens().onFile(file);
            List<? extends Token> tokens = antlrContext.getAllTokens();
            DefaultInputFile defaultInputFile = (DefaultInputFile) file;
            for (Token token : tokens) {
                try {
                    final String text = token.getText();
                    if (token.getType() == -1
                            || token.getStartIndex() >= token.getStopIndex()
                            || StringUtils.isEmpty(text)) {
                        continue;
                    }

                    final TextRange range =
                            defaultInputFile.newRange(
                                    token.getStartIndex(), token.getStopIndex() + 1);
                    defaultInputFile.validate(range);
                    newCpdTokens.addToken(range, text);

                } catch (Throwable e) {
                    if (LOGGER.isDebugEnabled()) {
                        LOGGER.debug(
                                "Cannot add range: {} on file {} for token {}", e, file, token);
                    }
                }
            }
            synchronized (context) {
                newCpdTokens.save();
            }
        } catch (Throwable e) {
            LOGGER.warn("Error adding cpd tokens on " + file, e);
        }
    }
}
