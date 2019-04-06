package org.antlr.sql.tools;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

public class PrettyPrinter {

	public static void main(String[] args) {
		AntlrContext ctx = Dialects.PSSQL.parse("INSERT INTO dbo.test VALUES (1,2);\r\n");
		print(ctx.root, 0, ctx.stream);
	}

	public static void print(final ParseTree node, final int level, CommonTokenStream stream) {
		final Interval sourceInterval = node.getSourceInterval();

		final Token firstToken = stream.get(sourceInterval.a);

		int line = firstToken.getLine();
		int charStart = firstToken.getCharPositionInLine();

		int endLine = line;
		int endChar = charStart + firstToken.getText().length();

		String data = "@(" + line + ":" + charStart + "," + endLine + ":" + endChar + ") with text: "
				+ firstToken.getText();
		final int tmp = level + 1;
		final StringBuilder sb = new StringBuilder();
		sb.append(StringUtils.repeat("\t", level));
		sb.append(node.getClass().getSimpleName() + ": " + data + " :" + node.getText());
		System.out.println(sb.toString());
		final int n = node.getChildCount();
		for (int i = 0; i < n; i++) {

			final ParseTree c = node.getChild(i);
			print(c, tmp, stream);

		}
	}
}
