package org.antlr.sql.sca.nodes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;

public class ParseTreeNode implements IParsedNode {

	private ParseTree tree;

	public int getDistance() {
		return distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tree == null) ? 0 : tree.hashCode());
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
		ParseTreeNode other = (ParseTreeNode) obj;
		if (tree == null) {
			if (other.tree != null)
				return false;
		} else if (!tree.equals(other.tree))
			return false;
		return true;
	}

	public int getIndex() {
		return index;
	}

	public int getIndex2() {
		return index2;
	}

	private int distance;
	private int index;
	private int index2;

	public ParseTreeNode(ParseTree tree) {
		this.tree = tree;
	}

	public ParseTreeNode(ParseTree tree, int distance, int index, int index2) {
		this.tree = tree;
		this.distance = distance;
		this.index = index;
		this.index2 = index2;
	}

	static void visit(final List<IParsedNode> nodes, final ParseTree tree, int level) {
		if (tree == null) {
			return;
		}

		final int newLevel = level + 1;
		final int c = tree.getChildCount();
		int j = c * -1;
		for (int i = 0; i < c; i++) {
			final ParseTree child = tree.getChild(i);
			final ParseTreeNode node = new ParseTreeNode(child, newLevel, i + 1, j++);
			nodes.add(node);
			visit(nodes, child, newLevel);
		}
	}

	@Override
	public IParsedNode[] getUses() {
		if (this.tree == null) {
			return new IParsedNode[0];
		}

		ParseTree p = this.tree;
		while (p.getParent() != null) {
			p = p.getParent();
		}
		final String textToFind = this.tree.getText();
		final List<ParseTreeNode> foundUses = new ArrayList<>();
		final LinkedList<ParseTree> itemsToCheck = new LinkedList<>();
		itemsToCheck.add(p);
		while (!itemsToCheck.isEmpty()) {
			final ParseTree current = itemsToCheck.pop();
			if (current == this.tree) {
				continue;
			}
			final String currentText = current.getText();
			if (StringUtils.containsIgnoreCase(currentText, textToFind)
					|| StringUtils.containsIgnoreCase(textToFind, currentText)) {
				foundUses.add(new ParseTreeNode(current));
			}
			for (int i = 0; i < current.getChildCount(); i++) {
				itemsToCheck.push(current.getChild(i));
			}
		}
		return foundUses.toArray(new IParsedNode[0]);
	}

	@Override
	public String getClassName() {
		return this.tree.getClass().getSimpleName();
	}

	@Override
	public String getText() {
		return this.tree.getText();
	}

	public IParsedNode[] getChildren() {
		final List<IParsedNode> nodes = new ArrayList<>();
		if (this.tree == null) {
			return nodes.toArray(new IParsedNode[0]);
		}
		visit(nodes, tree, 0);
		return nodes.toArray(new IParsedNode[0]);
	}

	public IParsedNode[] getSiblings() {
		final List<IParsedNode> nodes = new ArrayList<>();
		if (this.tree == null || this.tree.getParent() == null) {
			return nodes.toArray(new IParsedNode[0]);
		}
		ParseTree parseTreeItem = this.tree.getParent();
		visit(nodes, parseTreeItem, 0);
		return nodes.toArray(new IParsedNode[0]);

	}

	public IParsedNode[] getParents() {
		List<IParsedNode> nodes = new ArrayList<>();
		if (this.tree == null) {
			return nodes.toArray(new IParsedNode[0]);
		}
		ParseTree parseTreeItem = this.tree.getParent();
		int i = 0;
		while (parseTreeItem != null) {
			i++;
			nodes.add(new ParseTreeNode(parseTreeItem, i, 1, -1));
			parseTreeItem = parseTreeItem.getParent();
		}

		return nodes.toArray(new IParsedNode[0]);
	}

	// @Override
	public IParsedNode getControlFlowParent() {
		if (this.tree == null) {
			return null;
		}
		ParseTree parent1 = this.tree.getParent();
		int distance = 0;
		while (parent1 != null) {
			distance++;
			if (parent1 instanceof org.antlr.sql.dialects.tsql.TSqlParser.Cfl_statementContext) {
				return new ParseTreeNode(parent1, distance, 1, -1);
			}
			/*
			 * if (parent1 instanceof org.antlr.sql.dialects.mysql.MySqlParser.) { return
			 * new ParseTreeNode(parent1, distance, 1, -1); }
			 */
			parent1 = parent1.getParent();
		}
		return null;
	}

	@Override
	public int getLine() {
		if (tree.getPayload() instanceof Token) {
			Token t = (Token) (tree.getPayload());
			return t.getLine();
		}

		if (tree.getPayload() instanceof TerminalNode) {
			TerminalNode t = (TerminalNode) (tree.getPayload());
			return t.getSymbol().getLine();
		}

		if (tree.getPayload() instanceof ParserRuleContext) {
			ParserRuleContext t = (ParserRuleContext) (tree.getPayload());
			return t.getStart().getLine();
		}

		return -1;
	}

}
