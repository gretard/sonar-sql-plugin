// Generated from java-escape by ANTLR 4.11.1
package org.antlr.sql.dialects.snowflake;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SnowflakeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SnowflakeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#snowflake_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnowflake_file(SnowflakeParser.Snowflake_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch(SnowflakeParser.BatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#sql_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_command(SnowflakeParser.Sql_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#ddl_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_command(SnowflakeParser.Ddl_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#dml_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_command(SnowflakeParser.Dml_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(SnowflakeParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#insert_multi_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_multi_table_statement(SnowflakeParser.Insert_multi_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#into_clause2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause2(SnowflakeParser.Into_clause2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#values_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_list(SnowflakeParser.Values_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#value_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_item(SnowflakeParser.Value_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(SnowflakeParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#merge_matches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_matches(SnowflakeParser.Merge_matchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#merge_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_cond(SnowflakeParser.Merge_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#merge_update_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_update_delete(SnowflakeParser.Merge_update_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#merge_insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_insert(SnowflakeParser.Merge_insertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(SnowflakeParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#table_or_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_query(SnowflakeParser.Table_or_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(SnowflakeParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#values_builder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_builder(SnowflakeParser.Values_builderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#other_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_command(SnowflakeParser.Other_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#begin_txn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_txn(SnowflakeParser.Begin_txnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#copy_into_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_into_table(SnowflakeParser.Copy_into_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#external_location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_location(SnowflakeParser.External_locationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#files}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiles(SnowflakeParser.FilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_format(SnowflakeParser.File_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#format_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_name(SnowflakeParser.Format_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#format_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_type(SnowflakeParser.Format_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stage_file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_file_format(SnowflakeParser.Stage_file_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#copy_into_location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_into_location(SnowflakeParser.Copy_into_locationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(SnowflakeParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_signature(SnowflakeParser.Function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit(SnowflakeParser.CommitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#execute_immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_immediate(SnowflakeParser.Execute_immediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#execute_task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_task(SnowflakeParser.Execute_taskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(SnowflakeParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#parallel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel(SnowflakeParser.ParallelContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#get_dml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_dml(SnowflakeParser.Get_dmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#grant_ownership}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_ownership(SnowflakeParser.Grant_ownershipContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#grant_to_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_to_role(SnowflakeParser.Grant_to_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#global_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_privileges(SnowflakeParser.Global_privilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#global_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_privilege(SnowflakeParser.Global_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#account_object_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccount_object_privileges(SnowflakeParser.Account_object_privilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#account_object_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccount_object_privilege(SnowflakeParser.Account_object_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#schema_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_privileges(SnowflakeParser.Schema_privilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#schema_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_privilege(SnowflakeParser.Schema_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#schema_object_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_object_privileges(SnowflakeParser.Schema_object_privilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#schema_object_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_object_privilege(SnowflakeParser.Schema_object_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#grant_to_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_to_share(SnowflakeParser.Grant_to_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_privilege(SnowflakeParser.Object_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#grant_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_role(SnowflakeParser.Grant_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#role_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name(SnowflakeParser.Role_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#system_defined_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_defined_role(SnowflakeParser.System_defined_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(SnowflakeParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#internal_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternal_stage(SnowflakeParser.Internal_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#external_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_stage(SnowflakeParser.External_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#put}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPut(SnowflakeParser.PutContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove(SnowflakeParser.RemoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#revoke_from_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_from_role(SnowflakeParser.Revoke_from_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#revoke_from_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_from_share(SnowflakeParser.Revoke_from_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#revoke_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_role(SnowflakeParser.Revoke_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback(SnowflakeParser.RollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(SnowflakeParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#truncate_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_materialized_view(SnowflakeParser.Truncate_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#truncate_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_table(SnowflakeParser.Truncate_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#unset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnset(SnowflakeParser.UnsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_command(SnowflakeParser.Alter_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#account_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccount_params(SnowflakeParser.Account_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_params(SnowflakeParser.Object_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#default_ddl_collation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_ddl_collation(SnowflakeParser.Default_ddl_collationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_properties(SnowflakeParser.Object_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#session_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_params(SnowflakeParser.Session_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_account}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_account(SnowflakeParser.Alter_accountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#enabled_true_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnabled_true_false(SnowflakeParser.Enabled_true_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_alert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_alert(SnowflakeParser.Alter_alertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#resume_suspend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResume_suspend(SnowflakeParser.Resume_suspendContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alert_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlert_set_clause(SnowflakeParser.Alert_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alert_unset_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlert_unset_clause(SnowflakeParser.Alert_unset_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_api_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_api_integration(SnowflakeParser.Alter_api_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#api_integration_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApi_integration_property(SnowflakeParser.Api_integration_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_connection(SnowflakeParser.Alter_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(SnowflakeParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#database_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_property(SnowflakeParser.Database_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#account_id_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccount_id_list(SnowflakeParser.Account_id_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_dynamic_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_dynamic_table(SnowflakeParser.Alter_dynamic_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_external_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_table(SnowflakeParser.Alter_external_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#ignore_edition_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore_edition_check(SnowflakeParser.Ignore_edition_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#replication_schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplication_schedule(SnowflakeParser.Replication_scheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#db_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_name_list(SnowflakeParser.Db_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#share_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShare_name_list(SnowflakeParser.Share_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#full_acct_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_acct_list(SnowflakeParser.Full_acct_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_failover_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_failover_group(SnowflakeParser.Alter_failover_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_file_format(SnowflakeParser.Alter_file_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function(SnowflakeParser.Alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_function_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function_signature(SnowflakeParser.Alter_function_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#data_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_list(SnowflakeParser.Data_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_masking_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_masking_policy(SnowflakeParser.Alter_masking_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_materialized_view(SnowflakeParser.Alter_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_network_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_network_policy(SnowflakeParser.Alter_network_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_notification_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_notification_integration(SnowflakeParser.Alter_notification_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_pipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_pipe(SnowflakeParser.Alter_pipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_procedure(SnowflakeParser.Alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_replication_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_replication_group(SnowflakeParser.Alter_replication_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#credit_quota}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCredit_quota(SnowflakeParser.Credit_quotaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#frequency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrequency(SnowflakeParser.FrequencyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#notify_users}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_users(SnowflakeParser.Notify_usersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#triggerDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerDefinition(SnowflakeParser.TriggerDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_resource_monitor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_resource_monitor(SnowflakeParser.Alter_resource_monitorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_role(SnowflakeParser.Alter_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_row_access_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_row_access_policy(SnowflakeParser.Alter_row_access_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema(SnowflakeParser.Alter_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#schema_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_property(SnowflakeParser.Schema_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(SnowflakeParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_security_integration_external_oauth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_security_integration_external_oauth(SnowflakeParser.Alter_security_integration_external_oauthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#security_integration_external_oauth_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_integration_external_oauth_property(SnowflakeParser.Security_integration_external_oauth_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_security_integration_snowflake_oauth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_security_integration_snowflake_oauth(SnowflakeParser.Alter_security_integration_snowflake_oauthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#security_integration_snowflake_oauth_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_integration_snowflake_oauth_property(SnowflakeParser.Security_integration_snowflake_oauth_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_security_integration_saml2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_security_integration_saml2(SnowflakeParser.Alter_security_integration_saml2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_security_integration_scim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_security_integration_scim(SnowflakeParser.Alter_security_integration_scimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#security_integration_scim_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_integration_scim_property(SnowflakeParser.Security_integration_scim_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_session(SnowflakeParser.Alter_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_session_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_session_policy(SnowflakeParser.Alter_session_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_share(SnowflakeParser.Alter_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_storage_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_storage_integration(SnowflakeParser.Alter_storage_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_stream(SnowflakeParser.Alter_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(SnowflakeParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#clustering_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustering_action(SnowflakeParser.Clustering_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#table_column_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_action(SnowflakeParser.Table_column_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_column_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_clause(SnowflakeParser.Alter_column_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#inline_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInline_constraint(SnowflakeParser.Inline_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#enforced_not_enforced}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnforced_not_enforced(SnowflakeParser.Enforced_not_enforcedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#deferrable_not_deferrable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeferrable_not_deferrable(SnowflakeParser.Deferrable_not_deferrableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#initially_deferred_or_immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitially_deferred_or_immediate(SnowflakeParser.Initially_deferred_or_immediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#common_constraint_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_constraint_properties(SnowflakeParser.Common_constraint_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#on_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_update(SnowflakeParser.On_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#on_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete(SnowflakeParser.On_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#foreign_key_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_match(SnowflakeParser.Foreign_key_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#on_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_action(SnowflakeParser.On_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#constraint_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_properties(SnowflakeParser.Constraint_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#ext_table_column_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExt_table_column_action(SnowflakeParser.Ext_table_column_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#constraint_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_action(SnowflakeParser.Constraint_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#search_optimization_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_optimization_action(SnowflakeParser.Search_optimization_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#search_method_with_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_method_with_target(SnowflakeParser.Search_method_with_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_table_alter_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_alter_column(SnowflakeParser.Alter_table_alter_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_column_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_decl_list(SnowflakeParser.Alter_column_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_column_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_decl(SnowflakeParser.Alter_column_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_column_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_opts(SnowflakeParser.Alter_column_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_set_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_set_tags(SnowflakeParser.Column_set_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_unset_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_unset_tags(SnowflakeParser.Column_unset_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tag(SnowflakeParser.Alter_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_task(SnowflakeParser.Alter_taskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user(SnowflakeParser.Alter_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view(SnowflakeParser.Alter_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_modify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_modify(SnowflakeParser.Alter_modifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_warehouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_warehouse(SnowflakeParser.Alter_warehouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_connection_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_connection_opts(SnowflakeParser.Alter_connection_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_user_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_opts(SnowflakeParser.Alter_user_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_tag_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tag_opts(SnowflakeParser.Alter_tag_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_network_policy_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_network_policy_opts(SnowflakeParser.Alter_network_policy_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_warehouse_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_warehouse_opts(SnowflakeParser.Alter_warehouse_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_account_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_account_opts(SnowflakeParser.Alter_account_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#set_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_tags(SnowflakeParser.Set_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#tag_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_decl_list(SnowflakeParser.Tag_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#unset_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnset_tags(SnowflakeParser.Unset_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_command(SnowflakeParser.Create_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_account}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_account(SnowflakeParser.Create_accountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_alert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_alert(SnowflakeParser.Create_alertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alert_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlert_condition(SnowflakeParser.Alert_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alert_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlert_action(SnowflakeParser.Alert_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_api_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_api_integration(SnowflakeParser.Create_api_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_object_clone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_object_clone(SnowflakeParser.Create_object_cloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_connection(SnowflakeParser.Create_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(SnowflakeParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#clone_at_before}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClone_at_before(SnowflakeParser.Clone_at_beforeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#at_before1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_before1(SnowflakeParser.At_before1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#header_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_decl(SnowflakeParser.Header_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#compression_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompression_type(SnowflakeParser.Compression_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#compression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompression(SnowflakeParser.CompressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_dynamic_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_dynamic_table(SnowflakeParser.Create_dynamic_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_event_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_table(SnowflakeParser.Create_event_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_external_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_function(SnowflakeParser.Create_external_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_external_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_table(SnowflakeParser.Create_external_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#external_table_column_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_table_column_decl(SnowflakeParser.External_table_column_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#external_table_column_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_table_column_decl_list(SnowflakeParser.External_table_column_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#full_acct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_acct(SnowflakeParser.Full_acctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#integration_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegration_type_name(SnowflakeParser.Integration_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_failover_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_failover_group(SnowflakeParser.Create_failover_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#type_fileformat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_fileformat(SnowflakeParser.Type_fileformatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_file_format(SnowflakeParser.Create_file_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#arg_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_decl(SnowflakeParser.Arg_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#arg_default_value_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_default_value_clause(SnowflakeParser.Arg_default_value_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#col_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_decl(SnowflakeParser.Col_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(SnowflakeParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function(SnowflakeParser.Create_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_managed_account}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_managed_account(SnowflakeParser.Create_managed_accountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_masking_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_masking_policy(SnowflakeParser.Create_masking_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#tag_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_decl(SnowflakeParser.Tag_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_list_in_parentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list_in_parentheses(SnowflakeParser.Column_list_in_parenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_materialized_view(SnowflakeParser.Create_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_network_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_network_policy(SnowflakeParser.Create_network_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#cloud_provider_params_auto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloud_provider_params_auto(SnowflakeParser.Cloud_provider_params_autoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#cloud_provider_params_push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloud_provider_params_push(SnowflakeParser.Cloud_provider_params_pushContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_notification_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_notification_integration(SnowflakeParser.Create_notification_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_pipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_pipe(SnowflakeParser.Create_pipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#caller_owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaller_owner(SnowflakeParser.Caller_ownerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#executa_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuta_as(SnowflakeParser.Executa_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#procedure_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_definition(SnowflakeParser.Procedure_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_null(SnowflakeParser.Not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure(SnowflakeParser.Create_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_replication_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_replication_group(SnowflakeParser.Create_replication_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_resource_monitor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_resource_monitor(SnowflakeParser.Create_resource_monitorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_role(SnowflakeParser.Create_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_row_access_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_row_access_policy(SnowflakeParser.Create_row_access_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema(SnowflakeParser.Create_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_security_integration_external_oauth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_security_integration_external_oauth(SnowflakeParser.Create_security_integration_external_oauthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#implicit_none}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicit_none(SnowflakeParser.Implicit_noneContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_security_integration_snowflake_oauth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_security_integration_snowflake_oauth(SnowflakeParser.Create_security_integration_snowflake_oauthContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_security_integration_saml2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_security_integration_saml2(SnowflakeParser.Create_security_integration_saml2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_security_integration_scim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_security_integration_scim(SnowflakeParser.Create_security_integration_scimContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#network_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_policy(SnowflakeParser.Network_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#partner_application}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_application(SnowflakeParser.Partner_applicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#start_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_with(SnowflakeParser.Start_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#increment_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_by(SnowflakeParser.Increment_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(SnowflakeParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_session_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_session_policy(SnowflakeParser.Create_session_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_share(SnowflakeParser.Create_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#character}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter(SnowflakeParser.CharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#format_type_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_type_options(SnowflakeParser.Format_type_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#copy_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_options(SnowflakeParser.Copy_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_internal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_encryption_opts_internal(SnowflakeParser.Stage_encryption_opts_internalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stage_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_type(SnowflakeParser.Stage_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stage_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_master_key(SnowflakeParser.Stage_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stage_kms_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_kms_key(SnowflakeParser.Stage_kms_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_aws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_encryption_opts_aws(SnowflakeParser.Stage_encryption_opts_awsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#aws_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAws_token(SnowflakeParser.Aws_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#aws_key_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAws_key_id(SnowflakeParser.Aws_key_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#aws_secret_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAws_secret_key(SnowflakeParser.Aws_secret_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#aws_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAws_role(SnowflakeParser.Aws_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#azure_encryption_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAzure_encryption_value(SnowflakeParser.Azure_encryption_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_az}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_encryption_opts_az(SnowflakeParser.Stage_encryption_opts_azContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#storage_integration_eq_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_integration_eq_id(SnowflakeParser.Storage_integration_eq_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#az_credential_or_storage_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAz_credential_or_storage_integration(SnowflakeParser.Az_credential_or_storage_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#gcp_encryption_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGcp_encryption_value(SnowflakeParser.Gcp_encryption_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_gcp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStage_encryption_opts_gcp(SnowflakeParser.Stage_encryption_opts_gcpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#aws_credential_or_storage_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAws_credential_or_storage_integration(SnowflakeParser.Aws_credential_or_storage_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#external_stage_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_stage_params(SnowflakeParser.External_stage_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#true_false}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue_false(SnowflakeParser.True_falseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable(SnowflakeParser.EnableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#refresh_on_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefresh_on_create(SnowflakeParser.Refresh_on_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#auto_refresh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_refresh(SnowflakeParser.Auto_refreshContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#notification_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotification_integration(SnowflakeParser.Notification_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#directory_table_internal_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectory_table_internal_params(SnowflakeParser.Directory_table_internal_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#directory_table_external_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectory_table_external_params(SnowflakeParser.Directory_table_external_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_stage(SnowflakeParser.Create_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alter_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_stage(SnowflakeParser.Alter_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stage(SnowflakeParser.Drop_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stage(SnowflakeParser.Describe_stageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_stages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_stages(SnowflakeParser.Show_stagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#cloud_provider_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloud_provider_params(SnowflakeParser.Cloud_provider_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#cloud_provider_params2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloud_provider_params2(SnowflakeParser.Cloud_provider_params2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#cloud_provider_params3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloud_provider_params3(SnowflakeParser.Cloud_provider_params3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_storage_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_storage_integration(SnowflakeParser.Create_storage_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#copy_grants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_grants(SnowflakeParser.Copy_grantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#append_only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppend_only(SnowflakeParser.Append_onlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#insert_only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_only(SnowflakeParser.Insert_onlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_initial_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_initial_rows(SnowflakeParser.Show_initial_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#stream_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_time(SnowflakeParser.Stream_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_stream(SnowflakeParser.Create_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#temporary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporary(SnowflakeParser.TemporaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#table_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type(SnowflakeParser.Table_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#with_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_tags(SnowflakeParser.With_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#with_row_access_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_row_access_policy(SnowflakeParser.With_row_access_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#cluster_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_by(SnowflakeParser.Cluster_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#change_tracking}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking(SnowflakeParser.Change_trackingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#with_masking_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_masking_policy(SnowflakeParser.With_masking_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#collate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate(SnowflakeParser.CollateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#order_noorder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_noorder(SnowflakeParser.Order_noorderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(SnowflakeParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key(SnowflakeParser.Foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_key(SnowflakeParser.Primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut_of_line_constraint(SnowflakeParser.Out_of_line_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#full_col_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_col_decl(SnowflakeParser.Full_col_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_decl_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_decl_item(SnowflakeParser.Column_decl_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_decl_item_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_decl_item_list(SnowflakeParser.Column_decl_item_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(SnowflakeParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_decl_item_list_paren}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_decl_item_list_paren(SnowflakeParser.Column_decl_item_list_parenContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_clause(SnowflakeParser.Create_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_table_as_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_as_select(SnowflakeParser.Create_table_as_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_table_like}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_like(SnowflakeParser.Create_table_likeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_tag(SnowflakeParser.Create_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#tag_allowed_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_allowed_values(SnowflakeParser.Tag_allowed_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#session_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_parameter(SnowflakeParser.Session_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#session_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_parameter_list(SnowflakeParser.Session_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#session_params_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_params_list(SnowflakeParser.Session_params_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_task(SnowflakeParser.Create_taskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#task_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_parameters(SnowflakeParser.Task_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#task_compute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_compute(SnowflakeParser.Task_computeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#task_schedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_schedule(SnowflakeParser.Task_scheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#task_timeout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_timeout(SnowflakeParser.Task_timeoutContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#task_suspend_after_failure_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_suspend_after_failure_number(SnowflakeParser.Task_suspend_after_failure_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#task_error_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_error_integration(SnowflakeParser.Task_error_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#task_overlap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_overlap(SnowflakeParser.Task_overlapContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(SnowflakeParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(SnowflakeParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user(SnowflakeParser.Create_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#view_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_col(SnowflakeParser.View_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(SnowflakeParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#create_warehouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_warehouse(SnowflakeParser.Create_warehouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#wh_common_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWh_common_size(SnowflakeParser.Wh_common_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#wh_extra_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWh_extra_size(SnowflakeParser.Wh_extra_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#wh_properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWh_properties(SnowflakeParser.Wh_propertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#wh_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWh_params(SnowflakeParser.Wh_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#trigger_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_definition(SnowflakeParser.Trigger_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_name(SnowflakeParser.Object_type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_type_plural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_plural(SnowflakeParser.Object_type_pluralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_command(SnowflakeParser.Drop_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_object(SnowflakeParser.Drop_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_alert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_alert(SnowflakeParser.Drop_alertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_connection(SnowflakeParser.Drop_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database(SnowflakeParser.Drop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_dynamic_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_dynamic_table(SnowflakeParser.Drop_dynamic_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_external_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_table(SnowflakeParser.Drop_external_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_failover_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_failover_group(SnowflakeParser.Drop_failover_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_file_format(SnowflakeParser.Drop_file_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(SnowflakeParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_integration(SnowflakeParser.Drop_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_managed_account}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_managed_account(SnowflakeParser.Drop_managed_accountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_masking_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_masking_policy(SnowflakeParser.Drop_masking_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_materialized_view(SnowflakeParser.Drop_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_network_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_network_policy(SnowflakeParser.Drop_network_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_pipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_pipe(SnowflakeParser.Drop_pipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(SnowflakeParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_replication_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_replication_group(SnowflakeParser.Drop_replication_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_resource_monitor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_resource_monitor(SnowflakeParser.Drop_resource_monitorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_role(SnowflakeParser.Drop_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_row_access_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_row_access_policy(SnowflakeParser.Drop_row_access_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_schema(SnowflakeParser.Drop_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(SnowflakeParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_session_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_session_policy(SnowflakeParser.Drop_session_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_share(SnowflakeParser.Drop_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stream(SnowflakeParser.Drop_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(SnowflakeParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_tag(SnowflakeParser.Drop_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_task(SnowflakeParser.Drop_taskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user(SnowflakeParser.Drop_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view(SnowflakeParser.Drop_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#drop_warehouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_warehouse(SnowflakeParser.Drop_warehouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#cascade_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascade_restrict(SnowflakeParser.Cascade_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#arg_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_types(SnowflakeParser.Arg_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#undrop_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndrop_command(SnowflakeParser.Undrop_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#undrop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndrop_database(SnowflakeParser.Undrop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#undrop_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndrop_schema(SnowflakeParser.Undrop_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#undrop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndrop_table(SnowflakeParser.Undrop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#undrop_tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndrop_tag(SnowflakeParser.Undrop_tagContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#use_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_command(SnowflakeParser.Use_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#use_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_database(SnowflakeParser.Use_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#use_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_role(SnowflakeParser.Use_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#use_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_schema(SnowflakeParser.Use_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#use_secondary_roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_secondary_roles(SnowflakeParser.Use_secondary_rolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#use_warehouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_warehouse(SnowflakeParser.Use_warehouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#comment_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_clause(SnowflakeParser.Comment_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#if_suspended}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_suspended(SnowflakeParser.If_suspendedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_exists(SnowflakeParser.If_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#if_not_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_not_exists(SnowflakeParser.If_not_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#or_replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_replace(SnowflakeParser.Or_replaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe(SnowflakeParser.DescribeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_command(SnowflakeParser.Describe_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_alert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_alert(SnowflakeParser.Describe_alertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_database(SnowflakeParser.Describe_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_dynamic_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_dynamic_table(SnowflakeParser.Describe_dynamic_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_event_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_event_table(SnowflakeParser.Describe_event_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_external_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_external_table(SnowflakeParser.Describe_external_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_file_format(SnowflakeParser.Describe_file_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_function(SnowflakeParser.Describe_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_integration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_integration(SnowflakeParser.Describe_integrationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_masking_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_masking_policy(SnowflakeParser.Describe_masking_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_materialized_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_materialized_view(SnowflakeParser.Describe_materialized_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_network_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_network_policy(SnowflakeParser.Describe_network_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_pipe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_pipe(SnowflakeParser.Describe_pipeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_procedure(SnowflakeParser.Describe_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_result}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_result(SnowflakeParser.Describe_resultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_row_access_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_row_access_policy(SnowflakeParser.Describe_row_access_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_schema(SnowflakeParser.Describe_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_search_optimization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_search_optimization(SnowflakeParser.Describe_search_optimizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_sequence(SnowflakeParser.Describe_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_session_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_session_policy(SnowflakeParser.Describe_session_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_share(SnowflakeParser.Describe_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stream(SnowflakeParser.Describe_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_table(SnowflakeParser.Describe_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_task}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_task(SnowflakeParser.Describe_taskContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_transaction(SnowflakeParser.Describe_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_user(SnowflakeParser.Describe_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_view(SnowflakeParser.Describe_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#describe_warehouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_warehouse(SnowflakeParser.Describe_warehouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_command(SnowflakeParser.Show_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_alerts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_alerts(SnowflakeParser.Show_alertsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_channels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_channels(SnowflakeParser.Show_channelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_columns(SnowflakeParser.Show_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_connections(SnowflakeParser.Show_connectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#starts_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarts_with(SnowflakeParser.Starts_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#limit_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_rows(SnowflakeParser.Limit_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_databases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_databases(SnowflakeParser.Show_databasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_databases_in_failover_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_databases_in_failover_group(SnowflakeParser.Show_databases_in_failover_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_databases_in_replication_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_databases_in_replication_group(SnowflakeParser.Show_databases_in_replication_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_delegated_authorizations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_delegated_authorizations(SnowflakeParser.Show_delegated_authorizationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_dynamic_tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_dynamic_tables(SnowflakeParser.Show_dynamic_tablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_event_tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_event_tables(SnowflakeParser.Show_event_tablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_external_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_external_functions(SnowflakeParser.Show_external_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_external_tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_external_tables(SnowflakeParser.Show_external_tablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_failover_groups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_failover_groups(SnowflakeParser.Show_failover_groupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_file_formats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_file_formats(SnowflakeParser.Show_file_formatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_functions(SnowflakeParser.Show_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_global_accounts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_global_accounts(SnowflakeParser.Show_global_accountsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_grants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_grants(SnowflakeParser.Show_grantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_grants_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_grants_opts(SnowflakeParser.Show_grants_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_integrations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_integrations(SnowflakeParser.Show_integrationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_locks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_locks(SnowflakeParser.Show_locksContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_managed_accounts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_managed_accounts(SnowflakeParser.Show_managed_accountsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_masking_policies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_masking_policies(SnowflakeParser.Show_masking_policiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#in_obj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_obj(SnowflakeParser.In_objContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#in_obj_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_obj_2(SnowflakeParser.In_obj_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_materialized_views}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_materialized_views(SnowflakeParser.Show_materialized_viewsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_network_policies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_network_policies(SnowflakeParser.Show_network_policiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_objects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_objects(SnowflakeParser.Show_objectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_organization_accounts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_organization_accounts(SnowflakeParser.Show_organization_accountsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#in_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_for(SnowflakeParser.In_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_parameters(SnowflakeParser.Show_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_pipes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_pipes(SnowflakeParser.Show_pipesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_primary_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_primary_keys(SnowflakeParser.Show_primary_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_procedures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_procedures(SnowflakeParser.Show_proceduresContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_regions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_regions(SnowflakeParser.Show_regionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_replication_accounts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_replication_accounts(SnowflakeParser.Show_replication_accountsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_replication_databases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_replication_databases(SnowflakeParser.Show_replication_databasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_replication_groups}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_replication_groups(SnowflakeParser.Show_replication_groupsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_resource_monitors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_resource_monitors(SnowflakeParser.Show_resource_monitorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_roles(SnowflakeParser.Show_rolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_row_access_policies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_row_access_policies(SnowflakeParser.Show_row_access_policiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_schemas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_schemas(SnowflakeParser.Show_schemasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_sequences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_sequences(SnowflakeParser.Show_sequencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_session_policies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_session_policies(SnowflakeParser.Show_session_policiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_shares}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_shares(SnowflakeParser.Show_sharesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_shares_in_failover_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_shares_in_failover_group(SnowflakeParser.Show_shares_in_failover_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_shares_in_replication_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_shares_in_replication_group(SnowflakeParser.Show_shares_in_replication_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_streams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_streams(SnowflakeParser.Show_streamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_tables(SnowflakeParser.Show_tablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_tags}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_tags(SnowflakeParser.Show_tagsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_tasks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_tasks(SnowflakeParser.Show_tasksContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_transactions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_transactions(SnowflakeParser.Show_transactionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_user_functions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_user_functions(SnowflakeParser.Show_user_functionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_users}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_users(SnowflakeParser.Show_usersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_variables(SnowflakeParser.Show_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_views}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_views(SnowflakeParser.Show_viewsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#show_warehouses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_warehouses(SnowflakeParser.Show_warehousesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#like_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_pattern(SnowflakeParser.Like_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#account_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccount_identifier(SnowflakeParser.Account_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#schema_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_name(SnowflakeParser.Schema_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type(SnowflakeParser.Object_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_type_list(SnowflakeParser.Object_type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#tag_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag_value(SnowflakeParser.Tag_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#arg_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_data_type(SnowflakeParser.Arg_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#arg_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_name(SnowflakeParser.Arg_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#param_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_name(SnowflakeParser.Param_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#region_group_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegion_group_id(SnowflakeParser.Region_group_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#snowflake_region_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnowflake_region_id(SnowflakeParser.Snowflake_region_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(SnowflakeParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#string_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_list(SnowflakeParser.String_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#id_fn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_fn(SnowflakeParser.Id_fnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#id_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_(SnowflakeParser.Id_Context ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SnowflakeParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(SnowflakeParser.Non_reserved_wordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#builtin_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltin_function(SnowflakeParser.Builtin_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#binary_builtin_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_builtin_function(SnowflakeParser.Binary_builtin_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#binary_or_ternary_builtin_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_or_ternary_builtin_function(SnowflakeParser.Binary_or_ternary_builtin_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#ternary_builtin_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernary_builtin_function(SnowflakeParser.Ternary_builtin_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#list_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_function(SnowflakeParser.List_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(SnowflakeParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SnowflakeParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list(SnowflakeParser.Column_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_list_with_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_list_with_comment(SnowflakeParser.Column_list_with_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_name(SnowflakeParser.Object_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_name_or_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_name_or_identifier(SnowflakeParser.Object_name_or_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(SnowflakeParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list(SnowflakeParser.Expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#expr_list_sorted}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_sorted(SnowflakeParser.Expr_list_sortedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SnowflakeParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#iff_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIff_expr(SnowflakeParser.Iff_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#trim_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim_expression(SnowflakeParser.Trim_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#try_cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_cast_expr(SnowflakeParser.Try_cast_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#cast_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expr(SnowflakeParser.Cast_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#json_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_literal(SnowflakeParser.Json_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#kv_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKv_pair(SnowflakeParser.Kv_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SnowflakeParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#arr_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr_literal(SnowflakeParser.Arr_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#data_type_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_size(SnowflakeParser.Data_type_sizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(SnowflakeParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#primitive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(SnowflakeParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#order_by_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expr(SnowflakeParser.Order_by_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#asc_desc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc_desc(SnowflakeParser.Asc_descContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(SnowflakeParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SnowflakeParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#param_assoc_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_assoc_list(SnowflakeParser.Param_assoc_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#param_assoc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_assoc(SnowflakeParser.Param_assocContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#ignore_or_repect_nulls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore_or_repect_nulls(SnowflakeParser.Ignore_or_repect_nullsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanking_windowed_function(SnowflakeParser.Ranking_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#aggregate_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_function(SnowflakeParser.Aggregate_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(SnowflakeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(SnowflakeParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(SnowflakeParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#bracket_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(SnowflakeParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(SnowflakeParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_search_condition_section(SnowflakeParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#switch_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(SnowflakeParser.Switch_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#query_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_statement(SnowflakeParser.Query_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#with_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expression(SnowflakeParser.With_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SnowflakeParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(SnowflakeParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#set_operators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_operators(SnowflakeParser.Set_operatorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#select_optional_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_optional_clauses(SnowflakeParser.Select_optional_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#select_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_clause(SnowflakeParser.Select_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#select_top_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_top_clause(SnowflakeParser.Select_top_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#select_list_no_top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_no_top(SnowflakeParser.Select_list_no_topContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#select_list_top}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_top(SnowflakeParser.Select_list_topContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(SnowflakeParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(SnowflakeParser.Select_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_elem(SnowflakeParser.Column_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#as_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_alias(SnowflakeParser.As_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#expression_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_elem(SnowflakeParser.Expression_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_position(SnowflakeParser.Column_positionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct(SnowflakeParser.All_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#top_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_clause(SnowflakeParser.Top_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(SnowflakeParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#var_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_list(SnowflakeParser.Var_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(SnowflakeParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(SnowflakeParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#table_sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_sources(SnowflakeParser.Table_sourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(SnowflakeParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item_joined(SnowflakeParser.Table_source_item_joinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#object_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject_ref(SnowflakeParser.Object_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#flatten_table_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlatten_table_option(SnowflakeParser.Flatten_table_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#flatten_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlatten_table(SnowflakeParser.Flatten_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#splited_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSplited_table(SnowflakeParser.Splited_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#prior_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrior_list(SnowflakeParser.Prior_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#prior_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrior_item(SnowflakeParser.Prior_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#outer_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuter_join(SnowflakeParser.Outer_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(SnowflakeParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SnowflakeParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#at_before}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAt_before(SnowflakeParser.At_beforeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(SnowflakeParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#changes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChanges(SnowflakeParser.ChangesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#default_append_only}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_append_only(SnowflakeParser.Default_append_onlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#partition_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by(SnowflakeParser.Partition_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SnowflakeParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#expr_alias_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_alias_list(SnowflakeParser.Expr_alias_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#measures}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMeasures(SnowflakeParser.MeasuresContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#match_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_opts(SnowflakeParser.Match_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#row_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_match(SnowflakeParser.Row_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#first_last}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_last(SnowflakeParser.First_lastContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(SnowflakeParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#after_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfter_match(SnowflakeParser.After_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#symbol_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol_list(SnowflakeParser.Symbol_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#define}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine(SnowflakeParser.DefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#match_recognize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_recognize(SnowflakeParser.Match_recognizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#pivot_unpivot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_unpivot(SnowflakeParser.Pivot_unpivotContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#column_alias_list_in_brackets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_list_in_brackets(SnowflakeParser.Column_alias_list_in_bracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#expr_list_in_parentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_list_in_parentheses(SnowflakeParser.Expr_list_in_parenthesesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#values_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_table(SnowflakeParser.Values_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#values_table_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_table_body(SnowflakeParser.Values_table_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#sample_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_method(SnowflakeParser.Sample_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#repeatable_seed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatable_seed(SnowflakeParser.Repeatable_seedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#sample_opts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_opts(SnowflakeParser.Sample_optsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(SnowflakeParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(SnowflakeParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(SnowflakeParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#null_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_not_null(SnowflakeParser.Null_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SnowflakeParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SnowflakeParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(SnowflakeParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#group_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_item(SnowflakeParser.Group_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(SnowflakeParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(SnowflakeParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(SnowflakeParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#order_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_item(SnowflakeParser.Order_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(SnowflakeParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#row_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_rows(SnowflakeParser.Row_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#first_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst_next(SnowflakeParser.First_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link SnowflakeParser#limit_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit_clause(SnowflakeParser.Limit_clauseContext ctx);
}