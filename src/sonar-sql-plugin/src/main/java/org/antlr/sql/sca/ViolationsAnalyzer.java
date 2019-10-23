package org.antlr.sql.sca;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleResultType;

public class ViolationsAnalyzer {
	private static final Logger LOGGER = Loggers.get(ViolationsAnalyzer.class);

	public static class FoundViolation {
		public final Set<IParsedNode> violatingNodes = new HashSet<IParsedNode>();
		public boolean failuresFound = false;
	}

	public FoundViolation isMatch(Map<RuleImplementation, List<IParsedNode>> items) {

		boolean skipSatisfied = false;
		boolean failuresFound = false;
		FoundViolation violation = new FoundViolation();
		for (Entry<RuleImplementation, List<IParsedNode>> item : items.entrySet()) {

			RuleImplementation impl = item.getKey();
			List<IParsedNode> values = item.getValue();
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(() -> "Checking rules: " + impl.getRuleViolationMessage() + " against nodes: "
						+ values.stream().map(x -> x.getText() + "@" + x.getClassName()+" on "+x.getLine()).collect(Collectors.toList())
						+ " with result type: " + impl.getRuleResultType());
			}
			if (RuleResultType.DEFAULT == impl.getRuleResultType()) {
				continue;
			}

			if (RuleResultType.SKIP_IF_FOUND == impl.getRuleResultType() && !values.isEmpty()) {
				skipSatisfied = true;
			}
			if (RuleResultType.SKIP_IF_NOT_FOUND == impl.getRuleResultType() && values.isEmpty()) {
				skipSatisfied = true;
			}
			if (RuleResultType.FAIL_IF_FOUND == impl.getRuleResultType() && !values.isEmpty()) {
				failuresFound = true;
				violation.violatingNodes.addAll(values);

			}

			if (RuleResultType.FAIL_IF_NOT_FOUND == impl.getRuleResultType() && values.isEmpty()) {
				failuresFound = true;
				violation.violatingNodes.addAll(values);
			}

			if (RuleResultType.FAIL_IF_MORE_FOUND == impl.getRuleResultType() && values.size() > impl.getTimes()) {
				failuresFound = true;
				violation.violatingNodes.addAll(values);
			}

			if (RuleResultType.FAIL_IF_LESS_FOUND == impl.getRuleResultType() && values.size() < impl.getTimes()) {
				failuresFound = true;
				violation.violatingNodes.addAll(values);
			}

		}
		if (skipSatisfied) {
			violation.failuresFound = false;
			return violation;
		}
		violation.failuresFound = failuresFound;
		return violation;
	}
}
