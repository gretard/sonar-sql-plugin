package org.antlr.sql.sca.matchers;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.apache.commons.lang3.StringUtils;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public class DefaultNodesMatcher implements INodesMatcher {

    private final IMatcher[] matchers =
            new IMatcher[] {
                new ClassNameMatcher(), new TextMatcher(), new IndexMatcher(), new DistanceMatcher()
            };

    @SuppressWarnings("incomplete-switch")
    @Override
    public boolean matches(
            final IParsedNode item, final IParsedNode parent, final RuleImplementation rule) {

        for (final IMatcher matcher : matchers) {
            boolean res = matcher.match(item, rule);
            if (!res) {
                return false;
            }
        }

        switch (rule.getRuleMatchType()) {
            case FULL:
                if (parent == null || item == null) {
                    return false;
                }
                if (!StringUtils.containsIgnoreCase(item.getText(), parent.getText())
                        && !StringUtils.containsIgnoreCase(parent.getText(), item.getText())) {
                    return false;
                }
                break;
            case STRICT:
                if (parent == null || item == null) {
                    return false;
                }
                if (!StringUtils.equalsIgnoreCase(item.getText(), parent.getText())) {
                    return false;
                }

                final IParsedNode parent1 = parent.getControlFlowParent();
                final IParsedNode parent2 = item.getControlFlowParent();
                if (parent1 == null || parent2 == null) {
                    return false;
                }
                if (!parent.equals(parent2)) {
                    return false;
                }
                break;
        }
        return true;
    }
}
