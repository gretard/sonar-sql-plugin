// Generated from antlr4-grammar-vsql/antlr4-grammar-vsql/src/main/antlr4/VSqlParser.g4 by ANTLR 4.9.3
package org.antlr.sql.dialects.vsql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VSqlParser}.
 */
public interface VSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VSqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(VSqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(VSqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(VSqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(VSqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VSqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VSqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_access_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_access_policy_statement(VSqlParser.Alter_access_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_access_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_access_policy_statement(VSqlParser.Alter_access_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authentication_statement(VSqlParser.Alter_authentication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authentication_statement(VSqlParser.Alter_authentication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_database_drop_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_drop_statement(VSqlParser.Alter_database_drop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_database_drop_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_drop_statement(VSqlParser.Alter_database_drop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_fault_group_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fault_group_statement(VSqlParser.Alter_fault_group_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_fault_group_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fault_group_statement(VSqlParser.Alter_fault_group_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function_statement(VSqlParser.Alter_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function_statement(VSqlParser.Alter_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_hcatalog_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_hcatalog_schema_statement(VSqlParser.Alter_hcatalog_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_hcatalog_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_hcatalog_schema_statement(VSqlParser.Alter_hcatalog_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_library_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_library_statement(VSqlParser.Alter_library_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_library_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_library_statement(VSqlParser.Alter_library_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_model_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_model_statement(VSqlParser.Alter_model_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_model_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_model_statement(VSqlParser.Alter_model_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_network_interface_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_network_interface_statement(VSqlParser.Alter_network_interface_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_network_interface_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_network_interface_statement(VSqlParser.Alter_network_interface_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_node_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_node_statement(VSqlParser.Alter_node_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_node_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_node_statement(VSqlParser.Alter_node_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_notfifier_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_notfifier_statement(VSqlParser.Alter_notfifier_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_notfifier_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_notfifier_statement(VSqlParser.Alter_notfifier_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#notifier_params}.
	 * @param ctx the parse tree
	 */
	void enterNotifier_params(VSqlParser.Notifier_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#notifier_params}.
	 * @param ctx the parse tree
	 */
	void exitNotifier_params(VSqlParser.Notifier_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_projection_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_projection_statement(VSqlParser.Alter_projection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_projection_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_projection_statement(VSqlParser.Alter_projection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_profile_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_profile_statement(VSqlParser.Alter_profile_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_profile_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_profile_statement(VSqlParser.Alter_profile_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_profile_rename_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_profile_rename_statement(VSqlParser.Alter_profile_rename_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_profile_rename_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_profile_rename_statement(VSqlParser.Alter_profile_rename_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_resource_pool_statement(VSqlParser.Alter_resource_pool_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_resource_pool_statement(VSqlParser.Alter_resource_pool_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#resource_pool_param}.
	 * @param ctx the parse tree
	 */
	void enterResource_pool_param(VSqlParser.Resource_pool_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#resource_pool_param}.
	 * @param ctx the parse tree
	 */
	void exitResource_pool_param(VSqlParser.Resource_pool_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_role_rename_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_role_rename_statement(VSqlParser.Alter_role_rename_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_role_rename_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_role_rename_statement(VSqlParser.Alter_role_rename_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_statement(VSqlParser.Alter_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_statement(VSqlParser.Alter_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence_statement(VSqlParser.Alter_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence_statement(VSqlParser.Alter_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#sequence_params}.
	 * @param ctx the parse tree
	 */
	void enterSequence_params(VSqlParser.Sequence_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#sequence_params}.
	 * @param ctx the parse tree
	 */
	void exitSequence_params(VSqlParser.Sequence_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_session_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_session_statement(VSqlParser.Alter_session_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_session_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_session_statement(VSqlParser.Alter_session_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_subnet_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_subnet_statement(VSqlParser.Alter_subnet_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_subnet_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_subnet_statement(VSqlParser.Alter_subnet_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_table_rename_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_rename_statement(VSqlParser.Alter_table_rename_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_table_rename_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_rename_statement(VSqlParser.Alter_table_rename_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_table_general_statment}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_general_statment(VSqlParser.Alter_table_general_statmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_table_general_statment}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_general_statment(VSqlParser.Alter_table_general_statmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_item(VSqlParser.Alter_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_item(VSqlParser.Alter_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_user_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_statement(VSqlParser.Alter_user_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_user_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_statement(VSqlParser.Alter_user_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#user_params}.
	 * @param ctx the parse tree
	 */
	void enterUser_params(VSqlParser.User_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#user_params}.
	 * @param ctx the parse tree
	 */
	void exitUser_params(VSqlParser.User_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_statement(VSqlParser.Alter_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_statement(VSqlParser.Alter_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#todo_statement}.
	 * @param ctx the parse tree
	 */
	void enterTodo_statement(VSqlParser.Todo_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#todo_statement}.
	 * @param ctx the parse tree
	 */
	void exitTodo_statement(VSqlParser.Todo_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#begin_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterBegin_transaction_statement(VSqlParser.Begin_transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#begin_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitBegin_transaction_statement(VSqlParser.Begin_transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_statement(VSqlParser.Comment_on_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_statement(VSqlParser.Comment_on_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_column_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_column_statement(VSqlParser.Comment_on_column_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_column_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_column_statement(VSqlParser.Comment_on_column_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_constraint_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_constraint_statement(VSqlParser.Comment_on_constraint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_constraint_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_constraint_statement(VSqlParser.Comment_on_constraint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_function_statement(VSqlParser.Comment_on_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_function_statement(VSqlParser.Comment_on_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_transform_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_transform_function_statement(VSqlParser.Comment_on_transform_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_transform_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_transform_function_statement(VSqlParser.Comment_on_transform_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_library_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_library_statement(VSqlParser.Comment_on_library_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_library_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_library_statement(VSqlParser.Comment_on_library_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_node_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_node_statement(VSqlParser.Comment_on_node_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_node_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_node_statement(VSqlParser.Comment_on_node_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_schema_statement(VSqlParser.Comment_on_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_schema_statement(VSqlParser.Comment_on_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_sequence_statement(VSqlParser.Comment_on_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_sequence_statement(VSqlParser.Comment_on_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_table_statement(VSqlParser.Comment_on_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_table_statement(VSqlParser.Comment_on_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_view_statement(VSqlParser.Comment_on_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_view_statement(VSqlParser.Comment_on_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_on_projection_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_projection_statement(VSqlParser.Comment_on_projection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_on_projection_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_projection_statement(VSqlParser.Comment_on_projection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comment_value}.
	 * @param ctx the parse tree
	 */
	void enterComment_value(VSqlParser.Comment_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comment_value}.
	 * @param ctx the parse tree
	 */
	void exitComment_value(VSqlParser.Comment_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(VSqlParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(VSqlParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#connect_statement}.
	 * @param ctx the parse tree
	 */
	void enterConnect_statement(VSqlParser.Connect_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#connect_statement}.
	 * @param ctx the parse tree
	 */
	void exitConnect_statement(VSqlParser.Connect_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#copy_column}.
	 * @param ctx the parse tree
	 */
	void enterCopy_column(VSqlParser.Copy_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#copy_column}.
	 * @param ctx the parse tree
	 */
	void exitCopy_column(VSqlParser.Copy_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#column_option}.
	 * @param ctx the parse tree
	 */
	void enterColumn_option(VSqlParser.Column_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#column_option}.
	 * @param ctx the parse tree
	 */
	void exitColumn_option(VSqlParser.Column_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(VSqlParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(VSqlParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#local_path}.
	 * @param ctx the parse tree
	 */
	void enterLocal_path(VSqlParser.Local_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#local_path}.
	 * @param ctx the parse tree
	 */
	void exitLocal_path(VSqlParser.Local_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#inputFormat}.
	 * @param ctx the parse tree
	 */
	void enterInputFormat(VSqlParser.InputFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#inputFormat}.
	 * @param ctx the parse tree
	 */
	void exitInputFormat(VSqlParser.InputFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#vertica_source}.
	 * @param ctx the parse tree
	 */
	void enterVertica_source(VSqlParser.Vertica_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#vertica_source}.
	 * @param ctx the parse tree
	 */
	void exitVertica_source(VSqlParser.Vertica_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#udl_clause}.
	 * @param ctx the parse tree
	 */
	void enterUdl_clause(VSqlParser.Udl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#udl_clause}.
	 * @param ctx the parse tree
	 */
	void exitUdl_clause(VSqlParser.Udl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#copy_statement_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_statement_option(VSqlParser.Copy_statement_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#copy_statement_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_statement_option(VSqlParser.Copy_statement_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_statement(VSqlParser.Copy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_statement(VSqlParser.Copy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#copy_local_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_local_statement(VSqlParser.Copy_local_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#copy_local_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_local_statement(VSqlParser.Copy_local_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#copy_from_vertica_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from_vertica_statement(VSqlParser.Copy_from_vertica_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#copy_from_vertica_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from_vertica_statement(VSqlParser.Copy_from_vertica_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_access_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_access_policy_statement(VSqlParser.Create_access_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_access_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_access_policy_statement(VSqlParser.Create_access_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_authentication_statement(VSqlParser.Create_authentication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_authentication_statement(VSqlParser.Create_authentication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_branch_statement(VSqlParser.Create_branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_branch_statement(VSqlParser.Create_branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_external_table_as_copy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_table_as_copy_statement(VSqlParser.Create_external_table_as_copy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_external_table_as_copy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_table_as_copy_statement(VSqlParser.Create_external_table_as_copy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_fault_group_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fault_group_statement(VSqlParser.Create_fault_group_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_fault_group_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fault_group_statement(VSqlParser.Create_fault_group_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_flex_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_flex_table_statement(VSqlParser.Create_flex_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_flex_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_flex_table_statement(VSqlParser.Create_flex_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_flex_external_table_as_copy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_flex_external_table_as_copy_statement(VSqlParser.Create_flex_external_table_as_copy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_flex_external_table_as_copy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_flex_external_table_as_copy_statement(VSqlParser.Create_flex_external_table_as_copy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_function_statements_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_statements_statement(VSqlParser.Create_function_statements_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_function_statements_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_statements_statement(VSqlParser.Create_function_statements_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_or_replace_transform_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_replace_transform_function_statement(VSqlParser.Create_or_replace_transform_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_or_replace_transform_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_replace_transform_function_statement(VSqlParser.Create_or_replace_transform_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_or_replace_source_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_replace_source_function_statement(VSqlParser.Create_or_replace_source_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_or_replace_source_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_replace_source_function_statement(VSqlParser.Create_or_replace_source_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_or_replace_parser_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_replace_parser_function_statement(VSqlParser.Create_or_replace_parser_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_or_replace_parser_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_replace_parser_function_statement(VSqlParser.Create_or_replace_parser_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_or_replace_udf_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_replace_udf_function_statement(VSqlParser.Create_or_replace_udf_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_or_replace_udf_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_replace_udf_function_statement(VSqlParser.Create_or_replace_udf_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_or_replace_sql_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_replace_sql_function_statement(VSqlParser.Create_or_replace_sql_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_or_replace_sql_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_replace_sql_function_statement(VSqlParser.Create_or_replace_sql_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#expreDefininition}.
	 * @param ctx the parse tree
	 */
	void enterExpreDefininition(VSqlParser.ExpreDefininitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#expreDefininition}.
	 * @param ctx the parse tree
	 */
	void exitExpreDefininition(VSqlParser.ExpreDefininitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_or_replace_filter_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_replace_filter_statement(VSqlParser.Create_or_replace_filter_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_or_replace_filter_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_replace_filter_statement(VSqlParser.Create_or_replace_filter_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_or_replace_analytic_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_replace_analytic_function_statement(VSqlParser.Create_or_replace_analytic_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_or_replace_analytic_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_replace_analytic_function_statement(VSqlParser.Create_or_replace_analytic_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_or_replace_aggregate_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_replace_aggregate_function_statement(VSqlParser.Create_or_replace_aggregate_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_or_replace_aggregate_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_replace_aggregate_function_statement(VSqlParser.Create_or_replace_aggregate_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_hcatalog_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_hcatalog_schema_statement(VSqlParser.Create_hcatalog_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_hcatalog_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_hcatalog_schema_statement(VSqlParser.Create_hcatalog_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#hcatalog_schema_param}.
	 * @param ctx the parse tree
	 */
	void enterHcatalog_schema_param(VSqlParser.Hcatalog_schema_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#hcatalog_schema_param}.
	 * @param ctx the parse tree
	 */
	void exitHcatalog_schema_param(VSqlParser.Hcatalog_schema_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_library_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_library_statement(VSqlParser.Create_library_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_library_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_library_statement(VSqlParser.Create_library_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_load_balance_group_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_load_balance_group_statement(VSqlParser.Create_load_balance_group_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_load_balance_group_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_load_balance_group_statement(VSqlParser.Create_load_balance_group_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_local_temporary_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temporary_view_statement(VSqlParser.Create_local_temporary_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_local_temporary_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temporary_view_statement(VSqlParser.Create_local_temporary_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_location_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_location_statement(VSqlParser.Create_location_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_location_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_location_statement(VSqlParser.Create_location_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_network_address_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_network_address_statement(VSqlParser.Create_network_address_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_network_address_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_network_address_statement(VSqlParser.Create_network_address_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_network_interface_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_network_interface_statement(VSqlParser.Create_network_interface_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_network_interface_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_network_interface_statement(VSqlParser.Create_network_interface_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_notifier_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_notifier_statement(VSqlParser.Create_notifier_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_notifier_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_notifier_statement(VSqlParser.Create_notifier_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_statement(VSqlParser.Create_procedure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_statement(VSqlParser.Create_procedure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(VSqlParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#argument_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(VSqlParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#argument_item}.
	 * @param ctx the parse tree
	 */
	void enterArgument_item(VSqlParser.Argument_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#argument_item}.
	 * @param ctx the parse tree
	 */
	void exitArgument_item(VSqlParser.Argument_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_profile_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_profile_statement(VSqlParser.Create_profile_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_profile_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_profile_statement(VSqlParser.Create_profile_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#projection_clause_item}.
	 * @param ctx the parse tree
	 */
	void enterProjection_clause_item(VSqlParser.Projection_clause_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#projection_clause_item}.
	 * @param ctx the parse tree
	 */
	void exitProjection_clause_item(VSqlParser.Projection_clause_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#ksafe_clause}.
	 * @param ctx the parse tree
	 */
	void enterKsafe_clause(VSqlParser.Ksafe_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#ksafe_clause}.
	 * @param ctx the parse tree
	 */
	void exitKsafe_clause(VSqlParser.Ksafe_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#ifNotExistsClause}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExistsClause(VSqlParser.IfNotExistsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#ifNotExistsClause}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExistsClause(VSqlParser.IfNotExistsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_projection_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_projection_statement(VSqlParser.Create_projection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_projection_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_projection_statement(VSqlParser.Create_projection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_projection_live_aggregate_projections_statement(VSqlParser.Create_projection_live_aggregate_projections_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_projection_live_aggregate_projections_statement(VSqlParser.Create_projection_live_aggregate_projections_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_gr_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_projection_live_aggregate_projections_gr_statement(VSqlParser.Create_projection_live_aggregate_projections_gr_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_gr_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_projection_live_aggregate_projections_gr_statement(VSqlParser.Create_projection_live_aggregate_projections_gr_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_topk_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_projection_live_aggregate_projections_topk_statement(VSqlParser.Create_projection_live_aggregate_projections_topk_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_topk_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_projection_live_aggregate_projections_topk_statement(VSqlParser.Create_projection_live_aggregate_projections_topk_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_projection_udtfs_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_projection_udtfs_statement(VSqlParser.Create_projection_udtfs_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_projection_udtfs_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_projection_udtfs_statement(VSqlParser.Create_projection_udtfs_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(VSqlParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(VSqlParser.ColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#batch_query}.
	 * @param ctx the parse tree
	 */
	void enterBatch_query(VSqlParser.Batch_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#batch_query}.
	 * @param ctx the parse tree
	 */
	void exitBatch_query(VSqlParser.Batch_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#prepass_query}.
	 * @param ctx the parse tree
	 */
	void enterPrepass_query(VSqlParser.Prepass_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#prepass_query}.
	 * @param ctx the parse tree
	 */
	void exitPrepass_query(VSqlParser.Prepass_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_resource_pool_statement(VSqlParser.Create_resource_pool_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_resource_pool_statement(VSqlParser.Create_resource_pool_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_role_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_role_statement(VSqlParser.Create_role_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_role_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_role_statement(VSqlParser.Create_role_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_routing_rule_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routing_rule_statement(VSqlParser.Create_routing_rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_routing_rule_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routing_rule_statement(VSqlParser.Create_routing_rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_statement(VSqlParser.Create_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_statement(VSqlParser.Create_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence_statement(VSqlParser.Create_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence_statement(VSqlParser.Create_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_subnet_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_subnet_statement(VSqlParser.Create_subnet_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_subnet_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_subnet_statement(VSqlParser.Create_subnet_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement(VSqlParser.Create_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement(VSqlParser.Create_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#schema_privileges_clause}.
	 * @param ctx the parse tree
	 */
	void enterSchema_privileges_clause(VSqlParser.Schema_privileges_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#schema_privileges_clause}.
	 * @param ctx the parse tree
	 */
	void exitSchema_privileges_clause(VSqlParser.Schema_privileges_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_as_statement(VSqlParser.Create_table_as_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_as_statement(VSqlParser.Create_table_as_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(VSqlParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(VSqlParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#column_name_list_item}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list_item(VSqlParser.Column_name_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#column_name_list_item}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list_item(VSqlParser.Column_name_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#access_rank}.
	 * @param ctx the parse tree
	 */
	void enterAccess_rank(VSqlParser.Access_rankContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#access_rank}.
	 * @param ctx the parse tree
	 */
	void exitAccess_rank(VSqlParser.Access_rankContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grouped_clause}.
	 * @param ctx the parse tree
	 */
	void enterGrouped_clause(VSqlParser.Grouped_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grouped_clause}.
	 * @param ctx the parse tree
	 */
	void exitGrouped_clause(VSqlParser.Grouped_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_table_like_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_like_statement(VSqlParser.Create_table_like_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_table_like_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_like_statement(VSqlParser.Create_table_like_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_table_default_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_default_statement(VSqlParser.Create_table_default_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_table_default_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_default_statement(VSqlParser.Create_table_default_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(VSqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(VSqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#column_definition_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition_list(VSqlParser.Column_definition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#column_definition_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition_list(VSqlParser.Column_definition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(VSqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(VSqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(VSqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(VSqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#load_method}.
	 * @param ctx the parse tree
	 */
	void enterLoad_method(VSqlParser.Load_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#load_method}.
	 * @param ctx the parse tree
	 */
	void exitLoad_method(VSqlParser.Load_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#segmentation_clause}.
	 * @param ctx the parse tree
	 */
	void enterSegmentation_clause(VSqlParser.Segmentation_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#segmentation_clause}.
	 * @param ctx the parse tree
	 */
	void exitSegmentation_clause(VSqlParser.Segmentation_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_temporary_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_temporary_table_statement(VSqlParser.Create_temporary_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_temporary_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_temporary_table_statement(VSqlParser.Create_temporary_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_temporary_table_with_def_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_temporary_table_with_def_statement(VSqlParser.Create_temporary_table_with_def_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_temporary_table_with_def_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_temporary_table_with_def_statement(VSqlParser.Create_temporary_table_with_def_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_temporary_table_from_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_temporary_table_from_table_statement(VSqlParser.Create_temporary_table_from_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_temporary_table_from_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_temporary_table_from_table_statement(VSqlParser.Create_temporary_table_from_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#encodedBy_clause}.
	 * @param ctx the parse tree
	 */
	void enterEncodedBy_clause(VSqlParser.EncodedBy_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#encodedBy_clause}.
	 * @param ctx the parse tree
	 */
	void exitEncodedBy_clause(VSqlParser.EncodedBy_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#column_ref}.
	 * @param ctx the parse tree
	 */
	void enterColumn_ref(VSqlParser.Column_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#column_ref}.
	 * @param ctx the parse tree
	 */
	void exitColumn_ref(VSqlParser.Column_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_text_index_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_text_index_statement(VSqlParser.Create_text_index_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_text_index_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_text_index_statement(VSqlParser.Create_text_index_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_user_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_statement(VSqlParser.Create_user_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_user_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_statement(VSqlParser.Create_user_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_statement(VSqlParser.Create_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_statement(VSqlParser.Create_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(VSqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(VSqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#directed_query_statements_statement}.
	 * @param ctx the parse tree
	 */
	void enterDirected_query_statements_statement(VSqlParser.Directed_query_statements_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#directed_query_statements_statement}.
	 * @param ctx the parse tree
	 */
	void exitDirected_query_statements_statement(VSqlParser.Directed_query_statements_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#activate_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void enterActivate_directed_query_statement(VSqlParser.Activate_directed_query_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#activate_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void exitActivate_directed_query_statement(VSqlParser.Activate_directed_query_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#create_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_directed_query_statement(VSqlParser.Create_directed_query_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#create_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_directed_query_statement(VSqlParser.Create_directed_query_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#deactivate_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeactivate_directed_query_statement(VSqlParser.Deactivate_directed_query_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#deactivate_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeactivate_directed_query_statement(VSqlParser.Deactivate_directed_query_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_directed_query_statement(VSqlParser.Drop_directed_query_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_directed_query_statement(VSqlParser.Drop_directed_query_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#get_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void enterGet_directed_query_statement(VSqlParser.Get_directed_query_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#get_directed_query_statement}.
	 * @param ctx the parse tree
	 */
	void exitGet_directed_query_statement(VSqlParser.Get_directed_query_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#save_query}.
	 * @param ctx the parse tree
	 */
	void enterSave_query(VSqlParser.Save_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#save_query}.
	 * @param ctx the parse tree
	 */
	void exitSave_query(VSqlParser.Save_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#disconnect_statement}.
	 * @param ctx the parse tree
	 */
	void enterDisconnect_statement(VSqlParser.Disconnect_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#disconnect_statement}.
	 * @param ctx the parse tree
	 */
	void exitDisconnect_statement(VSqlParser.Disconnect_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_access_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_access_policy_statement(VSqlParser.Drop_access_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_access_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_access_policy_statement(VSqlParser.Drop_access_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_aggregate_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_aggregate_function_statement(VSqlParser.Drop_aggregate_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_aggregate_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_aggregate_function_statement(VSqlParser.Drop_aggregate_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_authentication_statement(VSqlParser.Drop_authentication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_authentication_statement(VSqlParser.Drop_authentication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_branch_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_branch_statement(VSqlParser.Drop_branch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_branch_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_branch_statement(VSqlParser.Drop_branch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_fault_group_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fault_group_statement(VSqlParser.Drop_fault_group_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_fault_group_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fault_group_statement(VSqlParser.Drop_fault_group_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function_statement(VSqlParser.Drop_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function_statement(VSqlParser.Drop_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_source_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_source_statement(VSqlParser.Drop_source_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_source_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_source_statement(VSqlParser.Drop_source_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_filter_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_filter_statement(VSqlParser.Drop_filter_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_filter_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_filter_statement(VSqlParser.Drop_filter_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_parser_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_parser_statement(VSqlParser.Drop_parser_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_parser_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_parser_statement(VSqlParser.Drop_parser_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_model_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_model_statement(VSqlParser.Drop_model_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_model_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_model_statement(VSqlParser.Drop_model_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_library_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_library_statement(VSqlParser.Drop_library_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_library_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_library_statement(VSqlParser.Drop_library_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_load_balance_group_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_load_balance_group_statement(VSqlParser.Drop_load_balance_group_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_load_balance_group_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_load_balance_group_statement(VSqlParser.Drop_load_balance_group_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_network_address_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_network_address_statement(VSqlParser.Drop_network_address_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_network_address_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_network_address_statement(VSqlParser.Drop_network_address_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_network_interface_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_network_interface_statement(VSqlParser.Drop_network_interface_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_network_interface_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_network_interface_statement(VSqlParser.Drop_network_interface_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_notifier_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_notifier_statement(VSqlParser.Drop_notifier_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_notifier_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_notifier_statement(VSqlParser.Drop_notifier_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure_statement(VSqlParser.Drop_procedure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure_statement(VSqlParser.Drop_procedure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_profile_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_profile_statement(VSqlParser.Drop_profile_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_profile_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_profile_statement(VSqlParser.Drop_profile_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_projection_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_projection_statement(VSqlParser.Drop_projection_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_projection_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_projection_statement(VSqlParser.Drop_projection_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_resource_pool_statement(VSqlParser.Drop_resource_pool_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_resource_pool_statement(VSqlParser.Drop_resource_pool_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_role_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_role_statement(VSqlParser.Drop_role_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_role_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_role_statement(VSqlParser.Drop_role_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_routing_rule_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_routing_rule_statement(VSqlParser.Drop_routing_rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_routing_rule_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_routing_rule_statement(VSqlParser.Drop_routing_rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema_statement(VSqlParser.Drop_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema_statement(VSqlParser.Drop_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence_statement(VSqlParser.Drop_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence_statement(VSqlParser.Drop_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_subnet_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_subnet_statement(VSqlParser.Drop_subnet_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_subnet_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_subnet_statement(VSqlParser.Drop_subnet_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_statement(VSqlParser.Drop_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_statement(VSqlParser.Drop_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_text_index_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_text_index_statement(VSqlParser.Drop_text_index_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_text_index_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_text_index_statement(VSqlParser.Drop_text_index_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_transform_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_transform_function_statement(VSqlParser.Drop_transform_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_transform_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_transform_function_statement(VSqlParser.Drop_transform_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_user_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user_statement(VSqlParser.Drop_user_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_user_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user_statement(VSqlParser.Drop_user_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#drop_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_statement(VSqlParser.Drop_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#drop_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_statement(VSqlParser.Drop_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#end_statement}.
	 * @param ctx the parse tree
	 */
	void enterEnd_statement(VSqlParser.End_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#end_statement}.
	 * @param ctx the parse tree
	 */
	void exitEnd_statement(VSqlParser.End_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(VSqlParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(VSqlParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#export_to_parquet_statement}.
	 * @param ctx the parse tree
	 */
	void enterExport_to_parquet_statement(VSqlParser.Export_to_parquet_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#export_to_parquet_statement}.
	 * @param ctx the parse tree
	 */
	void exitExport_to_parquet_statement(VSqlParser.Export_to_parquet_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#export_to_vertica_statement}.
	 * @param ctx the parse tree
	 */
	void enterExport_to_vertica_statement(VSqlParser.Export_to_vertica_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#export_to_vertica_statement}.
	 * @param ctx the parse tree
	 */
	void exitExport_to_vertica_statement(VSqlParser.Export_to_vertica_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_statements_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_statements_statement(VSqlParser.Grant_statements_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_statements_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_statements_statement(VSqlParser.Grant_statements_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_view_statement(VSqlParser.Grant_on_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_view_statement(VSqlParser.Grant_on_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_ude_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_ude_statement(VSqlParser.Grant_on_ude_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_ude_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_ude_statement(VSqlParser.Grant_on_ude_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_table_statement(VSqlParser.Grant_on_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_table_statement(VSqlParser.Grant_on_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_location_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_location_statement(VSqlParser.Grant_on_location_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_location_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_location_statement(VSqlParser.Grant_on_location_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_sequence_statement(VSqlParser.Grant_on_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_sequence_statement(VSqlParser.Grant_on_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_schema_statement(VSqlParser.Grant_on_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_schema_statement(VSqlParser.Grant_on_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#schema_privilege}.
	 * @param ctx the parse tree
	 */
	void enterSchema_privilege(VSqlParser.Schema_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#schema_privilege}.
	 * @param ctx the parse tree
	 */
	void exitSchema_privilege(VSqlParser.Schema_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_role_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_role_statement(VSqlParser.Grant_on_role_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_role_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_role_statement(VSqlParser.Grant_on_role_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_resourcepool_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_resourcepool_statement(VSqlParser.Grant_on_resourcepool_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_resourcepool_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_resourcepool_statement(VSqlParser.Grant_on_resourcepool_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_procedure_statement(VSqlParser.Grant_on_procedure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_procedure_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_procedure_statement(VSqlParser.Grant_on_procedure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_model_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_model_statement(VSqlParser.Grant_on_model_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_model_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_model_statement(VSqlParser.Grant_on_model_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_on_library_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_on_library_statement(VSqlParser.Grant_on_library_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_on_library_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_on_library_statement(VSqlParser.Grant_on_library_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_privileges_on_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_privileges_on_database_statement(VSqlParser.Grant_privileges_on_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_privileges_on_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_privileges_on_database_statement(VSqlParser.Grant_privileges_on_database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_authentication_to_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_authentication_to_statement(VSqlParser.Grant_authentication_to_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_authentication_to_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_authentication_to_statement(VSqlParser.Grant_authentication_to_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#withGrantOption}.
	 * @param ctx the parse tree
	 */
	void enterWithGrantOption(VSqlParser.WithGrantOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#withGrantOption}.
	 * @param ctx the parse tree
	 */
	void exitWithGrantOption(VSqlParser.WithGrantOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grantees}.
	 * @param ctx the parse tree
	 */
	void enterGrantees(VSqlParser.GranteesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grantees}.
	 * @param ctx the parse tree
	 */
	void exitGrantees(VSqlParser.GranteesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grantee}.
	 * @param ctx the parse tree
	 */
	void enterGrantee(VSqlParser.GranteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grantee}.
	 * @param ctx the parse tree
	 */
	void exitGrantee(VSqlParser.GranteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#grant_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrant_authentication_statement(VSqlParser.Grant_authentication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#grant_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrant_authentication_statement(VSqlParser.Grant_authentication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(VSqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(VSqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#insert_values}.
	 * @param ctx the parse tree
	 */
	void enterInsert_values(VSqlParser.Insert_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#insert_values}.
	 * @param ctx the parse tree
	 */
	void exitInsert_values(VSqlParser.Insert_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(VSqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(VSqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#matchingClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchingClause(VSqlParser.MatchingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#matchingClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchingClause(VSqlParser.MatchingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#profile_statement}.
	 * @param ctx the parse tree
	 */
	void enterProfile_statement(VSqlParser.Profile_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#profile_statement}.
	 * @param ctx the parse tree
	 */
	void exitProfile_statement(VSqlParser.Profile_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#release_savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterRelease_savepoint_statement(VSqlParser.Release_savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#release_savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitRelease_savepoint_statement(VSqlParser.Release_savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_statements_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_statements_statement(VSqlParser.Revoke_statements_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_statements_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_statements_statement(VSqlParser.Revoke_statements_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_view_statement(VSqlParser.Revoke_on_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_view_statement(VSqlParser.Revoke_on_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_function_statement(VSqlParser.Revoke_on_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_function_statement(VSqlParser.Revoke_on_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_table_statement(VSqlParser.Revoke_on_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_table_statement(VSqlParser.Revoke_on_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_location_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_location_statement(VSqlParser.Revoke_on_location_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_location_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_location_statement(VSqlParser.Revoke_on_location_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_sequence_statement(VSqlParser.Revoke_on_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_sequence_statement(VSqlParser.Revoke_on_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_schema_statement(VSqlParser.Revoke_on_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_schema_statement(VSqlParser.Revoke_on_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_role_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_role_statement(VSqlParser.Revoke_on_role_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_role_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_role_statement(VSqlParser.Revoke_on_role_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_resource_pool_statement(VSqlParser.Revoke_on_resource_pool_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_resource_pool_statement(VSqlParser.Revoke_on_resource_pool_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_prodecure_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_prodecure_statement(VSqlParser.Revoke_on_prodecure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_prodecure_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_prodecure_statement(VSqlParser.Revoke_on_prodecure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_model_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_model_statement(VSqlParser.Revoke_on_model_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_model_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_model_statement(VSqlParser.Revoke_on_model_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_library_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_library_statement(VSqlParser.Revoke_on_library_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_library_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_library_statement(VSqlParser.Revoke_on_library_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_on_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_on_database_statement(VSqlParser.Revoke_on_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_on_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_on_database_statement(VSqlParser.Revoke_on_database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#revoke_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_authentication_statement(VSqlParser.Revoke_authentication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#revoke_authentication_statement}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_authentication_statement(VSqlParser.Revoke_authentication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(VSqlParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(VSqlParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#rollback_to_savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_to_savepoint_statement(VSqlParser.Rollback_to_savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#rollback_to_savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_to_savepoint_statement(VSqlParser.Rollback_to_savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(VSqlParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(VSqlParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#with_statement}.
	 * @param ctx the parse tree
	 */
	void enterWith_statement(VSqlParser.With_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#with_statement}.
	 * @param ctx the parse tree
	 */
	void exitWith_statement(VSqlParser.With_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#at_epoch_clause}.
	 * @param ctx the parse tree
	 */
	void enterAt_epoch_clause(VSqlParser.At_epoch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#at_epoch_clause}.
	 * @param ctx the parse tree
	 */
	void exitAt_epoch_clause(VSqlParser.At_epoch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(VSqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(VSqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_datestyle_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_datestyle_statement(VSqlParser.Set_datestyle_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_datestyle_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_datestyle_statement(VSqlParser.Set_datestyle_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_escape_string_warning_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_escape_string_warning_statement(VSqlParser.Set_escape_string_warning_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_escape_string_warning_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_escape_string_warning_statement(VSqlParser.Set_escape_string_warning_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_intervalstyle_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_intervalstyle_statement(VSqlParser.Set_intervalstyle_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_intervalstyle_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_intervalstyle_statement(VSqlParser.Set_intervalstyle_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_locale_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_locale_statement(VSqlParser.Set_locale_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_locale_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_locale_statement(VSqlParser.Set_locale_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_role_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_role_statement(VSqlParser.Set_role_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_role_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_role_statement(VSqlParser.Set_role_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_search_path_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_search_path_statement(VSqlParser.Set_search_path_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_search_path_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_search_path_statement(VSqlParser.Set_search_path_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_autocommit_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_autocommit_statement(VSqlParser.Set_session_autocommit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_autocommit_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_autocommit_statement(VSqlParser.Set_session_autocommit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_characteristics_as_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_characteristics_as_transaction_statement(VSqlParser.Set_session_characteristics_as_transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_characteristics_as_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_characteristics_as_transaction_statement(VSqlParser.Set_session_characteristics_as_transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_graceperiod_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_graceperiod_statement(VSqlParser.Set_session_graceperiod_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_graceperiod_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_graceperiod_statement(VSqlParser.Set_session_graceperiod_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_idlesessiontimeout_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_idlesessiontimeout_statement(VSqlParser.Set_session_idlesessiontimeout_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_idlesessiontimeout_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_idlesessiontimeout_statement(VSqlParser.Set_session_idlesessiontimeout_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_memorycap_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_memorycap_statement(VSqlParser.Set_session_memorycap_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_memorycap_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_memorycap_statement(VSqlParser.Set_session_memorycap_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_multipleactiveresultsets_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_multipleactiveresultsets_statement(VSqlParser.Set_session_multipleactiveresultsets_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_multipleactiveresultsets_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_multipleactiveresultsets_statement(VSqlParser.Set_session_multipleactiveresultsets_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_resource_pool_statement(VSqlParser.Set_session_resource_pool_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_resource_pool_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_resource_pool_statement(VSqlParser.Set_session_resource_pool_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_runtimecap_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_runtimecap_statement(VSqlParser.Set_session_runtimecap_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_runtimecap_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_runtimecap_statement(VSqlParser.Set_session_runtimecap_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_session_tempspacecap_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_tempspacecap_statement(VSqlParser.Set_session_tempspacecap_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_session_tempspacecap_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_tempspacecap_statement(VSqlParser.Set_session_tempspacecap_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_standard_conforming_strings_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_standard_conforming_strings_statement(VSqlParser.Set_standard_conforming_strings_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_standard_conforming_strings_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_standard_conforming_strings_statement(VSqlParser.Set_standard_conforming_strings_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_time_zone_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_time_zone_statement(VSqlParser.Set_time_zone_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_time_zone_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_time_zone_statement(VSqlParser.Set_time_zone_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#show_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_statement(VSqlParser.Show_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#show_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_statement(VSqlParser.Show_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#show_current_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_current_statement(VSqlParser.Show_current_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#show_current_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_current_statement(VSqlParser.Show_current_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#show_database_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_database_statement(VSqlParser.Show_database_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#show_database_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_database_statement(VSqlParser.Show_database_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#show_node_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_node_statement(VSqlParser.Show_node_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#show_node_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_node_statement(VSqlParser.Show_node_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#show_session_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_session_statement(VSqlParser.Show_session_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#show_session_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_session_statement(VSqlParser.Show_session_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#start_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterStart_transaction_statement(VSqlParser.Start_transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#start_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitStart_transaction_statement(VSqlParser.Start_transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table_statement(VSqlParser.Truncate_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table_statement(VSqlParser.Truncate_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(VSqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(VSqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#simple_select_query_clause}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_query_clause(VSqlParser.Simple_select_query_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#simple_select_query_clause}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_query_clause(VSqlParser.Simple_select_query_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#select_query}.
	 * @param ctx the parse tree
	 */
	void enterSelect_query(VSqlParser.Select_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#select_query}.
	 * @param ctx the parse tree
	 */
	void exitSelect_query(VSqlParser.Select_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void enterOffset_clause(VSqlParser.Offset_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void exitOffset_clause(VSqlParser.Offset_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(VSqlParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(VSqlParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(VSqlParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(VSqlParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#intersect_clause}.
	 * @param ctx the parse tree
	 */
	void enterIntersect_clause(VSqlParser.Intersect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#intersect_clause}.
	 * @param ctx the parse tree
	 */
	void exitIntersect_clause(VSqlParser.Intersect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(VSqlParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(VSqlParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(VSqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(VSqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(VSqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(VSqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#timeseries_clause}.
	 * @param ctx the parse tree
	 */
	void enterTimeseries_clause(VSqlParser.Timeseries_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#timeseries_clause}.
	 * @param ctx the parse tree
	 */
	void exitTimeseries_clause(VSqlParser.Timeseries_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(VSqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(VSqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#as_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterAs_over_clause(VSqlParser.As_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#as_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitAs_over_clause(VSqlParser.As_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#groupBy_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupBy_clause(VSqlParser.GroupBy_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#groupBy_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupBy_clause(VSqlParser.GroupBy_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(VSqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(VSqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(VSqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(VSqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(VSqlParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(VSqlParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#match_clause}.
	 * @param ctx the parse tree
	 */
	void enterMatch_clause(VSqlParser.Match_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#match_clause}.
	 * @param ctx the parse tree
	 */
	void exitMatch_clause(VSqlParser.Match_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void enterPartition_clause(VSqlParser.Partition_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#partition_clause}.
	 * @param ctx the parse tree
	 */
	void exitPartition_clause(VSqlParser.Partition_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#encoding_clause}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_clause(VSqlParser.Encoding_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#encoding_clause}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_clause(VSqlParser.Encoding_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#owner_clause}.
	 * @param ctx the parse tree
	 */
	void enterOwner_clause(VSqlParser.Owner_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#owner_clause}.
	 * @param ctx the parse tree
	 */
	void exitOwner_clause(VSqlParser.Owner_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#rename_clause}.
	 * @param ctx the parse tree
	 */
	void enterRename_clause(VSqlParser.Rename_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#rename_clause}.
	 * @param ctx the parse tree
	 */
	void exitRename_clause(VSqlParser.Rename_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#set_schema_clause}.
	 * @param ctx the parse tree
	 */
	void enterSet_schema_clause(VSqlParser.Set_schema_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#set_schema_clause}.
	 * @param ctx the parse tree
	 */
	void exitSet_schema_clause(VSqlParser.Set_schema_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#orderbyItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderbyItem(VSqlParser.OrderbyItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#orderbyItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderbyItem(VSqlParser.OrderbyItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#predicates}.
	 * @param ctx the parse tree
	 */
	void enterPredicates(VSqlParser.PredicatesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#predicates}.
	 * @param ctx the parse tree
	 */
	void exitPredicates(VSqlParser.PredicatesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#tableSample}.
	 * @param ctx the parse tree
	 */
	void enterTableSample(VSqlParser.TableSampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#tableSample}.
	 * @param ctx the parse tree
	 */
	void exitTableSample(VSqlParser.TableSampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#dataset}.
	 * @param ctx the parse tree
	 */
	void enterDataset(VSqlParser.DatasetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#dataset}.
	 * @param ctx the parse tree
	 */
	void exitDataset(VSqlParser.DatasetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(VSqlParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(VSqlParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(VSqlParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(VSqlParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(VSqlParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(VSqlParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#el}.
	 * @param ctx the parse tree
	 */
	void enterEl(VSqlParser.ElContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#el}.
	 * @param ctx the parse tree
	 */
	void exitEl(VSqlParser.ElContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(VSqlParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(VSqlParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void enterCastExpr(VSqlParser.CastExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#castExpr}.
	 * @param ctx the parse tree
	 */
	void exitCastExpr(VSqlParser.CastExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#castOperator}.
	 * @param ctx the parse tree
	 */
	void enterCastOperator(VSqlParser.CastOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#castOperator}.
	 * @param ctx the parse tree
	 */
	void exitCastOperator(VSqlParser.CastOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(VSqlParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#arrayExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(VSqlParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(VSqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(VSqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#nullPredicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(VSqlParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#nullPredicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(VSqlParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(VSqlParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#likePredicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(VSqlParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#joinPredicate}.
	 * @param ctx the parse tree
	 */
	void enterJoinPredicate(VSqlParser.JoinPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#joinPredicate}.
	 * @param ctx the parse tree
	 */
	void exitJoinPredicate(VSqlParser.JoinPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#interpolatePredicate}.
	 * @param ctx the parse tree
	 */
	void enterInterpolatePredicate(VSqlParser.InterpolatePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#interpolatePredicate}.
	 * @param ctx the parse tree
	 */
	void exitInterpolatePredicate(VSqlParser.InterpolatePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#columnValuePredicate}.
	 * @param ctx the parse tree
	 */
	void enterColumnValuePredicate(VSqlParser.ColumnValuePredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#columnValuePredicate}.
	 * @param ctx the parse tree
	 */
	void exitColumnValuePredicate(VSqlParser.ColumnValuePredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(VSqlParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#inPredicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(VSqlParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#constantExp}.
	 * @param ctx the parse tree
	 */
	void enterConstantExp(VSqlParser.ConstantExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#constantExp}.
	 * @param ctx the parse tree
	 */
	void exitConstantExp(VSqlParser.ConstantExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#betweenPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(VSqlParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#betweenPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(VSqlParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#booleanPredicate}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPredicate(VSqlParser.BooleanPredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#booleanPredicate}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPredicate(VSqlParser.BooleanPredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#caseExp}.
	 * @param ctx the parse tree
	 */
	void enterCaseExp(VSqlParser.CaseExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#caseExp}.
	 * @param ctx the parse tree
	 */
	void exitCaseExp(VSqlParser.CaseExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(VSqlParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(VSqlParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(VSqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(VSqlParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#elementWithUsing}.
	 * @param ctx the parse tree
	 */
	void enterElementWithUsing(VSqlParser.ElementWithUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#elementWithUsing}.
	 * @param ctx the parse tree
	 */
	void exitElementWithUsing(VSqlParser.ElementWithUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void enterUsingClause(VSqlParser.UsingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#usingClause}.
	 * @param ctx the parse tree
	 */
	void exitUsingClause(VSqlParser.UsingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#commaSeparatedKeyValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterCommaSeparatedKeyValuePairs(VSqlParser.CommaSeparatedKeyValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#commaSeparatedKeyValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitCommaSeparatedKeyValuePairs(VSqlParser.CommaSeparatedKeyValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#values}.
	 * @param ctx the parse tree
	 */
	void enterValues(VSqlParser.ValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#values}.
	 * @param ctx the parse tree
	 */
	void exitValues(VSqlParser.ValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void enterKeyValuePair(VSqlParser.KeyValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#keyValuePair}.
	 * @param ctx the parse tree
	 */
	void exitKeyValuePair(VSqlParser.KeyValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#hints}.
	 * @param ctx the parse tree
	 */
	void enterHints(VSqlParser.HintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#hints}.
	 * @param ctx the parse tree
	 */
	void exitHints(VSqlParser.HintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(VSqlParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(VSqlParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(VSqlParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#columnReference}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(VSqlParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(VSqlParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(VSqlParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#viewReference}.
	 * @param ctx the parse tree
	 */
	void enterViewReference(VSqlParser.ViewReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#viewReference}.
	 * @param ctx the parse tree
	 */
	void exitViewReference(VSqlParser.ViewReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#sourceReference}.
	 * @param ctx the parse tree
	 */
	void enterSourceReference(VSqlParser.SourceReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#sourceReference}.
	 * @param ctx the parse tree
	 */
	void exitSourceReference(VSqlParser.SourceReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#filterReference}.
	 * @param ctx the parse tree
	 */
	void enterFilterReference(VSqlParser.FilterReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#filterReference}.
	 * @param ctx the parse tree
	 */
	void exitFilterReference(VSqlParser.FilterReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#parserReference}.
	 * @param ctx the parse tree
	 */
	void enterParserReference(VSqlParser.ParserReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#parserReference}.
	 * @param ctx the parse tree
	 */
	void exitParserReference(VSqlParser.ParserReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#projectionReference}.
	 * @param ctx the parse tree
	 */
	void enterProjectionReference(VSqlParser.ProjectionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#projectionReference}.
	 * @param ctx the parse tree
	 */
	void exitProjectionReference(VSqlParser.ProjectionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#procedureReference}.
	 * @param ctx the parse tree
	 */
	void enterProcedureReference(VSqlParser.ProcedureReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#procedureReference}.
	 * @param ctx the parse tree
	 */
	void exitProcedureReference(VSqlParser.ProcedureReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(VSqlParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(VSqlParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#functionReference}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReference(VSqlParser.FunctionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#functionReference}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReference(VSqlParser.FunctionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#libraryReference}.
	 * @param ctx the parse tree
	 */
	void enterLibraryReference(VSqlParser.LibraryReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#libraryReference}.
	 * @param ctx the parse tree
	 */
	void exitLibraryReference(VSqlParser.LibraryReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#sequenceReference}.
	 * @param ctx the parse tree
	 */
	void enterSequenceReference(VSqlParser.SequenceReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#sequenceReference}.
	 * @param ctx the parse tree
	 */
	void exitSequenceReference(VSqlParser.SequenceReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#modelReference}.
	 * @param ctx the parse tree
	 */
	void enterModelReference(VSqlParser.ModelReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#modelReference}.
	 * @param ctx the parse tree
	 */
	void exitModelReference(VSqlParser.ModelReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#txtIndexReference}.
	 * @param ctx the parse tree
	 */
	void enterTxtIndexReference(VSqlParser.TxtIndexReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#txtIndexReference}.
	 * @param ctx the parse tree
	 */
	void exitTxtIndexReference(VSqlParser.TxtIndexReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#schemaReference}.
	 * @param ctx the parse tree
	 */
	void enterSchemaReference(VSqlParser.SchemaReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#schemaReference}.
	 * @param ctx the parse tree
	 */
	void exitSchemaReference(VSqlParser.SchemaReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#dbname}.
	 * @param ctx the parse tree
	 */
	void enterDbname(VSqlParser.DbnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#dbname}.
	 * @param ctx the parse tree
	 */
	void exitDbname(VSqlParser.DbnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#txtIndex}.
	 * @param ctx the parse tree
	 */
	void enterTxtIndex(VSqlParser.TxtIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#txtIndex}.
	 * @param ctx the parse tree
	 */
	void exitTxtIndex(VSqlParser.TxtIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(VSqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(VSqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(VSqlParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(VSqlParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(VSqlParser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(VSqlParser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#notifier}.
	 * @param ctx the parse tree
	 */
	void enterNotifier(VSqlParser.NotifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#notifier}.
	 * @param ctx the parse tree
	 */
	void exitNotifier(VSqlParser.NotifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#model}.
	 * @param ctx the parse tree
	 */
	void enterModel(VSqlParser.ModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#model}.
	 * @param ctx the parse tree
	 */
	void exitModel(VSqlParser.ModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#filter}.
	 * @param ctx the parse tree
	 */
	void enterFilter(VSqlParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#filter}.
	 * @param ctx the parse tree
	 */
	void exitFilter(VSqlParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#parserName}.
	 * @param ctx the parse tree
	 */
	void enterParserName(VSqlParser.ParserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#parserName}.
	 * @param ctx the parse tree
	 */
	void exitParserName(VSqlParser.ParserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#view}.
	 * @param ctx the parse tree
	 */
	void enterView(VSqlParser.ViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#view}.
	 * @param ctx the parse tree
	 */
	void exitView(VSqlParser.ViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#lb_group}.
	 * @param ctx the parse tree
	 */
	void enterLb_group(VSqlParser.Lb_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#lb_group}.
	 * @param ctx the parse tree
	 */
	void exitLb_group(VSqlParser.Lb_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#network_address}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_address(VSqlParser.Network_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#network_address}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_address(VSqlParser.Network_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#routingRule}.
	 * @param ctx the parse tree
	 */
	void enterRoutingRule(VSqlParser.RoutingRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#routingRule}.
	 * @param ctx the parse tree
	 */
	void exitRoutingRule(VSqlParser.RoutingRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#branch_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBranch_identifier(VSqlParser.Branch_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#branch_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBranch_identifier(VSqlParser.Branch_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#role}.
	 * @param ctx the parse tree
	 */
	void enterRole(VSqlParser.RoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#role}.
	 * @param ctx the parse tree
	 */
	void exitRole(VSqlParser.RoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#lang}.
	 * @param ctx the parse tree
	 */
	void enterLang(VSqlParser.LangContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#lang}.
	 * @param ctx the parse tree
	 */
	void exitLang(VSqlParser.LangContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#resourcePool}.
	 * @param ctx the parse tree
	 */
	void enterResourcePool(VSqlParser.ResourcePoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#resourcePool}.
	 * @param ctx the parse tree
	 */
	void exitResourcePool(VSqlParser.ResourcePoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(VSqlParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(VSqlParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#udParam}.
	 * @param ctx the parse tree
	 */
	void enterUdParam(VSqlParser.UdParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#udParam}.
	 * @param ctx the parse tree
	 */
	void exitUdParam(VSqlParser.UdParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(VSqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(VSqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(VSqlParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(VSqlParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(VSqlParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(VSqlParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#library}.
	 * @param ctx the parse tree
	 */
	void enterLibrary(VSqlParser.LibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#library}.
	 * @param ctx the parse tree
	 */
	void exitLibrary(VSqlParser.LibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(VSqlParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(VSqlParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(VSqlParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(VSqlParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(VSqlParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(VSqlParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(VSqlParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(VSqlParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(VSqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(VSqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(VSqlParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(VSqlParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#singleChar}.
	 * @param ctx the parse tree
	 */
	void enterSingleChar(VSqlParser.SingleCharContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#singleChar}.
	 * @param ctx the parse tree
	 */
	void exitSingleChar(VSqlParser.SingleCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(VSqlParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(VSqlParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#integerNumber}.
	 * @param ctx the parse tree
	 */
	void enterIntegerNumber(VSqlParser.IntegerNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#integerNumber}.
	 * @param ctx the parse tree
	 */
	void exitIntegerNumber(VSqlParser.IntegerNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#asteriskExp}.
	 * @param ctx the parse tree
	 */
	void enterAsteriskExp(VSqlParser.AsteriskExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#asteriskExp}.
	 * @param ctx the parse tree
	 */
	void exitAsteriskExp(VSqlParser.AsteriskExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#subnet}.
	 * @param ctx the parse tree
	 */
	void enterSubnet(VSqlParser.SubnetContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#subnet}.
	 * @param ctx the parse tree
	 */
	void exitSubnet(VSqlParser.SubnetContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(VSqlParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(VSqlParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(VSqlParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(VSqlParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(VSqlParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(VSqlParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#faultGroup}.
	 * @param ctx the parse tree
	 */
	void enterFaultGroup(VSqlParser.FaultGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#faultGroup}.
	 * @param ctx the parse tree
	 */
	void exitFaultGroup(VSqlParser.FaultGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#auth_method_name}.
	 * @param ctx the parse tree
	 */
	void enterAuth_method_name(VSqlParser.Auth_method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#auth_method_name}.
	 * @param ctx the parse tree
	 */
	void exitAuth_method_name(VSqlParser.Auth_method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(VSqlParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(VSqlParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#network_interface}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_interface(VSqlParser.Network_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#network_interface}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_interface(VSqlParser.Network_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#profile}.
	 * @param ctx the parse tree
	 */
	void enterProfile(VSqlParser.ProfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#profile}.
	 * @param ctx the parse tree
	 */
	void exitProfile(VSqlParser.ProfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(VSqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(VSqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(VSqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(VSqlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#enableOrDisable}.
	 * @param ctx the parse tree
	 */
	void enterEnableOrDisable(VSqlParser.EnableOrDisableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#enableOrDisable}.
	 * @param ctx the parse tree
	 */
	void exitEnableOrDisable(VSqlParser.EnableOrDisableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#enabledOrDisabled}.
	 * @param ctx the parse tree
	 */
	void enterEnabledOrDisabled(VSqlParser.EnabledOrDisabledContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#enabledOrDisabled}.
	 * @param ctx the parse tree
	 */
	void exitEnabledOrDisabled(VSqlParser.EnabledOrDisabledContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#nullOrNotNull}.
	 * @param ctx the parse tree
	 */
	void enterNullOrNotNull(VSqlParser.NullOrNotNullContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#nullOrNotNull}.
	 * @param ctx the parse tree
	 */
	void exitNullOrNotNull(VSqlParser.NullOrNotNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#address}.
	 * @param ctx the parse tree
	 */
	void enterAddress(VSqlParser.AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#address}.
	 * @param ctx the parse tree
	 */
	void exitAddress(VSqlParser.AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#compressionType}.
	 * @param ctx the parse tree
	 */
	void enterCompressionType(VSqlParser.CompressionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#compressionType}.
	 * @param ctx the parse tree
	 */
	void exitCompressionType(VSqlParser.CompressionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#password_parameter}.
	 * @param ctx the parse tree
	 */
	void enterPassword_parameter(VSqlParser.Password_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#password_parameter}.
	 * @param ctx the parse tree
	 */
	void exitPassword_parameter(VSqlParser.Password_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(VSqlParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(VSqlParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitwiseOperator(VSqlParser.BitwiseOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitwiseOperator(VSqlParser.BitwiseOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#booleanOperators}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperators(VSqlParser.BooleanOperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#booleanOperators}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperators(VSqlParser.BooleanOperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#otherOperator}.
	 * @param ctx the parse tree
	 */
	void enterOtherOperator(VSqlParser.OtherOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#otherOperator}.
	 * @param ctx the parse tree
	 */
	void exitOtherOperator(VSqlParser.OtherOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#mathematicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathematicalOperator(VSqlParser.MathematicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#mathematicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathematicalOperator(VSqlParser.MathematicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(VSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(VSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(VSqlParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(VSqlParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionMode(VSqlParser.TransactionModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionMode(VSqlParser.TransactionModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_expression(VSqlParser.Bool_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#bool_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_expression(VSqlParser.Bool_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void enterDataTypes(VSqlParser.DataTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#dataTypes}.
	 * @param ctx the parse tree
	 */
	void exitDataTypes(VSqlParser.DataTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#binaryTypes}.
	 * @param ctx the parse tree
	 */
	void enterBinaryTypes(VSqlParser.BinaryTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#binaryTypes}.
	 * @param ctx the parse tree
	 */
	void exitBinaryTypes(VSqlParser.BinaryTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#booleanTypes}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTypes(VSqlParser.BooleanTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#booleanTypes}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTypes(VSqlParser.BooleanTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#charTypes}.
	 * @param ctx the parse tree
	 */
	void enterCharTypes(VSqlParser.CharTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#charTypes}.
	 * @param ctx the parse tree
	 */
	void exitCharTypes(VSqlParser.CharTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#dateTypes}.
	 * @param ctx the parse tree
	 */
	void enterDateTypes(VSqlParser.DateTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#dateTypes}.
	 * @param ctx the parse tree
	 */
	void exitDateTypes(VSqlParser.DateTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#apNumericTypes}.
	 * @param ctx the parse tree
	 */
	void enterApNumericTypes(VSqlParser.ApNumericTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#apNumericTypes}.
	 * @param ctx the parse tree
	 */
	void exitApNumericTypes(VSqlParser.ApNumericTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#eNumericTypes}.
	 * @param ctx the parse tree
	 */
	void enterENumericTypes(VSqlParser.ENumericTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#eNumericTypes}.
	 * @param ctx the parse tree
	 */
	void exitENumericTypes(VSqlParser.ENumericTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#spatialTypes}.
	 * @param ctx the parse tree
	 */
	void enterSpatialTypes(VSqlParser.SpatialTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#spatialTypes}.
	 * @param ctx the parse tree
	 */
	void exitSpatialTypes(VSqlParser.SpatialTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#uuidTypes}.
	 * @param ctx the parse tree
	 */
	void enterUuidTypes(VSqlParser.UuidTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#uuidTypes}.
	 * @param ctx the parse tree
	 */
	void exitUuidTypes(VSqlParser.UuidTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#otherTypes}.
	 * @param ctx the parse tree
	 */
	void enterOtherTypes(VSqlParser.OtherTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#otherTypes}.
	 * @param ctx the parse tree
	 */
	void exitOtherTypes(VSqlParser.OtherTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(VSqlParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link VSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(VSqlParser.NonReservedContext ctx);
}