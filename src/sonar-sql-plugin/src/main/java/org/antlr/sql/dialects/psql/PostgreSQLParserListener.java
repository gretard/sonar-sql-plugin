// Generated from antlr_psql/antlr4/PostgreSQLParser.g4 by ANTLR 4.9.3
package org.antlr.sql.dialects.psql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostgreSQLParser}.
 */
public interface PostgreSQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(PostgreSQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(PostgreSQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PostgreSQLParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PostgreSQLParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAbort_stmt(PostgreSQLParser.Abort_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#abort_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAbort_stmt(PostgreSQLParser.Abort_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_stmt(PostgreSQLParser.Alter_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_stmt(PostgreSQLParser.Alter_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_aggregate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_aggregate_stmt(PostgreSQLParser.Alter_aggregate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_aggregate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_aggregate_stmt(PostgreSQLParser.Alter_aggregate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_collation_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collation_stmt(PostgreSQLParser.Alter_collation_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_collation_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collation_stmt(PostgreSQLParser.Alter_collation_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_conversion_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_conversion_stmt(PostgreSQLParser.Alter_conversion_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_conversion_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_conversion_stmt(PostgreSQLParser.Alter_conversion_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_stmt(PostgreSQLParser.Alter_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_stmt(PostgreSQLParser.Alter_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_default_privileges_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_default_privileges_stmt(PostgreSQLParser.Alter_default_privileges_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_default_privileges_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_default_privileges_stmt(PostgreSQLParser.Alter_default_privileges_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_domain_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_domain_stmt(PostgreSQLParser.Alter_domain_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_domain_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_domain_stmt(PostgreSQLParser.Alter_domain_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_event_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_event_trigger_stmt(PostgreSQLParser.Alter_event_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_event_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_event_trigger_stmt(PostgreSQLParser.Alter_event_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_extension_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_stmt(PostgreSQLParser.Alter_extension_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_extension_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_stmt(PostgreSQLParser.Alter_extension_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_foreign_data_wrapper_stmt(PostgreSQLParser.Alter_foreign_data_wrapper_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_foreign_data_wrapper_stmt(PostgreSQLParser.Alter_foreign_data_wrapper_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_foreign_table_action(PostgreSQLParser.Alter_foreign_table_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_foreign_table_action(PostgreSQLParser.Alter_foreign_table_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_action_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_foreign_table_action_list(PostgreSQLParser.Alter_foreign_table_action_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_action_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_foreign_table_action_list(PostgreSQLParser.Alter_foreign_table_action_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_foreign_table_stmt(PostgreSQLParser.Alter_foreign_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_foreign_table_stmt(PostgreSQLParser.Alter_foreign_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function_stmt(PostgreSQLParser.Alter_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function_stmt(PostgreSQLParser.Alter_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_group_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_group_stmt(PostgreSQLParser.Alter_group_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_group_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_group_stmt(PostgreSQLParser.Alter_group_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_stmt(PostgreSQLParser.Alter_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_stmt(PostgreSQLParser.Alter_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_language_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_language_stmt(PostgreSQLParser.Alter_language_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_language_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_language_stmt(PostgreSQLParser.Alter_language_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_large_object_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_large_object_stmt(PostgreSQLParser.Alter_large_object_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_large_object_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_large_object_stmt(PostgreSQLParser.Alter_large_object_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_materialize_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_materialize_view_stmt(PostgreSQLParser.Alter_materialize_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_materialize_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_materialize_view_stmt(PostgreSQLParser.Alter_materialize_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_stmt(PostgreSQLParser.Alter_operator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_stmt(PostgreSQLParser.Alter_operator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_operator_class_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_class_stmt(PostgreSQLParser.Alter_operator_class_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_operator_class_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_class_stmt(PostgreSQLParser.Alter_operator_class_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_operator_family_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_family_stmt(PostgreSQLParser.Alter_operator_family_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_operator_family_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_family_stmt(PostgreSQLParser.Alter_operator_family_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_policy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_policy_stmt(PostgreSQLParser.Alter_policy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_policy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_policy_stmt(PostgreSQLParser.Alter_policy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_publication_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_publication_stmt(PostgreSQLParser.Alter_publication_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_publication_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_publication_stmt(PostgreSQLParser.Alter_publication_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_role_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_role_options(PostgreSQLParser.Alter_role_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_role_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_role_options(PostgreSQLParser.Alter_role_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_role_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_role_stmt(PostgreSQLParser.Alter_role_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_role_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_role_stmt(PostgreSQLParser.Alter_role_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_rule_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_rule_stmt(PostgreSQLParser.Alter_rule_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_rule_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_rule_stmt(PostgreSQLParser.Alter_rule_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_stmt(PostgreSQLParser.Alter_schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_stmt(PostgreSQLParser.Alter_schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_sequence_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence_stmt(PostgreSQLParser.Alter_sequence_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_sequence_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence_stmt(PostgreSQLParser.Alter_sequence_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_server_options_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_options_list(PostgreSQLParser.Alter_server_options_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_server_options_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_options_list(PostgreSQLParser.Alter_server_options_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_server_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_stmt(PostgreSQLParser.Alter_server_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_server_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_stmt(PostgreSQLParser.Alter_server_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_statistics_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_statistics_stmt(PostgreSQLParser.Alter_statistics_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_statistics_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_statistics_stmt(PostgreSQLParser.Alter_statistics_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_subscription_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_subscription_stmt(PostgreSQLParser.Alter_subscription_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_subscription_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_subscription_stmt(PostgreSQLParser.Alter_subscription_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_system_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_system_stmt(PostgreSQLParser.Alter_system_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_system_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_system_stmt(PostgreSQLParser.Alter_system_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(PostgreSQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(PostgreSQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace_stmt(PostgreSQLParser.Alter_tablespace_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace_stmt(PostgreSQLParser.Alter_tablespace_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_text_search_config_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_text_search_config_stmt(PostgreSQLParser.Alter_text_search_config_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_text_search_config_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_text_search_config_stmt(PostgreSQLParser.Alter_text_search_config_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_text_search_dict_stmt(PostgreSQLParser.Alter_text_search_dict_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_text_search_dict_stmt(PostgreSQLParser.Alter_text_search_dict_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_text_search_parser_stmt(PostgreSQLParser.Alter_text_search_parser_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_text_search_parser_stmt(PostgreSQLParser.Alter_text_search_parser_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_text_search_template_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_text_search_template_stmt(PostgreSQLParser.Alter_text_search_template_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_text_search_template_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_text_search_template_stmt(PostgreSQLParser.Alter_text_search_template_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger_stmt(PostgreSQLParser.Alter_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger_stmt(PostgreSQLParser.Alter_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_stmt(PostgreSQLParser.Alter_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_stmt(PostgreSQLParser.Alter_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_user_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_stmt(PostgreSQLParser.Alter_user_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_user_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_stmt(PostgreSQLParser.Alter_user_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_user_mapping_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_mapping_stmt(PostgreSQLParser.Alter_user_mapping_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_user_mapping_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_mapping_stmt(PostgreSQLParser.Alter_user_mapping_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_stmt(PostgreSQLParser.Alter_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_stmt(PostgreSQLParser.Alter_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(PostgreSQLParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(PostgreSQLParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(PostgreSQLParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(PostgreSQLParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#cluster_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCluster_stmt(PostgreSQLParser.Cluster_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#cluster_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCluster_stmt(PostgreSQLParser.Cluster_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#comment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterComment_stmt(PostgreSQLParser.Comment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#comment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitComment_stmt(PostgreSQLParser.Comment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(PostgreSQLParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(PostgreSQLParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#commit_prepared_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_prepared_stmt(PostgreSQLParser.Commit_prepared_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#commit_prepared_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_prepared_stmt(PostgreSQLParser.Commit_prepared_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_stmt(PostgreSQLParser.Copy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_stmt(PostgreSQLParser.Copy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_stmt(PostgreSQLParser.Create_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_stmt(PostgreSQLParser.Create_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_access_method_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_access_method_stmt(PostgreSQLParser.Create_access_method_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_access_method_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_access_method_stmt(PostgreSQLParser.Create_access_method_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_aggregate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggregate_stmt(PostgreSQLParser.Create_aggregate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_aggregate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggregate_stmt(PostgreSQLParser.Create_aggregate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_cast_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cast_stmt(PostgreSQLParser.Create_cast_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_cast_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cast_stmt(PostgreSQLParser.Create_cast_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_collation_opt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_collation_opt(PostgreSQLParser.Create_collation_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_collation_opt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_collation_opt(PostgreSQLParser.Create_collation_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_collation_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_collation_opt_list(PostgreSQLParser.Create_collation_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_collation_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_collation_opt_list(PostgreSQLParser.Create_collation_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_collation_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_collation_stmt(PostgreSQLParser.Create_collation_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_collation_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_collation_stmt(PostgreSQLParser.Create_collation_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_conversion_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_conversion_stmt(PostgreSQLParser.Create_conversion_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_conversion_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_conversion_stmt(PostgreSQLParser.Create_conversion_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(PostgreSQLParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(PostgreSQLParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraint(PostgreSQLParser.Domain_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraint(PostgreSQLParser.Domain_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_domain_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_domain_stmt(PostgreSQLParser.Create_domain_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_domain_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_domain_stmt(PostgreSQLParser.Create_domain_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_event_trigger_cond}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_trigger_cond(PostgreSQLParser.Create_event_trigger_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_event_trigger_cond}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_trigger_cond(PostgreSQLParser.Create_event_trigger_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_event_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_trigger_stmt(PostgreSQLParser.Create_event_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_event_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_trigger_stmt(PostgreSQLParser.Create_event_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_foreign_data_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_foreign_data_options(PostgreSQLParser.Create_foreign_data_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_foreign_data_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_foreign_data_options(PostgreSQLParser.Create_foreign_data_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_foreign_data_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_foreign_data_stmt(PostgreSQLParser.Create_foreign_data_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_foreign_data_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_foreign_data_stmt(PostgreSQLParser.Create_foreign_data_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_foreign_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_foreign_table_stmt(PostgreSQLParser.Create_foreign_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_foreign_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_foreign_table_stmt(PostgreSQLParser.Create_foreign_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(PostgreSQLParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(PostgreSQLParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_group_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_group_stmt(PostgreSQLParser.Create_group_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_group_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_group_stmt(PostgreSQLParser.Create_group_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(PostgreSQLParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(PostgreSQLParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_language_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_language_stmt(PostgreSQLParser.Create_language_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_language_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_language_stmt(PostgreSQLParser.Create_language_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_materialized_view_stmt(PostgreSQLParser.Create_materialized_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_materialized_view_stmt(PostgreSQLParser.Create_materialized_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_stmt(PostgreSQLParser.Create_operator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_stmt(PostgreSQLParser.Create_operator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_operator_class_opt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_class_opt(PostgreSQLParser.Create_operator_class_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_operator_class_opt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_class_opt(PostgreSQLParser.Create_operator_class_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_operator_class_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_class_stmt(PostgreSQLParser.Create_operator_class_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_operator_class_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_class_stmt(PostgreSQLParser.Create_operator_class_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_operator_family_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_family_stmt(PostgreSQLParser.Create_operator_family_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_operator_family_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_family_stmt(PostgreSQLParser.Create_operator_family_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_policy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_policy_stmt(PostgreSQLParser.Create_policy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_policy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_policy_stmt(PostgreSQLParser.Create_policy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_role_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_role_stmt(PostgreSQLParser.Create_role_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_role_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_role_stmt(PostgreSQLParser.Create_role_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_rule_event}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rule_event(PostgreSQLParser.Create_rule_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_rule_event}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rule_event(PostgreSQLParser.Create_rule_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_rule_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rule_stmt(PostgreSQLParser.Create_rule_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_rule_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rule_stmt(PostgreSQLParser.Create_rule_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_stmt(PostgreSQLParser.Create_schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_stmt(PostgreSQLParser.Create_schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_sequence_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence_stmt(PostgreSQLParser.Create_sequence_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_sequence_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence_stmt(PostgreSQLParser.Create_sequence_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_server_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_stmt(PostgreSQLParser.Create_server_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_server_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_stmt(PostgreSQLParser.Create_server_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_statistics_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics_stmt(PostgreSQLParser.Create_statistics_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_statistics_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics_stmt(PostgreSQLParser.Create_statistics_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_subscription_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_subscription_stmt(PostgreSQLParser.Create_subscription_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_subscription_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_subscription_stmt(PostgreSQLParser.Create_subscription_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(PostgreSQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(PostgreSQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_table_as_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_as_stmt(PostgreSQLParser.Create_table_as_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_table_as_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_as_stmt(PostgreSQLParser.Create_table_as_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tablespace_stmt(PostgreSQLParser.Create_tablespace_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tablespace_stmt(PostgreSQLParser.Create_tablespace_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_text_search_config_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_text_search_config_stmt(PostgreSQLParser.Create_text_search_config_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_text_search_config_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_text_search_config_stmt(PostgreSQLParser.Create_text_search_config_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_text_search_dict_stmt(PostgreSQLParser.Create_text_search_dict_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_text_search_dict_stmt(PostgreSQLParser.Create_text_search_dict_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_text_search_parser_stmt(PostgreSQLParser.Create_text_search_parser_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_text_search_parser_stmt(PostgreSQLParser.Create_text_search_parser_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_text_search_template_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_text_search_template_stmt(PostgreSQLParser.Create_text_search_template_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_text_search_template_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_text_search_template_stmt(PostgreSQLParser.Create_text_search_template_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_transform_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_transform_stmt(PostgreSQLParser.Create_transform_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_transform_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_transform_stmt(PostgreSQLParser.Create_transform_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(PostgreSQLParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(PostgreSQLParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_stmt(PostgreSQLParser.Create_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_stmt(PostgreSQLParser.Create_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_user_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_stmt(PostgreSQLParser.Create_user_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_user_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_stmt(PostgreSQLParser.Create_user_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_user_mapping_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_mapping_stmt(PostgreSQLParser.Create_user_mapping_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_user_mapping_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_mapping_stmt(PostgreSQLParser.Create_user_mapping_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(PostgreSQLParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(PostgreSQLParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#deallocate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeallocate_stmt(PostgreSQLParser.Deallocate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#deallocate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeallocate_stmt(PostgreSQLParser.Deallocate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(PostgreSQLParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(PostgreSQLParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(PostgreSQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(PostgreSQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#discard_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDiscard_stmt(PostgreSQLParser.Discard_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#discard_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDiscard_stmt(PostgreSQLParser.Discard_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(PostgreSQLParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(PostgreSQLParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_access_method_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_access_method_stmt(PostgreSQLParser.Drop_access_method_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_access_method_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_access_method_stmt(PostgreSQLParser.Drop_access_method_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_aggregate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_aggregate_stmt(PostgreSQLParser.Drop_aggregate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_aggregate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_aggregate_stmt(PostgreSQLParser.Drop_aggregate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_cast_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_cast_stmt(PostgreSQLParser.Drop_cast_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_cast_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_cast_stmt(PostgreSQLParser.Drop_cast_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_collation_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_collation_stmt(PostgreSQLParser.Drop_collation_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_collation_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_collation_stmt(PostgreSQLParser.Drop_collation_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_conversion_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_conversion_stmt(PostgreSQLParser.Drop_conversion_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_conversion_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_conversion_stmt(PostgreSQLParser.Drop_conversion_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_stmt(PostgreSQLParser.Drop_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_stmt(PostgreSQLParser.Drop_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_domain_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_domain_stmt(PostgreSQLParser.Drop_domain_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_domain_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_domain_stmt(PostgreSQLParser.Drop_domain_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_event_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_trigger_stmt(PostgreSQLParser.Drop_event_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_event_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_trigger_stmt(PostgreSQLParser.Drop_event_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_extension_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_extension_stmt(PostgreSQLParser.Drop_extension_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_extension_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_extension_stmt(PostgreSQLParser.Drop_extension_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_foreign_data_wrapper_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_foreign_data_wrapper_stmt(PostgreSQLParser.Drop_foreign_data_wrapper_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_foreign_data_wrapper_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_foreign_data_wrapper_stmt(PostgreSQLParser.Drop_foreign_data_wrapper_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_foreign_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_foreign_table_stmt(PostgreSQLParser.Drop_foreign_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_foreign_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_foreign_table_stmt(PostgreSQLParser.Drop_foreign_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function_stmt(PostgreSQLParser.Drop_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function_stmt(PostgreSQLParser.Drop_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_group_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_group_stmt(PostgreSQLParser.Drop_group_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_group_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_group_stmt(PostgreSQLParser.Drop_group_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(PostgreSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(PostgreSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_language_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_language_stmt(PostgreSQLParser.Drop_language_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_language_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_language_stmt(PostgreSQLParser.Drop_language_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_materialized_view_stmt(PostgreSQLParser.Drop_materialized_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_materialized_view_stmt(PostgreSQLParser.Drop_materialized_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_stmt(PostgreSQLParser.Drop_operator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_operator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_stmt(PostgreSQLParser.Drop_operator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_operator_class_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_class_stmt(PostgreSQLParser.Drop_operator_class_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_operator_class_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_class_stmt(PostgreSQLParser.Drop_operator_class_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_operator_family_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_family_stmt(PostgreSQLParser.Drop_operator_family_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_operator_family_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_family_stmt(PostgreSQLParser.Drop_operator_family_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_owned_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_owned_stmt(PostgreSQLParser.Drop_owned_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_owned_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_owned_stmt(PostgreSQLParser.Drop_owned_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_policy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_policy_stmt(PostgreSQLParser.Drop_policy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_policy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_policy_stmt(PostgreSQLParser.Drop_policy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_publication_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_publication_stmt(PostgreSQLParser.Drop_publication_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_publication_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_publication_stmt(PostgreSQLParser.Drop_publication_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_role_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_role_stmt(PostgreSQLParser.Drop_role_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_role_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_role_stmt(PostgreSQLParser.Drop_role_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_rule_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_rule_stmt(PostgreSQLParser.Drop_rule_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_rule_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_rule_stmt(PostgreSQLParser.Drop_rule_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema_stmt(PostgreSQLParser.Drop_schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema_stmt(PostgreSQLParser.Drop_schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_sequence_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence_stmt(PostgreSQLParser.Drop_sequence_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_sequence_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence_stmt(PostgreSQLParser.Drop_sequence_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_server_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_stmt(PostgreSQLParser.Drop_server_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_server_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_stmt(PostgreSQLParser.Drop_server_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_statistics_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics_stmt(PostgreSQLParser.Drop_statistics_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_statistics_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics_stmt(PostgreSQLParser.Drop_statistics_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_subscription_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_subscription_stmt(PostgreSQLParser.Drop_subscription_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_subscription_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_subscription_stmt(PostgreSQLParser.Drop_subscription_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(PostgreSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(PostgreSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_tablespace_stmt(PostgreSQLParser.Drop_tablespace_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_tablespace_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_tablespace_stmt(PostgreSQLParser.Drop_tablespace_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_text_search_config_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_text_search_config_stmt(PostgreSQLParser.Drop_text_search_config_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_text_search_config_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_text_search_config_stmt(PostgreSQLParser.Drop_text_search_config_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_text_search_dict_stmt(PostgreSQLParser.Drop_text_search_dict_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_text_search_dict_stmt(PostgreSQLParser.Drop_text_search_dict_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_text_search_parser_stmt(PostgreSQLParser.Drop_text_search_parser_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_text_search_parser_stmt(PostgreSQLParser.Drop_text_search_parser_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_text_search_template_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_text_search_template_stmt(PostgreSQLParser.Drop_text_search_template_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_text_search_template_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_text_search_template_stmt(PostgreSQLParser.Drop_text_search_template_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_transform_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_transform_stmt(PostgreSQLParser.Drop_transform_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_transform_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_transform_stmt(PostgreSQLParser.Drop_transform_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(PostgreSQLParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(PostgreSQLParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_type_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type_stmt(PostgreSQLParser.Drop_type_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_type_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type_stmt(PostgreSQLParser.Drop_type_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_user_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user_stmt(PostgreSQLParser.Drop_user_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_user_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user_stmt(PostgreSQLParser.Drop_user_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_user_mapping_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user_mapping_stmt(PostgreSQLParser.Drop_user_mapping_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_user_mapping_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user_mapping_stmt(PostgreSQLParser.Drop_user_mapping_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(PostgreSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(PostgreSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExecute_stmt(PostgreSQLParser.Execute_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExecute_stmt(PostgreSQLParser.Execute_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#explain_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExplain_stmt(PostgreSQLParser.Explain_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#explain_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExplain_stmt(PostgreSQLParser.Explain_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFetch_stmt(PostgreSQLParser.Fetch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFetch_stmt(PostgreSQLParser.Fetch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt(PostgreSQLParser.Grant_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt(PostgreSQLParser.Grant_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#import_foreign_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_foreign_schema_stmt(PostgreSQLParser.Import_foreign_schema_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#import_foreign_schema_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_foreign_schema_stmt(PostgreSQLParser.Import_foreign_schema_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(PostgreSQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(PostgreSQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#listen_stmt}.
	 * @param ctx the parse tree
	 */
	void enterListen_stmt(PostgreSQLParser.Listen_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#listen_stmt}.
	 * @param ctx the parse tree
	 */
	void exitListen_stmt(PostgreSQLParser.Listen_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#load_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLoad_stmt(PostgreSQLParser.Load_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#load_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLoad_stmt(PostgreSQLParser.Load_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#lock_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLock_stmt(PostgreSQLParser.Lock_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#lock_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLock_stmt(PostgreSQLParser.Lock_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#move_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMove_stmt(PostgreSQLParser.Move_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#move_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMove_stmt(PostgreSQLParser.Move_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNotify_stmt(PostgreSQLParser.Notify_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNotify_stmt(PostgreSQLParser.Notify_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#prepare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrepare_stmt(PostgreSQLParser.Prepare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#prepare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrepare_stmt(PostgreSQLParser.Prepare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#prepare_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrepare_transaction_stmt(PostgreSQLParser.Prepare_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#prepare_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrepare_transaction_stmt(PostgreSQLParser.Prepare_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#reassign_owned_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReassign_owned_stmt(PostgreSQLParser.Reassign_owned_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#reassign_owned_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReassign_owned_stmt(PostgreSQLParser.Reassign_owned_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#refresh_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRefresh_materialized_view_stmt(PostgreSQLParser.Refresh_materialized_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#refresh_materialized_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRefresh_materialized_view_stmt(PostgreSQLParser.Refresh_materialized_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(PostgreSQLParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(PostgreSQLParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#release_savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_savepoint_stmt(PostgreSQLParser.Release_savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#release_savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_savepoint_stmt(PostgreSQLParser.Release_savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#reset_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReset_stmt(PostgreSQLParser.Reset_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#reset_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReset_stmt(PostgreSQLParser.Reset_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#revoke_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_stmt(PostgreSQLParser.Revoke_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#revoke_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_stmt(PostgreSQLParser.Revoke_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(PostgreSQLParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(PostgreSQLParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#rollback_prepared_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_prepared_stmt(PostgreSQLParser.Rollback_prepared_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#rollback_prepared_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_prepared_stmt(PostgreSQLParser.Rollback_prepared_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#rollback_to_savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_to_savepoint_stmt(PostgreSQLParser.Rollback_to_savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#rollback_to_savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_to_savepoint_stmt(PostgreSQLParser.Rollback_to_savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(PostgreSQLParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(PostgreSQLParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#security_label_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_label_stmt(PostgreSQLParser.Security_label_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#security_label_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_label_stmt(PostgreSQLParser.Security_label_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_into_stmt(PostgreSQLParser.Select_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_into_stmt(PostgreSQLParser.Select_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(PostgreSQLParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(PostgreSQLParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_expr}.
	 * @param ctx the parse tree
	 */
	void enterWith_expr(PostgreSQLParser.With_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_expr}.
	 * @param ctx the parse tree
	 */
	void exitWith_expr(PostgreSQLParser.With_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_stmt(PostgreSQLParser.Set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_stmt(PostgreSQLParser.Set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_constraints_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_constraints_stmt(PostgreSQLParser.Set_constraints_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_constraints_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_constraints_stmt(PostgreSQLParser.Set_constraints_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_role_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_role_stmt(PostgreSQLParser.Set_role_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_role_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_role_stmt(PostgreSQLParser.Set_role_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_session_authorization_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_authorization_stmt(PostgreSQLParser.Set_session_authorization_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_session_authorization_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_authorization_stmt(PostgreSQLParser.Set_session_authorization_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode(PostgreSQLParser.Transaction_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode(PostgreSQLParser.Transaction_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode_list(PostgreSQLParser.Transaction_mode_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode_list(PostgreSQLParser.Transaction_mode_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_stmt(PostgreSQLParser.Set_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_stmt(PostgreSQLParser.Set_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#show_stmt}.
	 * @param ctx the parse tree
	 */
	void enterShow_stmt(PostgreSQLParser.Show_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#show_stmt}.
	 * @param ctx the parse tree
	 */
	void exitShow_stmt(PostgreSQLParser.Show_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_stmt(PostgreSQLParser.Truncate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_stmt(PostgreSQLParser.Truncate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#unlisten_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlisten_stmt(PostgreSQLParser.Unlisten_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#unlisten_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlisten_stmt(PostgreSQLParser.Unlisten_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(PostgreSQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(PostgreSQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vacuum_opt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_opt(PostgreSQLParser.Vacuum_optContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vacuum_opt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_opt(PostgreSQLParser.Vacuum_optContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vacuum_opt_list}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_opt_list(PostgreSQLParser.Vacuum_opt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vacuum_opt_list}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_opt_list(PostgreSQLParser.Vacuum_opt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(PostgreSQLParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(PostgreSQLParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#values_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_stmt(PostgreSQLParser.Values_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#values_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_stmt(PostgreSQLParser.Values_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#selector_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelector_clause(PostgreSQLParser.Selector_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#selector_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelector_clause(PostgreSQLParser.Selector_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PostgreSQLParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PostgreSQLParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PostgreSQLParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PostgreSQLParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(PostgreSQLParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(PostgreSQLParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grouping_elem}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_elem(PostgreSQLParser.Grouping_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grouping_elem}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_elem(PostgreSQLParser.Grouping_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grouping_elem_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_elem_list(PostgreSQLParser.Grouping_elem_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grouping_elem_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_elem_list(PostgreSQLParser.Grouping_elem_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(PostgreSQLParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(PostgreSQLParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#explain_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExplain_parameter(PostgreSQLParser.Explain_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#explain_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExplain_parameter(PostgreSQLParser.Explain_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame}.
	 * @param ctx the parse tree
	 */
	void enterFrame(PostgreSQLParser.FrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame}.
	 * @param ctx the parse tree
	 */
	void exitFrame(PostgreSQLParser.FrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_start}.
	 * @param ctx the parse tree
	 */
	void enterFrame_start(PostgreSQLParser.Frame_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_start}.
	 * @param ctx the parse tree
	 */
	void exitFrame_start(PostgreSQLParser.Frame_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_end}.
	 * @param ctx the parse tree
	 */
	void enterFrame_end(PostgreSQLParser.Frame_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_end}.
	 * @param ctx the parse tree
	 */
	void exitFrame_end(PostgreSQLParser.Frame_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#window_clause}.
	 * @param ctx the parse tree
	 */
	void enterWindow_clause(PostgreSQLParser.Window_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#window_clause}.
	 * @param ctx the parse tree
	 */
	void exitWindow_clause(PostgreSQLParser.Window_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#combine_clause}.
	 * @param ctx the parse tree
	 */
	void enterCombine_clause(PostgreSQLParser.Combine_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#combine_clause}.
	 * @param ctx the parse tree
	 */
	void exitCombine_clause(PostgreSQLParser.Combine_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PostgreSQLParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PostgreSQLParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#order_by_item}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_item(PostgreSQLParser.Order_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#order_by_item}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_item(PostgreSQLParser.Order_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(PostgreSQLParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(PostgreSQLParser.Limit_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void enterOffset_clause(PostgreSQLParser.Offset_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#offset_clause}.
	 * @param ctx the parse tree
	 */
	void exitOffset_clause(PostgreSQLParser.Offset_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#fetch_clause}.
	 * @param ctx the parse tree
	 */
	void enterFetch_clause(PostgreSQLParser.Fetch_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#fetch_clause}.
	 * @param ctx the parse tree
	 */
	void exitFetch_clause(PostgreSQLParser.Fetch_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_clause(PostgreSQLParser.For_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_clause(PostgreSQLParser.For_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#updater_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdater_clause(PostgreSQLParser.Updater_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#updater_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdater_clause(PostgreSQLParser.Updater_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#updater_expr}.
	 * @param ctx the parse tree
	 */
	void enterUpdater_expr(PostgreSQLParser.Updater_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#updater_expr}.
	 * @param ctx the parse tree
	 */
	void exitUpdater_expr(PostgreSQLParser.Updater_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterReturning_clause(PostgreSQLParser.Returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitReturning_clause(PostgreSQLParser.Returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PostgreSQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PostgreSQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(PostgreSQLParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(PostgreSQLParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void enterCase_expr(PostgreSQLParser.Case_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#case_expr}.
	 * @param ctx the parse tree
	 */
	void exitCase_expr(PostgreSQLParser.Case_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(PostgreSQLParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(PostgreSQLParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#expr_list_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_list(PostgreSQLParser.Expr_list_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#expr_list_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_list(PostgreSQLParser.Expr_list_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#func_sig_arg}.
	 * @param ctx the parse tree
	 */
	void enterFunc_sig_arg(PostgreSQLParser.Func_sig_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#func_sig_arg}.
	 * @param ctx the parse tree
	 */
	void exitFunc_sig_arg(PostgreSQLParser.Func_sig_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#func_sig_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_sig_arg_list(PostgreSQLParser.Func_sig_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#func_sig_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_sig_arg_list(PostgreSQLParser.Func_sig_arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#func_sig}.
	 * @param ctx the parse tree
	 */
	void enterFunc_sig(PostgreSQLParser.Func_sigContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#func_sig}.
	 * @param ctx the parse tree
	 */
	void exitFunc_sig(PostgreSQLParser.Func_sigContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#func_sig_list}.
	 * @param ctx the parse tree
	 */
	void enterFunc_sig_list(PostgreSQLParser.Func_sig_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#func_sig_list}.
	 * @param ctx the parse tree
	 */
	void exitFunc_sig_list(PostgreSQLParser.Func_sig_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(PostgreSQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(PostgreSQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#timezone}.
	 * @param ctx the parse tree
	 */
	void enterTimezone(PostgreSQLParser.TimezoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#timezone}.
	 * @param ctx the parse tree
	 */
	void exitTimezone(PostgreSQLParser.TimezoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(PostgreSQLParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(PostgreSQLParser.OperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void enterAggregate(PostgreSQLParser.AggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#aggregate}.
	 * @param ctx the parse tree
	 */
	void exitAggregate(PostgreSQLParser.AggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#name_}.
	 * @param ctx the parse tree
	 */
	void enterName_(PostgreSQLParser.Name_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#name_}.
	 * @param ctx the parse tree
	 */
	void exitName_(PostgreSQLParser.Name_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#name_list}.
	 * @param ctx the parse tree
	 */
	void enterName_list(PostgreSQLParser.Name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#name_list}.
	 * @param ctx the parse tree
	 */
	void exitName_list(PostgreSQLParser.Name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(PostgreSQLParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(PostgreSQLParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#option_expr}.
	 * @param ctx the parse tree
	 */
	void enterOption_expr(PostgreSQLParser.Option_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#option_expr}.
	 * @param ctx the parse tree
	 */
	void exitOption_expr(PostgreSQLParser.Option_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#option_list}.
	 * @param ctx the parse tree
	 */
	void enterOption_list(PostgreSQLParser.Option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#option_list}.
	 * @param ctx the parse tree
	 */
	void exitOption_list(PostgreSQLParser.Option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_name_}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_(PostgreSQLParser.Table_name_Context ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_name_}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_(PostgreSQLParser.Table_name_Context ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#data_type_list}.
	 * @param ctx the parse tree
	 */
	void enterData_type_list(PostgreSQLParser.Data_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#data_type_list}.
	 * @param ctx the parse tree
	 */
	void exitData_type_list(PostgreSQLParser.Data_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_method}.
	 * @param ctx the parse tree
	 */
	void enterIndex_method(PostgreSQLParser.Index_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_method}.
	 * @param ctx the parse tree
	 */
	void exitIndex_method(PostgreSQLParser.Index_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#func_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_name(PostgreSQLParser.Func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#func_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_name(PostgreSQLParser.Func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(PostgreSQLParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(PostgreSQLParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#array_cons_expr}.
	 * @param ctx the parse tree
	 */
	void enterArray_cons_expr(PostgreSQLParser.Array_cons_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#array_cons_expr}.
	 * @param ctx the parse tree
	 */
	void exitArray_cons_expr(PostgreSQLParser.Array_cons_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void enterFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void exitFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_column_alias}.
	 * @param ctx the parse tree
	 */
	void enterWith_column_alias(PostgreSQLParser.With_column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_column_alias}.
	 * @param ctx the parse tree
	 */
	void exitWith_column_alias(PostgreSQLParser.With_column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(PostgreSQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(PostgreSQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(PostgreSQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(PostgreSQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#aggregate_signature}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_signature(PostgreSQLParser.Aggregate_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#aggregate_signature}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_signature(PostgreSQLParser.Aggregate_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(PostgreSQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(PostgreSQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraints(PostgreSQLParser.Column_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraints(PostgreSQLParser.Column_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 */
	void enterIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 */
	void exitIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#exclude_element}.
	 * @param ctx the parse tree
	 */
	void enterExclude_element(PostgreSQLParser.Exclude_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#exclude_element}.
	 * @param ctx the parse tree
	 */
	void exitExclude_element(PostgreSQLParser.Exclude_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(PostgreSQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(PostgreSQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#role_name}.
	 * @param ctx the parse tree
	 */
	void enterRole_name(PostgreSQLParser.Role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#role_name}.
	 * @param ctx the parse tree
	 */
	void exitRole_name(PostgreSQLParser.Role_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#role_name_list}.
	 * @param ctx the parse tree
	 */
	void enterRole_name_list(PostgreSQLParser.Role_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#role_name_list}.
	 * @param ctx the parse tree
	 */
	void exitRole_name_list(PostgreSQLParser.Role_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#param_value}.
	 * @param ctx the parse tree
	 */
	void enterParam_value(PostgreSQLParser.Param_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#param_value}.
	 * @param ctx the parse tree
	 */
	void exitParam_value(PostgreSQLParser.Param_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#non_reserved_keyword}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_keyword(PostgreSQLParser.Non_reserved_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#non_reserved_keyword}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_keyword(PostgreSQLParser.Non_reserved_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PostgreSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PostgreSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#todo_fill_in}.
	 * @param ctx the parse tree
	 */
	void enterTodo_fill_in(PostgreSQLParser.Todo_fill_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#todo_fill_in}.
	 * @param ctx the parse tree
	 */
	void exitTodo_fill_in(PostgreSQLParser.Todo_fill_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#todo_implement}.
	 * @param ctx the parse tree
	 */
	void enterTodo_implement(PostgreSQLParser.Todo_implementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#todo_implement}.
	 * @param ctx the parse tree
	 */
	void exitTodo_implement(PostgreSQLParser.Todo_implementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#correlation_name}.
	 * @param ctx the parse tree
	 */
	void enterCorrelation_name(PostgreSQLParser.Correlation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#correlation_name}.
	 * @param ctx the parse tree
	 */
	void exitCorrelation_name(PostgreSQLParser.Correlation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(PostgreSQLParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(PostgreSQLParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(PostgreSQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(PostgreSQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(PostgreSQLParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(PostgreSQLParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#window_name}.
	 * @param ctx the parse tree
	 */
	void enterWindow_name(PostgreSQLParser.Window_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#window_name}.
	 * @param ctx the parse tree
	 */
	void exitWindow_name(PostgreSQLParser.Window_nameContext ctx);
}