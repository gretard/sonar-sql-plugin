package org.antlr.sql.sca;

import java.util.List;
import java.util.Map;

import org.antlr.sql.sca.ViolationsAnalyzer.FoundViolation;
import org.antlr.sql.visitors.RulesMatchingVisitor2;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.issues.RuleToCheck;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;

public class IssuesProvider {
    private static final Logger LOGGER = Loggers.get(IssuesProvider.class);

    public static boolean DEBUG = Boolean.FALSE || LOGGER.isDebugEnabled();

    public SqlIssuesList check(List<RuleToCheck> rulesToCheck, ParseTree root) {

        SqlIssuesList sqlIssuesList = new SqlIssuesList();

        // find all nodes matching class and/or text base/first rule implementation
        // conditions
        RulesMatchingVisitor2 visitor = new RulesMatchingVisitor2(rulesToCheck);
        visitor.visit(root);
        Map<RuleToCheck, RuleToCheck.RuleCheckResult> results = visitor.getResults();

        if (DEBUG) {
            log("Nodes matching base rules: " + results.size());
            results.forEach((k, v) -> {
                log("RULE: " + k.rule.getKey() + " " + v.candidates.size());
                v.candidates.forEach(i -> {
                    log("\tNODE: " + i.getText() + " " + i.getGlobalIndex() + " " + i.getLine() + " "
                            + i.getClassName());
                });
            });
        }
        // find all nodes matching all inner rule implementations
        ViolationsSearcher2 searcher = new ViolationsSearcher2();
        List<RuleToCheck.RuleCheckResult2> violationSeachResults = searcher.search(results);

        if (DEBUG) {
            log("Nodes matching all rules: " + violationSeachResults.size());
            violationSeachResults.forEach(v -> {
                log("RULE: " + v.ruleToCheck.rule.getKey());
                v.map.items.forEach((k, val) -> {
                    log("NODES: " + k + " " + val.size());
                    val.forEach(i -> {
                        log("\tNODE: " + i.getText() + " " + i.getGlobalIndex() + " " + i.getLine() + " "
                                + i.getClassName());
                    });
                });

            });

        }
        // analyze found nodes against rules
        ViolationsAnalyzer an = new ViolationsAnalyzer();

        for (RuleToCheck.RuleCheckResult2 res : violationSeachResults) {
            FoundViolation vio = an.isMatched(res);

            if (DEBUG) {
                log("VIOLATIONS: " + res.ruleToCheck.rule.getKey() + " " + vio.failuresFound);
                res.map.items.forEach((k, val) -> {
                    log("RULES: " + k + " " + val.size() + " " + k.getRuleResultType());
                    val.forEach(i -> {
                        log("\tNODE: " + i.getText() + " " + i.getGlobalIndex() + " " + i.getLine() + " "
                                + i.getClassName());
                    });
                });
                log("VIOLATING NODES: " + vio.violatingNodes.size());
                vio.violatingNodes.forEach(i -> {
                    log("\tNODE: " + i.getText() + " " + i.getGlobalIndex() + " " + i.getLine() + " "
                            + i.getClassName());
                });
            }

            if (vio.failuresFound) {
                SqlIssue issue = vio.toSqlIssue();
                sqlIssuesList.addIssue(issue);
            }
        }

        return sqlIssuesList;
    }

    private static void log(String msg) {
        LOGGER.debug(msg);

    }
}
