package org.sonar.plugins.sql;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionXmlLoader;
import org.sonar.plugins.sql.adhoc.AdhocRulesProvider;
import org.sonar.plugins.sql.sensors.XmlHelper;
import org.sonar.api.server.rule.RulesDefinition.NewRule;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MsRulesDefinition implements RulesDefinition {

    private static final Logger LOGGER = Loggers.get(MsRulesDefinition.class);

    @Override
    public void define(Context context) {
        final NewRepository repository = context.createExternalRepository(Constants.TSQL_MS_ENGINEID,
                Constants.languageKey);
        try (InputStream stream = this.getClass().getClassLoader().getResourceAsStream("vssql-rules.xml")) {

            final DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            final DocumentBuilder builder = factory.newDocumentBuilder();
            final Document xmlDoc = builder.parse(stream);

            final NodeList nodes = xmlDoc.getElementsByTagName("rule");
            for (int i = 0; i < nodes.getLength(); i++) {
                try {
                    final Node node = nodes.item(i);
                    final String key = XmlHelper.getNodeValue(node, "key");
                    final String name = XmlHelper.getNodeValue(node, "name");
                    final String description = XmlHelper.getNodeValue(node, "description");

                    final String constantPerIssue = XmlHelper.getNodeValue(node, "debtRemediationFunctionCoefficient");
                    final String severity = XmlHelper.getNodeValue(node, "severity");
                    final String tags[] = XmlHelper.getNodeValue(node, "tag").split(",");

                    final NewRule rule = repository.createRule(key).setName(name).setMarkdownDescription(description)
                            .setSeverity(severity).setTags(tags);
                    rule.setDebtRemediationFunction(rule.debtRemediationFunctions().constantPerIssue(constantPerIssue));
                } catch (final Exception e) {
                    LOGGER.warn(String.format("Unexpected error while registering rule: %s", i), e);

                }
            }
        } catch (Exception e) {
            LOGGER.warn("Unexpected error while registering rules", e);
        }
        repository.done();

    }

}
