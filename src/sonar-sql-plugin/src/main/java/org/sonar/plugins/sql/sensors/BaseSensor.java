package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FilenameUtils;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;

public class BaseSensor {

	private static final Logger LOGGER = Loggers.get(BaseSensor.class);

	public static List<InputFile> find(SensorContext context, String path) throws IOException {
		FilePredicates p = context.fileSystem().predicates();
		Set<InputFile> files = new HashSet<>();
		URI uri = new File(path).getCanonicalFile().toURI();

		context.fileSystem().inputFiles(p.hasLanguage(Constants.languageKey)).forEach(i -> {
			LOGGER.debug(() -> {
				return "Trying to match: " + i.uri() + " against " + uri;
			});

			if (uri.equals(i.uri())) {
				files.add(i);
			}
		});
		return new ArrayList<>(files);
	}

	public static List<InputFile> findByName(SensorContext context, String path) {
		final FilePredicates p = context.fileSystem().predicates();
		final Set<InputFile> files = new HashSet<>();
		final String search = path.replace("[", "").replace("]", "");
		final String temp[] = search.split("\\.");
		final String name = temp[temp.length - 1];
		context.fileSystem().inputFiles(p.hasLanguage(Constants.languageKey)).forEach(i -> {

			final File file = new File(i.uri());

			LOGGER.debug(() -> {
				return "Trying to match: " + i.uri() + " against " + search;
			});

			// schema.name.sql
			if (search.equals(FilenameUtils.getBaseName(file.getAbsolutePath()).replace("[", "").replace("]", ""))) {
				files.add(i);
				return;
			}
			// schema/name.sql
			if (search.equals(file.getParentFile().getName().replace("[", "").replace("]", "") + "."
					+ FilenameUtils.getBaseName(file.getAbsolutePath().replace("[", "").replace("]", "")))) {
				files.add(i);

			}
			// name.sql
			if (name.equals(FilenameUtils.getBaseName(file.getAbsolutePath().replace("[", "").replace("]", "")))) {
				files.add(i);
			}

		});
		return new ArrayList<>(files);
	}
}
