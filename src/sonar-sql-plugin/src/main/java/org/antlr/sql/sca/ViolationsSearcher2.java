package org.antlr.sql.sca;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.antlr.sql.sca.matchers.DefaultNodesMatcher;
import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.plugins.sql.issues.RuleToCheck;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public class ViolationsSearcher2 {

    private DefaultNodesMatcher matcher = new DefaultNodesMatcher();

    public List<RuleToCheck.RuleCheckResult2> search(Map<RuleToCheck, RuleToCheck.RuleCheckResult> rulesToCheck) {

        final List<RuleToCheck.RuleCheckResult2> results = new LinkedList<>();
        for (RuleToCheck rule : rulesToCheck.keySet()) {

            RuleToCheck.RuleCheckResult candidates = rulesToCheck.get(rule);
            // need to add checks if there are no matches, i.e. rule to check if something
            // does not exist
            if (candidates.candidates.isEmpty()) {
                org.sonar.plugins.sql.issues.RuleToCheck.RuleNodesMap map = new org.sonar.plugins.sql.issues.RuleToCheck.RuleNodesMap(
                        rule.rule);
                RuleToCheck.RuleCheckResult2 result = new RuleToCheck.RuleCheckResult2();
                result.ruleToCheck = rule;
                result.map = map;
                results.add(result);
                continue;
            }
            // check all candidates matches against single rule
            if ("file".equalsIgnoreCase(rule.rule.getRuleReportsOn())) {
                org.sonar.plugins.sql.issues.RuleToCheck.RuleNodesMap map = new org.sonar.plugins.sql.issues.RuleToCheck.RuleNodesMap(
                        rule.rule);
                RuleToCheck.RuleCheckResult2 result = new RuleToCheck.RuleCheckResult2();
                result.ruleToCheck = rule;
                result.map = map;
                results.add(result);
                for (IParsedNode node : candidates.candidates) {
                    visit(node, null, rule.rule.getRuleImplementation(), map.items);
                }
                continue;
            }

            // check all candidates matches against all rules
            for (IParsedNode node : candidates.candidates) {
                org.sonar.plugins.sql.issues.RuleToCheck.RuleNodesMap map = new org.sonar.plugins.sql.issues.RuleToCheck.RuleNodesMap(
                        rule.rule);
                RuleToCheck.RuleCheckResult2 result = new RuleToCheck.RuleCheckResult2();
                result.ruleToCheck = rule;
                result.map = map;
                results.add(result);
                visit(node, null, rule.rule.getRuleImplementation(), map.items);
            }

        }
        return results;

    }

    private void visit(final IParsedNode item, final IParsedNode parent, final RuleImplementation rule,
            Map<RuleImplementation, List<IParsedNode>> matches) {
        boolean shouldAdd = matcher.matches(item, parent, rule);
        if (!shouldAdd) {
            return;
        }
        List<IParsedNode> temp = matches.get(rule);
        temp.add(item);

        if (!rule.getChildrenRules().getRuleImplementation().isEmpty()) {
            for (IParsedNode nodeToCheck : item.getChildren()) {
                for (RuleImplementation ruleToCheck : rule.getChildrenRules().getRuleImplementation()) {
                    visit(nodeToCheck, item, ruleToCheck, matches);
                }
            }
        }

        if (!rule.getParentRules().getRuleImplementation().isEmpty()) {
            for (IParsedNode nodeToCheck : item.getParents()) {
                for (RuleImplementation ruleToCheck : rule.getParentRules().getRuleImplementation()) {
                    visit(nodeToCheck, item, ruleToCheck, matches);
                }
            }
        }

        if (!rule.getSiblingsRules().getRuleImplementation().isEmpty()) {
            for (IParsedNode nodeToCheck : item.getSiblings()) {
                for (RuleImplementation ruleToCheck : rule.getSiblingsRules().getRuleImplementation()) {
                    visit(nodeToCheck, item, ruleToCheck, matches);
                }
            }
        }

        if (!rule.getUsesRules().getRuleImplementation().isEmpty()) {
            for (IParsedNode nodeToCheck : item.getUses()) {
                for (RuleImplementation ruleToCheck : rule.getUsesRules().getRuleImplementation()) {
                    visit(nodeToCheck, item, ruleToCheck, matches);
                }
            }
        }
    }

}
