// Generated from antlr4-grammar-vsql/antlr4-grammar-vsql/src/main/antlr4/VSqlParser.g4 by ANTLR 4.9.3
package org.antlr.sql.dialects.vsql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VSqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VSqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(VSqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(VSqlParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VSqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_access_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_access_policy_statement(VSqlParser.Alter_access_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_authentication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authentication_statement(VSqlParser.Alter_authentication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_database_drop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database_drop_statement(VSqlParser.Alter_database_drop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_fault_group_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fault_group_statement(VSqlParser.Alter_fault_group_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function_statement(VSqlParser.Alter_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_hcatalog_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_hcatalog_schema_statement(VSqlParser.Alter_hcatalog_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_library_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_library_statement(VSqlParser.Alter_library_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_model_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_model_statement(VSqlParser.Alter_model_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_network_interface_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_network_interface_statement(VSqlParser.Alter_network_interface_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_node_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_node_statement(VSqlParser.Alter_node_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_notfifier_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_notfifier_statement(VSqlParser.Alter_notfifier_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#notifier_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifier_params(VSqlParser.Notifier_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_projection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_projection_statement(VSqlParser.Alter_projection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_profile_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_profile_statement(VSqlParser.Alter_profile_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_profile_rename_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_profile_rename_statement(VSqlParser.Alter_profile_rename_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_resource_pool_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_resource_pool_statement(VSqlParser.Alter_resource_pool_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#resource_pool_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource_pool_param(VSqlParser.Resource_pool_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_role_rename_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_role_rename_statement(VSqlParser.Alter_role_rename_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_statement(VSqlParser.Alter_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence_statement(VSqlParser.Alter_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#sequence_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_params(VSqlParser.Sequence_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_session_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_session_statement(VSqlParser.Alter_session_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_subnet_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_subnet_statement(VSqlParser.Alter_subnet_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_table_rename_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_rename_statement(VSqlParser.Alter_table_rename_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_table_general_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_general_statment(VSqlParser.Alter_table_general_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_item(VSqlParser.Alter_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_user_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_statement(VSqlParser.Alter_user_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#user_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_params(VSqlParser.User_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alter_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view_statement(VSqlParser.Alter_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#todo_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTodo_statement(VSqlParser.Todo_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#begin_transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_transaction_statement(VSqlParser.Begin_transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_statement(VSqlParser.Comment_on_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_column_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_column_statement(VSqlParser.Comment_on_column_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_constraint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_constraint_statement(VSqlParser.Comment_on_constraint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_function_statement(VSqlParser.Comment_on_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_transform_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_transform_function_statement(VSqlParser.Comment_on_transform_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_library_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_library_statement(VSqlParser.Comment_on_library_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_node_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_node_statement(VSqlParser.Comment_on_node_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_schema_statement(VSqlParser.Comment_on_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_sequence_statement(VSqlParser.Comment_on_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_table_statement(VSqlParser.Comment_on_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_view_statement(VSqlParser.Comment_on_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_on_projection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_projection_statement(VSqlParser.Comment_on_projection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comment_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_value(VSqlParser.Comment_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#commit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_statement(VSqlParser.Commit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#connect_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnect_statement(VSqlParser.Connect_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#copy_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_column(VSqlParser.Copy_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#column_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_option(VSqlParser.Column_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(VSqlParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#local_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_path(VSqlParser.Local_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#inputFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputFormat(VSqlParser.InputFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#vertica_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVertica_source(VSqlParser.Vertica_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#udl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdl_clause(VSqlParser.Udl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#copy_statement_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_statement_option(VSqlParser.Copy_statement_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#copy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_statement(VSqlParser.Copy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#copy_local_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_local_statement(VSqlParser.Copy_local_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#copy_from_vertica_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_vertica_statement(VSqlParser.Copy_from_vertica_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_access_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_access_policy_statement(VSqlParser.Create_access_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_authentication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_authentication_statement(VSqlParser.Create_authentication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_branch_statement(VSqlParser.Create_branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_external_table_as_copy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_table_as_copy_statement(VSqlParser.Create_external_table_as_copy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_fault_group_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fault_group_statement(VSqlParser.Create_fault_group_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_flex_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_flex_table_statement(VSqlParser.Create_flex_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_flex_external_table_as_copy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_flex_external_table_as_copy_statement(VSqlParser.Create_flex_external_table_as_copy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_function_statements_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_statements_statement(VSqlParser.Create_function_statements_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_or_replace_transform_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_replace_transform_function_statement(VSqlParser.Create_or_replace_transform_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_or_replace_source_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_replace_source_function_statement(VSqlParser.Create_or_replace_source_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_or_replace_parser_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_replace_parser_function_statement(VSqlParser.Create_or_replace_parser_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_or_replace_udf_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_replace_udf_function_statement(VSqlParser.Create_or_replace_udf_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_or_replace_sql_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_replace_sql_function_statement(VSqlParser.Create_or_replace_sql_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#expreDefininition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpreDefininition(VSqlParser.ExpreDefininitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_or_replace_filter_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_replace_filter_statement(VSqlParser.Create_or_replace_filter_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_or_replace_analytic_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_replace_analytic_function_statement(VSqlParser.Create_or_replace_analytic_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_or_replace_aggregate_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_replace_aggregate_function_statement(VSqlParser.Create_or_replace_aggregate_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_hcatalog_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_hcatalog_schema_statement(VSqlParser.Create_hcatalog_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#hcatalog_schema_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHcatalog_schema_param(VSqlParser.Hcatalog_schema_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_library_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_library_statement(VSqlParser.Create_library_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_load_balance_group_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_load_balance_group_statement(VSqlParser.Create_load_balance_group_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_local_temporary_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temporary_view_statement(VSqlParser.Create_local_temporary_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_location_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_location_statement(VSqlParser.Create_location_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_network_address_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_network_address_statement(VSqlParser.Create_network_address_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_network_interface_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_network_interface_statement(VSqlParser.Create_network_interface_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_notifier_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_notifier_statement(VSqlParser.Create_notifier_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_procedure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_statement(VSqlParser.Create_procedure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#argument_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_list(VSqlParser.Argument_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#argument_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_item(VSqlParser.Argument_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_profile_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_profile_statement(VSqlParser.Create_profile_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#projection_clause_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection_clause_item(VSqlParser.Projection_clause_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#ksafe_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKsafe_clause(VSqlParser.Ksafe_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#ifNotExistsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExistsClause(VSqlParser.IfNotExistsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_projection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_projection_statement(VSqlParser.Create_projection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_projection_live_aggregate_projections_statement(VSqlParser.Create_projection_live_aggregate_projections_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_gr_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_projection_live_aggregate_projections_gr_statement(VSqlParser.Create_projection_live_aggregate_projections_gr_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_projection_live_aggregate_projections_topk_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_projection_live_aggregate_projections_topk_statement(VSqlParser.Create_projection_live_aggregate_projections_topk_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_projection_udtfs_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_projection_udtfs_statement(VSqlParser.Create_projection_udtfs_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(VSqlParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#batch_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch_query(VSqlParser.Batch_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#prepass_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepass_query(VSqlParser.Prepass_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_resource_pool_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_resource_pool_statement(VSqlParser.Create_resource_pool_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_role_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_role_statement(VSqlParser.Create_role_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_routing_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routing_rule_statement(VSqlParser.Create_routing_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema_statement(VSqlParser.Create_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence_statement(VSqlParser.Create_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_subnet_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_subnet_statement(VSqlParser.Create_subnet_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement(VSqlParser.Create_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#schema_privileges_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_privileges_clause(VSqlParser.Schema_privileges_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_as_statement(VSqlParser.Create_table_as_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(VSqlParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#column_name_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list_item(VSqlParser.Column_name_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#access_rank}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_rank(VSqlParser.Access_rankContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grouped_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouped_clause(VSqlParser.Grouped_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_table_like_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_like_statement(VSqlParser.Create_table_like_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_table_default_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_default_statement(VSqlParser.Create_table_default_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(VSqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#column_definition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition_list(VSqlParser.Column_definition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(VSqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(VSqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#load_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoad_method(VSqlParser.Load_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#segmentation_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSegmentation_clause(VSqlParser.Segmentation_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_temporary_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_temporary_table_statement(VSqlParser.Create_temporary_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_temporary_table_with_def_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_temporary_table_with_def_statement(VSqlParser.Create_temporary_table_with_def_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_temporary_table_from_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_temporary_table_from_table_statement(VSqlParser.Create_temporary_table_from_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#encodedBy_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncodedBy_clause(VSqlParser.EncodedBy_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#column_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_ref(VSqlParser.Column_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_text_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_text_index_statement(VSqlParser.Create_text_index_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_user_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_statement(VSqlParser.Create_user_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_statement(VSqlParser.Create_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(VSqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#directed_query_statements_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirected_query_statements_statement(VSqlParser.Directed_query_statements_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#activate_directed_query_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActivate_directed_query_statement(VSqlParser.Activate_directed_query_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#create_directed_query_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_directed_query_statement(VSqlParser.Create_directed_query_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#deactivate_directed_query_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeactivate_directed_query_statement(VSqlParser.Deactivate_directed_query_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_directed_query_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_directed_query_statement(VSqlParser.Drop_directed_query_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#get_directed_query_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_directed_query_statement(VSqlParser.Get_directed_query_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#save_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSave_query(VSqlParser.Save_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#disconnect_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisconnect_statement(VSqlParser.Disconnect_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_access_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_access_policy_statement(VSqlParser.Drop_access_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_aggregate_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_aggregate_function_statement(VSqlParser.Drop_aggregate_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_authentication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_authentication_statement(VSqlParser.Drop_authentication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_branch_statement(VSqlParser.Drop_branch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_fault_group_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fault_group_statement(VSqlParser.Drop_fault_group_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function_statement(VSqlParser.Drop_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_source_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_source_statement(VSqlParser.Drop_source_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_filter_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_filter_statement(VSqlParser.Drop_filter_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_parser_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_parser_statement(VSqlParser.Drop_parser_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_model_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_model_statement(VSqlParser.Drop_model_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_library_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_library_statement(VSqlParser.Drop_library_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_load_balance_group_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_load_balance_group_statement(VSqlParser.Drop_load_balance_group_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_network_address_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_network_address_statement(VSqlParser.Drop_network_address_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_network_interface_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_network_interface_statement(VSqlParser.Drop_network_interface_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_notifier_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_notifier_statement(VSqlParser.Drop_notifier_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_procedure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure_statement(VSqlParser.Drop_procedure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_profile_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_profile_statement(VSqlParser.Drop_profile_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_projection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_projection_statement(VSqlParser.Drop_projection_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_resource_pool_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_resource_pool_statement(VSqlParser.Drop_resource_pool_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_role_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_role_statement(VSqlParser.Drop_role_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_routing_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_routing_rule_statement(VSqlParser.Drop_routing_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_schema_statement(VSqlParser.Drop_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence_statement(VSqlParser.Drop_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_subnet_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_subnet_statement(VSqlParser.Drop_subnet_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_statement(VSqlParser.Drop_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_text_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_text_index_statement(VSqlParser.Drop_text_index_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_transform_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_transform_function_statement(VSqlParser.Drop_transform_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_user_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user_statement(VSqlParser.Drop_user_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#drop_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_statement(VSqlParser.Drop_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#end_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_statement(VSqlParser.End_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#explain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_statement(VSqlParser.Explain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#export_to_parquet_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_to_parquet_statement(VSqlParser.Export_to_parquet_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#export_to_vertica_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_to_vertica_statement(VSqlParser.Export_to_vertica_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_statements_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_statements_statement(VSqlParser.Grant_statements_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_view_statement(VSqlParser.Grant_on_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_ude_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_ude_statement(VSqlParser.Grant_on_ude_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_table_statement(VSqlParser.Grant_on_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_location_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_location_statement(VSqlParser.Grant_on_location_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_sequence_statement(VSqlParser.Grant_on_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_schema_statement(VSqlParser.Grant_on_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#schema_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_privilege(VSqlParser.Schema_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_role_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_role_statement(VSqlParser.Grant_on_role_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_resourcepool_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_resourcepool_statement(VSqlParser.Grant_on_resourcepool_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_procedure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_procedure_statement(VSqlParser.Grant_on_procedure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_model_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_model_statement(VSqlParser.Grant_on_model_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_on_library_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_on_library_statement(VSqlParser.Grant_on_library_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_privileges_on_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_privileges_on_database_statement(VSqlParser.Grant_privileges_on_database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_authentication_to_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_authentication_to_statement(VSqlParser.Grant_authentication_to_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#withGrantOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithGrantOption(VSqlParser.WithGrantOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grantees}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantees(VSqlParser.GranteesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantee(VSqlParser.GranteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#grant_authentication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_authentication_statement(VSqlParser.Grant_authentication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(VSqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#insert_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_values(VSqlParser.Insert_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(VSqlParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#matchingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchingClause(VSqlParser.MatchingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#profile_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfile_statement(VSqlParser.Profile_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#release_savepoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_savepoint_statement(VSqlParser.Release_savepoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_statements_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_statements_statement(VSqlParser.Revoke_statements_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_view_statement(VSqlParser.Revoke_on_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_function_statement(VSqlParser.Revoke_on_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_table_statement(VSqlParser.Revoke_on_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_location_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_location_statement(VSqlParser.Revoke_on_location_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_sequence_statement(VSqlParser.Revoke_on_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_schema_statement(VSqlParser.Revoke_on_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_role_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_role_statement(VSqlParser.Revoke_on_role_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_resource_pool_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_resource_pool_statement(VSqlParser.Revoke_on_resource_pool_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_prodecure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_prodecure_statement(VSqlParser.Revoke_on_prodecure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_model_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_model_statement(VSqlParser.Revoke_on_model_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_library_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_library_statement(VSqlParser.Revoke_on_library_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_on_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_on_database_statement(VSqlParser.Revoke_on_database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#revoke_authentication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_authentication_statement(VSqlParser.Revoke_authentication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#rollback_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_statement(VSqlParser.Rollback_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#rollback_to_savepoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_to_savepoint_statement(VSqlParser.Rollback_to_savepoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#savepoint_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_statement(VSqlParser.Savepoint_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#with_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_statement(VSqlParser.With_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#at_epoch_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_epoch_clause(VSqlParser.At_epoch_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(VSqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_datestyle_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_datestyle_statement(VSqlParser.Set_datestyle_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_escape_string_warning_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_escape_string_warning_statement(VSqlParser.Set_escape_string_warning_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_intervalstyle_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_intervalstyle_statement(VSqlParser.Set_intervalstyle_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_locale_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_locale_statement(VSqlParser.Set_locale_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_role_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_role_statement(VSqlParser.Set_role_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_search_path_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_search_path_statement(VSqlParser.Set_search_path_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_autocommit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_autocommit_statement(VSqlParser.Set_session_autocommit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_characteristics_as_transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_characteristics_as_transaction_statement(VSqlParser.Set_session_characteristics_as_transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_graceperiod_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_graceperiod_statement(VSqlParser.Set_session_graceperiod_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_idlesessiontimeout_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_idlesessiontimeout_statement(VSqlParser.Set_session_idlesessiontimeout_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_memorycap_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_memorycap_statement(VSqlParser.Set_session_memorycap_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_multipleactiveresultsets_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_multipleactiveresultsets_statement(VSqlParser.Set_session_multipleactiveresultsets_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_resource_pool_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_resource_pool_statement(VSqlParser.Set_session_resource_pool_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_runtimecap_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_runtimecap_statement(VSqlParser.Set_session_runtimecap_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_session_tempspacecap_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_tempspacecap_statement(VSqlParser.Set_session_tempspacecap_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_standard_conforming_strings_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_standard_conforming_strings_statement(VSqlParser.Set_standard_conforming_strings_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_time_zone_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_time_zone_statement(VSqlParser.Set_time_zone_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#show_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_statement(VSqlParser.Show_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#show_current_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_current_statement(VSqlParser.Show_current_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#show_database_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_database_statement(VSqlParser.Show_database_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#show_node_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_node_statement(VSqlParser.Show_node_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#show_session_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_session_statement(VSqlParser.Show_session_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#start_transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_transaction_statement(VSqlParser.Start_transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#truncate_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_table_statement(VSqlParser.Truncate_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(VSqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#simple_select_query_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_query_clause(VSqlParser.Simple_select_query_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#select_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_query(VSqlParser.Select_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#offset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset_clause(VSqlParser.Offset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(VSqlParser.Limit_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(VSqlParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#intersect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersect_clause(VSqlParser.Intersect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(VSqlParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(VSqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(VSqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#timeseries_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeseries_clause(VSqlParser.Timeseries_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(VSqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#as_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_over_clause(VSqlParser.As_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#groupBy_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupBy_clause(VSqlParser.GroupBy_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(VSqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(VSqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(VSqlParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#match_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_clause(VSqlParser.Match_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#partition_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_clause(VSqlParser.Partition_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#encoding_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding_clause(VSqlParser.Encoding_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#owner_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner_clause(VSqlParser.Owner_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#rename_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_clause(VSqlParser.Rename_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#set_schema_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_schema_clause(VSqlParser.Set_schema_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#orderbyItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderbyItem(VSqlParser.OrderbyItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#predicates}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicates(VSqlParser.PredicatesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#tableSample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSample(VSqlParser.TableSampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#dataset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataset(VSqlParser.DatasetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(VSqlParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElements(VSqlParser.ElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(VSqlParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#el}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEl(VSqlParser.ElContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(VSqlParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#castExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpr(VSqlParser.CastExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#castOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastOperator(VSqlParser.CastOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#arrayExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(VSqlParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(VSqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#nullPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPredicate(VSqlParser.NullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#likePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(VSqlParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#joinPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinPredicate(VSqlParser.JoinPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#interpolatePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolatePredicate(VSqlParser.InterpolatePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#columnValuePredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnValuePredicate(VSqlParser.ColumnValuePredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#inPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(VSqlParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#constantExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExp(VSqlParser.ConstantExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#betweenPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(VSqlParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#booleanPredicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPredicate(VSqlParser.BooleanPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#caseExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExp(VSqlParser.CaseExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(VSqlParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(VSqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#elementWithUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementWithUsing(VSqlParser.ElementWithUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#usingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsingClause(VSqlParser.UsingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#commaSeparatedKeyValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaSeparatedKeyValuePairs(VSqlParser.CommaSeparatedKeyValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(VSqlParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#keyValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValuePair(VSqlParser.KeyValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHints(VSqlParser.HintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(VSqlParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#columnReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(VSqlParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(VSqlParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#viewReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewReference(VSqlParser.ViewReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#sourceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceReference(VSqlParser.SourceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#filterReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterReference(VSqlParser.FilterReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#parserReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserReference(VSqlParser.ParserReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#projectionReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjectionReference(VSqlParser.ProjectionReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#procedureReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureReference(VSqlParser.ProcedureReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure(VSqlParser.ProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#functionReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReference(VSqlParser.FunctionReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#libraryReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibraryReference(VSqlParser.LibraryReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#sequenceReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceReference(VSqlParser.SequenceReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#modelReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModelReference(VSqlParser.ModelReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#txtIndexReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtIndexReference(VSqlParser.TxtIndexReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#schemaReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaReference(VSqlParser.SchemaReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#dbname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbname(VSqlParser.DbnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#txtIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTxtIndex(VSqlParser.TxtIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(VSqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(VSqlParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(VSqlParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#notifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifier(VSqlParser.NotifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(VSqlParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(VSqlParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#parserName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParserName(VSqlParser.ParserNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView(VSqlParser.ViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#lb_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLb_group(VSqlParser.Lb_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#network_address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_address(VSqlParser.Network_addressContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#routingRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutingRule(VSqlParser.RoutingRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#branch_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_identifier(VSqlParser.Branch_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole(VSqlParser.RoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#lang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLang(VSqlParser.LangContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#resourcePool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourcePool(VSqlParser.ResourcePoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema(VSqlParser.SchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#udParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdParam(VSqlParser.UdParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(VSqlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(VSqlParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(VSqlParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary(VSqlParser.LibraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(VSqlParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(VSqlParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(VSqlParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(VSqlParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(VSqlParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(VSqlParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#singleChar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleChar(VSqlParser.SingleCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(VSqlParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#integerNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerNumber(VSqlParser.IntegerNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#asteriskExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsteriskExp(VSqlParser.AsteriskExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#subnet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubnet(VSqlParser.SubnetContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(VSqlParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(VSqlParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(VSqlParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#faultGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFaultGroup(VSqlParser.FaultGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#auth_method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuth_method_name(VSqlParser.Auth_method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(VSqlParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#network_interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_interface(VSqlParser.Network_interfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#profile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProfile(VSqlParser.ProfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(VSqlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(VSqlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#enableOrDisable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableOrDisable(VSqlParser.EnableOrDisableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#enabledOrDisabled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnabledOrDisabled(VSqlParser.EnabledOrDisabledContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#nullOrNotNull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullOrNotNull(VSqlParser.NullOrNotNullContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#address}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddress(VSqlParser.AddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#compressionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompressionType(VSqlParser.CompressionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#password_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword_parameter(VSqlParser.Password_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(VSqlParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOperator(VSqlParser.BitwiseOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#booleanOperators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperators(VSqlParser.BooleanOperatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#otherOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherOperator(VSqlParser.OtherOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#mathematicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathematicalOperator(VSqlParser.MathematicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(VSqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#isolationLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(VSqlParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionMode(VSqlParser.TransactionModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(VSqlParser.Bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#dataTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypes(VSqlParser.DataTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#binaryTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryTypes(VSqlParser.BinaryTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#booleanTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTypes(VSqlParser.BooleanTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#charTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharTypes(VSqlParser.CharTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#dateTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateTypes(VSqlParser.DateTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#apNumericTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApNumericTypes(VSqlParser.ApNumericTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#eNumericTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitENumericTypes(VSqlParser.ENumericTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#spatialTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatialTypes(VSqlParser.SpatialTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#uuidTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUuidTypes(VSqlParser.UuidTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#otherTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherTypes(VSqlParser.OtherTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link VSqlParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(VSqlParser.NonReservedContext ctx);
}