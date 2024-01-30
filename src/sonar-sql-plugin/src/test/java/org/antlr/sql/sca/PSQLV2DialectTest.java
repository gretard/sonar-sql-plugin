package org.antlr.sql.sca;

import java.io.IOException;
import java.util.List;

import org.antlr.sql.dialects.Dialects;
import org.antlr.sql.models.AntlrContext;
import org.antlr.v4.runtime.Token;
import org.junit.Assert;
import org.junit.Test;

public class PSQLV2DialectTest {

	@Test
	public void testComments() throws IOException {

		AntlrContext antlrContext = parse("/** test**/\r\n---test");

		Assert.assertNotNull(antlrContext);

		List<? extends Token> tokens = antlrContext.getAllTokens();
		Assert.assertFalse(tokens.isEmpty());
		Assert.assertTrue(antlrContext.isComment(tokens.get(0)));
		Assert.assertTrue(antlrContext.isComment(tokens.get(2)));

	}

	@Test
	public void testKeyword() throws IOException {

		AntlrContext antlrContext = parse("select 1");

		Assert.assertNotNull(antlrContext);

		List<? extends Token> tokens = antlrContext.getAllTokens();
		Assert.assertFalse(tokens.isEmpty());
		Assert.assertTrue(antlrContext.isKeyword(tokens.get(0)));

	}

	@Test
	public void testString() throws IOException {

		AntlrContext antlrContext = parse("select 'aa'");

		Assert.assertNotNull(antlrContext);

		List<? extends Token> tokens = antlrContext.getAllTokens();
		Assert.assertFalse(tokens.isEmpty());
		Assert.assertTrue(antlrContext.isString(tokens.get(2)));

	}

	private static AntlrContext parse(String sql) {
		AntlrContext antlrContext = Dialects.PSSQLV2.parse(sql);

		// PrettyPrinter.print(antlrContext.root, 0, antlrContext.stream);
		// PrettyPrinter.printTokens(antlrContext);
		return antlrContext;
	}

}
