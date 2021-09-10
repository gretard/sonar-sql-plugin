package org.sonar.plugins.sql.adhoc;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.sonar.api.impl.utils.JUnitTempFolder;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleMatchType;
import org.sonar.plugins.sql.models.rules.RuleMode;
import org.sonar.plugins.sql.models.rules.RuleResultType;
import org.sonar.plugins.sql.models.rules.SqlRules;
import org.sonar.plugins.sql.models.rules.TextCheckType;

public class AdhocRulesProviderTest {
    @org.junit.Rule
    public JUnitTempFolder temp = new org.sonar.api.impl.utils.JUnitTempFolder();

    @Test
    public void testRuleDetailsAreParsedProperlyToDefaults() throws Exception {
        File baseFile = temp.newFile();

        FileUtils.copyURLToFile(getClass().getResource("/external/rule1.customRules"), baseFile);
        SqlRules rules = AdhocRulesProvider.read(baseFile);
        Assert.assertEquals("demo", rules.getRepoName());
        Assert.assertEquals("demoKey", rules.getRepoKey());
        Assert.assertEquals(true, rules.isIsAdhoc());
        Assert.assertEquals(1, rules.getRule().size());
        Rule rule = rules.getRule().get(0);
        Assert.assertEquals("2min", rule.getDebtRemediationFunctionCoefficient());
        Assert.assertNotNull(rule.getDescription());
        Assert.assertEquals(null, rule.getDescriptionFormat());
        Assert.assertEquals("IC002", rule.getInternalKey());
        Assert.assertEquals("C002", rule.getKey());
        Assert.assertEquals("test", rule.getName());
        Assert.assertEquals("BUG", rule.getRuleType());
        Assert.assertEquals("MINOR", rule.getSeverity());
        Assert.assertEquals("LINEAR", rule.getRemediationFunction());
        Assert.assertEquals(null, rule.getRemediationFunctionBaseEffort());
        Assert.assertEquals(null, rule.getSource());
        Assert.assertEquals(null, rule.getStatus());
        Assert.assertEquals("code", rule.getRuleAppliesTo());
        Assert.assertEquals("design", rule.getTag());
        Assert.assertNotNull(rule.getRuleImplementation());
        Assert.assertEquals("line", rule.getRuleReportsOn());


    }
    @Test
    public void testRuleDetailsAreParsedProperly() throws Exception {
        File baseFile = temp.newFile();

        FileUtils.copyURLToFile(getClass().getResource("/external/rule3.customRules"), baseFile);
        SqlRules rules = AdhocRulesProvider.read(baseFile);
        Assert.assertEquals("demo", rules.getRepoName());
        Assert.assertEquals("demoKey", rules.getRepoKey());
        Assert.assertEquals(true, rules.isIsAdhoc());
        Assert.assertEquals(1, rules.getRule().size());
        Rule rule = rules.getRule().get(0);
        Assert.assertEquals("2min", rule.getDebtRemediationFunctionCoefficient());
        Assert.assertNotNull(rule.getDescription());
        Assert.assertEquals(null, rule.getDescriptionFormat());
        Assert.assertEquals("IC002", rule.getInternalKey());
        Assert.assertEquals("file", rule.getRuleReportsOn());

        Assert.assertEquals("C002", rule.getKey());
        Assert.assertEquals("test", rule.getName());
        Assert.assertEquals("BUG", rule.getRuleType());
        Assert.assertEquals("MINOR", rule.getSeverity());
        Assert.assertEquals("LINEAR", rule.getRemediationFunction());
        Assert.assertEquals(null, rule.getRemediationFunctionBaseEffort());
        Assert.assertEquals(null, rule.getSource());
        Assert.assertEquals(null, rule.getStatus());
        Assert.assertEquals("comments", rule.getRuleAppliesTo());
        Assert.assertEquals("design", rule.getTag());
        Assert.assertNotNull(rule.getRuleImplementation());

    }

    @Test
    public void testRuleImplementationDetailsAreParsedProperly() throws Exception {
        File baseFile = temp.newFile();

        FileUtils.copyURLToFile(getClass().getResource("/external/rule2.customRules"), baseFile);
        SqlRules rules = AdhocRulesProvider.read(baseFile);
        Assert.assertEquals(1, rules.getRule().size());
        Rule rule = rules.getRule().get(0);
        Assert.assertNotNull(rule.getRuleImplementation());

        RuleImplementation ri = rule.getRuleImplementation();
        Assert.assertEquals(2, ri.getNames().getTextItem().size());
        Assert.assertEquals(1, ri.getTextToFind().getTextItem().size());
        Assert.assertEquals(3, ri.getChildrenRules().getRuleImplementation().size());
        Assert.assertEquals(1, ri.getParentRules().getRuleImplementation().size());
        Assert.assertEquals(1, ri.getSiblingsRules().getRuleImplementation().size());
        Assert.assertEquals(2, ri.getUsesRules().getRuleImplementation().size());
        Assert.assertEquals(2, ri.getCompliantRulesCodeExamples().getRuleCodeExample().size());
        Assert.assertEquals(1, ri.getViolatingRulesCodeExamples().getRuleCodeExample().size());
        Assert.assertEquals(2, ri.getDistance());
        Assert.assertEquals(3, ri.getIndex());
        Assert.assertEquals(4, ri.getTimes());
        Assert.assertEquals(RuleDistanceIndexMatchType.EQUALS, ri.getDistanceCheckType());
        Assert.assertEquals(RuleDistanceIndexMatchType.LESS, ri.getIndexCheckType());
        Assert.assertEquals(RuleMatchType.TEXT_AND_CLASS, ri.getRuleMatchType());
        Assert.assertEquals(RuleMode.GROUP, ri.getRuleMode());
        Assert.assertEquals(RuleResultType.FAIL_IF_FOUND, ri.getRuleResultType());
        Assert.assertEquals("msg", ri.getRuleViolationMessage());
        Assert.assertEquals(TextCheckType.STRICT, ri.getTextCheckType());
        Assert.assertEquals("test", ri.getParentRules().getRuleImplementation().get(0).getRuleViolationMessage());

        // ri.getChildrenRules()

    }

}
