package org.antlr.sql.sca;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleResultType;

public class ViolationsAnalyzer {
    private static final Logger LOGGER = Loggers.get(ViolationsAnalyzer.class);

    public static class FoundViolation {
        public final Set<IParsedNode> violatingNodes = new HashSet<IParsedNode>();
        public boolean failuresFound = false;
    }

    public FoundViolation isMatch(Map<RuleImplementation, List<IParsedNode>> items) {

        boolean skipSatisfied = false;
        boolean failuresFound = false;
        FoundViolation violation = new FoundViolation();
        for (Entry<RuleImplementation, List<IParsedNode>> item : items.entrySet()) {

            RuleImplementation impl = item.getKey();
            List<IParsedNode> values = item.getValue();

            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(
                        () -> "Checking rules: " + impl.getRuleViolationMessage() + " against nodes: "
                                + values.stream().map(x -> x.getText() + "@" + x.getClassName() + " on " + x.getLine())
                                        .collect(Collectors.toList())
                                + " with result type: " + impl.getRuleResultType());
            }
            if (RuleResultType.DEFAULT == impl.getRuleResultType()) {
                continue;
            }

            if (RuleResultType.SKIP_IF_FOUND == impl.getRuleResultType() && !values.isEmpty()) {
                skipSatisfied = true;
            }
            if (RuleResultType.SKIP_IF_NOT_FOUND == impl.getRuleResultType() && values.isEmpty()) {
                skipSatisfied = true;
            }
            if (RuleResultType.FAIL_IF_FOUND == impl.getRuleResultType() && !values.isEmpty()) {
                failuresFound = true;
                violation.violatingNodes.addAll(values);

            }

            if (RuleResultType.FAIL_IF_NOT_FOUND == impl.getRuleResultType() && values.isEmpty()) {
                failuresFound = true;
                violation.violatingNodes.addAll(values);
            }

            if (RuleResultType.FAIL_IF_MORE_FOUND == impl.getRuleResultType() && values.size() > impl.getTimes()) {
                failuresFound = true;
                violation.violatingNodes.addAll(values);
            }

            if (RuleResultType.FAIL_IF_LESS_FOUND == impl.getRuleResultType() && values.size() < impl.getTimes()) {
                failuresFound = true;
                violation.violatingNodes.addAll(values);
            }

        }

        if (skipSatisfied) {
            violation.failuresFound = false;
            return violation;
        }

        boolean orderViodlated = false;
        // check order
        List<RuleImplementation> rules = items.keySet().stream()
                .sorted(Comparator.comparing(RuleImplementation::getIndex)).collect(Collectors.toList());
        int prev = 0;
        for (RuleImplementation rule : rules) {
        	   if (LOGGER.isDebugEnabled()) {
                   LOGGER.debug(
                           () -> "Checking rules: " + rule.getIndex()+" "+rule.getRuleViolationMessage()+" "+rule.getDistanceCheckType()+" "+items.get(rule).size());
               }
            if (rule.getIndex() == 0 || rule.getDistanceCheckType() != RuleDistanceIndexMatchType.BEFOREORAFTER) {
                continue;
            }
            if (LOGGER.isDebugEnabled()) {
                LOGGER.debug(
                        () -> "Checking nodes: " + rule.getIndex()+" "+rule.getRuleViolationMessage()+" "+rule.getDistanceCheckType()+" "+items.get(rule).size());
            }
            for (IParsedNode node : items.get(rule)) {
            	   if (LOGGER.isDebugEnabled()) {
                       LOGGER.debug(
                               () -> "Checking nodes00: " + rule.getIndex()+" "+rule.getRuleViolationMessage()+" "+rule.getDistanceCheckType()+" "+items.get(rule).size());
                   }
                if (node.getGlobalIndex() < prev) {
                	   if (LOGGER.isDebugEnabled()) {
                           LOGGER.debug(
                                   () -> "FOUND node: " + rule.getIndex()+" "+rule.getRuleViolationMessage()+" "+rule.getDistanceCheckType()+" "+items.get(rule).size());
                       }
                    orderViodlated = true;
                    violation.violatingNodes.add(node);
                    break;
                }
                prev = node.getGlobalIndex();
            }
        }

        violation.failuresFound = failuresFound || orderViodlated;
        return violation;
    }
}
