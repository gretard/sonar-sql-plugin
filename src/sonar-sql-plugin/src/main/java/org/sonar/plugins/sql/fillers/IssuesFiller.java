package org.sonar.plugins.sql.fillers;

import java.io.IOException;
import java.util.List;
import org.antlr.sql.models.AntlrContext;
import org.antlr.sql.sca.IssuesProvider;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.batch.sensor.SensorContext;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.issues.RuleToCheck;
import org.sonar.plugins.sql.issues.SqlIssuesList;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.sensors.BaseSensor;

public class IssuesFiller extends BaseSensor implements Filler {
    private static final Logger LOGGER = Loggers.get(IssuesFiller.class);
    private final IssuesProvider issuesProvider = new IssuesProvider();

    @Override
    public void fill(InputFile file, SensorContext context, AntlrContext antlrContext) {
        SqlIssuesList sqlIssuesList = getIssues(antlrContext);

        try {
            addIssues(context, sqlIssuesList, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public SqlIssuesList getIssues(AntlrContext antlrContext) {
        List<RuleToCheck> rulesToCheck =
                RuleToCheck.createCodeList2(antlrContext.rules.toArray(new SqlRules[0]));
        return issuesProvider.check(rulesToCheck, antlrContext.root);
    }
}
