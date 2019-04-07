package org.antlr.sql.dialects.rules;

import org.sonar.plugins.sql.models.rules.Rule;

public interface IBaseRules {

	Rule getWaitForRule();

	Rule getSelectAllRule();

	Rule getInsertRule();

	Rule getOrderByRule();

	Rule getExecRule();

	Rule getSchemaRule();

	Rule getNoLockRule();

	Rule getCursorRule();

	Rule getMultipleDeclarations();

	Rule getSameFlow();

	Rule getPKRule();

	Rule getFKRule();

	Rule getIndexNamingRule();

	Rule getNullComparisonRule();

	Rule getWhereWithOrVsUnionRule();

	Rule getUnionVsUnionALLRule();

	Rule getExistsVsInRule();

	Rule getOrderByRuleWithoutAscDesc();

	Rule getFileTooLargeRule();

	Rule getSargRule();

	Rule getDeclareRule();

}