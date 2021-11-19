package org.sonar.plugins.sql.sensors;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang3.StringUtils;
import org.sonar.api.batch.fs.FilePredicates;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.rule.Severity;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewExternalIssue;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.rules.RuleType;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.Constants;
import org.sonar.plugins.sql.issues.SqlIssue;
import org.sonar.plugins.sql.issues.SqlIssuesList;

public class BaseSensor {

    private static final Logger LOGGER = Loggers.get(BaseSensor.class);

    public static List<InputFile> find(SensorContext context, String path) throws IOException {
        FilePredicates p = context.fileSystem().predicates();
        Set<InputFile> files = new HashSet<>();
        URI uri = new File(path).getCanonicalFile().toURI();

        context.fileSystem().inputFiles(p.hasLanguage(Constants.languageKey)).forEach(i -> {
            if (uri.equals(i.uri())) {
                files.add(i);
            }
        });

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Found '{}' matches against {} ", Arrays.toString(files.toArray()), path);
        }
        return new ArrayList<>(files);
    }

    public static List<InputFile> findByName(SensorContext context, String path) {
        final FilePredicates p = context.fileSystem().predicates();
        final Set<InputFile> files = new HashSet<>();
        final String search = path.replace("[", "").replace("]", "");
        final String temp[] = search.split("\\.");
        final String name = temp[temp.length - 1];
        context.fileSystem().inputFiles(p.hasLanguage(Constants.languageKey)).forEach(i -> {

            final File file = new File(i.uri());

            // schema.name.sql
            if (search.equals(FilenameUtils.getBaseName(file.getAbsolutePath()).replace("[", "").replace("]", ""))) {
                files.add(i);
                return;
            }
            // schema/name.sql
            if (search.equals(file.getParentFile().getName().replace("[", "").replace("]", "") + "."
                    + FilenameUtils.getBaseName(file.getAbsolutePath().replace("[", "").replace("]", "")))) {
                files.add(i);

            }
            // name.sql
            if (name.equals(FilenameUtils.getBaseName(file.getAbsolutePath().replace("[", "").replace("]", "")))) {
                files.add(i);
            }

        });
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Found '{}' matches against {} and  {}", Arrays.toString(files.toArray()), path, search);
        }

        return new ArrayList<>(files);
    }

    protected static synchronized void addIssues(SensorContext context, final SqlIssuesList issues,
            final InputFile file) throws IOException {
     

        final List<String> rulesToSkip = Arrays
                .asList(context.config().getStringArray(Constants.PLUGIN_SQL_RULES_SKIP));

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Found {} issues", issues.getaLLIssues().size());
        }

        for (final Entry<String, Set<SqlIssue>> fileIssues : issues.getIssues().entrySet()) {

            String fileName = fileIssues.getKey();

            InputFile main = file;
            if (main == null) {
                final List<InputFile> files = find(context, fileName);
                if (files.isEmpty()) {
                    LOGGER.debug("Was not able to find file {} to add issues", fileName);
                    continue;
                }
                main = files.get(0);
            }

            for (final SqlIssue issue : fileIssues.getValue()) {
                try {

                    if (rulesToSkip.contains(issue.getUniqueKey())) {
                        continue;
                    }

                    if (issue.isAdhoc()) {
                        context.newAdHocRule().description(issue.getDescription()).engineId(issue.getRepo())
                                .name(issue.getName()).ruleId(issue.getKey())
                                .severity(extractSeverity(issue.getSeverity()))
                                .type(RuleType.valueOf(issue.getRuleType())).save();
                    }
                    if (issue.isExternal) {
                        final NewExternalIssue newExternalIssue = context.newExternalIssue().ruleId(issue.getKey())
                                .engineId(issue.getRepo()).type(RuleType.valueOf(issue.getRuleType()));
                        if (issue.getDebtRemediationEffort() > 0) {
                            newExternalIssue.remediationEffortMinutes(issue.getDebtRemediationEffort());
                        }
                        final NewIssueLocation location = newExternalIssue.newLocation().on(main)
                                .message(issue.getMessage());
                        if (issue.getLine() > 0) {
                            location.at(main.selectLine(issue.getLine()));
                        }
                        newExternalIssue.at(location).severity(extractSeverity(issue.getSeverity())).save();
                        continue;
                    }
                    final NewIssue newIssue = context.newIssue().forRule(RuleKey.of(issue.getRepo(), issue.getKey()));
                    final NewIssueLocation loc = newIssue.newLocation().on(main).message(issue.getMessage());
                    if (issue.getLine() > 0) {
                        loc.at(main.selectLine(issue.getLine()));
                    }
                    newIssue.at(loc).save();

                } catch (Throwable e) {
                    LOGGER.warn("Unexpected error adding issue on file " + fileName+" for issue: "+issue, e);

                }
            }

        }
    }

    protected static final Severity extractSeverity(final String severityValue) {
        String severity = "MAJOR";
        if (severityValue != null) {
            severity = severityValue.toUpperCase();
        }
        if ("ERROR".equalsIgnoreCase(severity)) {
            return Severity.CRITICAL;
        }
        if ("WARNING".equalsIgnoreCase(severity)) {
            return Severity.MAJOR;
        }
        if (StringUtils.containsIgnoreCase(severityValue, "HIGH")) {
            return Severity.MAJOR;
        }
        if (StringUtils.containsIgnoreCase(severityValue, "LOW")) {
            return Severity.INFO;
        }
        try {
            return Severity.valueOf(severity);
        } catch (Exception e) {

        }

        return Severity.MAJOR;

    }
}
