package org.sonar.plugins.sql.fillers;

import java.util.List;

import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.Token;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.highlighting.NewHighlighting;
import org.sonar.api.batch.sensor.highlighting.TypeOfText;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class HighlighterFiller implements Filler {

	private static final Logger LOGGER = Loggers.get(HighlighterFiller.class);

	@SuppressWarnings("deprecation")
	@Override
	public void fill(InputFile file, SensorContext context, AntlrContext antlrContext) {
		try {
			NewHighlighting newHighlighting = context.newHighlighting().onFile(file);
			List<? extends Token> tokens = antlrContext.getAllTokens();
			for (Token token : tokens) {
				try {
					if (token.getStopIndex() <= token.getStartIndex()) {
						continue;
					}
					if (antlrContext.isComment(token)) {
						newHighlighting.highlight(token.getStartIndex(), token.getStopIndex() + 1, TypeOfText.COMMENT);
						continue;
					}
					if (antlrContext.isString(token)) {
						newHighlighting.highlight(token.getStartIndex(), token.getStopIndex() + 1, TypeOfText.STRING);
						continue;
					}
					if (antlrContext.isKeyword(token)) {
						newHighlighting.highlight(token.getStartIndex(), token.getStopIndex() + 1, TypeOfText.KEYWORD);
						continue;
					}
				} catch (Exception e) {
					e.printStackTrace();
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
