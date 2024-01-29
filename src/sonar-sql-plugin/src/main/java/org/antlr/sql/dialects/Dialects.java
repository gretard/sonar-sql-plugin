package org.antlr.sql.dialects;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.antlr.sql.dialects.rules.CommonRules;
import org.antlr.sql.models.AntlrContext;
import org.sonar.plugins.sql.models.rules.SqlRules;

public enum Dialects {
	TSQL(new TSQLDialect()), PSSQL(new PsSqlDialect()), MYSQL(new MySqlDialect()), VSQL(new VSQLDialect()),
	PSSQLV2(new PsSqlV2Dialect()), SNOWFLAKE(new SnowflakeDialect());

	public AntlrContext parse(String text) {
		return parse(text, Collections.emptyList());
	}

	public List<SqlRules> getDialectRules(SqlRules... additionalRules) {
		var rules = new LinkedList<SqlRules>();
		SQLDialectRules.INSTANCE.getRules().forEach(r -> {
			if (r.getDialect() == null || this.name().equalsIgnoreCase(r.getDialect())) {
				rules.add(r);
			}

		});

		rules.addAll(CommonRules.INSTANCE.getRules());
		rules.addAll(Arrays.asList(additionalRules));
		return rules;
	}

	public AntlrContext parseInitialContext(String text) {
		return this.dialect.parse(text);
	}

	public AntlrContext parse(String text, List<SqlRules> rules) {
		AntlrContext ctx = this.dialect.parse(text);
		ctx.initialContents = text;
		SQLDialectRules.INSTANCE.getRules().forEach(r -> {
			if (r.getDialect() == null || this.name().equalsIgnoreCase(r.getDialect())) {
				ctx.rules.add(r);
			}

		});

		rules.forEach(r -> {
			if (r.getDialect() == null || this.name().equalsIgnoreCase(r.getDialect())) {
				ctx.rules.add(r);
			}
		});
		ctx.rules.addAll(CommonRules.INSTANCE.getRules());

		return ctx;
	}

	private final IDialect dialect;

	private Dialects(IDialect dialect) {
		this.dialect = dialect;
	}
}