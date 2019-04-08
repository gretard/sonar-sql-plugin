package org.sonar.plugins.sql.fillers;

import java.util.List;

import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.Token;
import org.sonar.api.batch.fs.InputFile;
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
				if (token.getStopIndex() <= token.getStartIndex()) {
					continue;
				}
				try {
					newCpdTokens.addToken(defaultInputFile.newRange(token.getStartIndex(), token.getStopIndex() + 1),
							token.getText());
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}

			newCpdTokens.save();

		} catch (Throwable e) {
			LOGGER.warn("Error adding cpd tokens on " + file, e);

		}

	}

}
