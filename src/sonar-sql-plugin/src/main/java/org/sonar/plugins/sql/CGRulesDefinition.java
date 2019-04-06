package org.sonar.plugins.sql;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionXmlLoader;

public class CGRulesDefinition implements RulesDefinition {

	private RulesDefinitionXmlLoader xmlProfileParser;

	public CGRulesDefinition(RulesDefinitionXmlLoader xmlProfileParser) {
		this.xmlProfileParser = xmlProfileParser;
	}

	@Override
	public void define(Context context) {
		try (InputStream stream = this.getClass().getResourceAsStream("/rules/cgsql-rules.xml")) {
			try (InputStreamReader reader = new InputStreamReader(stream)) {
				final NewRepository repo = context.createExternalRepository(Constants.TSQL_CG_ENGINEID,
						Constants.languageKey);
				xmlProfileParser.load(repo, reader);
				repo.rules().forEach(x -> x.setActivatedByDefault(true));
				repo.done();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
