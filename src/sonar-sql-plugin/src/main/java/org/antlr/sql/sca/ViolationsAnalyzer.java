package org.antlr.sql.sca;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.plugins.sql.models.rules.RuleImplementation;
import org.sonar.plugins.sql.models.rules.RuleResultType;

public class ViolationsAnalyzer {

	public boolean isMatch(Map<RuleImplementation, List<IParsedNode>> items) {

		boolean skipSatisfied = false;
		boolean failuresFound = false;
		for (Entry<RuleImplementation, List<IParsedNode>> item : items.entrySet()) {
			RuleImplementation impl = item.getKey();
			List<IParsedNode> values = item.getValue();
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
			}

			if (RuleResultType.FAIL_IF_NOT_FOUND == impl.getRuleResultType() && values.isEmpty()) {
				failuresFound = true;
			}

			if (RuleResultType.FAIL_IF_MORE_FOUND == impl.getRuleResultType() && values.size() > impl.getTimes()) {
				failuresFound = true;
			}

			if (RuleResultType.FAIL_IF_LESS_FOUND == impl.getRuleResultType() && values.size() < impl.getTimes()) {
				failuresFound = true;
			}

		}
		if (skipSatisfied) {
			return false;
		}
		return failuresFound;
	}
}
