package org.antlr.sql.dialects;

import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.tree.ParseTree;
import org.sonar.plugins.sql.CaseChangingCharStream;

public abstract class BaseDialect implements IDialect {

	protected abstract Lexer getLexer(CharStream charStream);

	protected abstract ParseTree getRoot(CommonTokenStream stream);

	protected abstract DialectLanguageTypesMap getTypesMap();

	public AntlrContext parse(String text) {
		final CharStream charStream = new CaseChangingCharStream(CharStreams.fromString(text), true);

		Lexer lexer = this.getLexer(charStream);
	//	lexer.removeErrorListeners();

		final CommonTokenStream stream = new CommonTokenStream(lexer);
		stream.fill();

		ParseTree tree = this.getRoot(stream);

		AntlrContext c = new AntlrContext();

		c.root = tree;
		c.stream = stream;
		c.types = this.getTypesMap();
		c.lexer = lexer;

		return c;
	}
}
