package org.antlr.sql.tools;

import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

public class PrettyPrinter {

	public static void printTokens(AntlrContext context) {
		context.getAllTokens().forEach(t -> System.out.println(t));
	}

	public static void print(final ParseTree node, final int level, CommonTokenStream stream) {
		final Interval sourceInterval = node.getSourceInterval();
		int line = -1;
		int charStart = -1;
		int endLine = -1;
		int endChar = -1;
		String text = null;
		try {
			final Token firstToken = stream.get(sourceInterval.a);
			line = firstToken.getLine();
			charStart = firstToken.getCharPositionInLine();
			endLine = line;
			endChar = charStart + firstToken.getText().length();
			text = firstToken.getText();
		} catch (Exception e) {

		}

		String data = "@(" + line + ":" + charStart + "," + endLine + ":" + endChar + ") with text: " + text;
		final int tmp = level + 1;
		final StringBuilder sb = new StringBuilder();
		sb.append(StringUtils.repeat(" ", level));
		sb.append(node.getClass().getSimpleName() + ": " + data + " :" + node.getText());
		System.out.println(sb.toString());
		final int n = node.getChildCount();
		for (int i = 0; i < n; i++) {
			final ParseTree c = node.getChild(i);
			print(c, tmp, stream);

		}
	}
}
