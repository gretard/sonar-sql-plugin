package org.sonar.plugins.sql.sensors;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.antlr.sql.dialects.Dialects;
import org.apache.commons.io.input.BOMInputStream;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.Sensor;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.SensorDescriptor;
import org.sonar.api.batch.sensor.coverage.NewCoverage;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SqlCoverCoverageSensor extends BaseSensor implements Sensor {

	private static final Logger LOGGER = Loggers.get(SqlCoverCoverageSensor.class);

	@Override
	public void describe(SensorDescriptor descriptor) {
		descriptor.onlyOnLanguage(Constants.languageKey).onlyWhenConfiguration(x -> x.get(Constants.PLUGIN_SQL_DIALECT)
				.orElse(Dialects.TSQL.name()).equalsIgnoreCase(Dialects.TSQL.name()));
	}

	private static Map<String, Set<Coverage>> read(final InputStream stream) throws Exception {
		// SequencePoint
		// Class
		Map<String, Set<Coverage>> cov = new HashMap<>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(stream);
		NodeList list = doc.getElementsByTagName("SequencePoint");
		for (int i = 0; i < list.getLength(); i++) {
			try {
				Node node = list.item(i);
				int hits = Integer.parseInt(XmlHelper.readAttribute(node, "vc", null));
				int line = Integer.parseInt(XmlHelper.readAttribute(node, "sl", null));
				Node classz = node.getParentNode().getParentNode().getParentNode().getParentNode();
				String fileName = XmlHelper.getNodeValue(classz, "FullName");

				Set<Coverage> x = cov.getOrDefault(fileName, new HashSet<>());
				x.add(new Coverage(line, hits));
				cov.put(fileName, x);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return cov;
	}

	private static class Coverage {
		public Coverage(int line, int hits) {
			this.line = line;
			this.hits = hits;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + line;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Coverage other = (Coverage) obj;
			if (line != other.line)
				return false;
			return true;
		}

		public int line;
		public int hits;
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
			Map<String, Set<Coverage>> coverage = read(stream);

			for (String fileName : coverage.keySet()) {

				final List<InputFile> files = findByName(context, fileName);
				if (files.size() != 1) {
					LOGGER.info("File for coverage can't be determined {}, was: '{}'", fileName, files);
					continue;
				}
				final InputFile file = files.get(0);

				try {
					final NewCoverage cov = context.newCoverage().onFile(file);
					coverage.get(fileName).forEach(c -> {
						cov.lineHits(c.line, c.hits);
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
