package org.antlr.sql.visitors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.antlr.sql.sca.matchers.ClassNameMatcher;
import org.antlr.sql.sca.matchers.TextMatcher;
import org.antlr.sql.sca.nodes.ParseTreeNode;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.plugins.sql.issues.RuleToCheck;
import org.sonar.plugins.sql.issues.RuleToCheck.RuleCheckResult;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public class RulesMatchingVisitor2 extends AbstractParseTreeVisitor<Void> {

    private final List<RuleToCheck> rules;
    private final ClassNameMatcher matcher = new ClassNameMatcher();
    private final TextMatcher textMatcher = new TextMatcher();
    private final Map<RuleToCheck, RuleToCheck.RuleCheckResult> results = new LinkedHashMap<>();

    public Map<RuleToCheck, RuleToCheck.RuleCheckResult> getResults() {
        return results;
    }

    public RulesMatchingVisitor2(List<RuleToCheck> rules) {
        this.rules = rules;
        rules.forEach(
                r -> {
                    results.put(r, new RuleCheckResult());
                });
    }

    @Override
    public Void visit(final ParseTree tree) {

        final int n = tree.getChildCount();

        for (int i = 0; i < n; i++) {
            final ParseTree c = tree.getChild(i);
            visit(c);
        }
        final ParseTreeNode node = new ParseTreeNode(tree);
        for (RuleToCheck rules : this.rules) {
            Rule rule = rules.rule;
            RuleImplementation ruleImplementation = rule.getRuleImplementation();

            if (!this.matcher.match(node, ruleImplementation)
                    || !this.textMatcher.match(node, ruleImplementation)) {
                continue;
            }

            results.get(rules).candidates.add(node);

            // TODO: check this
            //            if (RuleMode.GROUP.equals(ruleImplementation.getRuleMode())) {
            //                this.groupMatches.putIfAbsent(node.getText(), match);
            //            } else {
            //                this.matches.add(match);
            //            }
        }
        return defaultResult();
    }
}
