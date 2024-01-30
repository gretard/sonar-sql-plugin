package org.antlr.sql.sca.matchers;

import static org.assertj.core.api.Assertions.assertThat;

import org.antlr.sql.sca.utils.TestParsedNode;
import org.junit.Test;
import org.sonar.plugins.sql.models.rules.RuleDistanceIndexMatchType;
import org.sonar.plugins.sql.models.rules.RuleImplementation;

public class IndexMatcherTest {

	private final IndexMatcher sut = new IndexMatcher();

	@Test
	public void testRuleHasZeroIndex() {
		TestParsedNode node = new TestParsedNode();
		RuleImplementation rule = new RuleImplementation();

		boolean result = sut.match(node, rule);

		assertThat(result).isTrue();
	}

	@Test
	public void testRuleHasNoneZeroIndexAndExpectsBiggerIndex() {
		TestParsedNode node = new TestParsedNode();
		RuleImplementation rule = new RuleImplementation();
		rule.setIndex(20);
		rule.setIndexCheckType(RuleDistanceIndexMatchType.MORE);

		boolean result = sut.match(node, rule);

		assertThat(result).isFalse();
	}

}
