package org.antlr.sql.sca;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.ViolationsAnalyzer.FoundViolation;
import org.antlr.sql.sca.nodes.IParsedNode;
import org.antlr.sql.visitors.RulesMatchingVisitor;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public class IssuesProvider {
	private static final Logger LOGGER = Loggers.get(IssuesProvider.class);

	private final ViolationsAnalyzer violationsAnalyzer = new ViolationsAnalyzer();
	private final ViolationsSearcher searcher = new ViolationsSearcher();

	public SqlIssuesList analyze(AntlrContext ctx) {
		final SqlIssuesList list = new SqlIssuesList();

		final RulesMatchingVisitor visitor = new RulesMatchingVisitor(ctx.getRules());
		visitor.visit(ctx.root);

		List<FoundMatch> matches = visitor.getMatches();

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(() -> "FOUND matches: " + matches.size());
		}
		for (FoundMatch m : matches) {

			Map<RuleImplementation, List<IParsedNode>> checkedRules = searcher.search(m);
			final FoundViolation violations = violationsAnalyzer.isMatch(checkedRules);

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(() -> "MATCH checked: [" + m.node.getText() + "] " + m.node.getLine() + " "
						+ m.node.getClassName() + ". Issues found: "
						+ violations.violatingNodes.stream()
								.map(x -> x.getText() + "@" + x.getClassName() + " on " + x.getLine())
								.collect(Collectors.toList())
						+ " " + violations.failuresFound);
			}

			if (violations.failuresFound) {
				SqlIssue e = mapToSqlIssue(m);
				list.addIssue(e);
			}

		}
		return list;
	}

	protected static SqlIssue mapToSqlIssue(FoundMatch m) {
		SqlIssue e = new SqlIssue();
		e.repo = m.sqlRules.getRepoKey();
		e.line = m.getLine();
		try {
			if (StringUtils.equalsIgnoreCase("LINEAR", m.rule.getRemediationFunction())
					&& !StringUtils.isBlank(m.rule.getDebtRemediationFunctionCoefficient())) {
				e.debtRemediationEffort = org.sonar.api.utils.Duration
						.decode(m.rule.getDebtRemediationFunctionCoefficient(), 8).toMinutes();
			}
		} catch (Exception p) {

		}
		e.description = m.rule.getDescription();
		e.ruleType = m.rule.getRuleType();
		e.key = m.rule.getKey();
		e.severity = m.rule.getSeverity();
		e.isAdhoc = m.sqlRules.isIsAdhoc();
		e.message = m.rule.getRuleImplementation().getRuleViolationMessage();
		e.name = m.rule.getName();
		e.isExternal = m.sqlRules.getIsExternal();
		return e;
	}
}
