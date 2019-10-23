package org.antlr.sql.sca;

import org.antlr.sql.sca.nodes.IParsedNode;
import org.sonar.plugins.sql.models.rules.Rule;
import org.sonar.plugins.sql.models.rules.SqlRules;

public class FoundMatch {
	public IParsedNode node;
	public Rule rule;
	public SqlRules sqlRules;

	public int getLine() {
		return (node == null) ? 1 : node.getLine();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((node == null) ? 0 : node.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoundMatch other = (FoundMatch) obj;
		if (node == null) {
			if (other.node != null)
				return false;
		} else if (!node.equals(other.node))
			return false;
		return true;
	}
}
