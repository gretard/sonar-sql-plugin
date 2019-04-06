package org.antlr.sql.visitors;

import java.util.Set;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public class ClassTypesCountingVisitor extends AbstractParseTreeVisitor<Void> {

	private int counter = 0;

	public int getCounter() {
		return counter;
	}

	private final Set<Class<?>> classesToMatch;

	public ClassTypesCountingVisitor(final Set<Class<?>> classesToMatch) {
		this.classesToMatch = classesToMatch;
	}

	@Override
	public Void visit(final ParseTree tree) {

		final int n = tree.getChildCount();

		if (classesToMatch.contains(tree.getClass())) {
			this.counter++;
		}

		for (int i = 0; i < n; i++) {
			final ParseTree c = tree.getChild(i);
			visit(c);
		}

		return defaultResult();
	}
}
