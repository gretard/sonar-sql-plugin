package org.sonar.plugins.sql.fillers;

import java.util.List;

import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.IssuesProvider;
import org.antlr.sql.sca.SqlIssue;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.rule.Severity;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.batch.sensor.issue.NewExternalIssue;
import org.sonar.api.batch.sensor.issue.NewIssue;
import org.sonar.api.batch.sensor.issue.NewIssueLocation;
import org.sonar.api.batch.sensor.rule.NewAdHocRule;
import org.sonar.api.rule.RuleKey;
import org.sonar.api.rules.RuleType;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class IssuesFiller implements Filler {
	private static final Logger LOGGER = Loggers.get(IssuesFiller.class);

	@Override
	public void fill(InputFile file, SensorContext context, AntlrContext antlrContext) {

		IssuesProvider provider = new IssuesProvider();
		List<SqlIssue> issues = provider.analyze(antlrContext);

		synchronized (context) {
			for (SqlIssue issue : issues) {
				try {
					if (issue.isAdhoc) {
						NewAdHocRule rule = context.newAdHocRule();
						rule.description(issue.rule.getDescription()).engineId(issue.repo).name(issue.rule.getName())
								.ruleId(issue.rule.getKey()).severity(Severity.valueOf(issue.rule.getSeverity()))
								.type(RuleType.CODE_SMELL).save();

						NewExternalIssue iss = context.newExternalIssue();
						NewIssueLocation loc = iss.newLocation().on(file).at(file.selectLine(issue.line))
								.message(issue.rule.getRuleImplementation().getRuleViolationMessage());
						iss.at(loc).engineId(issue.repo).ruleId(issue.rule.getKey()).type(RuleType.CODE_SMELL)
								.severity(Severity.valueOf(issue.rule.getSeverity())).save();
						continue;
					}
					NewIssue iss = context.newIssue();
					NewIssueLocation loc = iss.newLocation().on(file).at(file.selectLine(issue.line))
							.message(issue.rule.getRuleImplementation().getRuleViolationMessage());
					iss.at(loc).forRule(RuleKey.of(issue.repo, issue.rule.getKey())).save();
				} catch (Exception e) {
					LOGGER.warn(
							"Unexpected error adding issue: " + issue.repo + " " + issue.rule.getKey() + " at " + file,
							e);
				}
			}
		}

	}

}
