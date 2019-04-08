package org.sonar.plugins.sql.adhoc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.io.input.BOMInputStream;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class AdhocRulesProvider {

	private static final Logger LOGGER = Loggers.get(AdhocRulesProvider.class);

	private static SqlRules read(final File file) throws JAXBException, FileNotFoundException, IOException {
		try (BOMInputStream stream = new BOMInputStream(new FileInputStream(file))) {
			final JAXBContext jaxbContext = JAXBContext.newInstance(SqlRules.class);
			final Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			final SqlRules data = (SqlRules) jaxbUnmarshaller.unmarshal(stream);
			return data;
		}
	}

	public List<SqlRules> getAdhocRules(String searchSuffix, String baseDir, String... paths) {

		final String s = searchSuffix.toLowerCase();
		List<SqlRules> rules = new ArrayList<>();
		List<String> pathsToSearch = new ArrayList<>();
		pathsToSearch.addAll(Arrays.asList(paths));

		if (pathsToSearch.isEmpty()) {
			pathsToSearch.add(".");
		}

		for (final String path : pathsToSearch) {
			LOGGER.debug(() -> {
				return "Searching custom/adhoc rules at: " + path;
			});
			File file = new File(path);
			if (!file.isAbsolute()) {
				file = new File(baseDir, path);
			}
			if (file.isFile() && file.getName().toLowerCase().endsWith(s)) {
				try {
					rules.add(read(file));
				} catch (Exception e) {
					LOGGER.warn("Unexpected error reading file: " + file, e);
				}
			}
			if (file.isDirectory()) {
				try {

					Files.walk(file.toPath())
							.filter(p -> Files.isRegularFile(p) && p.getFileName().toString().toLowerCase().contains(s))
							.forEach(p -> {
								try {
									rules.add(read(p.toFile()));
								} catch (Exception e) {
									LOGGER.warn("Unexpected error reading file: " + p, e);
								}
							});
				} catch (IOException e) {
					LOGGER.warn("Unexpected error reading files at: " + file, e);

				}
			}

		}
		return rules;
	}
}
