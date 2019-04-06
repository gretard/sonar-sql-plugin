package org.sonar.plugins.sql.sensors;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.models.AntlrContext;
import org.apache.commons.lang3.EnumUtils;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.config.Configuration;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.adhoc.AdhocRulesProvider;
import org.sonar.plugins.sql.fillers.CognitiveComplexityFiller;
import org.sonar.plugins.sql.fillers.CpdTokensFiller;
import org.sonar.plugins.sql.fillers.CyclomaticCompleixtyFiller;
import org.sonar.plugins.sql.fillers.Filler;
import org.sonar.plugins.sql.fillers.HighlighterFiller;
import org.sonar.plugins.sql.fillers.IssuesFiller;
import org.sonar.plugins.sql.fillers.LineMetricsFiller;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class SQLSensor implements Sensor {

	private static final Logger LOGGER = Loggers.get(SQLSensor.class);

	private final Filler fillers[] = { new CognitiveComplexityFiller(), new CyclomaticCompleixtyFiller(),
			new LineMetricsFiller(), new HighlighterFiller(), new CpdTokensFiller(), new IssuesFiller() };
	private final AdhocRulesProvider adhocRulesProvider = new AdhocRulesProvider();

	@Override
	public void describe(final SensorDescriptor descriptor) {
		descriptor.onlyOnLanguage(Constants.languageKey);
	}

	@Override
	public void execute(final SensorContext context) {

		final Configuration config = context.config();

		final String dialect = config.get(Constants.PLUGIN_SQL_DIALECT).orElse("tsql").toUpperCase();
		final long timeout = config.getLong(Constants.PLUGIN_SQL_SCA_TIMEOUT)
				.orElse(Constants.PLUGIN_SQL_SCA_TIMEOUT_DEFAULT);
		final long maxFileSize = config.getLong(Constants.PLUGIN_SQL_SCA_MAX_FILE_SIZE)
				.orElse(Constants.PLUGIN_SQL_SCA_MAX_FILE_SIZE_DEFAULT);

		if (!EnumUtils.isValidEnum(Dialects.class, dialect)) {
			LOGGER.warn("Undefined dialect was passed: {}. Supported dialects are: {}", dialect, Dialects.values());
			return;
		}
		final Dialects sqlDialect = Dialects.valueOf(dialect.toUpperCase());
		final ExecutorService service = Executors.newWorkStealingPool();
		final org.sonar.api.batch.fs.FileSystem fs = context.fileSystem();
		final Iterable<InputFile> files = fs.inputFiles(fs.predicates().hasLanguage(Constants.languageKey));
		final List<SqlRules> customRules = adhocRulesProvider.getAdhocRules(
				config.get(Constants.PLUGIN_SQL_EXTERNAL_RULES_SUFFIX)
						.orElse(Constants.PLUGIN_SQL_EXTERNAL_RULES_SUFFIXES_DEFAULT),
				context.fileSystem().baseDir().getAbsolutePath(),
				config.getStringArray(Constants.PLUGIN_SQL_EXTERNAL_RULES_SEARCH_PATH));

		LOGGER.debug("Found {} number of custom rules", customRules.size());
		files.forEach(inputFile -> {
			service.execute(new Runnable() {

				@Override
				public void run() {
					try {
						if (inputFile.file().length() > maxFileSize) {
							LOGGER.debug("Skipping {} file as its size exceeds {} bytes", inputFile, maxFileSize);

							return;
						}
						final AntlrContext ctx = sqlDialect.parse(inputFile.contents(), customRules);
						for (final Filler filler : fillers) {
							filler.fill(inputFile, context, ctx);
						}

					} catch (Throwable e) {
						LOGGER.warn("Unexpected exception while analyzing file: " + inputFile, e);
					}

				}
			});

		});
		service.shutdown();
		try {
			service.awaitTermination(timeout, TimeUnit.SECONDS);
			service.shutdownNow();
		} catch (Throwable e) {
			LOGGER.warn("Unexpected exception while waiting for executor service to finish.", e);
		}

	}

}
