package org.antlr.sql.sca;

import org.sonar.plugins.sql.models.rules.Rule;

public class SqlIssue {
	public int line;
	
	public Rule rule;

	public String repo;

	public boolean isAdhoc;
}
