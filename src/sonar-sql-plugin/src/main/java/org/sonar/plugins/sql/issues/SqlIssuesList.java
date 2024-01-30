package org.sonar.plugins.sql.issues;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SqlIssuesList {
    private final Map<String, Set<SqlIssue>> issues = new HashMap<>();

    public Map<String, Set<SqlIssue>> getIssues() {
        return issues;
    }

    public Collection<SqlIssue> getaLLIssues() {
        Set<SqlIssue> issues = new HashSet<>();
        this.issues.forEach(
                (k, v) -> {
                    issues.addAll(v);
                });
        return issues;
    }

    public SqlIssuesList addIssue(final SqlIssue issue) {
        final Set<SqlIssue> issues =
                this.issues.getOrDefault(issue.getFileName(), new HashSet<SqlIssue>());
        issues.add(issue);
        this.issues.put(issue.getFileName(), issues);
        return this;
    }
}
