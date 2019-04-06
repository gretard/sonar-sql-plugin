package org.antlr.sql.dialects;

import org.antlr.sql.models.AntlrContext;

public interface IDialect {
	public AntlrContext parse(String text);
}
