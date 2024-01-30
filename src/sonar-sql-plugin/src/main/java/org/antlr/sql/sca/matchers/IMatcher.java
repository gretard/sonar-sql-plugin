package org.antlr.sql.sca.matchers;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public interface IMatcher {
    boolean match(IParsedNode item, RuleImplementation ruleImplementation);
}
