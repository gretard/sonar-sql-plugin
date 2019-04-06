package org.antlr.sql.visitors;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.sql.sca.FoundMatch;
import org.antlr.sql.sca.matchers.ClassNameMatcher;
import org.antlr.sql.sca.matchers.TextMatcher;
import org.antlr.sql.sca.nodes.ParseTreeNode;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMode;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class RulesMatchingVisitor extends AbstractParseTreeVisitor<Void> {

	private List<SqlRules> rules;
	private final ClassNameMatcher matcher = new ClassNameMatcher();
	private final TextMatcher textMatcher = new TextMatcher();

	public RulesMatchingVisitor(List<SqlRules> rules) {
		this.rules = rules;
	}

	private List<FoundMatch> matches = new LinkedList<>();
	private Map<String, FoundMatch> groupMatches = new HashMap<>();

	public List<FoundMatch> getMatches() {
		List<FoundMatch> found = new LinkedList<>();
		found.addAll(matches);
		found.addAll(groupMatches.values());
		return found;
	}

	@Override
	public Void visit(final ParseTree tree) {

		final int n = tree.getChildCount();

		for (int i = 0; i < n; i++) {
			final ParseTree c = tree.getChild(i);
			visit(c);
		}
		final ParseTreeNode node = new ParseTreeNode(tree);
		for (SqlRules rules : this.rules) {
			for (Rule rule : rules.getRule()) {
				RuleImplementation ruleImplementation = rule.getRuleImplementation();
				if (!this.matcher.match(node, ruleImplementation)
						|| !this.textMatcher.match(node, ruleImplementation)) {
					continue;
				}
				FoundMatch match = new FoundMatch();
				match.rule = rule;
				match.node = node;
				match.sqlRules = rules;
				if (RuleMode.GROUP.equals(ruleImplementation.getRuleMode())) {
					this.groupMatches.putIfAbsent(node.getText(), match);
				} else {
					this.matches.add(match);
				}
			}
		}
		return defaultResult();
	}

}
