package org.sonar.plugins.sql.issues;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class RuleToCheck {
    public String repoKey;

    public boolean isAdhoc;

    public boolean isExternal;

    public Rule rule;

    public RuleToCheck(SqlRules sqlRules, Rule rule) {
        this.rule = rule;
        this.repoKey = sqlRules.getRepoKey();
        this.isAdhoc = sqlRules.isIsAdhoc();
        this.isExternal = sqlRules.getIsExternal();
    }

    public static class RuleCheckResult {
        public RuleToCheck ruleToCheck;
        public List<IParsedNode> candidates = new LinkedList<>();
    }

    public static class RuleCheckResult2 {
        public RuleToCheck ruleToCheck;
        public RuleNodesMap map;
    }

    public static class CandidateCheck {
        public IParsedNode candidate;
        public Map<String, Boolean> matches = new TreeMap<>();
    }

    public static List<RuleToCheck> createCodeList2(SqlRules... list) {
        List<RuleToCheck> items = new LinkedList<>();
        for (SqlRules item : list) {
            item.getRule()
                    .forEach(
                            rule -> {
                                if (rule.getRuleAppliesTo() == null
                                        || "code".equalsIgnoreCase(rule.getRuleAppliesTo())) {
                                    items.add(new RuleToCheck(item, rule));
                                }
                            });
        }

        return items;
    }

    public static List<RuleToCheck> createCodeList2(List<SqlRules> list) {
        List<RuleToCheck> items = new LinkedList<>();
        for (SqlRules item : list) {
            item.getRule()
                    .forEach(
                            rule -> {
                                if (rule.getRuleAppliesTo() == null
                                        || "code".equalsIgnoreCase(rule.getRuleAppliesTo())) {
                                    items.add(new RuleToCheck(item, rule));
                                }
                            });
        }

        return items;
    }

    public static List<RuleToCheck> createCommentsList(SqlRules... list) {
        List<RuleToCheck> items = new LinkedList<>();
        for (SqlRules item : list) {
            item.getRule()
                    .forEach(
                            rule -> {
                                if ("comments".equalsIgnoreCase(rule.getRuleAppliesTo())) {
                                    items.add(new RuleToCheck(item, rule));
                                }
                            });
        }

        return items;
    }

    public static class RuleNodesMap {

        public final Map<RuleImplementation, List<IParsedNode>> items = new LinkedHashMap<>();

        public RuleNodesMap(Rule rule) {
            initMap(items, rule.getRuleImplementation());
        }

        public List<IParsedNode> getNodes() {
            List<IParsedNode> nodes = new LinkedList<>();
            items.forEach(
                    (k, v) -> {
                        nodes.addAll(v);
                    });
            return nodes;
        }

        private static void initMap(
                final Map<RuleImplementation, List<IParsedNode>> map,
                final RuleImplementation rule) {
            map.putIfAbsent(rule, new ArrayList<>());

            for (final RuleImplementation i : rule.getChildrenRules().getRuleImplementation()) {
                initMap(map, i);
            }
            for (final RuleImplementation i : rule.getParentRules().getRuleImplementation()) {
                initMap(map, i);
            }
            for (final RuleImplementation i : rule.getUsesRules().getRuleImplementation()) {
                initMap(map, i);
            }
            for (final RuleImplementation i : rule.getSiblingsRules().getRuleImplementation()) {
                initMap(map, i);
            }
        }
    }
}
