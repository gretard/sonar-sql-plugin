package org.sonar.plugins.sql;

import org.junit.Assert;
import org.junit.Test;
import org.sonar.api.rules.RuleType;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinition.Context;

public class MsRulesDefinitionTest {

    @Test
    public void test() {
        Context context = new RulesDefinition.Context();
        MsRulesDefinition sut = new MsRulesDefinition();
        sut.define(context);

        Assert.assertEquals(1, context.repositories().size());
        Assert.assertEquals(14, context.repositories().get(0).rules().size());

        Assert.assertTrue(
                context.repositories().get(0).rules().stream()
                        .allMatch(x -> x.type() == RuleType.CODE_SMELL));
    }
}
