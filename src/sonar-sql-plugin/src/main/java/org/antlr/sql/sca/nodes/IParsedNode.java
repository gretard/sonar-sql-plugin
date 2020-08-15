package org.antlr.sql.sca.nodes;

public interface IParsedNode {
	public String getClassName();

	public String getText();

	public int getLine();

	public default IParsedNode[] getParents() {
		return new IParsedNode[0];
	}

	public default IParsedNode[] getSiblings() {
		return new IParsedNode[0];
	}
	public IParsedNode getControlFlowParent();
	public default IParsedNode[] getUses() {
		return new IParsedNode[0];
	}

	public default IParsedNode[] getChildren() {
		return new IParsedNode[0];
	}

	public default int getDistance() {
		return 0;
	}

	public default int getIndex() {
		return 0;
	}

	public default int getIndex2() {
		return 0;
	}
	
	public default int getGlobalIndex() {
	    return 0;
	}
}
