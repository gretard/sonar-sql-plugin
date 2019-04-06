package org.sonar.plugins.sql.sensors;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.antlr.sql.dialects.Dialects;
import org.apache.commons.io.input.BOMInputStream;
import org.opencover.CoverageSession;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.batch.sensor.coverage.NewCoverage;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;

public class SqlCoverCoverageSensor extends BaseSensor implements Sensor {

	private static final Logger LOGGER = Loggers.get(SqlCoverCoverageSensor.class);

	@Override
	public void describe(SensorDescriptor descriptor) {
		descriptor.onlyOnLanguage(Constants.languageKey).onlyWhenConfiguration(x -> x.get(Constants.PLUGIN_SQL_DIALECT)
				.orElse(Dialects.TSQL.name()).equalsIgnoreCase(Dialects.TSQL.name()));
	}

	private static List<org.opencover.Class> read(final InputStream stream) throws JAXBException {
		final JAXBContext jaxbContext = JAXBContext.newInstance(CoverageSession.class);
		final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		final CoverageSession coverageSession = (CoverageSession) jaxbUnmarshaller.unmarshal(stream);
		final List<org.opencover.Class> data = coverageSession.getModules().getModule().getClasses().getClazz();
		return data;
	}

	@Override
	public void execute(final SensorContext context) {
		final String coverageFile = context.config().get(Constants.TSQL_SQLCOVER_PATH)
				.orElse(Constants.TSQL_SQLCOVER_PATH_DEFAULT).toLowerCase();
		final String baseDir = context.fileSystem().baseDir().getAbsolutePath();
		try {
			if (Files.exists(Paths.get(coverageFile))) {
				readCoverageReport(context, Paths.get(coverageFile));
				return;
			}
			Files.walk(Paths.get(baseDir)).filter(
					p -> Files.isRegularFile(p) && p.getFileName().toString().toLowerCase().contains(coverageFile))
					.forEach(p -> {
						readCoverageReport(context, p);
					});
		} catch (Exception e) {
			LOGGER.warn("Unexpected error", e);
		}
	}

	private static void readCoverageReport(SensorContext context, Path p) {
		LOGGER.debug("Found file with coverage {}", p.toString());

		try (BOMInputStream stream = new BOMInputStream(new FileInputStream(p.toFile()))) {
			List<org.opencover.Class> coverage = read(stream);

			for (org.opencover.Class c : coverage) {

				final List<InputFile> files = findByName(context, c.getFullName());
				if (files.size() != 1) {
					LOGGER.info("File for coverage can't be determined {}, was: '{}'", c.getFullName(), files);
					continue;
				}
				final InputFile file = files.get(0);

				try {
					final NewCoverage cov = context.newCoverage().onFile(file);
					c.getMethods().getMethod().getSequencePoints().getSequencePoint().forEach(point -> {
						cov.lineHits(point.getSl(), point.getVc());
					});

					cov.save();
				} catch (Throwable e) {
					LOGGER.warn("Unexpected error while adding coverage on file: " + file, e);
				}
			}

		} catch (Throwable e) {
			LOGGER.warn("Unexpected error while reading file: " + p.toFile().getAbsolutePath(), e);
		}
	}

}
