package org.sonar.plugins.sql;

import org.sonar.api.config.Configuration;
import org.sonar.api.resources.AbstractLanguage;

public final class SQLLanguage extends AbstractLanguage {

	public static final String NAME = "SQL";

	public static final String[] DEFAULT_FILE_SUFFIXES = new String[] { ".sql" };

	private final Configuration config;

	public SQLLanguage(final Configuration config) {
		super(Constants.languageKey, NAME);
		this.config = config;

	}

	public String[] getFileSuffixes() {
		
		final String[] suffixes = config.getStringArray(Constants.PLUGIN_SUFFIXES);
		if (suffixes == null || suffixes.length == 0) {
			return DEFAULT_FILE_SUFFIXES;
		}
		return suffixes;

	}

}
