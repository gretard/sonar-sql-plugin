package org.sonar.plugins.sql.fillers;

import java.io.IOException;

import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.IssuesProvider;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.sensors.BaseSensor;

public class IssuesFiller extends BaseSensor implements Filler {
	private static final Logger LOGGER = Loggers.get(IssuesFiller.class);
	private final IssuesProvider provider = new IssuesProvider();

	@Override
	public void fill(InputFile file, SensorContext context, AntlrContext antlrContext) {

		try {
			SqlIssuesList list = provider.analyze(antlrContext);
			addIssues(context, list, file);
		} catch (IOException e1) {
			LOGGER.warn("Unexpected error adding issues", e1);
		}

	}

}
