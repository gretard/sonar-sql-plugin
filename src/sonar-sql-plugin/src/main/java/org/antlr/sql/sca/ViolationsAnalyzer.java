package org.antlr.sql.sca;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.apache.commons.lang3.StringUtils;
import org.sonar.plugins.sql.issues.RuleToCheck;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleResultType;

public class ViolationsAnalyzer {

    public static class FoundViolation {
        public final Set<IParsedNode> violatingNodes = new LinkedHashSet<IParsedNode>();
        public boolean failuresFound = false;
        public Rule rule;
        public String repoKey;
        public boolean isAdhoc = false;
        public boolean isExternal = false;

        public SqlIssue toSqlIssue() {
            SqlIssue issue = new SqlIssue();
            issue.repo = repoKey;
            issue.isAdhoc = isAdhoc;
            issue.isExternal = isExternal;
            issue.description = rule.getDescription();
            issue.key = rule.getKey();
            issue.ruleType = rule.getRuleType();
            issue.severity = rule.getSeverity();
            issue.message = rule.getRuleImplementation().getRuleViolationMessage();
            issue.name = rule.getName();
            if (!violatingNodes.isEmpty()) {
                IParsedNode node = violatingNodes.stream().findFirst().get();
                issue.line = node.getLine();
            }
            try {
                if (StringUtils.equalsIgnoreCase("LINEAR", rule.getRemediationFunction())
                        && !StringUtils.isBlank(rule.getDebtRemediationFunctionCoefficient())) {
                    issue.debtRemediationEffort = org.sonar.api.utils.Duration
                            .decode(rule.getDebtRemediationFunctionCoefficient(), 8).toMinutes();
                }
            } catch (Exception p) {

            }

            return issue;
        }
    }

    public FoundViolation isMatch(RuleToCheck item, Map<RuleImplementation, List<IParsedNode>> items) {
        FoundViolation vio = isMatch(items);
        vio.rule = item.rule;
        vio.isAdhoc = item.isAdhoc;
        vio.repoKey = item.repoKey;
        vio.isExternal = item.isExternal;
        return vio;
    }

    public FoundViolation isMatched(RuleToCheck.RuleCheckResult2 result) {
        FoundViolation vio = isMatch(result.map.items);
        vio.rule = result.ruleToCheck.rule;
        vio.isAdhoc = result.ruleToCheck.isAdhoc;
        vio.repoKey = result.ruleToCheck.repoKey;
        vio.isExternal = result.ruleToCheck.isExternal;

        if (vio.violatingNodes.isEmpty()) {
            List<IParsedNode> nodes = result.map.getNodes();
            if (!nodes.isEmpty()) {
                vio.violatingNodes.add(nodes.get(0));
            }
        }
        return vio;
    }

    public FoundViolation isMatch(Map<RuleImplementation, List<IParsedNode>> items) {

        boolean skipSatisfied = false;
        boolean failuresFound = false;
        final FoundViolation violation = new FoundViolation();
        for (final Entry<RuleImplementation, List<IParsedNode>> item : items.entrySet()) {

            RuleImplementation impl = item.getKey();
            List<IParsedNode> values = item.getValue();
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

        boolean orderViolated = false;

        // check order
        List<RuleImplementation> rules = items.keySet().stream()
                .sorted(Comparator.comparing(RuleImplementation::getIndex)).collect(Collectors.toList());
        int prev = 0;
        for (RuleImplementation rule : rules) {

            if (rule.getIndex() == 0 || rule.getDistanceCheckType() != RuleDistanceIndexMatchType.BEFOREORAFTER) {
                continue;
            }

            for (IParsedNode node : items.get(rule)) {
                if (node.getGlobalIndex() < prev) {
                    orderViolated = true;
                    violation.violatingNodes.add(node);
                    break;
                }
                prev = node.getGlobalIndex();
            }
        }

        violation.failuresFound = failuresFound || orderViolated;
        return violation;
    }
}
