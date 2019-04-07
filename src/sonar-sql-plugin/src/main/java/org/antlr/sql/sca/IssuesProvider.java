package org.antlr.sql.sca;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.nodes.IParsedNode;
import org.antlr.sql.visitors.RulesMatchingVisitor;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public class IssuesProvider {
	ViolationsAnalyzer violationsAnalyzer = new ViolationsAnalyzer();
	ViolationsSearcher searcher = new ViolationsSearcher();

	public List<SqlIssue> analyze(AntlrContext ctx) {
		List<SqlIssue> foundIssues = new ArrayList<>();
		RulesMatchingVisitor visitor = new RulesMatchingVisitor(ctx.getRules());
		visitor.visit(ctx.root);

		List<FoundMatch> matches = visitor.getMatches();
		for (FoundMatch m : matches) {
			Map<RuleImplementation, List<IParsedNode>> checkedRules = searcher.search(m);

			if (violationsAnalyzer.isMatch(checkedRules)) {
				SqlIssue e = new SqlIssue();
				e.repo = m.sqlRules.getRepoKey();
				e.line = m.node.getLine();
				e.rule = m.rule;
				e.isAdhoc = m.sqlRules.isIsAdhoc();
				foundIssues.add(e);
			}

		}
		return foundIssues;
	}
}
