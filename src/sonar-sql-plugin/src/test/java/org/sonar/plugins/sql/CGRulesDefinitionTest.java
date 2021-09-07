package org.sonar.plugins.sql;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinition.Context;

public class CGRulesDefinitionTest {

    @Test
    @Ignore
    public void testDefine() {
        Context context = new RulesDefinition.Context();
        CGRulesDefinition sut = new CGRulesDefinition();
        sut.define(context);

        Assert.assertEquals(1, context.repositories().size());
        Assert.assertEquals(14, context.repositories().get(0).rules().size());
    }

}
