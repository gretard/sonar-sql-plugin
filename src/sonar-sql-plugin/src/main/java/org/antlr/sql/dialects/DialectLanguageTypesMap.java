package org.antlr.sql.dialects;

import java.util.HashSet;
import java.util.Set;

public class DialectLanguageTypesMap {

	private final Set<Class<?>> cyclomaticComplexity = new HashSet<>();

	private final Set<Class<?>> cognitiveComplexity = new HashSet<>();

	private final Set<Integer> commentTokens = new HashSet<>();

	private final Set<Integer> stringTokens = new HashSet<>();

	public Set<Class<?>> getCyclomaticComplexityClasses() {
		return cyclomaticComplexity;
	}

	public Set<Class<?>> getCognitiveComplexityClasses() {
		return cognitiveComplexity;
	}

	public Set<Integer> getCommentTokens() {
		return commentTokens;
	}

	public Set<Integer> getStringTokens() {
		return stringTokens;
	}

	public DialectLanguageTypesMap addCommentToken(int e) {
		commentTokens.add(e);
		return this;
	}

	public DialectLanguageTypesMap addStringToken(int e) {
		stringTokens.add(e);
		return this;
	}

	public DialectLanguageTypesMap addComplexityType(Class<?> e) {
		cyclomaticComplexity.add(e);
		return this;
	}

	public DialectLanguageTypesMap addCognitiveComplexityType(Class<?> e) {
		cognitiveComplexity.add(e);
		return this;
	}
}
