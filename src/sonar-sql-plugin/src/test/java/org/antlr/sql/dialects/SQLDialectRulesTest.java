package org.antlr.sql.dialects;

import org.junit.Assert;
import org.junit.Test;

public class SQLDialectRulesTest {

    @Test
    public void testGetRules() {
        long s = SQLDialectRules.INSTANCE.getGroupedRules().get(0).getRule().size();
        Assert.assertEquals(20, s);

    }
    @Test
    public void testGetRules2() {
        long s = SQLDialectRules.INSTANCE.getRules().get(0).getRule().size();
        Assert.assertEquals(16, s);

    }

}
