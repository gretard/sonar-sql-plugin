package org.antlr.sql.sca.matchers;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public class IndexMatcher implements IMatcher {

	@Override
	public boolean match(IParsedNode node, RuleImplementation rule) {
		if (rule.getIndex() == 0) {
			return true;
		}
		if (rule.getIndex() > 0) {
			int val = node.getIndex();
			if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.LESS) {
				if (val > rule.getIndex()) {
					return false;
				}
			}
			if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.EQUALS) {
				if (val != rule.getIndex()) {
					return false;
				}
			}
			if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.MORE) {
				if (rule.getIndex() < val) {
					return false;
				}
			}

		}
		if (rule.getIndex() < 0) {
			int val = node.getIndex2();
			if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.LESS) {
				if (val > rule.getIndex()) {
					return false;
				}
			}
			if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.EQUALS) {
				if (val != rule.getIndex()) {
					return false;
				}
			}
			if (rule.getIndexCheckType() == RuleDistanceIndexMatchType.MORE) {
				if (rule.getIndex() < val) {
					return false;
				}
			}

		}
		return true;
	}

}
