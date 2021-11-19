// Generated from antlr_psql/antlr4/PostgreSQLParser.g4 by ANTLR 4.9.3
package org.antlr.sql.dialects.psql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostgreSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostgreSQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(PostgreSQLParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PostgreSQLParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#abort_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbort_stmt(PostgreSQLParser.Abort_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_stmt(PostgreSQLParser.Alter_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_aggregate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_aggregate_stmt(PostgreSQLParser.Alter_aggregate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_collation_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_collation_stmt(PostgreSQLParser.Alter_collation_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_conversion_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_conversion_stmt(PostgreSQLParser.Alter_conversion_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database_stmt(PostgreSQLParser.Alter_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_default_privileges_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_default_privileges_stmt(PostgreSQLParser.Alter_default_privileges_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_domain_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_domain_stmt(PostgreSQLParser.Alter_domain_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_event_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_event_trigger_stmt(PostgreSQLParser.Alter_event_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_extension_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_stmt(PostgreSQLParser.Alter_extension_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_foreign_data_wrapper_stmt(PostgreSQLParser.Alter_foreign_data_wrapper_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_foreign_table_action(PostgreSQLParser.Alter_foreign_table_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_action_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_foreign_table_action_list(PostgreSQLParser.Alter_foreign_table_action_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_foreign_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_foreign_table_stmt(PostgreSQLParser.Alter_foreign_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function_stmt(PostgreSQLParser.Alter_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_group_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_group_stmt(PostgreSQLParser.Alter_group_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index_stmt(PostgreSQLParser.Alter_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_language_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_language_stmt(PostgreSQLParser.Alter_language_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_large_object_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_large_object_stmt(PostgreSQLParser.Alter_large_object_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_materialize_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_materialize_view_stmt(PostgreSQLParser.Alter_materialize_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_operator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_stmt(PostgreSQLParser.Alter_operator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_operator_class_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_class_stmt(PostgreSQLParser.Alter_operator_class_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_operator_family_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_family_stmt(PostgreSQLParser.Alter_operator_family_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_policy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_policy_stmt(PostgreSQLParser.Alter_policy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_publication_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_publication_stmt(PostgreSQLParser.Alter_publication_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_role_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_role_options(PostgreSQLParser.Alter_role_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_role_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_role_stmt(PostgreSQLParser.Alter_role_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_rule_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_rule_stmt(PostgreSQLParser.Alter_rule_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_stmt(PostgreSQLParser.Alter_schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_sequence_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence_stmt(PostgreSQLParser.Alter_sequence_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_server_options_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_options_list(PostgreSQLParser.Alter_server_options_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_server_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_stmt(PostgreSQLParser.Alter_server_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_statistics_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_statistics_stmt(PostgreSQLParser.Alter_statistics_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_subscription_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_subscription_stmt(PostgreSQLParser.Alter_subscription_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_system_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_system_stmt(PostgreSQLParser.Alter_system_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(PostgreSQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_tablespace_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace_stmt(PostgreSQLParser.Alter_tablespace_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_text_search_config_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_text_search_config_stmt(PostgreSQLParser.Alter_text_search_config_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_text_search_dict_stmt(PostgreSQLParser.Alter_text_search_dict_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_text_search_parser_stmt(PostgreSQLParser.Alter_text_search_parser_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_text_search_template_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_text_search_template_stmt(PostgreSQLParser.Alter_text_search_template_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger_stmt(PostgreSQLParser.Alter_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_type_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_stmt(PostgreSQLParser.Alter_type_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_user_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_stmt(PostgreSQLParser.Alter_user_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_user_mapping_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_mapping_stmt(PostgreSQLParser.Alter_user_mapping_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view_stmt(PostgreSQLParser.Alter_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(PostgreSQLParser.Analyze_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(PostgreSQLParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#cluster_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_stmt(PostgreSQLParser.Cluster_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#comment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_stmt(PostgreSQLParser.Comment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(PostgreSQLParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#commit_prepared_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_prepared_stmt(PostgreSQLParser.Commit_prepared_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#copy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_stmt(PostgreSQLParser.Copy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_stmt(PostgreSQLParser.Create_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_access_method_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_access_method_stmt(PostgreSQLParser.Create_access_method_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_aggregate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_aggregate_stmt(PostgreSQLParser.Create_aggregate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_cast_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_cast_stmt(PostgreSQLParser.Create_cast_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_collation_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_collation_opt(PostgreSQLParser.Create_collation_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_collation_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_collation_opt_list(PostgreSQLParser.Create_collation_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_collation_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_collation_stmt(PostgreSQLParser.Create_collation_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_conversion_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_conversion_stmt(PostgreSQLParser.Create_conversion_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(PostgreSQLParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraint(PostgreSQLParser.Domain_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_domain_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_domain_stmt(PostgreSQLParser.Create_domain_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_event_trigger_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_trigger_cond(PostgreSQLParser.Create_event_trigger_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_event_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_trigger_stmt(PostgreSQLParser.Create_event_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_foreign_data_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_foreign_data_options(PostgreSQLParser.Create_foreign_data_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_foreign_data_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_foreign_data_stmt(PostgreSQLParser.Create_foreign_data_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_foreign_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_foreign_table_stmt(PostgreSQLParser.Create_foreign_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(PostgreSQLParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_group_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_group_stmt(PostgreSQLParser.Create_group_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(PostgreSQLParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_language_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_language_stmt(PostgreSQLParser.Create_language_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_materialized_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_materialized_view_stmt(PostgreSQLParser.Create_materialized_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_operator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_stmt(PostgreSQLParser.Create_operator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_operator_class_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_class_opt(PostgreSQLParser.Create_operator_class_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_operator_class_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_class_stmt(PostgreSQLParser.Create_operator_class_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_operator_family_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_family_stmt(PostgreSQLParser.Create_operator_family_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_policy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_policy_stmt(PostgreSQLParser.Create_policy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_role_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_role_stmt(PostgreSQLParser.Create_role_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_rule_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_rule_event(PostgreSQLParser.Create_rule_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_rule_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_rule_stmt(PostgreSQLParser.Create_rule_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema_stmt(PostgreSQLParser.Create_schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_sequence_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence_stmt(PostgreSQLParser.Create_sequence_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_server_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_stmt(PostgreSQLParser.Create_server_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_statistics_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics_stmt(PostgreSQLParser.Create_statistics_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_subscription_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_subscription_stmt(PostgreSQLParser.Create_subscription_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(PostgreSQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_table_as_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_as_stmt(PostgreSQLParser.Create_table_as_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_tablespace_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_tablespace_stmt(PostgreSQLParser.Create_tablespace_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_text_search_config_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_text_search_config_stmt(PostgreSQLParser.Create_text_search_config_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_text_search_dict_stmt(PostgreSQLParser.Create_text_search_dict_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_text_search_parser_stmt(PostgreSQLParser.Create_text_search_parser_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_text_search_template_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_text_search_template_stmt(PostgreSQLParser.Create_text_search_template_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_transform_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_transform_stmt(PostgreSQLParser.Create_transform_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(PostgreSQLParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_type_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_stmt(PostgreSQLParser.Create_type_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_user_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_stmt(PostgreSQLParser.Create_user_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_user_mapping_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_mapping_stmt(PostgreSQLParser.Create_user_mapping_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(PostgreSQLParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#deallocate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocate_stmt(PostgreSQLParser.Deallocate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(PostgreSQLParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(PostgreSQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#discard_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiscard_stmt(PostgreSQLParser.Discard_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(PostgreSQLParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_access_method_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_access_method_stmt(PostgreSQLParser.Drop_access_method_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_aggregate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_aggregate_stmt(PostgreSQLParser.Drop_aggregate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_cast_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_cast_stmt(PostgreSQLParser.Drop_cast_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_collation_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_collation_stmt(PostgreSQLParser.Drop_collation_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_conversion_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_conversion_stmt(PostgreSQLParser.Drop_conversion_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_stmt(PostgreSQLParser.Drop_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_domain_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_domain_stmt(PostgreSQLParser.Drop_domain_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_event_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_event_trigger_stmt(PostgreSQLParser.Drop_event_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_extension_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_extension_stmt(PostgreSQLParser.Drop_extension_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_foreign_data_wrapper_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_foreign_data_wrapper_stmt(PostgreSQLParser.Drop_foreign_data_wrapper_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_foreign_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_foreign_table_stmt(PostgreSQLParser.Drop_foreign_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function_stmt(PostgreSQLParser.Drop_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_group_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_group_stmt(PostgreSQLParser.Drop_group_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(PostgreSQLParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_language_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_language_stmt(PostgreSQLParser.Drop_language_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_materialized_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_materialized_view_stmt(PostgreSQLParser.Drop_materialized_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_operator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_stmt(PostgreSQLParser.Drop_operator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_operator_class_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_class_stmt(PostgreSQLParser.Drop_operator_class_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_operator_family_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_family_stmt(PostgreSQLParser.Drop_operator_family_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_owned_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_owned_stmt(PostgreSQLParser.Drop_owned_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_policy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_policy_stmt(PostgreSQLParser.Drop_policy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_publication_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_publication_stmt(PostgreSQLParser.Drop_publication_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_role_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_role_stmt(PostgreSQLParser.Drop_role_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_rule_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_rule_stmt(PostgreSQLParser.Drop_rule_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_schema_stmt(PostgreSQLParser.Drop_schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_sequence_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence_stmt(PostgreSQLParser.Drop_sequence_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_server_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_stmt(PostgreSQLParser.Drop_server_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_statistics_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics_stmt(PostgreSQLParser.Drop_statistics_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_subscription_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_subscription_stmt(PostgreSQLParser.Drop_subscription_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(PostgreSQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_tablespace_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_tablespace_stmt(PostgreSQLParser.Drop_tablespace_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_text_search_config_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_text_search_config_stmt(PostgreSQLParser.Drop_text_search_config_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_text_search_dict_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_text_search_dict_stmt(PostgreSQLParser.Drop_text_search_dict_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_text_search_parser_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_text_search_parser_stmt(PostgreSQLParser.Drop_text_search_parser_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_text_search_template_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_text_search_template_stmt(PostgreSQLParser.Drop_text_search_template_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_transform_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_transform_stmt(PostgreSQLParser.Drop_transform_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(PostgreSQLParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_type_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type_stmt(PostgreSQLParser.Drop_type_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_user_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user_stmt(PostgreSQLParser.Drop_user_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_user_mapping_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user_mapping_stmt(PostgreSQLParser.Drop_user_mapping_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(PostgreSQLParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_stmt(PostgreSQLParser.Execute_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#explain_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_stmt(PostgreSQLParser.Explain_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(PostgreSQLParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grant_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt(PostgreSQLParser.Grant_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#import_foreign_schema_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_foreign_schema_stmt(PostgreSQLParser.Import_foreign_schema_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(PostgreSQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#listen_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListen_stmt(PostgreSQLParser.Listen_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#load_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad_stmt(PostgreSQLParser.Load_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#lock_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_stmt(PostgreSQLParser.Lock_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#move_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMove_stmt(PostgreSQLParser.Move_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_stmt(PostgreSQLParser.Notify_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#prepare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare_stmt(PostgreSQLParser.Prepare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#prepare_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepare_transaction_stmt(PostgreSQLParser.Prepare_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#reassign_owned_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReassign_owned_stmt(PostgreSQLParser.Reassign_owned_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#refresh_materialized_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefresh_materialized_view_stmt(PostgreSQLParser.Refresh_materialized_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(PostgreSQLParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#release_savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_savepoint_stmt(PostgreSQLParser.Release_savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#reset_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReset_stmt(PostgreSQLParser.Reset_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#revoke_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_stmt(PostgreSQLParser.Revoke_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(PostgreSQLParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#rollback_prepared_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_prepared_stmt(PostgreSQLParser.Rollback_prepared_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#rollback_to_savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_to_savepoint_stmt(PostgreSQLParser.Rollback_to_savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(PostgreSQLParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#security_label_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label_stmt(PostgreSQLParser.Security_label_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_into_stmt(PostgreSQLParser.Select_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(PostgreSQLParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expr(PostgreSQLParser.With_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_stmt(PostgreSQLParser.Set_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_constraints_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_constraints_stmt(PostgreSQLParser.Set_constraints_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_role_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_role_stmt(PostgreSQLParser.Set_role_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_session_authorization_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_authorization_stmt(PostgreSQLParser.Set_session_authorization_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode(PostgreSQLParser.Transaction_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#transaction_mode_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode_list(PostgreSQLParser.Transaction_mode_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_transaction_stmt(PostgreSQLParser.Set_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#show_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_stmt(PostgreSQLParser.Show_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(PostgreSQLParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#unlisten_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlisten_stmt(PostgreSQLParser.Unlisten_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(PostgreSQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vacuum_opt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_opt(PostgreSQLParser.Vacuum_optContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vacuum_opt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_opt_list(PostgreSQLParser.Vacuum_opt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(PostgreSQLParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#values_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_stmt(PostgreSQLParser.Values_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#selector_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector_clause(PostgreSQLParser.Selector_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PostgreSQLParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PostgreSQLParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(PostgreSQLParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grouping_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_elem(PostgreSQLParser.Grouping_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grouping_elem_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_elem_list(PostgreSQLParser.Grouping_elem_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(PostgreSQLParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(PostgreSQLParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#explain_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_parameter(PostgreSQLParser.Explain_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame(PostgreSQLParser.FrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_start(PostgreSQLParser.Frame_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_end(PostgreSQLParser.Frame_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#window_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_clause(PostgreSQLParser.Window_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#combine_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombine_clause(PostgreSQLParser.Combine_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(PostgreSQLParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#order_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_item(PostgreSQLParser.Order_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(PostgreSQLParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(PostgreSQLParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#fetch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_clause(PostgreSQLParser.Fetch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(PostgreSQLParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#updater_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdater_clause(PostgreSQLParser.Updater_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#updater_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdater_expr(PostgreSQLParser.Updater_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#returning_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturning_clause(PostgreSQLParser.Returning_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PostgreSQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(PostgreSQLParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#case_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expr(PostgreSQLParser.Case_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(PostgreSQLParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#expr_list_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_list(PostgreSQLParser.Expr_list_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#func_sig_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_sig_arg(PostgreSQLParser.Func_sig_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#func_sig_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_sig_arg_list(PostgreSQLParser.Func_sig_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#func_sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_sig(PostgreSQLParser.Func_sigContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#func_sig_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_sig_list(PostgreSQLParser.Func_sig_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(PostgreSQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#timezone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimezone(PostgreSQLParser.TimezoneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#oper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOper(PostgreSQLParser.OperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate(PostgreSQLParser.AggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#name_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_(PostgreSQLParser.Name_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_list(PostgreSQLParser.Name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(PostgreSQLParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#option_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_expr(PostgreSQLParser.Option_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_list(PostgreSQLParser.Option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_name_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_(PostgreSQLParser.Table_name_Context ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#data_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_list(PostgreSQLParser.Data_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_method(PostgreSQLParser.Index_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(PostgreSQLParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(PostgreSQLParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#array_cons_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_cons_expr(PostgreSQLParser.Array_cons_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_column_alias(PostgreSQLParser.With_column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(PostgreSQLParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(PostgreSQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(PostgreSQLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#aggregate_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_signature(PostgreSQLParser.Aggregate_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(PostgreSQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraints(PostgreSQLParser.Column_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#exclude_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclude_element(PostgreSQLParser.Exclude_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(PostgreSQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#role_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name(PostgreSQLParser.Role_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#role_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name_list(PostgreSQLParser.Role_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#param_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_value(PostgreSQLParser.Param_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#non_reserved_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_keyword(PostgreSQLParser.Non_reserved_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PostgreSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#todo_fill_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodo_fill_in(PostgreSQLParser.Todo_fill_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#todo_implement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodo_implement(PostgreSQLParser.Todo_implementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#correlation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorrelation_name(PostgreSQLParser.Correlation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(PostgreSQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(PostgreSQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(PostgreSQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(PostgreSQLParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#window_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_name(PostgreSQLParser.Window_nameContext ctx);
}