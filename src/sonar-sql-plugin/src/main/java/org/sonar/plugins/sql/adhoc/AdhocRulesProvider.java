package org.sonar.plugins.sql.adhoc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.commons.io.input.BOMInputStream;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleMode;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.models.rules.TextCheckType;
import org.sonar.plugins.sql.sensors.XmlHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AdhocRulesProvider {

    private static final Logger LOGGER = Loggers.get(AdhocRulesProvider.class);

    protected static void readNode(List<RuleImplementation> parents, Node parent) {
        if (parent == null) {
            return;
        }
        RuleImplementation rule = new RuleImplementation();

        rule.setRuleViolationMessage(XmlHelper.getNodeValue(parent, "ruleViolationMessage"));

        rule.setTimes(XmlHelper.getNodeValue2(parent, "times", v -> Integer.parseInt(v), 1));

        rule.setDistance(XmlHelper.getNodeValue2(parent, "distance", v -> Integer.parseInt(v), 0));
        rule.setIndex(XmlHelper.getNodeValue2(parent, "index", v -> Integer.parseInt(v), 0));

        rule.setIndexCheckType(
                XmlHelper.getNodeValue2(
                        parent,
                        "indexCheckType",
                        v -> RuleDistanceIndexMatchType.fromValue(v),
                        RuleDistanceIndexMatchType.DEFAULT));
        rule.setDistanceCheckType(
                XmlHelper.getNodeValue2(
                        parent,
                        "distanceCheckType",
                        v -> RuleDistanceIndexMatchType.fromValue(v),
                        RuleDistanceIndexMatchType.DEFAULT));
        rule.setRuleMode(
                XmlHelper.getNodeValue2(
                        parent, "ruleMode", v -> RuleMode.fromValue(v), RuleMode.DEFAULT));
        rule.setRuleMatchType(
                XmlHelper.getNodeValue2(
                        parent,
                        "ruleMatchType",
                        v -> RuleMatchType.fromValue(v),
                        RuleMatchType.DEFAULT));

        rule.setRuleResultType(
                XmlHelper.getNodeValue2(
                        parent,
                        "ruleResultType",
                        v -> RuleResultType.fromValue(v),
                        RuleResultType.DEFAULT));

        rule.setTextCheckType(
                XmlHelper.getNodeValue2(
                        parent,
                        "textCheckType",
                        v -> TextCheckType.fromValue(v),
                        TextCheckType.DEFAULT));

        Node names = XmlHelper.getNode(parent, "names");
        if (names != null) {
            NodeList children = names.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                if (child.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }

                rule.getNames().getTextItem().add(child.getTextContent().trim());
            }
        }
        Node textToFind = XmlHelper.getNode(parent, "textToFind");
        if (textToFind != null) {
            NodeList children = textToFind.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                if (child.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                rule.getTextToFind().getTextItem().add(child.getTextContent().trim());
            }
        }
        Node violatingRulesCodeExamples = XmlHelper.getNode(parent, "violatingRulesCodeExamples");
        if (violatingRulesCodeExamples != null) {
            NodeList children = violatingRulesCodeExamples.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                if (child.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                rule.getViolatingRulesCodeExamples()
                        .getRuleCodeExample()
                        .add(child.getTextContent());
            }
        }
        Node compliantRulesCodeExamples = XmlHelper.getNode(parent, "compliantRulesCodeExamples");
        if (compliantRulesCodeExamples != null) {
            NodeList children = compliantRulesCodeExamples.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                if (child.getNodeType() != Node.ELEMENT_NODE) {
                    continue;
                }
                rule.getCompliantRulesCodeExamples()
                        .getRuleCodeExample()
                        .add(child.getTextContent());
            }
        }

        {
            Node rules = XmlHelper.getNode(parent, "usesRules");
            if (rules != null) {
                NodeList children = rules.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    Node child = children.item(i);
                    if (child.getNodeType() != Node.ELEMENT_NODE) {
                        continue;
                    }
                    readNode(rule.getUsesRules().getRuleImplementation(), child);
                }
            }
        }

        {
            Node rules = XmlHelper.getNode(parent, "parentRules");
            if (rules != null) {
                NodeList children = rules.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    Node child = children.item(i);
                    if (child.getNodeType() != Node.ELEMENT_NODE) {
                        continue;
                    }
                    readNode(rule.getParentRules().getRuleImplementation(), child);
                }
            }
        }
        {
            Node rules = XmlHelper.getNode(parent, "childrenRules");
            if (rules != null) {
                NodeList children = rules.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    Node child = children.item(i);
                    if (child.getNodeType() != Node.ELEMENT_NODE) {
                        continue;
                    }
                    readNode(rule.getChildrenRules().getRuleImplementation(), child);
                }
            }
        }
        {
            Node rules = XmlHelper.getNode(parent, "siblingsRules");
            if (rules != null) {
                NodeList children = rules.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    Node child = children.item(i);
                    if (child.getNodeType() != Node.ELEMENT_NODE) {
                        continue;
                    }
                    readNode(rule.getSiblingsRules().getRuleImplementation(), child);
                }
            }
        }

        parents.add(rule);
    }

    public static SqlRules read(final File file) throws Exception {
        try (BOMInputStream stream = new BOMInputStream(new FileInputStream(file))) {

            SqlRules rules = new SqlRules();

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(stream);
            Element root = doc.getDocumentElement();
            rules.setDialect(XmlHelper.readAttribute(root, "dialect", "tsql"));
            rules.setRepoName(XmlHelper.readAttribute(root, "repoName", null));
            rules.setRepoKey(XmlHelper.readAttribute(root, "repoKey", null));
            rules.setIsAdhoc(true);
            rules.setIsExternal(true);
            NodeList list = doc.getElementsByTagName("rule");
            for (int i = 0; i < list.getLength(); i++) {
                try {
                    Node parent = list.item(i);
                    org.sonar.plugins.sql.models.rules.Rule rule = new Rule();
                    rule.setKey(XmlHelper.getNodeValue(parent, "key"));
                    rule.setRuleAppliesTo(XmlHelper.getNodeValue(parent, "ruleAppliesTo", "code"));
                    rule.setRuleReportsOn(XmlHelper.getNodeValue(parent, "ruleReportsOn", "line"));
                    rule.setName(XmlHelper.getNodeValue(parent, "name"));
                    rule.setInternalKey(XmlHelper.getNodeValue(parent, "internalKey"));
                    rule.setDescription(XmlHelper.getNodeValue(parent, "description"));
                    rule.setSeverity(XmlHelper.getNodeValue(parent, "severity"));
                    rule.setRemediationFunction(
                            XmlHelper.getNodeValue(parent, "remediationFunction"));
                    rule.setDebtRemediationFunctionCoefficient(
                            XmlHelper.getNodeValue(parent, "debtRemediationFunctionCoefficient"));
                    rule.setTag(XmlHelper.getNodeValue(parent, "tag"));
                    rule.setRuleType(
                            XmlHelper.getNodeValue2(parent, "ruleType", v -> v, "CODE_SMELL"));

                    Node imp = XmlHelper.getNode(parent, "ruleImplementation");
                    List<RuleImplementation> main = new LinkedList<RuleImplementation>();
                    readNode(main, imp);
                    if (main.isEmpty()) {
                        continue;
                    }
                    rule.setRuleImplementation(main.get(0));
                    rules.getRule().add(rule);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            return rules;
        }
    }

    public List<SqlRules> getAdhocRules(String searchSuffix, String baseDir, String... paths) {

        final String s = searchSuffix.toLowerCase();
        List<SqlRules> rules = new ArrayList<>();
        List<String> pathsToSearch = new ArrayList<>();
        pathsToSearch.addAll(Arrays.asList(paths));

        if (pathsToSearch.isEmpty()) {
            pathsToSearch.add(".");
        }

        for (final String path : pathsToSearch) {
            LOGGER.debug(
                    () -> {
                        return "Searching custom/adhoc rules at: " + path;
                    });
            File file = new File(path);
            if (!file.isAbsolute()) {
                file = new File(baseDir, path);
            }
            if (file.isFile() && file.getName().toLowerCase().endsWith(s)) {
                try {
                    rules.add(read(file));
                } catch (Exception e) {
                    LOGGER.warn("Unexpected error reading file: " + file, e);
                }
            }
            if (file.isDirectory()) {
                try {

                    try (Stream<Path> stream = Files.walk(file.toPath())) {
                        stream.filter(
                                        p ->
                                                Files.isRegularFile(p)
                                                        && p.getFileName()
                                                                .toString()
                                                                .toLowerCase()
                                                                .contains(s))
                                .forEach(
                                        p -> {
                                            try {
                                                rules.add(read(p.toFile()));
                                            } catch (Exception e) {
                                                LOGGER.warn(
                                                        "Unexpected error reading file: " + p, e);
                                            }
                                        });
                    }
                } catch (IOException e) {
                    LOGGER.warn("Unexpected error reading files at: " + file, e);
                }
            }
        }
        return rules;
    }
}
