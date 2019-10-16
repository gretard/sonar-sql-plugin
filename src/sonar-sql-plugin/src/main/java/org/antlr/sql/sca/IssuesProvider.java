package org.antlr.sql.sca;

import java.util.List;
import java.util.Map;

import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.ViolationsAnalyzer.FoundViolation;
import org.antlr.sql.sca.nodes.IParsedNode;
import org.antlr.sql.visitors.RulesMatchingVisitor;
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
                        + m.node.getClassName() + ". Issues found: " + violations.violatingNodes + " "
                        + violations.failuresFound);
            }

            if (violations.failuresFound) {
                SqlIssue e = new SqlIssue();
                e.repo = m.sqlRules.getRepoKey();
                e.line = m.node.getLine();
                e.description = m.rule.getDescription();
                e.ruleType = m.rule.getRuleType();
                e.key = m.rule.getKey();
                e.severity = m.rule.getSeverity();
                e.isAdhoc = m.sqlRules.isIsAdhoc();
                e.message = m.rule.getRuleImplementation().getRuleViolationMessage();
                e.name = m.rule.getName();
                e.isExternal = m.sqlRules.getIsExternal();
                list.addIssue(e);
            }

        }
        return list;
    }
}
