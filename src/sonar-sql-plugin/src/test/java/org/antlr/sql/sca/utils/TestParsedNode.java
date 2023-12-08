package org.antlr.sql.sca.utils;

import org.antlr.sql.sca.nodes.IParsedNode;

public class TestParsedNode implements IParsedNode {

	public String text = "SELECT * FROM 1";
	public String className = TestParsedNode.class.getSimpleName();

	public int index = 1;
	public int globalIndex = 2;

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public int getGlobalIndex() {
		return globalIndex;
	}

	@Override
	public String getClassName() {
		return className;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getLine() {
		return 0;
	}

	@Override
	public IParsedNode getControlFlowParent() {
		return null;
	}

}
