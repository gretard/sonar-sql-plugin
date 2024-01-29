// Generated from java-escape by ANTLR 4.11.1
package org.antlr.sql.dialects.snowflake;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SnowflakeParser}.
 */
public interface SnowflakeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#snowflake_file}.
	 * @param ctx the parse tree
	 */
	void enterSnowflake_file(SnowflakeParser.Snowflake_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#snowflake_file}.
	 * @param ctx the parse tree
	 */
	void exitSnowflake_file(SnowflakeParser.Snowflake_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(SnowflakeParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(SnowflakeParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#sql_command}.
	 * @param ctx the parse tree
	 */
	void enterSql_command(SnowflakeParser.Sql_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#sql_command}.
	 * @param ctx the parse tree
	 */
	void exitSql_command(SnowflakeParser.Sql_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#ddl_command}.
	 * @param ctx the parse tree
	 */
	void enterDdl_command(SnowflakeParser.Ddl_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#ddl_command}.
	 * @param ctx the parse tree
	 */
	void exitDdl_command(SnowflakeParser.Ddl_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#dml_command}.
	 * @param ctx the parse tree
	 */
	void enterDml_command(SnowflakeParser.Dml_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#dml_command}.
	 * @param ctx the parse tree
	 */
	void exitDml_command(SnowflakeParser.Dml_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(SnowflakeParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(SnowflakeParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#insert_multi_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_multi_table_statement(SnowflakeParser.Insert_multi_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#insert_multi_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_multi_table_statement(SnowflakeParser.Insert_multi_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#into_clause2}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause2(SnowflakeParser.Into_clause2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#into_clause2}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause2(SnowflakeParser.Into_clause2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#values_list}.
	 * @param ctx the parse tree
	 */
	void enterValues_list(SnowflakeParser.Values_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#values_list}.
	 * @param ctx the parse tree
	 */
	void exitValues_list(SnowflakeParser.Values_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#value_item}.
	 * @param ctx the parse tree
	 */
	void enterValue_item(SnowflakeParser.Value_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#value_item}.
	 * @param ctx the parse tree
	 */
	void exitValue_item(SnowflakeParser.Value_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(SnowflakeParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(SnowflakeParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#merge_matches}.
	 * @param ctx the parse tree
	 */
	void enterMerge_matches(SnowflakeParser.Merge_matchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#merge_matches}.
	 * @param ctx the parse tree
	 */
	void exitMerge_matches(SnowflakeParser.Merge_matchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#merge_cond}.
	 * @param ctx the parse tree
	 */
	void enterMerge_cond(SnowflakeParser.Merge_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#merge_cond}.
	 * @param ctx the parse tree
	 */
	void exitMerge_cond(SnowflakeParser.Merge_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#merge_update_delete}.
	 * @param ctx the parse tree
	 */
	void enterMerge_update_delete(SnowflakeParser.Merge_update_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#merge_update_delete}.
	 * @param ctx the parse tree
	 */
	void exitMerge_update_delete(SnowflakeParser.Merge_update_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#merge_insert}.
	 * @param ctx the parse tree
	 */
	void enterMerge_insert(SnowflakeParser.Merge_insertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#merge_insert}.
	 * @param ctx the parse tree
	 */
	void exitMerge_insert(SnowflakeParser.Merge_insertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(SnowflakeParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(SnowflakeParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#table_or_query}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_query(SnowflakeParser.Table_or_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#table_or_query}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_query(SnowflakeParser.Table_or_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(SnowflakeParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(SnowflakeParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#values_builder}.
	 * @param ctx the parse tree
	 */
	void enterValues_builder(SnowflakeParser.Values_builderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#values_builder}.
	 * @param ctx the parse tree
	 */
	void exitValues_builder(SnowflakeParser.Values_builderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#other_command}.
	 * @param ctx the parse tree
	 */
	void enterOther_command(SnowflakeParser.Other_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#other_command}.
	 * @param ctx the parse tree
	 */
	void exitOther_command(SnowflakeParser.Other_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#begin_txn}.
	 * @param ctx the parse tree
	 */
	void enterBegin_txn(SnowflakeParser.Begin_txnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#begin_txn}.
	 * @param ctx the parse tree
	 */
	void exitBegin_txn(SnowflakeParser.Begin_txnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#copy_into_table}.
	 * @param ctx the parse tree
	 */
	void enterCopy_into_table(SnowflakeParser.Copy_into_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#copy_into_table}.
	 * @param ctx the parse tree
	 */
	void exitCopy_into_table(SnowflakeParser.Copy_into_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#external_location}.
	 * @param ctx the parse tree
	 */
	void enterExternal_location(SnowflakeParser.External_locationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#external_location}.
	 * @param ctx the parse tree
	 */
	void exitExternal_location(SnowflakeParser.External_locationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#files}.
	 * @param ctx the parse tree
	 */
	void enterFiles(SnowflakeParser.FilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#files}.
	 * @param ctx the parse tree
	 */
	void exitFiles(SnowflakeParser.FilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#file_format}.
	 * @param ctx the parse tree
	 */
	void enterFile_format(SnowflakeParser.File_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#file_format}.
	 * @param ctx the parse tree
	 */
	void exitFile_format(SnowflakeParser.File_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#format_name}.
	 * @param ctx the parse tree
	 */
	void enterFormat_name(SnowflakeParser.Format_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#format_name}.
	 * @param ctx the parse tree
	 */
	void exitFormat_name(SnowflakeParser.Format_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#format_type}.
	 * @param ctx the parse tree
	 */
	void enterFormat_type(SnowflakeParser.Format_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#format_type}.
	 * @param ctx the parse tree
	 */
	void exitFormat_type(SnowflakeParser.Format_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stage_file_format}.
	 * @param ctx the parse tree
	 */
	void enterStage_file_format(SnowflakeParser.Stage_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stage_file_format}.
	 * @param ctx the parse tree
	 */
	void exitStage_file_format(SnowflakeParser.Stage_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#copy_into_location}.
	 * @param ctx the parse tree
	 */
	void enterCopy_into_location(SnowflakeParser.Copy_into_locationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#copy_into_location}.
	 * @param ctx the parse tree
	 */
	void exitCopy_into_location(SnowflakeParser.Copy_into_locationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(SnowflakeParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(SnowflakeParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void enterFunction_signature(SnowflakeParser.Function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#function_signature}.
	 * @param ctx the parse tree
	 */
	void exitFunction_signature(SnowflakeParser.Function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#commit}.
	 * @param ctx the parse tree
	 */
	void enterCommit(SnowflakeParser.CommitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#commit}.
	 * @param ctx the parse tree
	 */
	void exitCommit(SnowflakeParser.CommitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate(SnowflakeParser.Execute_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#execute_immediate}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate(SnowflakeParser.Execute_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#execute_task}.
	 * @param ctx the parse tree
	 */
	void enterExecute_task(SnowflakeParser.Execute_taskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#execute_task}.
	 * @param ctx the parse tree
	 */
	void exitExecute_task(SnowflakeParser.Execute_taskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SnowflakeParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SnowflakeParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#parallel}.
	 * @param ctx the parse tree
	 */
	void enterParallel(SnowflakeParser.ParallelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#parallel}.
	 * @param ctx the parse tree
	 */
	void exitParallel(SnowflakeParser.ParallelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#get_dml}.
	 * @param ctx the parse tree
	 */
	void enterGet_dml(SnowflakeParser.Get_dmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#get_dml}.
	 * @param ctx the parse tree
	 */
	void exitGet_dml(SnowflakeParser.Get_dmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#grant_ownership}.
	 * @param ctx the parse tree
	 */
	void enterGrant_ownership(SnowflakeParser.Grant_ownershipContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#grant_ownership}.
	 * @param ctx the parse tree
	 */
	void exitGrant_ownership(SnowflakeParser.Grant_ownershipContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#grant_to_role}.
	 * @param ctx the parse tree
	 */
	void enterGrant_to_role(SnowflakeParser.Grant_to_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#grant_to_role}.
	 * @param ctx the parse tree
	 */
	void exitGrant_to_role(SnowflakeParser.Grant_to_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#global_privileges}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_privileges(SnowflakeParser.Global_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#global_privileges}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_privileges(SnowflakeParser.Global_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#global_privilege}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_privilege(SnowflakeParser.Global_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#global_privilege}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_privilege(SnowflakeParser.Global_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#account_object_privileges}.
	 * @param ctx the parse tree
	 */
	void enterAccount_object_privileges(SnowflakeParser.Account_object_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#account_object_privileges}.
	 * @param ctx the parse tree
	 */
	void exitAccount_object_privileges(SnowflakeParser.Account_object_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#account_object_privilege}.
	 * @param ctx the parse tree
	 */
	void enterAccount_object_privilege(SnowflakeParser.Account_object_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#account_object_privilege}.
	 * @param ctx the parse tree
	 */
	void exitAccount_object_privilege(SnowflakeParser.Account_object_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#schema_privileges}.
	 * @param ctx the parse tree
	 */
	void enterSchema_privileges(SnowflakeParser.Schema_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#schema_privileges}.
	 * @param ctx the parse tree
	 */
	void exitSchema_privileges(SnowflakeParser.Schema_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#schema_privilege}.
	 * @param ctx the parse tree
	 */
	void enterSchema_privilege(SnowflakeParser.Schema_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#schema_privilege}.
	 * @param ctx the parse tree
	 */
	void exitSchema_privilege(SnowflakeParser.Schema_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#schema_object_privileges}.
	 * @param ctx the parse tree
	 */
	void enterSchema_object_privileges(SnowflakeParser.Schema_object_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#schema_object_privileges}.
	 * @param ctx the parse tree
	 */
	void exitSchema_object_privileges(SnowflakeParser.Schema_object_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#schema_object_privilege}.
	 * @param ctx the parse tree
	 */
	void enterSchema_object_privilege(SnowflakeParser.Schema_object_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#schema_object_privilege}.
	 * @param ctx the parse tree
	 */
	void exitSchema_object_privilege(SnowflakeParser.Schema_object_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#grant_to_share}.
	 * @param ctx the parse tree
	 */
	void enterGrant_to_share(SnowflakeParser.Grant_to_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#grant_to_share}.
	 * @param ctx the parse tree
	 */
	void exitGrant_to_share(SnowflakeParser.Grant_to_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_privilege}.
	 * @param ctx the parse tree
	 */
	void enterObject_privilege(SnowflakeParser.Object_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_privilege}.
	 * @param ctx the parse tree
	 */
	void exitObject_privilege(SnowflakeParser.Object_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#grant_role}.
	 * @param ctx the parse tree
	 */
	void enterGrant_role(SnowflakeParser.Grant_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#grant_role}.
	 * @param ctx the parse tree
	 */
	void exitGrant_role(SnowflakeParser.Grant_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#role_name}.
	 * @param ctx the parse tree
	 */
	void enterRole_name(SnowflakeParser.Role_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#role_name}.
	 * @param ctx the parse tree
	 */
	void exitRole_name(SnowflakeParser.Role_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#system_defined_role}.
	 * @param ctx the parse tree
	 */
	void enterSystem_defined_role(SnowflakeParser.System_defined_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#system_defined_role}.
	 * @param ctx the parse tree
	 */
	void exitSystem_defined_role(SnowflakeParser.System_defined_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(SnowflakeParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(SnowflakeParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#internal_stage}.
	 * @param ctx the parse tree
	 */
	void enterInternal_stage(SnowflakeParser.Internal_stageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#internal_stage}.
	 * @param ctx the parse tree
	 */
	void exitInternal_stage(SnowflakeParser.Internal_stageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#external_stage}.
	 * @param ctx the parse tree
	 */
	void enterExternal_stage(SnowflakeParser.External_stageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#external_stage}.
	 * @param ctx the parse tree
	 */
	void exitExternal_stage(SnowflakeParser.External_stageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#put}.
	 * @param ctx the parse tree
	 */
	void enterPut(SnowflakeParser.PutContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#put}.
	 * @param ctx the parse tree
	 */
	void exitPut(SnowflakeParser.PutContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(SnowflakeParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(SnowflakeParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#revoke_from_role}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_from_role(SnowflakeParser.Revoke_from_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#revoke_from_role}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_from_role(SnowflakeParser.Revoke_from_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#revoke_from_share}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_from_share(SnowflakeParser.Revoke_from_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#revoke_from_share}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_from_share(SnowflakeParser.Revoke_from_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#revoke_role}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_role(SnowflakeParser.Revoke_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#revoke_role}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_role(SnowflakeParser.Revoke_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#rollback}.
	 * @param ctx the parse tree
	 */
	void enterRollback(SnowflakeParser.RollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#rollback}.
	 * @param ctx the parse tree
	 */
	void exitRollback(SnowflakeParser.RollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(SnowflakeParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(SnowflakeParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#truncate_materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_materialized_view(SnowflakeParser.Truncate_materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#truncate_materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_materialized_view(SnowflakeParser.Truncate_materialized_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table(SnowflakeParser.Truncate_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table(SnowflakeParser.Truncate_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#unset}.
	 * @param ctx the parse tree
	 */
	void enterUnset(SnowflakeParser.UnsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#unset}.
	 * @param ctx the parse tree
	 */
	void exitUnset(SnowflakeParser.UnsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_command}.
	 * @param ctx the parse tree
	 */
	void enterAlter_command(SnowflakeParser.Alter_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_command}.
	 * @param ctx the parse tree
	 */
	void exitAlter_command(SnowflakeParser.Alter_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#account_params}.
	 * @param ctx the parse tree
	 */
	void enterAccount_params(SnowflakeParser.Account_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#account_params}.
	 * @param ctx the parse tree
	 */
	void exitAccount_params(SnowflakeParser.Account_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_params}.
	 * @param ctx the parse tree
	 */
	void enterObject_params(SnowflakeParser.Object_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_params}.
	 * @param ctx the parse tree
	 */
	void exitObject_params(SnowflakeParser.Object_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#default_ddl_collation}.
	 * @param ctx the parse tree
	 */
	void enterDefault_ddl_collation(SnowflakeParser.Default_ddl_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#default_ddl_collation}.
	 * @param ctx the parse tree
	 */
	void exitDefault_ddl_collation(SnowflakeParser.Default_ddl_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_properties}.
	 * @param ctx the parse tree
	 */
	void enterObject_properties(SnowflakeParser.Object_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_properties}.
	 * @param ctx the parse tree
	 */
	void exitObject_properties(SnowflakeParser.Object_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#session_params}.
	 * @param ctx the parse tree
	 */
	void enterSession_params(SnowflakeParser.Session_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#session_params}.
	 * @param ctx the parse tree
	 */
	void exitSession_params(SnowflakeParser.Session_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_account}.
	 * @param ctx the parse tree
	 */
	void enterAlter_account(SnowflakeParser.Alter_accountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_account}.
	 * @param ctx the parse tree
	 */
	void exitAlter_account(SnowflakeParser.Alter_accountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#enabled_true_false}.
	 * @param ctx the parse tree
	 */
	void enterEnabled_true_false(SnowflakeParser.Enabled_true_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#enabled_true_false}.
	 * @param ctx the parse tree
	 */
	void exitEnabled_true_false(SnowflakeParser.Enabled_true_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_alert}.
	 * @param ctx the parse tree
	 */
	void enterAlter_alert(SnowflakeParser.Alter_alertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_alert}.
	 * @param ctx the parse tree
	 */
	void exitAlter_alert(SnowflakeParser.Alter_alertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#resume_suspend}.
	 * @param ctx the parse tree
	 */
	void enterResume_suspend(SnowflakeParser.Resume_suspendContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#resume_suspend}.
	 * @param ctx the parse tree
	 */
	void exitResume_suspend(SnowflakeParser.Resume_suspendContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alert_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlert_set_clause(SnowflakeParser.Alert_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alert_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlert_set_clause(SnowflakeParser.Alert_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alert_unset_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlert_unset_clause(SnowflakeParser.Alert_unset_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alert_unset_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlert_unset_clause(SnowflakeParser.Alert_unset_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_api_integration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_api_integration(SnowflakeParser.Alter_api_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_api_integration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_api_integration(SnowflakeParser.Alter_api_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#api_integration_property}.
	 * @param ctx the parse tree
	 */
	void enterApi_integration_property(SnowflakeParser.Api_integration_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#api_integration_property}.
	 * @param ctx the parse tree
	 */
	void exitApi_integration_property(SnowflakeParser.Api_integration_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_connection}.
	 * @param ctx the parse tree
	 */
	void enterAlter_connection(SnowflakeParser.Alter_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_connection}.
	 * @param ctx the parse tree
	 */
	void exitAlter_connection(SnowflakeParser.Alter_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(SnowflakeParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(SnowflakeParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#database_property}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_property(SnowflakeParser.Database_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#database_property}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_property(SnowflakeParser.Database_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#account_id_list}.
	 * @param ctx the parse tree
	 */
	void enterAccount_id_list(SnowflakeParser.Account_id_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#account_id_list}.
	 * @param ctx the parse tree
	 */
	void exitAccount_id_list(SnowflakeParser.Account_id_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_dynamic_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_dynamic_table(SnowflakeParser.Alter_dynamic_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_dynamic_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_dynamic_table(SnowflakeParser.Alter_dynamic_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_external_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_table(SnowflakeParser.Alter_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_external_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_table(SnowflakeParser.Alter_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#ignore_edition_check}.
	 * @param ctx the parse tree
	 */
	void enterIgnore_edition_check(SnowflakeParser.Ignore_edition_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#ignore_edition_check}.
	 * @param ctx the parse tree
	 */
	void exitIgnore_edition_check(SnowflakeParser.Ignore_edition_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#replication_schedule}.
	 * @param ctx the parse tree
	 */
	void enterReplication_schedule(SnowflakeParser.Replication_scheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#replication_schedule}.
	 * @param ctx the parse tree
	 */
	void exitReplication_schedule(SnowflakeParser.Replication_scheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#db_name_list}.
	 * @param ctx the parse tree
	 */
	void enterDb_name_list(SnowflakeParser.Db_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#db_name_list}.
	 * @param ctx the parse tree
	 */
	void exitDb_name_list(SnowflakeParser.Db_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#share_name_list}.
	 * @param ctx the parse tree
	 */
	void enterShare_name_list(SnowflakeParser.Share_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#share_name_list}.
	 * @param ctx the parse tree
	 */
	void exitShare_name_list(SnowflakeParser.Share_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#full_acct_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_acct_list(SnowflakeParser.Full_acct_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#full_acct_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_acct_list(SnowflakeParser.Full_acct_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_failover_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_failover_group(SnowflakeParser.Alter_failover_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_failover_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_failover_group(SnowflakeParser.Alter_failover_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_file_format}.
	 * @param ctx the parse tree
	 */
	void enterAlter_file_format(SnowflakeParser.Alter_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_file_format}.
	 * @param ctx the parse tree
	 */
	void exitAlter_file_format(SnowflakeParser.Alter_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function(SnowflakeParser.Alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function(SnowflakeParser.Alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_function_signature}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function_signature(SnowflakeParser.Alter_function_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_function_signature}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function_signature(SnowflakeParser.Alter_function_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#data_type_list}.
	 * @param ctx the parse tree
	 */
	void enterData_type_list(SnowflakeParser.Data_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#data_type_list}.
	 * @param ctx the parse tree
	 */
	void exitData_type_list(SnowflakeParser.Data_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_masking_policy}.
	 * @param ctx the parse tree
	 */
	void enterAlter_masking_policy(SnowflakeParser.Alter_masking_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_masking_policy}.
	 * @param ctx the parse tree
	 */
	void exitAlter_masking_policy(SnowflakeParser.Alter_masking_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterAlter_materialized_view(SnowflakeParser.Alter_materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitAlter_materialized_view(SnowflakeParser.Alter_materialized_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_network_policy}.
	 * @param ctx the parse tree
	 */
	void enterAlter_network_policy(SnowflakeParser.Alter_network_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_network_policy}.
	 * @param ctx the parse tree
	 */
	void exitAlter_network_policy(SnowflakeParser.Alter_network_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_notification_integration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_notification_integration(SnowflakeParser.Alter_notification_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_notification_integration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_notification_integration(SnowflakeParser.Alter_notification_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_pipe}.
	 * @param ctx the parse tree
	 */
	void enterAlter_pipe(SnowflakeParser.Alter_pipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_pipe}.
	 * @param ctx the parse tree
	 */
	void exitAlter_pipe(SnowflakeParser.Alter_pipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterAlter_procedure(SnowflakeParser.Alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitAlter_procedure(SnowflakeParser.Alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_replication_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_replication_group(SnowflakeParser.Alter_replication_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_replication_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_replication_group(SnowflakeParser.Alter_replication_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#credit_quota}.
	 * @param ctx the parse tree
	 */
	void enterCredit_quota(SnowflakeParser.Credit_quotaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#credit_quota}.
	 * @param ctx the parse tree
	 */
	void exitCredit_quota(SnowflakeParser.Credit_quotaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#frequency}.
	 * @param ctx the parse tree
	 */
	void enterFrequency(SnowflakeParser.FrequencyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#frequency}.
	 * @param ctx the parse tree
	 */
	void exitFrequency(SnowflakeParser.FrequencyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#notify_users}.
	 * @param ctx the parse tree
	 */
	void enterNotify_users(SnowflakeParser.Notify_usersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#notify_users}.
	 * @param ctx the parse tree
	 */
	void exitNotify_users(SnowflakeParser.Notify_usersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#triggerDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTriggerDefinition(SnowflakeParser.TriggerDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#triggerDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTriggerDefinition(SnowflakeParser.TriggerDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_resource_monitor}.
	 * @param ctx the parse tree
	 */
	void enterAlter_resource_monitor(SnowflakeParser.Alter_resource_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_resource_monitor}.
	 * @param ctx the parse tree
	 */
	void exitAlter_resource_monitor(SnowflakeParser.Alter_resource_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_role(SnowflakeParser.Alter_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_role(SnowflakeParser.Alter_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void enterAlter_row_access_policy(SnowflakeParser.Alter_row_access_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void exitAlter_row_access_policy(SnowflakeParser.Alter_row_access_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_schema}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema(SnowflakeParser.Alter_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_schema}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema(SnowflakeParser.Alter_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#schema_property}.
	 * @param ctx the parse tree
	 */
	void enterSchema_property(SnowflakeParser.Schema_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#schema_property}.
	 * @param ctx the parse tree
	 */
	void exitSchema_property(SnowflakeParser.Schema_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(SnowflakeParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(SnowflakeParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_security_integration_external_oauth}.
	 * @param ctx the parse tree
	 */
	void enterAlter_security_integration_external_oauth(SnowflakeParser.Alter_security_integration_external_oauthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_security_integration_external_oauth}.
	 * @param ctx the parse tree
	 */
	void exitAlter_security_integration_external_oauth(SnowflakeParser.Alter_security_integration_external_oauthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#security_integration_external_oauth_property}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_integration_external_oauth_property(SnowflakeParser.Security_integration_external_oauth_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#security_integration_external_oauth_property}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_integration_external_oauth_property(SnowflakeParser.Security_integration_external_oauth_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_security_integration_snowflake_oauth}.
	 * @param ctx the parse tree
	 */
	void enterAlter_security_integration_snowflake_oauth(SnowflakeParser.Alter_security_integration_snowflake_oauthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_security_integration_snowflake_oauth}.
	 * @param ctx the parse tree
	 */
	void exitAlter_security_integration_snowflake_oauth(SnowflakeParser.Alter_security_integration_snowflake_oauthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#security_integration_snowflake_oauth_property}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_integration_snowflake_oauth_property(SnowflakeParser.Security_integration_snowflake_oauth_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#security_integration_snowflake_oauth_property}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_integration_snowflake_oauth_property(SnowflakeParser.Security_integration_snowflake_oauth_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_security_integration_saml2}.
	 * @param ctx the parse tree
	 */
	void enterAlter_security_integration_saml2(SnowflakeParser.Alter_security_integration_saml2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_security_integration_saml2}.
	 * @param ctx the parse tree
	 */
	void exitAlter_security_integration_saml2(SnowflakeParser.Alter_security_integration_saml2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_security_integration_scim}.
	 * @param ctx the parse tree
	 */
	void enterAlter_security_integration_scim(SnowflakeParser.Alter_security_integration_scimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_security_integration_scim}.
	 * @param ctx the parse tree
	 */
	void exitAlter_security_integration_scim(SnowflakeParser.Alter_security_integration_scimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#security_integration_scim_property}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_integration_scim_property(SnowflakeParser.Security_integration_scim_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#security_integration_scim_property}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_integration_scim_property(SnowflakeParser.Security_integration_scim_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_session}.
	 * @param ctx the parse tree
	 */
	void enterAlter_session(SnowflakeParser.Alter_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_session}.
	 * @param ctx the parse tree
	 */
	void exitAlter_session(SnowflakeParser.Alter_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_session_policy}.
	 * @param ctx the parse tree
	 */
	void enterAlter_session_policy(SnowflakeParser.Alter_session_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_session_policy}.
	 * @param ctx the parse tree
	 */
	void exitAlter_session_policy(SnowflakeParser.Alter_session_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_share}.
	 * @param ctx the parse tree
	 */
	void enterAlter_share(SnowflakeParser.Alter_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_share}.
	 * @param ctx the parse tree
	 */
	void exitAlter_share(SnowflakeParser.Alter_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_storage_integration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_storage_integration(SnowflakeParser.Alter_storage_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_storage_integration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_storage_integration(SnowflakeParser.Alter_storage_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_stream}.
	 * @param ctx the parse tree
	 */
	void enterAlter_stream(SnowflakeParser.Alter_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_stream}.
	 * @param ctx the parse tree
	 */
	void exitAlter_stream(SnowflakeParser.Alter_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(SnowflakeParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(SnowflakeParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#clustering_action}.
	 * @param ctx the parse tree
	 */
	void enterClustering_action(SnowflakeParser.Clustering_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#clustering_action}.
	 * @param ctx the parse tree
	 */
	void exitClustering_action(SnowflakeParser.Clustering_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#table_column_action}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_action(SnowflakeParser.Table_column_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#table_column_action}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_action(SnowflakeParser.Table_column_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_column_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_clause(SnowflakeParser.Alter_column_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_column_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_clause(SnowflakeParser.Alter_column_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void enterInline_constraint(SnowflakeParser.Inline_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#inline_constraint}.
	 * @param ctx the parse tree
	 */
	void exitInline_constraint(SnowflakeParser.Inline_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#enforced_not_enforced}.
	 * @param ctx the parse tree
	 */
	void enterEnforced_not_enforced(SnowflakeParser.Enforced_not_enforcedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#enforced_not_enforced}.
	 * @param ctx the parse tree
	 */
	void exitEnforced_not_enforced(SnowflakeParser.Enforced_not_enforcedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#deferrable_not_deferrable}.
	 * @param ctx the parse tree
	 */
	void enterDeferrable_not_deferrable(SnowflakeParser.Deferrable_not_deferrableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#deferrable_not_deferrable}.
	 * @param ctx the parse tree
	 */
	void exitDeferrable_not_deferrable(SnowflakeParser.Deferrable_not_deferrableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#initially_deferred_or_immediate}.
	 * @param ctx the parse tree
	 */
	void enterInitially_deferred_or_immediate(SnowflakeParser.Initially_deferred_or_immediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#initially_deferred_or_immediate}.
	 * @param ctx the parse tree
	 */
	void exitInitially_deferred_or_immediate(SnowflakeParser.Initially_deferred_or_immediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#common_constraint_properties}.
	 * @param ctx the parse tree
	 */
	void enterCommon_constraint_properties(SnowflakeParser.Common_constraint_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#common_constraint_properties}.
	 * @param ctx the parse tree
	 */
	void exitCommon_constraint_properties(SnowflakeParser.Common_constraint_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#on_update}.
	 * @param ctx the parse tree
	 */
	void enterOn_update(SnowflakeParser.On_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#on_update}.
	 * @param ctx the parse tree
	 */
	void exitOn_update(SnowflakeParser.On_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete(SnowflakeParser.On_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete(SnowflakeParser.On_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#foreign_key_match}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_match(SnowflakeParser.Foreign_key_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#foreign_key_match}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_match(SnowflakeParser.Foreign_key_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#on_action}.
	 * @param ctx the parse tree
	 */
	void enterOn_action(SnowflakeParser.On_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#on_action}.
	 * @param ctx the parse tree
	 */
	void exitOn_action(SnowflakeParser.On_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#constraint_properties}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_properties(SnowflakeParser.Constraint_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#constraint_properties}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_properties(SnowflakeParser.Constraint_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#ext_table_column_action}.
	 * @param ctx the parse tree
	 */
	void enterExt_table_column_action(SnowflakeParser.Ext_table_column_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#ext_table_column_action}.
	 * @param ctx the parse tree
	 */
	void exitExt_table_column_action(SnowflakeParser.Ext_table_column_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#constraint_action}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_action(SnowflakeParser.Constraint_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#constraint_action}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_action(SnowflakeParser.Constraint_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#search_optimization_action}.
	 * @param ctx the parse tree
	 */
	void enterSearch_optimization_action(SnowflakeParser.Search_optimization_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#search_optimization_action}.
	 * @param ctx the parse tree
	 */
	void exitSearch_optimization_action(SnowflakeParser.Search_optimization_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#search_method_with_target}.
	 * @param ctx the parse tree
	 */
	void enterSearch_method_with_target(SnowflakeParser.Search_method_with_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#search_method_with_target}.
	 * @param ctx the parse tree
	 */
	void exitSearch_method_with_target(SnowflakeParser.Search_method_with_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_table_alter_column}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_alter_column(SnowflakeParser.Alter_table_alter_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_table_alter_column}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_alter_column(SnowflakeParser.Alter_table_alter_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_column_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_decl_list(SnowflakeParser.Alter_column_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_column_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_decl_list(SnowflakeParser.Alter_column_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_column_decl}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_decl(SnowflakeParser.Alter_column_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_column_decl}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_decl(SnowflakeParser.Alter_column_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_column_opts}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_opts(SnowflakeParser.Alter_column_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_column_opts}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_opts(SnowflakeParser.Alter_column_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_set_tags}.
	 * @param ctx the parse tree
	 */
	void enterColumn_set_tags(SnowflakeParser.Column_set_tagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_set_tags}.
	 * @param ctx the parse tree
	 */
	void exitColumn_set_tags(SnowflakeParser.Column_set_tagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_unset_tags}.
	 * @param ctx the parse tree
	 */
	void enterColumn_unset_tags(SnowflakeParser.Column_unset_tagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_unset_tags}.
	 * @param ctx the parse tree
	 */
	void exitColumn_unset_tags(SnowflakeParser.Column_unset_tagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_tag}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tag(SnowflakeParser.Alter_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_tag}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tag(SnowflakeParser.Alter_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_task}.
	 * @param ctx the parse tree
	 */
	void enterAlter_task(SnowflakeParser.Alter_taskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_task}.
	 * @param ctx the parse tree
	 */
	void exitAlter_task(SnowflakeParser.Alter_taskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user(SnowflakeParser.Alter_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user(SnowflakeParser.Alter_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_view}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view(SnowflakeParser.Alter_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_view}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view(SnowflakeParser.Alter_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_modify}.
	 * @param ctx the parse tree
	 */
	void enterAlter_modify(SnowflakeParser.Alter_modifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_modify}.
	 * @param ctx the parse tree
	 */
	void exitAlter_modify(SnowflakeParser.Alter_modifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_warehouse}.
	 * @param ctx the parse tree
	 */
	void enterAlter_warehouse(SnowflakeParser.Alter_warehouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_warehouse}.
	 * @param ctx the parse tree
	 */
	void exitAlter_warehouse(SnowflakeParser.Alter_warehouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_connection_opts}.
	 * @param ctx the parse tree
	 */
	void enterAlter_connection_opts(SnowflakeParser.Alter_connection_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_connection_opts}.
	 * @param ctx the parse tree
	 */
	void exitAlter_connection_opts(SnowflakeParser.Alter_connection_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_user_opts}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_opts(SnowflakeParser.Alter_user_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_user_opts}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_opts(SnowflakeParser.Alter_user_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_tag_opts}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tag_opts(SnowflakeParser.Alter_tag_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_tag_opts}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tag_opts(SnowflakeParser.Alter_tag_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_network_policy_opts}.
	 * @param ctx the parse tree
	 */
	void enterAlter_network_policy_opts(SnowflakeParser.Alter_network_policy_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_network_policy_opts}.
	 * @param ctx the parse tree
	 */
	void exitAlter_network_policy_opts(SnowflakeParser.Alter_network_policy_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_warehouse_opts}.
	 * @param ctx the parse tree
	 */
	void enterAlter_warehouse_opts(SnowflakeParser.Alter_warehouse_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_warehouse_opts}.
	 * @param ctx the parse tree
	 */
	void exitAlter_warehouse_opts(SnowflakeParser.Alter_warehouse_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_account_opts}.
	 * @param ctx the parse tree
	 */
	void enterAlter_account_opts(SnowflakeParser.Alter_account_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_account_opts}.
	 * @param ctx the parse tree
	 */
	void exitAlter_account_opts(SnowflakeParser.Alter_account_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#set_tags}.
	 * @param ctx the parse tree
	 */
	void enterSet_tags(SnowflakeParser.Set_tagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#set_tags}.
	 * @param ctx the parse tree
	 */
	void exitSet_tags(SnowflakeParser.Set_tagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#tag_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterTag_decl_list(SnowflakeParser.Tag_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#tag_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitTag_decl_list(SnowflakeParser.Tag_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#unset_tags}.
	 * @param ctx the parse tree
	 */
	void enterUnset_tags(SnowflakeParser.Unset_tagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#unset_tags}.
	 * @param ctx the parse tree
	 */
	void exitUnset_tags(SnowflakeParser.Unset_tagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_command}.
	 * @param ctx the parse tree
	 */
	void enterCreate_command(SnowflakeParser.Create_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_command}.
	 * @param ctx the parse tree
	 */
	void exitCreate_command(SnowflakeParser.Create_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_account}.
	 * @param ctx the parse tree
	 */
	void enterCreate_account(SnowflakeParser.Create_accountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_account}.
	 * @param ctx the parse tree
	 */
	void exitCreate_account(SnowflakeParser.Create_accountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_alert}.
	 * @param ctx the parse tree
	 */
	void enterCreate_alert(SnowflakeParser.Create_alertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_alert}.
	 * @param ctx the parse tree
	 */
	void exitCreate_alert(SnowflakeParser.Create_alertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alert_condition}.
	 * @param ctx the parse tree
	 */
	void enterAlert_condition(SnowflakeParser.Alert_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alert_condition}.
	 * @param ctx the parse tree
	 */
	void exitAlert_condition(SnowflakeParser.Alert_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alert_action}.
	 * @param ctx the parse tree
	 */
	void enterAlert_action(SnowflakeParser.Alert_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alert_action}.
	 * @param ctx the parse tree
	 */
	void exitAlert_action(SnowflakeParser.Alert_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_api_integration}.
	 * @param ctx the parse tree
	 */
	void enterCreate_api_integration(SnowflakeParser.Create_api_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_api_integration}.
	 * @param ctx the parse tree
	 */
	void exitCreate_api_integration(SnowflakeParser.Create_api_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_object_clone}.
	 * @param ctx the parse tree
	 */
	void enterCreate_object_clone(SnowflakeParser.Create_object_cloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_object_clone}.
	 * @param ctx the parse tree
	 */
	void exitCreate_object_clone(SnowflakeParser.Create_object_cloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_connection}.
	 * @param ctx the parse tree
	 */
	void enterCreate_connection(SnowflakeParser.Create_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_connection}.
	 * @param ctx the parse tree
	 */
	void exitCreate_connection(SnowflakeParser.Create_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(SnowflakeParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(SnowflakeParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#clone_at_before}.
	 * @param ctx the parse tree
	 */
	void enterClone_at_before(SnowflakeParser.Clone_at_beforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#clone_at_before}.
	 * @param ctx the parse tree
	 */
	void exitClone_at_before(SnowflakeParser.Clone_at_beforeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#at_before1}.
	 * @param ctx the parse tree
	 */
	void enterAt_before1(SnowflakeParser.At_before1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#at_before1}.
	 * @param ctx the parse tree
	 */
	void exitAt_before1(SnowflakeParser.At_before1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#header_decl}.
	 * @param ctx the parse tree
	 */
	void enterHeader_decl(SnowflakeParser.Header_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#header_decl}.
	 * @param ctx the parse tree
	 */
	void exitHeader_decl(SnowflakeParser.Header_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#compression_type}.
	 * @param ctx the parse tree
	 */
	void enterCompression_type(SnowflakeParser.Compression_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#compression_type}.
	 * @param ctx the parse tree
	 */
	void exitCompression_type(SnowflakeParser.Compression_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#compression}.
	 * @param ctx the parse tree
	 */
	void enterCompression(SnowflakeParser.CompressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#compression}.
	 * @param ctx the parse tree
	 */
	void exitCompression(SnowflakeParser.CompressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_dynamic_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_dynamic_table(SnowflakeParser.Create_dynamic_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_dynamic_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_dynamic_table(SnowflakeParser.Create_dynamic_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_event_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_table(SnowflakeParser.Create_event_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_event_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_table(SnowflakeParser.Create_event_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_external_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_function(SnowflakeParser.Create_external_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_external_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_function(SnowflakeParser.Create_external_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_external_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_table(SnowflakeParser.Create_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_external_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_table(SnowflakeParser.Create_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#external_table_column_decl}.
	 * @param ctx the parse tree
	 */
	void enterExternal_table_column_decl(SnowflakeParser.External_table_column_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#external_table_column_decl}.
	 * @param ctx the parse tree
	 */
	void exitExternal_table_column_decl(SnowflakeParser.External_table_column_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#external_table_column_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterExternal_table_column_decl_list(SnowflakeParser.External_table_column_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#external_table_column_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitExternal_table_column_decl_list(SnowflakeParser.External_table_column_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#full_acct}.
	 * @param ctx the parse tree
	 */
	void enterFull_acct(SnowflakeParser.Full_acctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#full_acct}.
	 * @param ctx the parse tree
	 */
	void exitFull_acct(SnowflakeParser.Full_acctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#integration_type_name}.
	 * @param ctx the parse tree
	 */
	void enterIntegration_type_name(SnowflakeParser.Integration_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#integration_type_name}.
	 * @param ctx the parse tree
	 */
	void exitIntegration_type_name(SnowflakeParser.Integration_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_failover_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_failover_group(SnowflakeParser.Create_failover_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_failover_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_failover_group(SnowflakeParser.Create_failover_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#type_fileformat}.
	 * @param ctx the parse tree
	 */
	void enterType_fileformat(SnowflakeParser.Type_fileformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#type_fileformat}.
	 * @param ctx the parse tree
	 */
	void exitType_fileformat(SnowflakeParser.Type_fileformatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_file_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_file_format(SnowflakeParser.Create_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_file_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_file_format(SnowflakeParser.Create_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#arg_decl}.
	 * @param ctx the parse tree
	 */
	void enterArg_decl(SnowflakeParser.Arg_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#arg_decl}.
	 * @param ctx the parse tree
	 */
	void exitArg_decl(SnowflakeParser.Arg_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#arg_default_value_clause}.
	 * @param ctx the parse tree
	 */
	void enterArg_default_value_clause(SnowflakeParser.Arg_default_value_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#arg_default_value_clause}.
	 * @param ctx the parse tree
	 */
	void exitArg_default_value_clause(SnowflakeParser.Arg_default_value_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#col_decl}.
	 * @param ctx the parse tree
	 */
	void enterCol_decl(SnowflakeParser.Col_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#col_decl}.
	 * @param ctx the parse tree
	 */
	void exitCol_decl(SnowflakeParser.Col_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(SnowflakeParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(SnowflakeParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function(SnowflakeParser.Create_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function(SnowflakeParser.Create_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_managed_account}.
	 * @param ctx the parse tree
	 */
	void enterCreate_managed_account(SnowflakeParser.Create_managed_accountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_managed_account}.
	 * @param ctx the parse tree
	 */
	void exitCreate_managed_account(SnowflakeParser.Create_managed_accountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_masking_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_masking_policy(SnowflakeParser.Create_masking_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_masking_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_masking_policy(SnowflakeParser.Create_masking_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#tag_decl}.
	 * @param ctx the parse tree
	 */
	void enterTag_decl(SnowflakeParser.Tag_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#tag_decl}.
	 * @param ctx the parse tree
	 */
	void exitTag_decl(SnowflakeParser.Tag_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_list_in_parentheses}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list_in_parentheses(SnowflakeParser.Column_list_in_parenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_list_in_parentheses}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list_in_parentheses(SnowflakeParser.Column_list_in_parenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_materialized_view(SnowflakeParser.Create_materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_materialized_view(SnowflakeParser.Create_materialized_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_network_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_network_policy(SnowflakeParser.Create_network_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_network_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_network_policy(SnowflakeParser.Create_network_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#cloud_provider_params_auto}.
	 * @param ctx the parse tree
	 */
	void enterCloud_provider_params_auto(SnowflakeParser.Cloud_provider_params_autoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#cloud_provider_params_auto}.
	 * @param ctx the parse tree
	 */
	void exitCloud_provider_params_auto(SnowflakeParser.Cloud_provider_params_autoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#cloud_provider_params_push}.
	 * @param ctx the parse tree
	 */
	void enterCloud_provider_params_push(SnowflakeParser.Cloud_provider_params_pushContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#cloud_provider_params_push}.
	 * @param ctx the parse tree
	 */
	void exitCloud_provider_params_push(SnowflakeParser.Cloud_provider_params_pushContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_notification_integration}.
	 * @param ctx the parse tree
	 */
	void enterCreate_notification_integration(SnowflakeParser.Create_notification_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_notification_integration}.
	 * @param ctx the parse tree
	 */
	void exitCreate_notification_integration(SnowflakeParser.Create_notification_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_pipe}.
	 * @param ctx the parse tree
	 */
	void enterCreate_pipe(SnowflakeParser.Create_pipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_pipe}.
	 * @param ctx the parse tree
	 */
	void exitCreate_pipe(SnowflakeParser.Create_pipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#caller_owner}.
	 * @param ctx the parse tree
	 */
	void enterCaller_owner(SnowflakeParser.Caller_ownerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#caller_owner}.
	 * @param ctx the parse tree
	 */
	void exitCaller_owner(SnowflakeParser.Caller_ownerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#executa_as}.
	 * @param ctx the parse tree
	 */
	void enterExecuta_as(SnowflakeParser.Executa_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#executa_as}.
	 * @param ctx the parse tree
	 */
	void exitExecuta_as(SnowflakeParser.Executa_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#procedure_definition}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_definition(SnowflakeParser.Procedure_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#procedure_definition}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_definition(SnowflakeParser.Procedure_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#not_null}.
	 * @param ctx the parse tree
	 */
	void enterNot_null(SnowflakeParser.Not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#not_null}.
	 * @param ctx the parse tree
	 */
	void exitNot_null(SnowflakeParser.Not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure(SnowflakeParser.Create_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure(SnowflakeParser.Create_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_replication_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_replication_group(SnowflakeParser.Create_replication_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_replication_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_replication_group(SnowflakeParser.Create_replication_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_resource_monitor}.
	 * @param ctx the parse tree
	 */
	void enterCreate_resource_monitor(SnowflakeParser.Create_resource_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_resource_monitor}.
	 * @param ctx the parse tree
	 */
	void exitCreate_resource_monitor(SnowflakeParser.Create_resource_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_role(SnowflakeParser.Create_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_role(SnowflakeParser.Create_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_row_access_policy(SnowflakeParser.Create_row_access_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_row_access_policy(SnowflakeParser.Create_row_access_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema(SnowflakeParser.Create_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema(SnowflakeParser.Create_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_security_integration_external_oauth}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_integration_external_oauth(SnowflakeParser.Create_security_integration_external_oauthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_security_integration_external_oauth}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_integration_external_oauth(SnowflakeParser.Create_security_integration_external_oauthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#implicit_none}.
	 * @param ctx the parse tree
	 */
	void enterImplicit_none(SnowflakeParser.Implicit_noneContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#implicit_none}.
	 * @param ctx the parse tree
	 */
	void exitImplicit_none(SnowflakeParser.Implicit_noneContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_security_integration_snowflake_oauth}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_integration_snowflake_oauth(SnowflakeParser.Create_security_integration_snowflake_oauthContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_security_integration_snowflake_oauth}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_integration_snowflake_oauth(SnowflakeParser.Create_security_integration_snowflake_oauthContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_security_integration_saml2}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_integration_saml2(SnowflakeParser.Create_security_integration_saml2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_security_integration_saml2}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_integration_saml2(SnowflakeParser.Create_security_integration_saml2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_security_integration_scim}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_integration_scim(SnowflakeParser.Create_security_integration_scimContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_security_integration_scim}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_integration_scim(SnowflakeParser.Create_security_integration_scimContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#network_policy}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_policy(SnowflakeParser.Network_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#network_policy}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_policy(SnowflakeParser.Network_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#partner_application}.
	 * @param ctx the parse tree
	 */
	void enterPartner_application(SnowflakeParser.Partner_applicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#partner_application}.
	 * @param ctx the parse tree
	 */
	void exitPartner_application(SnowflakeParser.Partner_applicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#start_with}.
	 * @param ctx the parse tree
	 */
	void enterStart_with(SnowflakeParser.Start_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#start_with}.
	 * @param ctx the parse tree
	 */
	void exitStart_with(SnowflakeParser.Start_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#increment_by}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_by(SnowflakeParser.Increment_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#increment_by}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_by(SnowflakeParser.Increment_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(SnowflakeParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(SnowflakeParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_session_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_session_policy(SnowflakeParser.Create_session_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_session_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_session_policy(SnowflakeParser.Create_session_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_share}.
	 * @param ctx the parse tree
	 */
	void enterCreate_share(SnowflakeParser.Create_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_share}.
	 * @param ctx the parse tree
	 */
	void exitCreate_share(SnowflakeParser.Create_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(SnowflakeParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(SnowflakeParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#format_type_options}.
	 * @param ctx the parse tree
	 */
	void enterFormat_type_options(SnowflakeParser.Format_type_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#format_type_options}.
	 * @param ctx the parse tree
	 */
	void exitFormat_type_options(SnowflakeParser.Format_type_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#copy_options}.
	 * @param ctx the parse tree
	 */
	void enterCopy_options(SnowflakeParser.Copy_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#copy_options}.
	 * @param ctx the parse tree
	 */
	void exitCopy_options(SnowflakeParser.Copy_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_internal}.
	 * @param ctx the parse tree
	 */
	void enterStage_encryption_opts_internal(SnowflakeParser.Stage_encryption_opts_internalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_internal}.
	 * @param ctx the parse tree
	 */
	void exitStage_encryption_opts_internal(SnowflakeParser.Stage_encryption_opts_internalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stage_type}.
	 * @param ctx the parse tree
	 */
	void enterStage_type(SnowflakeParser.Stage_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stage_type}.
	 * @param ctx the parse tree
	 */
	void exitStage_type(SnowflakeParser.Stage_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stage_master_key}.
	 * @param ctx the parse tree
	 */
	void enterStage_master_key(SnowflakeParser.Stage_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stage_master_key}.
	 * @param ctx the parse tree
	 */
	void exitStage_master_key(SnowflakeParser.Stage_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stage_kms_key}.
	 * @param ctx the parse tree
	 */
	void enterStage_kms_key(SnowflakeParser.Stage_kms_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stage_kms_key}.
	 * @param ctx the parse tree
	 */
	void exitStage_kms_key(SnowflakeParser.Stage_kms_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_aws}.
	 * @param ctx the parse tree
	 */
	void enterStage_encryption_opts_aws(SnowflakeParser.Stage_encryption_opts_awsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_aws}.
	 * @param ctx the parse tree
	 */
	void exitStage_encryption_opts_aws(SnowflakeParser.Stage_encryption_opts_awsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#aws_token}.
	 * @param ctx the parse tree
	 */
	void enterAws_token(SnowflakeParser.Aws_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#aws_token}.
	 * @param ctx the parse tree
	 */
	void exitAws_token(SnowflakeParser.Aws_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#aws_key_id}.
	 * @param ctx the parse tree
	 */
	void enterAws_key_id(SnowflakeParser.Aws_key_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#aws_key_id}.
	 * @param ctx the parse tree
	 */
	void exitAws_key_id(SnowflakeParser.Aws_key_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#aws_secret_key}.
	 * @param ctx the parse tree
	 */
	void enterAws_secret_key(SnowflakeParser.Aws_secret_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#aws_secret_key}.
	 * @param ctx the parse tree
	 */
	void exitAws_secret_key(SnowflakeParser.Aws_secret_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#aws_role}.
	 * @param ctx the parse tree
	 */
	void enterAws_role(SnowflakeParser.Aws_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#aws_role}.
	 * @param ctx the parse tree
	 */
	void exitAws_role(SnowflakeParser.Aws_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#azure_encryption_value}.
	 * @param ctx the parse tree
	 */
	void enterAzure_encryption_value(SnowflakeParser.Azure_encryption_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#azure_encryption_value}.
	 * @param ctx the parse tree
	 */
	void exitAzure_encryption_value(SnowflakeParser.Azure_encryption_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_az}.
	 * @param ctx the parse tree
	 */
	void enterStage_encryption_opts_az(SnowflakeParser.Stage_encryption_opts_azContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_az}.
	 * @param ctx the parse tree
	 */
	void exitStage_encryption_opts_az(SnowflakeParser.Stage_encryption_opts_azContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#storage_integration_eq_id}.
	 * @param ctx the parse tree
	 */
	void enterStorage_integration_eq_id(SnowflakeParser.Storage_integration_eq_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#storage_integration_eq_id}.
	 * @param ctx the parse tree
	 */
	void exitStorage_integration_eq_id(SnowflakeParser.Storage_integration_eq_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#az_credential_or_storage_integration}.
	 * @param ctx the parse tree
	 */
	void enterAz_credential_or_storage_integration(SnowflakeParser.Az_credential_or_storage_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#az_credential_or_storage_integration}.
	 * @param ctx the parse tree
	 */
	void exitAz_credential_or_storage_integration(SnowflakeParser.Az_credential_or_storage_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#gcp_encryption_value}.
	 * @param ctx the parse tree
	 */
	void enterGcp_encryption_value(SnowflakeParser.Gcp_encryption_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#gcp_encryption_value}.
	 * @param ctx the parse tree
	 */
	void exitGcp_encryption_value(SnowflakeParser.Gcp_encryption_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_gcp}.
	 * @param ctx the parse tree
	 */
	void enterStage_encryption_opts_gcp(SnowflakeParser.Stage_encryption_opts_gcpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stage_encryption_opts_gcp}.
	 * @param ctx the parse tree
	 */
	void exitStage_encryption_opts_gcp(SnowflakeParser.Stage_encryption_opts_gcpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#aws_credential_or_storage_integration}.
	 * @param ctx the parse tree
	 */
	void enterAws_credential_or_storage_integration(SnowflakeParser.Aws_credential_or_storage_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#aws_credential_or_storage_integration}.
	 * @param ctx the parse tree
	 */
	void exitAws_credential_or_storage_integration(SnowflakeParser.Aws_credential_or_storage_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#external_stage_params}.
	 * @param ctx the parse tree
	 */
	void enterExternal_stage_params(SnowflakeParser.External_stage_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#external_stage_params}.
	 * @param ctx the parse tree
	 */
	void exitExternal_stage_params(SnowflakeParser.External_stage_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#true_false}.
	 * @param ctx the parse tree
	 */
	void enterTrue_false(SnowflakeParser.True_falseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#true_false}.
	 * @param ctx the parse tree
	 */
	void exitTrue_false(SnowflakeParser.True_falseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#enable}.
	 * @param ctx the parse tree
	 */
	void enterEnable(SnowflakeParser.EnableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#enable}.
	 * @param ctx the parse tree
	 */
	void exitEnable(SnowflakeParser.EnableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#refresh_on_create}.
	 * @param ctx the parse tree
	 */
	void enterRefresh_on_create(SnowflakeParser.Refresh_on_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#refresh_on_create}.
	 * @param ctx the parse tree
	 */
	void exitRefresh_on_create(SnowflakeParser.Refresh_on_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#auto_refresh}.
	 * @param ctx the parse tree
	 */
	void enterAuto_refresh(SnowflakeParser.Auto_refreshContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#auto_refresh}.
	 * @param ctx the parse tree
	 */
	void exitAuto_refresh(SnowflakeParser.Auto_refreshContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#notification_integration}.
	 * @param ctx the parse tree
	 */
	void enterNotification_integration(SnowflakeParser.Notification_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#notification_integration}.
	 * @param ctx the parse tree
	 */
	void exitNotification_integration(SnowflakeParser.Notification_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#directory_table_internal_params}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_table_internal_params(SnowflakeParser.Directory_table_internal_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#directory_table_internal_params}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_table_internal_params(SnowflakeParser.Directory_table_internal_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#directory_table_external_params}.
	 * @param ctx the parse tree
	 */
	void enterDirectory_table_external_params(SnowflakeParser.Directory_table_external_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#directory_table_external_params}.
	 * @param ctx the parse tree
	 */
	void exitDirectory_table_external_params(SnowflakeParser.Directory_table_external_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_stage}.
	 * @param ctx the parse tree
	 */
	void enterCreate_stage(SnowflakeParser.Create_stageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_stage}.
	 * @param ctx the parse tree
	 */
	void exitCreate_stage(SnowflakeParser.Create_stageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alter_stage}.
	 * @param ctx the parse tree
	 */
	void enterAlter_stage(SnowflakeParser.Alter_stageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alter_stage}.
	 * @param ctx the parse tree
	 */
	void exitAlter_stage(SnowflakeParser.Alter_stageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_stage}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stage(SnowflakeParser.Drop_stageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_stage}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stage(SnowflakeParser.Drop_stageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_stage}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stage(SnowflakeParser.Describe_stageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_stage}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stage(SnowflakeParser.Describe_stageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_stages}.
	 * @param ctx the parse tree
	 */
	void enterShow_stages(SnowflakeParser.Show_stagesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_stages}.
	 * @param ctx the parse tree
	 */
	void exitShow_stages(SnowflakeParser.Show_stagesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#cloud_provider_params}.
	 * @param ctx the parse tree
	 */
	void enterCloud_provider_params(SnowflakeParser.Cloud_provider_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#cloud_provider_params}.
	 * @param ctx the parse tree
	 */
	void exitCloud_provider_params(SnowflakeParser.Cloud_provider_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#cloud_provider_params2}.
	 * @param ctx the parse tree
	 */
	void enterCloud_provider_params2(SnowflakeParser.Cloud_provider_params2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#cloud_provider_params2}.
	 * @param ctx the parse tree
	 */
	void exitCloud_provider_params2(SnowflakeParser.Cloud_provider_params2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#cloud_provider_params3}.
	 * @param ctx the parse tree
	 */
	void enterCloud_provider_params3(SnowflakeParser.Cloud_provider_params3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#cloud_provider_params3}.
	 * @param ctx the parse tree
	 */
	void exitCloud_provider_params3(SnowflakeParser.Cloud_provider_params3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_storage_integration}.
	 * @param ctx the parse tree
	 */
	void enterCreate_storage_integration(SnowflakeParser.Create_storage_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_storage_integration}.
	 * @param ctx the parse tree
	 */
	void exitCreate_storage_integration(SnowflakeParser.Create_storage_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#copy_grants}.
	 * @param ctx the parse tree
	 */
	void enterCopy_grants(SnowflakeParser.Copy_grantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#copy_grants}.
	 * @param ctx the parse tree
	 */
	void exitCopy_grants(SnowflakeParser.Copy_grantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#append_only}.
	 * @param ctx the parse tree
	 */
	void enterAppend_only(SnowflakeParser.Append_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#append_only}.
	 * @param ctx the parse tree
	 */
	void exitAppend_only(SnowflakeParser.Append_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#insert_only}.
	 * @param ctx the parse tree
	 */
	void enterInsert_only(SnowflakeParser.Insert_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#insert_only}.
	 * @param ctx the parse tree
	 */
	void exitInsert_only(SnowflakeParser.Insert_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_initial_rows}.
	 * @param ctx the parse tree
	 */
	void enterShow_initial_rows(SnowflakeParser.Show_initial_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_initial_rows}.
	 * @param ctx the parse tree
	 */
	void exitShow_initial_rows(SnowflakeParser.Show_initial_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#stream_time}.
	 * @param ctx the parse tree
	 */
	void enterStream_time(SnowflakeParser.Stream_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#stream_time}.
	 * @param ctx the parse tree
	 */
	void exitStream_time(SnowflakeParser.Stream_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_stream}.
	 * @param ctx the parse tree
	 */
	void enterCreate_stream(SnowflakeParser.Create_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_stream}.
	 * @param ctx the parse tree
	 */
	void exitCreate_stream(SnowflakeParser.Create_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#temporary}.
	 * @param ctx the parse tree
	 */
	void enterTemporary(SnowflakeParser.TemporaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#temporary}.
	 * @param ctx the parse tree
	 */
	void exitTemporary(SnowflakeParser.TemporaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#table_type}.
	 * @param ctx the parse tree
	 */
	void enterTable_type(SnowflakeParser.Table_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#table_type}.
	 * @param ctx the parse tree
	 */
	void exitTable_type(SnowflakeParser.Table_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#with_tags}.
	 * @param ctx the parse tree
	 */
	void enterWith_tags(SnowflakeParser.With_tagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#with_tags}.
	 * @param ctx the parse tree
	 */
	void exitWith_tags(SnowflakeParser.With_tagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#with_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void enterWith_row_access_policy(SnowflakeParser.With_row_access_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#with_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void exitWith_row_access_policy(SnowflakeParser.With_row_access_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#cluster_by}.
	 * @param ctx the parse tree
	 */
	void enterCluster_by(SnowflakeParser.Cluster_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#cluster_by}.
	 * @param ctx the parse tree
	 */
	void exitCluster_by(SnowflakeParser.Cluster_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#change_tracking}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking(SnowflakeParser.Change_trackingContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#change_tracking}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking(SnowflakeParser.Change_trackingContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#with_masking_policy}.
	 * @param ctx the parse tree
	 */
	void enterWith_masking_policy(SnowflakeParser.With_masking_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#with_masking_policy}.
	 * @param ctx the parse tree
	 */
	void exitWith_masking_policy(SnowflakeParser.With_masking_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#collate}.
	 * @param ctx the parse tree
	 */
	void enterCollate(SnowflakeParser.CollateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#collate}.
	 * @param ctx the parse tree
	 */
	void exitCollate(SnowflakeParser.CollateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#order_noorder}.
	 * @param ctx the parse tree
	 */
	void enterOrder_noorder(SnowflakeParser.Order_noorderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#order_noorder}.
	 * @param ctx the parse tree
	 */
	void exitOrder_noorder(SnowflakeParser.Order_noorderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(SnowflakeParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(SnowflakeParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key(SnowflakeParser.Foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key(SnowflakeParser.Foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#primary_key}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key(SnowflakeParser.Primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#primary_key}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key(SnowflakeParser.Primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 */
	void enterOut_of_line_constraint(SnowflakeParser.Out_of_line_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#out_of_line_constraint}.
	 * @param ctx the parse tree
	 */
	void exitOut_of_line_constraint(SnowflakeParser.Out_of_line_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#full_col_decl}.
	 * @param ctx the parse tree
	 */
	void enterFull_col_decl(SnowflakeParser.Full_col_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#full_col_decl}.
	 * @param ctx the parse tree
	 */
	void exitFull_col_decl(SnowflakeParser.Full_col_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_decl_item}.
	 * @param ctx the parse tree
	 */
	void enterColumn_decl_item(SnowflakeParser.Column_decl_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_decl_item}.
	 * @param ctx the parse tree
	 */
	void exitColumn_decl_item(SnowflakeParser.Column_decl_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_decl_item_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_decl_item_list(SnowflakeParser.Column_decl_item_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_decl_item_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_decl_item_list(SnowflakeParser.Column_decl_item_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(SnowflakeParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(SnowflakeParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_decl_item_list_paren}.
	 * @param ctx the parse tree
	 */
	void enterColumn_decl_item_list_paren(SnowflakeParser.Column_decl_item_list_parenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_decl_item_list_paren}.
	 * @param ctx the parse tree
	 */
	void exitColumn_decl_item_list_paren(SnowflakeParser.Column_decl_item_list_parenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_clause(SnowflakeParser.Create_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_clause(SnowflakeParser.Create_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_table_as_select}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_as_select(SnowflakeParser.Create_table_as_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_table_as_select}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_as_select(SnowflakeParser.Create_table_as_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_table_like}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_like(SnowflakeParser.Create_table_likeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_table_like}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_like(SnowflakeParser.Create_table_likeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_tag}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tag(SnowflakeParser.Create_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_tag}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tag(SnowflakeParser.Create_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#tag_allowed_values}.
	 * @param ctx the parse tree
	 */
	void enterTag_allowed_values(SnowflakeParser.Tag_allowed_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#tag_allowed_values}.
	 * @param ctx the parse tree
	 */
	void exitTag_allowed_values(SnowflakeParser.Tag_allowed_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#session_parameter}.
	 * @param ctx the parse tree
	 */
	void enterSession_parameter(SnowflakeParser.Session_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#session_parameter}.
	 * @param ctx the parse tree
	 */
	void exitSession_parameter(SnowflakeParser.Session_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#session_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterSession_parameter_list(SnowflakeParser.Session_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#session_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitSession_parameter_list(SnowflakeParser.Session_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#session_params_list}.
	 * @param ctx the parse tree
	 */
	void enterSession_params_list(SnowflakeParser.Session_params_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#session_params_list}.
	 * @param ctx the parse tree
	 */
	void exitSession_params_list(SnowflakeParser.Session_params_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_task}.
	 * @param ctx the parse tree
	 */
	void enterCreate_task(SnowflakeParser.Create_taskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_task}.
	 * @param ctx the parse tree
	 */
	void exitCreate_task(SnowflakeParser.Create_taskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#task_parameters}.
	 * @param ctx the parse tree
	 */
	void enterTask_parameters(SnowflakeParser.Task_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#task_parameters}.
	 * @param ctx the parse tree
	 */
	void exitTask_parameters(SnowflakeParser.Task_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#task_compute}.
	 * @param ctx the parse tree
	 */
	void enterTask_compute(SnowflakeParser.Task_computeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#task_compute}.
	 * @param ctx the parse tree
	 */
	void exitTask_compute(SnowflakeParser.Task_computeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#task_schedule}.
	 * @param ctx the parse tree
	 */
	void enterTask_schedule(SnowflakeParser.Task_scheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#task_schedule}.
	 * @param ctx the parse tree
	 */
	void exitTask_schedule(SnowflakeParser.Task_scheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#task_timeout}.
	 * @param ctx the parse tree
	 */
	void enterTask_timeout(SnowflakeParser.Task_timeoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#task_timeout}.
	 * @param ctx the parse tree
	 */
	void exitTask_timeout(SnowflakeParser.Task_timeoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#task_suspend_after_failure_number}.
	 * @param ctx the parse tree
	 */
	void enterTask_suspend_after_failure_number(SnowflakeParser.Task_suspend_after_failure_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#task_suspend_after_failure_number}.
	 * @param ctx the parse tree
	 */
	void exitTask_suspend_after_failure_number(SnowflakeParser.Task_suspend_after_failure_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#task_error_integration}.
	 * @param ctx the parse tree
	 */
	void enterTask_error_integration(SnowflakeParser.Task_error_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#task_error_integration}.
	 * @param ctx the parse tree
	 */
	void exitTask_error_integration(SnowflakeParser.Task_error_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#task_overlap}.
	 * @param ctx the parse tree
	 */
	void enterTask_overlap(SnowflakeParser.Task_overlapContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#task_overlap}.
	 * @param ctx the parse tree
	 */
	void exitTask_overlap(SnowflakeParser.Task_overlapContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(SnowflakeParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(SnowflakeParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(SnowflakeParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(SnowflakeParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(SnowflakeParser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(SnowflakeParser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#view_col}.
	 * @param ctx the parse tree
	 */
	void enterView_col(SnowflakeParser.View_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#view_col}.
	 * @param ctx the parse tree
	 */
	void exitView_col(SnowflakeParser.View_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(SnowflakeParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(SnowflakeParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#create_warehouse}.
	 * @param ctx the parse tree
	 */
	void enterCreate_warehouse(SnowflakeParser.Create_warehouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#create_warehouse}.
	 * @param ctx the parse tree
	 */
	void exitCreate_warehouse(SnowflakeParser.Create_warehouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#wh_common_size}.
	 * @param ctx the parse tree
	 */
	void enterWh_common_size(SnowflakeParser.Wh_common_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#wh_common_size}.
	 * @param ctx the parse tree
	 */
	void exitWh_common_size(SnowflakeParser.Wh_common_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#wh_extra_size}.
	 * @param ctx the parse tree
	 */
	void enterWh_extra_size(SnowflakeParser.Wh_extra_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#wh_extra_size}.
	 * @param ctx the parse tree
	 */
	void exitWh_extra_size(SnowflakeParser.Wh_extra_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#wh_properties}.
	 * @param ctx the parse tree
	 */
	void enterWh_properties(SnowflakeParser.Wh_propertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#wh_properties}.
	 * @param ctx the parse tree
	 */
	void exitWh_properties(SnowflakeParser.Wh_propertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#wh_params}.
	 * @param ctx the parse tree
	 */
	void enterWh_params(SnowflakeParser.Wh_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#wh_params}.
	 * @param ctx the parse tree
	 */
	void exitWh_params(SnowflakeParser.Wh_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#trigger_definition}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_definition(SnowflakeParser.Trigger_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#trigger_definition}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_definition(SnowflakeParser.Trigger_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_type_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_name(SnowflakeParser.Object_type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_type_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_name(SnowflakeParser.Object_type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_type_plural}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_plural(SnowflakeParser.Object_type_pluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_type_plural}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_plural(SnowflakeParser.Object_type_pluralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_command}.
	 * @param ctx the parse tree
	 */
	void enterDrop_command(SnowflakeParser.Drop_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_command}.
	 * @param ctx the parse tree
	 */
	void exitDrop_command(SnowflakeParser.Drop_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_object}.
	 * @param ctx the parse tree
	 */
	void enterDrop_object(SnowflakeParser.Drop_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_object}.
	 * @param ctx the parse tree
	 */
	void exitDrop_object(SnowflakeParser.Drop_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_alert}.
	 * @param ctx the parse tree
	 */
	void enterDrop_alert(SnowflakeParser.Drop_alertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_alert}.
	 * @param ctx the parse tree
	 */
	void exitDrop_alert(SnowflakeParser.Drop_alertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_connection}.
	 * @param ctx the parse tree
	 */
	void enterDrop_connection(SnowflakeParser.Drop_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_connection}.
	 * @param ctx the parse tree
	 */
	void exitDrop_connection(SnowflakeParser.Drop_connectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(SnowflakeParser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(SnowflakeParser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_dynamic_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_dynamic_table(SnowflakeParser.Drop_dynamic_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_dynamic_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_dynamic_table(SnowflakeParser.Drop_dynamic_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_table(SnowflakeParser.Drop_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_table(SnowflakeParser.Drop_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_failover_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_failover_group(SnowflakeParser.Drop_failover_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_failover_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_failover_group(SnowflakeParser.Drop_failover_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_file_format}.
	 * @param ctx the parse tree
	 */
	void enterDrop_file_format(SnowflakeParser.Drop_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_file_format}.
	 * @param ctx the parse tree
	 */
	void exitDrop_file_format(SnowflakeParser.Drop_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(SnowflakeParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(SnowflakeParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_integration}.
	 * @param ctx the parse tree
	 */
	void enterDrop_integration(SnowflakeParser.Drop_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_integration}.
	 * @param ctx the parse tree
	 */
	void exitDrop_integration(SnowflakeParser.Drop_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_managed_account}.
	 * @param ctx the parse tree
	 */
	void enterDrop_managed_account(SnowflakeParser.Drop_managed_accountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_managed_account}.
	 * @param ctx the parse tree
	 */
	void exitDrop_managed_account(SnowflakeParser.Drop_managed_accountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_masking_policy}.
	 * @param ctx the parse tree
	 */
	void enterDrop_masking_policy(SnowflakeParser.Drop_masking_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_masking_policy}.
	 * @param ctx the parse tree
	 */
	void exitDrop_masking_policy(SnowflakeParser.Drop_masking_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_materialized_view(SnowflakeParser.Drop_materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_materialized_view(SnowflakeParser.Drop_materialized_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_network_policy}.
	 * @param ctx the parse tree
	 */
	void enterDrop_network_policy(SnowflakeParser.Drop_network_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_network_policy}.
	 * @param ctx the parse tree
	 */
	void exitDrop_network_policy(SnowflakeParser.Drop_network_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_pipe}.
	 * @param ctx the parse tree
	 */
	void enterDrop_pipe(SnowflakeParser.Drop_pipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_pipe}.
	 * @param ctx the parse tree
	 */
	void exitDrop_pipe(SnowflakeParser.Drop_pipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(SnowflakeParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(SnowflakeParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_replication_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_replication_group(SnowflakeParser.Drop_replication_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_replication_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_replication_group(SnowflakeParser.Drop_replication_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_resource_monitor}.
	 * @param ctx the parse tree
	 */
	void enterDrop_resource_monitor(SnowflakeParser.Drop_resource_monitorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_resource_monitor}.
	 * @param ctx the parse tree
	 */
	void exitDrop_resource_monitor(SnowflakeParser.Drop_resource_monitorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_role(SnowflakeParser.Drop_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_role(SnowflakeParser.Drop_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void enterDrop_row_access_policy(SnowflakeParser.Drop_row_access_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void exitDrop_row_access_policy(SnowflakeParser.Drop_row_access_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema(SnowflakeParser.Drop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema(SnowflakeParser.Drop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(SnowflakeParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(SnowflakeParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_session_policy}.
	 * @param ctx the parse tree
	 */
	void enterDrop_session_policy(SnowflakeParser.Drop_session_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_session_policy}.
	 * @param ctx the parse tree
	 */
	void exitDrop_session_policy(SnowflakeParser.Drop_session_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_share}.
	 * @param ctx the parse tree
	 */
	void enterDrop_share(SnowflakeParser.Drop_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_share}.
	 * @param ctx the parse tree
	 */
	void exitDrop_share(SnowflakeParser.Drop_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_stream}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stream(SnowflakeParser.Drop_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_stream}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stream(SnowflakeParser.Drop_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(SnowflakeParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(SnowflakeParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_tag}.
	 * @param ctx the parse tree
	 */
	void enterDrop_tag(SnowflakeParser.Drop_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_tag}.
	 * @param ctx the parse tree
	 */
	void exitDrop_tag(SnowflakeParser.Drop_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_task}.
	 * @param ctx the parse tree
	 */
	void enterDrop_task(SnowflakeParser.Drop_taskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_task}.
	 * @param ctx the parse tree
	 */
	void exitDrop_task(SnowflakeParser.Drop_taskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_user}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user(SnowflakeParser.Drop_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_user}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user(SnowflakeParser.Drop_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view(SnowflakeParser.Drop_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view(SnowflakeParser.Drop_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#drop_warehouse}.
	 * @param ctx the parse tree
	 */
	void enterDrop_warehouse(SnowflakeParser.Drop_warehouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#drop_warehouse}.
	 * @param ctx the parse tree
	 */
	void exitDrop_warehouse(SnowflakeParser.Drop_warehouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void enterCascade_restrict(SnowflakeParser.Cascade_restrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void exitCascade_restrict(SnowflakeParser.Cascade_restrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#arg_types}.
	 * @param ctx the parse tree
	 */
	void enterArg_types(SnowflakeParser.Arg_typesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#arg_types}.
	 * @param ctx the parse tree
	 */
	void exitArg_types(SnowflakeParser.Arg_typesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#undrop_command}.
	 * @param ctx the parse tree
	 */
	void enterUndrop_command(SnowflakeParser.Undrop_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#undrop_command}.
	 * @param ctx the parse tree
	 */
	void exitUndrop_command(SnowflakeParser.Undrop_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#undrop_database}.
	 * @param ctx the parse tree
	 */
	void enterUndrop_database(SnowflakeParser.Undrop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#undrop_database}.
	 * @param ctx the parse tree
	 */
	void exitUndrop_database(SnowflakeParser.Undrop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#undrop_schema}.
	 * @param ctx the parse tree
	 */
	void enterUndrop_schema(SnowflakeParser.Undrop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#undrop_schema}.
	 * @param ctx the parse tree
	 */
	void exitUndrop_schema(SnowflakeParser.Undrop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#undrop_table}.
	 * @param ctx the parse tree
	 */
	void enterUndrop_table(SnowflakeParser.Undrop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#undrop_table}.
	 * @param ctx the parse tree
	 */
	void exitUndrop_table(SnowflakeParser.Undrop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#undrop_tag}.
	 * @param ctx the parse tree
	 */
	void enterUndrop_tag(SnowflakeParser.Undrop_tagContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#undrop_tag}.
	 * @param ctx the parse tree
	 */
	void exitUndrop_tag(SnowflakeParser.Undrop_tagContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#use_command}.
	 * @param ctx the parse tree
	 */
	void enterUse_command(SnowflakeParser.Use_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#use_command}.
	 * @param ctx the parse tree
	 */
	void exitUse_command(SnowflakeParser.Use_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#use_database}.
	 * @param ctx the parse tree
	 */
	void enterUse_database(SnowflakeParser.Use_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#use_database}.
	 * @param ctx the parse tree
	 */
	void exitUse_database(SnowflakeParser.Use_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#use_role}.
	 * @param ctx the parse tree
	 */
	void enterUse_role(SnowflakeParser.Use_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#use_role}.
	 * @param ctx the parse tree
	 */
	void exitUse_role(SnowflakeParser.Use_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#use_schema}.
	 * @param ctx the parse tree
	 */
	void enterUse_schema(SnowflakeParser.Use_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#use_schema}.
	 * @param ctx the parse tree
	 */
	void exitUse_schema(SnowflakeParser.Use_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#use_secondary_roles}.
	 * @param ctx the parse tree
	 */
	void enterUse_secondary_roles(SnowflakeParser.Use_secondary_rolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#use_secondary_roles}.
	 * @param ctx the parse tree
	 */
	void exitUse_secondary_roles(SnowflakeParser.Use_secondary_rolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#use_warehouse}.
	 * @param ctx the parse tree
	 */
	void enterUse_warehouse(SnowflakeParser.Use_warehouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#use_warehouse}.
	 * @param ctx the parse tree
	 */
	void exitUse_warehouse(SnowflakeParser.Use_warehouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#comment_clause}.
	 * @param ctx the parse tree
	 */
	void enterComment_clause(SnowflakeParser.Comment_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#comment_clause}.
	 * @param ctx the parse tree
	 */
	void exitComment_clause(SnowflakeParser.Comment_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#if_suspended}.
	 * @param ctx the parse tree
	 */
	void enterIf_suspended(SnowflakeParser.If_suspendedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#if_suspended}.
	 * @param ctx the parse tree
	 */
	void exitIf_suspended(SnowflakeParser.If_suspendedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#if_exists}.
	 * @param ctx the parse tree
	 */
	void enterIf_exists(SnowflakeParser.If_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#if_exists}.
	 * @param ctx the parse tree
	 */
	void exitIf_exists(SnowflakeParser.If_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#if_not_exists}.
	 * @param ctx the parse tree
	 */
	void enterIf_not_exists(SnowflakeParser.If_not_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#if_not_exists}.
	 * @param ctx the parse tree
	 */
	void exitIf_not_exists(SnowflakeParser.If_not_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#or_replace}.
	 * @param ctx the parse tree
	 */
	void enterOr_replace(SnowflakeParser.Or_replaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#or_replace}.
	 * @param ctx the parse tree
	 */
	void exitOr_replace(SnowflakeParser.Or_replaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe}.
	 * @param ctx the parse tree
	 */
	void enterDescribe(SnowflakeParser.DescribeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe}.
	 * @param ctx the parse tree
	 */
	void exitDescribe(SnowflakeParser.DescribeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_command}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_command(SnowflakeParser.Describe_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_command}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_command(SnowflakeParser.Describe_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_alert}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_alert(SnowflakeParser.Describe_alertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_alert}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_alert(SnowflakeParser.Describe_alertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_database}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_database(SnowflakeParser.Describe_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_database}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_database(SnowflakeParser.Describe_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_dynamic_table}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_dynamic_table(SnowflakeParser.Describe_dynamic_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_dynamic_table}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_dynamic_table(SnowflakeParser.Describe_dynamic_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_event_table}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_event_table(SnowflakeParser.Describe_event_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_event_table}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_event_table(SnowflakeParser.Describe_event_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_external_table}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_external_table(SnowflakeParser.Describe_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_external_table}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_external_table(SnowflakeParser.Describe_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_file_format}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_file_format(SnowflakeParser.Describe_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_file_format}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_file_format(SnowflakeParser.Describe_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_function}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_function(SnowflakeParser.Describe_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_function}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_function(SnowflakeParser.Describe_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_integration}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_integration(SnowflakeParser.Describe_integrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_integration}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_integration(SnowflakeParser.Describe_integrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_masking_policy}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_masking_policy(SnowflakeParser.Describe_masking_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_masking_policy}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_masking_policy(SnowflakeParser.Describe_masking_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_materialized_view}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_materialized_view(SnowflakeParser.Describe_materialized_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_materialized_view}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_materialized_view(SnowflakeParser.Describe_materialized_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_network_policy}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_network_policy(SnowflakeParser.Describe_network_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_network_policy}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_network_policy(SnowflakeParser.Describe_network_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_pipe}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_pipe(SnowflakeParser.Describe_pipeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_pipe}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_pipe(SnowflakeParser.Describe_pipeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_procedure(SnowflakeParser.Describe_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_procedure(SnowflakeParser.Describe_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_result}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_result(SnowflakeParser.Describe_resultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_result}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_result(SnowflakeParser.Describe_resultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_row_access_policy(SnowflakeParser.Describe_row_access_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_row_access_policy}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_row_access_policy(SnowflakeParser.Describe_row_access_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_schema}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_schema(SnowflakeParser.Describe_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_schema}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_schema(SnowflakeParser.Describe_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_search_optimization}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_search_optimization(SnowflakeParser.Describe_search_optimizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_search_optimization}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_search_optimization(SnowflakeParser.Describe_search_optimizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_sequence(SnowflakeParser.Describe_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_sequence(SnowflakeParser.Describe_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_session_policy}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_session_policy(SnowflakeParser.Describe_session_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_session_policy}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_session_policy(SnowflakeParser.Describe_session_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_share}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_share(SnowflakeParser.Describe_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_share}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_share(SnowflakeParser.Describe_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_stream}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stream(SnowflakeParser.Describe_streamContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_stream}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stream(SnowflakeParser.Describe_streamContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_table}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_table(SnowflakeParser.Describe_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_table}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_table(SnowflakeParser.Describe_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_task}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_task(SnowflakeParser.Describe_taskContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_task}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_task(SnowflakeParser.Describe_taskContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_transaction}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_transaction(SnowflakeParser.Describe_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_transaction}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_transaction(SnowflakeParser.Describe_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_user}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_user(SnowflakeParser.Describe_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_user}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_user(SnowflakeParser.Describe_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_view}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_view(SnowflakeParser.Describe_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_view}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_view(SnowflakeParser.Describe_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#describe_warehouse}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_warehouse(SnowflakeParser.Describe_warehouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#describe_warehouse}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_warehouse(SnowflakeParser.Describe_warehouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_command}.
	 * @param ctx the parse tree
	 */
	void enterShow_command(SnowflakeParser.Show_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_command}.
	 * @param ctx the parse tree
	 */
	void exitShow_command(SnowflakeParser.Show_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_alerts}.
	 * @param ctx the parse tree
	 */
	void enterShow_alerts(SnowflakeParser.Show_alertsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_alerts}.
	 * @param ctx the parse tree
	 */
	void exitShow_alerts(SnowflakeParser.Show_alertsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_channels}.
	 * @param ctx the parse tree
	 */
	void enterShow_channels(SnowflakeParser.Show_channelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_channels}.
	 * @param ctx the parse tree
	 */
	void exitShow_channels(SnowflakeParser.Show_channelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_columns}.
	 * @param ctx the parse tree
	 */
	void enterShow_columns(SnowflakeParser.Show_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_columns}.
	 * @param ctx the parse tree
	 */
	void exitShow_columns(SnowflakeParser.Show_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_connections}.
	 * @param ctx the parse tree
	 */
	void enterShow_connections(SnowflakeParser.Show_connectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_connections}.
	 * @param ctx the parse tree
	 */
	void exitShow_connections(SnowflakeParser.Show_connectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#starts_with}.
	 * @param ctx the parse tree
	 */
	void enterStarts_with(SnowflakeParser.Starts_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#starts_with}.
	 * @param ctx the parse tree
	 */
	void exitStarts_with(SnowflakeParser.Starts_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#limit_rows}.
	 * @param ctx the parse tree
	 */
	void enterLimit_rows(SnowflakeParser.Limit_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#limit_rows}.
	 * @param ctx the parse tree
	 */
	void exitLimit_rows(SnowflakeParser.Limit_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_databases}.
	 * @param ctx the parse tree
	 */
	void enterShow_databases(SnowflakeParser.Show_databasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_databases}.
	 * @param ctx the parse tree
	 */
	void exitShow_databases(SnowflakeParser.Show_databasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_databases_in_failover_group}.
	 * @param ctx the parse tree
	 */
	void enterShow_databases_in_failover_group(SnowflakeParser.Show_databases_in_failover_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_databases_in_failover_group}.
	 * @param ctx the parse tree
	 */
	void exitShow_databases_in_failover_group(SnowflakeParser.Show_databases_in_failover_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_databases_in_replication_group}.
	 * @param ctx the parse tree
	 */
	void enterShow_databases_in_replication_group(SnowflakeParser.Show_databases_in_replication_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_databases_in_replication_group}.
	 * @param ctx the parse tree
	 */
	void exitShow_databases_in_replication_group(SnowflakeParser.Show_databases_in_replication_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_delegated_authorizations}.
	 * @param ctx the parse tree
	 */
	void enterShow_delegated_authorizations(SnowflakeParser.Show_delegated_authorizationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_delegated_authorizations}.
	 * @param ctx the parse tree
	 */
	void exitShow_delegated_authorizations(SnowflakeParser.Show_delegated_authorizationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_dynamic_tables}.
	 * @param ctx the parse tree
	 */
	void enterShow_dynamic_tables(SnowflakeParser.Show_dynamic_tablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_dynamic_tables}.
	 * @param ctx the parse tree
	 */
	void exitShow_dynamic_tables(SnowflakeParser.Show_dynamic_tablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_event_tables}.
	 * @param ctx the parse tree
	 */
	void enterShow_event_tables(SnowflakeParser.Show_event_tablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_event_tables}.
	 * @param ctx the parse tree
	 */
	void exitShow_event_tables(SnowflakeParser.Show_event_tablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_external_functions}.
	 * @param ctx the parse tree
	 */
	void enterShow_external_functions(SnowflakeParser.Show_external_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_external_functions}.
	 * @param ctx the parse tree
	 */
	void exitShow_external_functions(SnowflakeParser.Show_external_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_external_tables}.
	 * @param ctx the parse tree
	 */
	void enterShow_external_tables(SnowflakeParser.Show_external_tablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_external_tables}.
	 * @param ctx the parse tree
	 */
	void exitShow_external_tables(SnowflakeParser.Show_external_tablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_failover_groups}.
	 * @param ctx the parse tree
	 */
	void enterShow_failover_groups(SnowflakeParser.Show_failover_groupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_failover_groups}.
	 * @param ctx the parse tree
	 */
	void exitShow_failover_groups(SnowflakeParser.Show_failover_groupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_file_formats}.
	 * @param ctx the parse tree
	 */
	void enterShow_file_formats(SnowflakeParser.Show_file_formatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_file_formats}.
	 * @param ctx the parse tree
	 */
	void exitShow_file_formats(SnowflakeParser.Show_file_formatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_functions}.
	 * @param ctx the parse tree
	 */
	void enterShow_functions(SnowflakeParser.Show_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_functions}.
	 * @param ctx the parse tree
	 */
	void exitShow_functions(SnowflakeParser.Show_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_global_accounts}.
	 * @param ctx the parse tree
	 */
	void enterShow_global_accounts(SnowflakeParser.Show_global_accountsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_global_accounts}.
	 * @param ctx the parse tree
	 */
	void exitShow_global_accounts(SnowflakeParser.Show_global_accountsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_grants}.
	 * @param ctx the parse tree
	 */
	void enterShow_grants(SnowflakeParser.Show_grantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_grants}.
	 * @param ctx the parse tree
	 */
	void exitShow_grants(SnowflakeParser.Show_grantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_grants_opts}.
	 * @param ctx the parse tree
	 */
	void enterShow_grants_opts(SnowflakeParser.Show_grants_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_grants_opts}.
	 * @param ctx the parse tree
	 */
	void exitShow_grants_opts(SnowflakeParser.Show_grants_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_integrations}.
	 * @param ctx the parse tree
	 */
	void enterShow_integrations(SnowflakeParser.Show_integrationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_integrations}.
	 * @param ctx the parse tree
	 */
	void exitShow_integrations(SnowflakeParser.Show_integrationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_locks}.
	 * @param ctx the parse tree
	 */
	void enterShow_locks(SnowflakeParser.Show_locksContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_locks}.
	 * @param ctx the parse tree
	 */
	void exitShow_locks(SnowflakeParser.Show_locksContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_managed_accounts}.
	 * @param ctx the parse tree
	 */
	void enterShow_managed_accounts(SnowflakeParser.Show_managed_accountsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_managed_accounts}.
	 * @param ctx the parse tree
	 */
	void exitShow_managed_accounts(SnowflakeParser.Show_managed_accountsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_masking_policies}.
	 * @param ctx the parse tree
	 */
	void enterShow_masking_policies(SnowflakeParser.Show_masking_policiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_masking_policies}.
	 * @param ctx the parse tree
	 */
	void exitShow_masking_policies(SnowflakeParser.Show_masking_policiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#in_obj}.
	 * @param ctx the parse tree
	 */
	void enterIn_obj(SnowflakeParser.In_objContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#in_obj}.
	 * @param ctx the parse tree
	 */
	void exitIn_obj(SnowflakeParser.In_objContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#in_obj_2}.
	 * @param ctx the parse tree
	 */
	void enterIn_obj_2(SnowflakeParser.In_obj_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#in_obj_2}.
	 * @param ctx the parse tree
	 */
	void exitIn_obj_2(SnowflakeParser.In_obj_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_materialized_views}.
	 * @param ctx the parse tree
	 */
	void enterShow_materialized_views(SnowflakeParser.Show_materialized_viewsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_materialized_views}.
	 * @param ctx the parse tree
	 */
	void exitShow_materialized_views(SnowflakeParser.Show_materialized_viewsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_network_policies}.
	 * @param ctx the parse tree
	 */
	void enterShow_network_policies(SnowflakeParser.Show_network_policiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_network_policies}.
	 * @param ctx the parse tree
	 */
	void exitShow_network_policies(SnowflakeParser.Show_network_policiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_objects}.
	 * @param ctx the parse tree
	 */
	void enterShow_objects(SnowflakeParser.Show_objectsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_objects}.
	 * @param ctx the parse tree
	 */
	void exitShow_objects(SnowflakeParser.Show_objectsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_organization_accounts}.
	 * @param ctx the parse tree
	 */
	void enterShow_organization_accounts(SnowflakeParser.Show_organization_accountsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_organization_accounts}.
	 * @param ctx the parse tree
	 */
	void exitShow_organization_accounts(SnowflakeParser.Show_organization_accountsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#in_for}.
	 * @param ctx the parse tree
	 */
	void enterIn_for(SnowflakeParser.In_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#in_for}.
	 * @param ctx the parse tree
	 */
	void exitIn_for(SnowflakeParser.In_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_parameters}.
	 * @param ctx the parse tree
	 */
	void enterShow_parameters(SnowflakeParser.Show_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_parameters}.
	 * @param ctx the parse tree
	 */
	void exitShow_parameters(SnowflakeParser.Show_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_pipes}.
	 * @param ctx the parse tree
	 */
	void enterShow_pipes(SnowflakeParser.Show_pipesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_pipes}.
	 * @param ctx the parse tree
	 */
	void exitShow_pipes(SnowflakeParser.Show_pipesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_primary_keys}.
	 * @param ctx the parse tree
	 */
	void enterShow_primary_keys(SnowflakeParser.Show_primary_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_primary_keys}.
	 * @param ctx the parse tree
	 */
	void exitShow_primary_keys(SnowflakeParser.Show_primary_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_procedures}.
	 * @param ctx the parse tree
	 */
	void enterShow_procedures(SnowflakeParser.Show_proceduresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_procedures}.
	 * @param ctx the parse tree
	 */
	void exitShow_procedures(SnowflakeParser.Show_proceduresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_regions}.
	 * @param ctx the parse tree
	 */
	void enterShow_regions(SnowflakeParser.Show_regionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_regions}.
	 * @param ctx the parse tree
	 */
	void exitShow_regions(SnowflakeParser.Show_regionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_replication_accounts}.
	 * @param ctx the parse tree
	 */
	void enterShow_replication_accounts(SnowflakeParser.Show_replication_accountsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_replication_accounts}.
	 * @param ctx the parse tree
	 */
	void exitShow_replication_accounts(SnowflakeParser.Show_replication_accountsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_replication_databases}.
	 * @param ctx the parse tree
	 */
	void enterShow_replication_databases(SnowflakeParser.Show_replication_databasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_replication_databases}.
	 * @param ctx the parse tree
	 */
	void exitShow_replication_databases(SnowflakeParser.Show_replication_databasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_replication_groups}.
	 * @param ctx the parse tree
	 */
	void enterShow_replication_groups(SnowflakeParser.Show_replication_groupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_replication_groups}.
	 * @param ctx the parse tree
	 */
	void exitShow_replication_groups(SnowflakeParser.Show_replication_groupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_resource_monitors}.
	 * @param ctx the parse tree
	 */
	void enterShow_resource_monitors(SnowflakeParser.Show_resource_monitorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_resource_monitors}.
	 * @param ctx the parse tree
	 */
	void exitShow_resource_monitors(SnowflakeParser.Show_resource_monitorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_roles}.
	 * @param ctx the parse tree
	 */
	void enterShow_roles(SnowflakeParser.Show_rolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_roles}.
	 * @param ctx the parse tree
	 */
	void exitShow_roles(SnowflakeParser.Show_rolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_row_access_policies}.
	 * @param ctx the parse tree
	 */
	void enterShow_row_access_policies(SnowflakeParser.Show_row_access_policiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_row_access_policies}.
	 * @param ctx the parse tree
	 */
	void exitShow_row_access_policies(SnowflakeParser.Show_row_access_policiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_schemas}.
	 * @param ctx the parse tree
	 */
	void enterShow_schemas(SnowflakeParser.Show_schemasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_schemas}.
	 * @param ctx the parse tree
	 */
	void exitShow_schemas(SnowflakeParser.Show_schemasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_sequences}.
	 * @param ctx the parse tree
	 */
	void enterShow_sequences(SnowflakeParser.Show_sequencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_sequences}.
	 * @param ctx the parse tree
	 */
	void exitShow_sequences(SnowflakeParser.Show_sequencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_session_policies}.
	 * @param ctx the parse tree
	 */
	void enterShow_session_policies(SnowflakeParser.Show_session_policiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_session_policies}.
	 * @param ctx the parse tree
	 */
	void exitShow_session_policies(SnowflakeParser.Show_session_policiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_shares}.
	 * @param ctx the parse tree
	 */
	void enterShow_shares(SnowflakeParser.Show_sharesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_shares}.
	 * @param ctx the parse tree
	 */
	void exitShow_shares(SnowflakeParser.Show_sharesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_shares_in_failover_group}.
	 * @param ctx the parse tree
	 */
	void enterShow_shares_in_failover_group(SnowflakeParser.Show_shares_in_failover_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_shares_in_failover_group}.
	 * @param ctx the parse tree
	 */
	void exitShow_shares_in_failover_group(SnowflakeParser.Show_shares_in_failover_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_shares_in_replication_group}.
	 * @param ctx the parse tree
	 */
	void enterShow_shares_in_replication_group(SnowflakeParser.Show_shares_in_replication_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_shares_in_replication_group}.
	 * @param ctx the parse tree
	 */
	void exitShow_shares_in_replication_group(SnowflakeParser.Show_shares_in_replication_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_streams}.
	 * @param ctx the parse tree
	 */
	void enterShow_streams(SnowflakeParser.Show_streamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_streams}.
	 * @param ctx the parse tree
	 */
	void exitShow_streams(SnowflakeParser.Show_streamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_tables}.
	 * @param ctx the parse tree
	 */
	void enterShow_tables(SnowflakeParser.Show_tablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_tables}.
	 * @param ctx the parse tree
	 */
	void exitShow_tables(SnowflakeParser.Show_tablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_tags}.
	 * @param ctx the parse tree
	 */
	void enterShow_tags(SnowflakeParser.Show_tagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_tags}.
	 * @param ctx the parse tree
	 */
	void exitShow_tags(SnowflakeParser.Show_tagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_tasks}.
	 * @param ctx the parse tree
	 */
	void enterShow_tasks(SnowflakeParser.Show_tasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_tasks}.
	 * @param ctx the parse tree
	 */
	void exitShow_tasks(SnowflakeParser.Show_tasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_transactions}.
	 * @param ctx the parse tree
	 */
	void enterShow_transactions(SnowflakeParser.Show_transactionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_transactions}.
	 * @param ctx the parse tree
	 */
	void exitShow_transactions(SnowflakeParser.Show_transactionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_user_functions}.
	 * @param ctx the parse tree
	 */
	void enterShow_user_functions(SnowflakeParser.Show_user_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_user_functions}.
	 * @param ctx the parse tree
	 */
	void exitShow_user_functions(SnowflakeParser.Show_user_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_users}.
	 * @param ctx the parse tree
	 */
	void enterShow_users(SnowflakeParser.Show_usersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_users}.
	 * @param ctx the parse tree
	 */
	void exitShow_users(SnowflakeParser.Show_usersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_variables}.
	 * @param ctx the parse tree
	 */
	void enterShow_variables(SnowflakeParser.Show_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_variables}.
	 * @param ctx the parse tree
	 */
	void exitShow_variables(SnowflakeParser.Show_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_views}.
	 * @param ctx the parse tree
	 */
	void enterShow_views(SnowflakeParser.Show_viewsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_views}.
	 * @param ctx the parse tree
	 */
	void exitShow_views(SnowflakeParser.Show_viewsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#show_warehouses}.
	 * @param ctx the parse tree
	 */
	void enterShow_warehouses(SnowflakeParser.Show_warehousesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#show_warehouses}.
	 * @param ctx the parse tree
	 */
	void exitShow_warehouses(SnowflakeParser.Show_warehousesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#like_pattern}.
	 * @param ctx the parse tree
	 */
	void enterLike_pattern(SnowflakeParser.Like_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#like_pattern}.
	 * @param ctx the parse tree
	 */
	void exitLike_pattern(SnowflakeParser.Like_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#account_identifier}.
	 * @param ctx the parse tree
	 */
	void enterAccount_identifier(SnowflakeParser.Account_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#account_identifier}.
	 * @param ctx the parse tree
	 */
	void exitAccount_identifier(SnowflakeParser.Account_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_name(SnowflakeParser.Schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#schema_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_name(SnowflakeParser.Schema_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_type}.
	 * @param ctx the parse tree
	 */
	void enterObject_type(SnowflakeParser.Object_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_type}.
	 * @param ctx the parse tree
	 */
	void exitObject_type(SnowflakeParser.Object_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_type_list}.
	 * @param ctx the parse tree
	 */
	void enterObject_type_list(SnowflakeParser.Object_type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_type_list}.
	 * @param ctx the parse tree
	 */
	void exitObject_type_list(SnowflakeParser.Object_type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#tag_value}.
	 * @param ctx the parse tree
	 */
	void enterTag_value(SnowflakeParser.Tag_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#tag_value}.
	 * @param ctx the parse tree
	 */
	void exitTag_value(SnowflakeParser.Tag_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#arg_data_type}.
	 * @param ctx the parse tree
	 */
	void enterArg_data_type(SnowflakeParser.Arg_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#arg_data_type}.
	 * @param ctx the parse tree
	 */
	void exitArg_data_type(SnowflakeParser.Arg_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#arg_name}.
	 * @param ctx the parse tree
	 */
	void enterArg_name(SnowflakeParser.Arg_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#arg_name}.
	 * @param ctx the parse tree
	 */
	void exitArg_name(SnowflakeParser.Arg_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(SnowflakeParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(SnowflakeParser.Param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#region_group_id}.
	 * @param ctx the parse tree
	 */
	void enterRegion_group_id(SnowflakeParser.Region_group_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#region_group_id}.
	 * @param ctx the parse tree
	 */
	void exitRegion_group_id(SnowflakeParser.Region_group_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#snowflake_region_id}.
	 * @param ctx the parse tree
	 */
	void enterSnowflake_region_id(SnowflakeParser.Snowflake_region_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#snowflake_region_id}.
	 * @param ctx the parse tree
	 */
	void exitSnowflake_region_id(SnowflakeParser.Snowflake_region_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(SnowflakeParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(SnowflakeParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#string_list}.
	 * @param ctx the parse tree
	 */
	void enterString_list(SnowflakeParser.String_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#string_list}.
	 * @param ctx the parse tree
	 */
	void exitString_list(SnowflakeParser.String_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#id_fn}.
	 * @param ctx the parse tree
	 */
	void enterId_fn(SnowflakeParser.Id_fnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#id_fn}.
	 * @param ctx the parse tree
	 */
	void exitId_fn(SnowflakeParser.Id_fnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#id_}.
	 * @param ctx the parse tree
	 */
	void enterId_(SnowflakeParser.Id_Context ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#id_}.
	 * @param ctx the parse tree
	 */
	void exitId_(SnowflakeParser.Id_Context ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SnowflakeParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SnowflakeParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(SnowflakeParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(SnowflakeParser.Non_reserved_wordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#builtin_function}.
	 * @param ctx the parse tree
	 */
	void enterBuiltin_function(SnowflakeParser.Builtin_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#builtin_function}.
	 * @param ctx the parse tree
	 */
	void exitBuiltin_function(SnowflakeParser.Builtin_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#binary_builtin_function}.
	 * @param ctx the parse tree
	 */
	void enterBinary_builtin_function(SnowflakeParser.Binary_builtin_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#binary_builtin_function}.
	 * @param ctx the parse tree
	 */
	void exitBinary_builtin_function(SnowflakeParser.Binary_builtin_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#binary_or_ternary_builtin_function}.
	 * @param ctx the parse tree
	 */
	void enterBinary_or_ternary_builtin_function(SnowflakeParser.Binary_or_ternary_builtin_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#binary_or_ternary_builtin_function}.
	 * @param ctx the parse tree
	 */
	void exitBinary_or_ternary_builtin_function(SnowflakeParser.Binary_or_ternary_builtin_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#ternary_builtin_function}.
	 * @param ctx the parse tree
	 */
	void enterTernary_builtin_function(SnowflakeParser.Ternary_builtin_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#ternary_builtin_function}.
	 * @param ctx the parse tree
	 */
	void exitTernary_builtin_function(SnowflakeParser.Ternary_builtin_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#list_function}.
	 * @param ctx the parse tree
	 */
	void enterList_function(SnowflakeParser.List_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#list_function}.
	 * @param ctx the parse tree
	 */
	void exitList_function(SnowflakeParser.List_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(SnowflakeParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(SnowflakeParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SnowflakeParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SnowflakeParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list(SnowflakeParser.Column_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list(SnowflakeParser.Column_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_list_with_comment}.
	 * @param ctx the parse tree
	 */
	void enterColumn_list_with_comment(SnowflakeParser.Column_list_with_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_list_with_comment}.
	 * @param ctx the parse tree
	 */
	void exitColumn_list_with_comment(SnowflakeParser.Column_list_with_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_name}.
	 * @param ctx the parse tree
	 */
	void enterObject_name(SnowflakeParser.Object_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_name}.
	 * @param ctx the parse tree
	 */
	void exitObject_name(SnowflakeParser.Object_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_name_or_identifier}.
	 * @param ctx the parse tree
	 */
	void enterObject_name_or_identifier(SnowflakeParser.Object_name_or_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_name_or_identifier}.
	 * @param ctx the parse tree
	 */
	void exitObject_name_or_identifier(SnowflakeParser.Object_name_or_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(SnowflakeParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(SnowflakeParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list(SnowflakeParser.Expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#expr_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list(SnowflakeParser.Expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#expr_list_sorted}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_sorted(SnowflakeParser.Expr_list_sortedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#expr_list_sorted}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_sorted(SnowflakeParser.Expr_list_sortedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SnowflakeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SnowflakeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#iff_expr}.
	 * @param ctx the parse tree
	 */
	void enterIff_expr(SnowflakeParser.Iff_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#iff_expr}.
	 * @param ctx the parse tree
	 */
	void exitIff_expr(SnowflakeParser.Iff_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#trim_expression}.
	 * @param ctx the parse tree
	 */
	void enterTrim_expression(SnowflakeParser.Trim_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#trim_expression}.
	 * @param ctx the parse tree
	 */
	void exitTrim_expression(SnowflakeParser.Trim_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#try_cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterTry_cast_expr(SnowflakeParser.Try_cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#try_cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitTry_cast_expr(SnowflakeParser.Try_cast_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void enterCast_expr(SnowflakeParser.Cast_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#cast_expr}.
	 * @param ctx the parse tree
	 */
	void exitCast_expr(SnowflakeParser.Cast_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#json_literal}.
	 * @param ctx the parse tree
	 */
	void enterJson_literal(SnowflakeParser.Json_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#json_literal}.
	 * @param ctx the parse tree
	 */
	void exitJson_literal(SnowflakeParser.Json_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#kv_pair}.
	 * @param ctx the parse tree
	 */
	void enterKv_pair(SnowflakeParser.Kv_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#kv_pair}.
	 * @param ctx the parse tree
	 */
	void exitKv_pair(SnowflakeParser.Kv_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SnowflakeParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SnowflakeParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#arr_literal}.
	 * @param ctx the parse tree
	 */
	void enterArr_literal(SnowflakeParser.Arr_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#arr_literal}.
	 * @param ctx the parse tree
	 */
	void exitArr_literal(SnowflakeParser.Arr_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#data_type_size}.
	 * @param ctx the parse tree
	 */
	void enterData_type_size(SnowflakeParser.Data_type_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#data_type_size}.
	 * @param ctx the parse tree
	 */
	void exitData_type_size(SnowflakeParser.Data_type_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(SnowflakeParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(SnowflakeParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(SnowflakeParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(SnowflakeParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#order_by_expr}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expr(SnowflakeParser.Order_by_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#order_by_expr}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expr(SnowflakeParser.Order_by_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void enterAsc_desc(SnowflakeParser.Asc_descContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#asc_desc}.
	 * @param ctx the parse tree
	 */
	void exitAsc_desc(SnowflakeParser.Asc_descContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(SnowflakeParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(SnowflakeParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SnowflakeParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SnowflakeParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#param_assoc_list}.
	 * @param ctx the parse tree
	 */
	void enterParam_assoc_list(SnowflakeParser.Param_assoc_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#param_assoc_list}.
	 * @param ctx the parse tree
	 */
	void exitParam_assoc_list(SnowflakeParser.Param_assoc_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#param_assoc}.
	 * @param ctx the parse tree
	 */
	void enterParam_assoc(SnowflakeParser.Param_assocContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#param_assoc}.
	 * @param ctx the parse tree
	 */
	void exitParam_assoc(SnowflakeParser.Param_assocContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#ignore_or_repect_nulls}.
	 * @param ctx the parse tree
	 */
	void enterIgnore_or_repect_nulls(SnowflakeParser.Ignore_or_repect_nullsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#ignore_or_repect_nulls}.
	 * @param ctx the parse tree
	 */
	void exitIgnore_or_repect_nulls(SnowflakeParser.Ignore_or_repect_nullsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterRanking_windowed_function(SnowflakeParser.Ranking_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitRanking_windowed_function(SnowflakeParser.Ranking_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_function(SnowflakeParser.Aggregate_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#aggregate_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_function(SnowflakeParser.Aggregate_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SnowflakeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SnowflakeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(SnowflakeParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(SnowflakeParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(SnowflakeParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(SnowflakeParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(SnowflakeParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(SnowflakeParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(SnowflakeParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(SnowflakeParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_search_condition_section(SnowflakeParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_search_condition_section(SnowflakeParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(SnowflakeParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(SnowflakeParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#query_statement}.
	 * @param ctx the parse tree
	 */
	void enterQuery_statement(SnowflakeParser.Query_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#query_statement}.
	 * @param ctx the parse tree
	 */
	void exitQuery_statement(SnowflakeParser.Query_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_expression(SnowflakeParser.With_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_expression(SnowflakeParser.With_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SnowflakeParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SnowflakeParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(SnowflakeParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(SnowflakeParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#set_operators}.
	 * @param ctx the parse tree
	 */
	void enterSet_operators(SnowflakeParser.Set_operatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#set_operators}.
	 * @param ctx the parse tree
	 */
	void exitSet_operators(SnowflakeParser.Set_operatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#select_optional_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSelect_optional_clauses(SnowflakeParser.Select_optional_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#select_optional_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSelect_optional_clauses(SnowflakeParser.Select_optional_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(SnowflakeParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(SnowflakeParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#select_top_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_top_clause(SnowflakeParser.Select_top_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#select_top_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_top_clause(SnowflakeParser.Select_top_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#select_list_no_top}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_no_top(SnowflakeParser.Select_list_no_topContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#select_list_no_top}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_no_top(SnowflakeParser.Select_list_no_topContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#select_list_top}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_top(SnowflakeParser.Select_list_topContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#select_list_top}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_top(SnowflakeParser.Select_list_topContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(SnowflakeParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(SnowflakeParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(SnowflakeParser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(SnowflakeParser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_elem}.
	 * @param ctx the parse tree
	 */
	void enterColumn_elem(SnowflakeParser.Column_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_elem}.
	 * @param ctx the parse tree
	 */
	void exitColumn_elem(SnowflakeParser.Column_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#as_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_alias(SnowflakeParser.As_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#as_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_alias(SnowflakeParser.As_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void enterExpression_elem(SnowflakeParser.Expression_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void exitExpression_elem(SnowflakeParser.Expression_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_position}.
	 * @param ctx the parse tree
	 */
	void enterColumn_position(SnowflakeParser.Column_positionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_position}.
	 * @param ctx the parse tree
	 */
	void exitColumn_position(SnowflakeParser.Column_positionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct(SnowflakeParser.All_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct(SnowflakeParser.All_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void enterTop_clause(SnowflakeParser.Top_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void exitTop_clause(SnowflakeParser.Top_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(SnowflakeParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(SnowflakeParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#var_list}.
	 * @param ctx the parse tree
	 */
	void enterVar_list(SnowflakeParser.Var_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#var_list}.
	 * @param ctx the parse tree
	 */
	void exitVar_list(SnowflakeParser.Var_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SnowflakeParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SnowflakeParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(SnowflakeParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(SnowflakeParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void enterTable_sources(SnowflakeParser.Table_sourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void exitTable_sources(SnowflakeParser.Table_sourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(SnowflakeParser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(SnowflakeParser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_joined(SnowflakeParser.Table_source_item_joinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_joined(SnowflakeParser.Table_source_item_joinedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#object_ref}.
	 * @param ctx the parse tree
	 */
	void enterObject_ref(SnowflakeParser.Object_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#object_ref}.
	 * @param ctx the parse tree
	 */
	void exitObject_ref(SnowflakeParser.Object_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#flatten_table_option}.
	 * @param ctx the parse tree
	 */
	void enterFlatten_table_option(SnowflakeParser.Flatten_table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#flatten_table_option}.
	 * @param ctx the parse tree
	 */
	void exitFlatten_table_option(SnowflakeParser.Flatten_table_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#flatten_table}.
	 * @param ctx the parse tree
	 */
	void enterFlatten_table(SnowflakeParser.Flatten_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#flatten_table}.
	 * @param ctx the parse tree
	 */
	void exitFlatten_table(SnowflakeParser.Flatten_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#splited_table}.
	 * @param ctx the parse tree
	 */
	void enterSplited_table(SnowflakeParser.Splited_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#splited_table}.
	 * @param ctx the parse tree
	 */
	void exitSplited_table(SnowflakeParser.Splited_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#prior_list}.
	 * @param ctx the parse tree
	 */
	void enterPrior_list(SnowflakeParser.Prior_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#prior_list}.
	 * @param ctx the parse tree
	 */
	void exitPrior_list(SnowflakeParser.Prior_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#prior_item}.
	 * @param ctx the parse tree
	 */
	void enterPrior_item(SnowflakeParser.Prior_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#prior_item}.
	 * @param ctx the parse tree
	 */
	void exitPrior_item(SnowflakeParser.Prior_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#outer_join}.
	 * @param ctx the parse tree
	 */
	void enterOuter_join(SnowflakeParser.Outer_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#outer_join}.
	 * @param ctx the parse tree
	 */
	void exitOuter_join(SnowflakeParser.Outer_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(SnowflakeParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(SnowflakeParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SnowflakeParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SnowflakeParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#at_before}.
	 * @param ctx the parse tree
	 */
	void enterAt_before(SnowflakeParser.At_beforeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#at_before}.
	 * @param ctx the parse tree
	 */
	void exitAt_before(SnowflakeParser.At_beforeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(SnowflakeParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(SnowflakeParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#changes}.
	 * @param ctx the parse tree
	 */
	void enterChanges(SnowflakeParser.ChangesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#changes}.
	 * @param ctx the parse tree
	 */
	void exitChanges(SnowflakeParser.ChangesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#default_append_only}.
	 * @param ctx the parse tree
	 */
	void enterDefault_append_only(SnowflakeParser.Default_append_onlyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#default_append_only}.
	 * @param ctx the parse tree
	 */
	void exitDefault_append_only(SnowflakeParser.Default_append_onlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by(SnowflakeParser.Partition_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by(SnowflakeParser.Partition_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(SnowflakeParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(SnowflakeParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#expr_alias_list}.
	 * @param ctx the parse tree
	 */
	void enterExpr_alias_list(SnowflakeParser.Expr_alias_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#expr_alias_list}.
	 * @param ctx the parse tree
	 */
	void exitExpr_alias_list(SnowflakeParser.Expr_alias_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#measures}.
	 * @param ctx the parse tree
	 */
	void enterMeasures(SnowflakeParser.MeasuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#measures}.
	 * @param ctx the parse tree
	 */
	void exitMeasures(SnowflakeParser.MeasuresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#match_opts}.
	 * @param ctx the parse tree
	 */
	void enterMatch_opts(SnowflakeParser.Match_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#match_opts}.
	 * @param ctx the parse tree
	 */
	void exitMatch_opts(SnowflakeParser.Match_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#row_match}.
	 * @param ctx the parse tree
	 */
	void enterRow_match(SnowflakeParser.Row_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#row_match}.
	 * @param ctx the parse tree
	 */
	void exitRow_match(SnowflakeParser.Row_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#first_last}.
	 * @param ctx the parse tree
	 */
	void enterFirst_last(SnowflakeParser.First_lastContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#first_last}.
	 * @param ctx the parse tree
	 */
	void exitFirst_last(SnowflakeParser.First_lastContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(SnowflakeParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(SnowflakeParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#after_match}.
	 * @param ctx the parse tree
	 */
	void enterAfter_match(SnowflakeParser.After_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#after_match}.
	 * @param ctx the parse tree
	 */
	void exitAfter_match(SnowflakeParser.After_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void enterSymbol_list(SnowflakeParser.Symbol_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#symbol_list}.
	 * @param ctx the parse tree
	 */
	void exitSymbol_list(SnowflakeParser.Symbol_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#define}.
	 * @param ctx the parse tree
	 */
	void enterDefine(SnowflakeParser.DefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#define}.
	 * @param ctx the parse tree
	 */
	void exitDefine(SnowflakeParser.DefineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#match_recognize}.
	 * @param ctx the parse tree
	 */
	void enterMatch_recognize(SnowflakeParser.Match_recognizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#match_recognize}.
	 * @param ctx the parse tree
	 */
	void exitMatch_recognize(SnowflakeParser.Match_recognizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#pivot_unpivot}.
	 * @param ctx the parse tree
	 */
	void enterPivot_unpivot(SnowflakeParser.Pivot_unpivotContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#pivot_unpivot}.
	 * @param ctx the parse tree
	 */
	void exitPivot_unpivot(SnowflakeParser.Pivot_unpivotContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#column_alias_list_in_brackets}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_list_in_brackets(SnowflakeParser.Column_alias_list_in_bracketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#column_alias_list_in_brackets}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_list_in_brackets(SnowflakeParser.Column_alias_list_in_bracketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#expr_list_in_parentheses}.
	 * @param ctx the parse tree
	 */
	void enterExpr_list_in_parentheses(SnowflakeParser.Expr_list_in_parenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#expr_list_in_parentheses}.
	 * @param ctx the parse tree
	 */
	void exitExpr_list_in_parentheses(SnowflakeParser.Expr_list_in_parenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#values_table}.
	 * @param ctx the parse tree
	 */
	void enterValues_table(SnowflakeParser.Values_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#values_table}.
	 * @param ctx the parse tree
	 */
	void exitValues_table(SnowflakeParser.Values_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#values_table_body}.
	 * @param ctx the parse tree
	 */
	void enterValues_table_body(SnowflakeParser.Values_table_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#values_table_body}.
	 * @param ctx the parse tree
	 */
	void exitValues_table_body(SnowflakeParser.Values_table_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#sample_method}.
	 * @param ctx the parse tree
	 */
	void enterSample_method(SnowflakeParser.Sample_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#sample_method}.
	 * @param ctx the parse tree
	 */
	void exitSample_method(SnowflakeParser.Sample_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#repeatable_seed}.
	 * @param ctx the parse tree
	 */
	void enterRepeatable_seed(SnowflakeParser.Repeatable_seedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#repeatable_seed}.
	 * @param ctx the parse tree
	 */
	void exitRepeatable_seed(SnowflakeParser.Repeatable_seedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#sample_opts}.
	 * @param ctx the parse tree
	 */
	void enterSample_opts(SnowflakeParser.Sample_optsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#sample_opts}.
	 * @param ctx the parse tree
	 */
	void exitSample_opts(SnowflakeParser.Sample_optsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(SnowflakeParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(SnowflakeParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(SnowflakeParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(SnowflakeParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(SnowflakeParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(SnowflakeParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#null_not_null}.
	 * @param ctx the parse tree
	 */
	void enterNull_not_null(SnowflakeParser.Null_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#null_not_null}.
	 * @param ctx the parse tree
	 */
	void exitNull_not_null(SnowflakeParser.Null_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SnowflakeParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SnowflakeParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SnowflakeParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SnowflakeParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(SnowflakeParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(SnowflakeParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#group_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_item(SnowflakeParser.Group_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#group_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_item(SnowflakeParser.Group_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(SnowflakeParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(SnowflakeParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(SnowflakeParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(SnowflakeParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(SnowflakeParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(SnowflakeParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#order_item}.
	 * @param ctx the parse tree
	 */
	void enterOrder_item(SnowflakeParser.Order_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#order_item}.
	 * @param ctx the parse tree
	 */
	void exitOrder_item(SnowflakeParser.Order_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(SnowflakeParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(SnowflakeParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#row_rows}.
	 * @param ctx the parse tree
	 */
	void enterRow_rows(SnowflakeParser.Row_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#row_rows}.
	 * @param ctx the parse tree
	 */
	void exitRow_rows(SnowflakeParser.Row_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#first_next}.
	 * @param ctx the parse tree
	 */
	void enterFirst_next(SnowflakeParser.First_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#first_next}.
	 * @param ctx the parse tree
	 */
	void exitFirst_next(SnowflakeParser.First_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link SnowflakeParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void enterLimit_clause(SnowflakeParser.Limit_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SnowflakeParser#limit_clause}.
	 * @param ctx the parse tree
	 */
	void exitLimit_clause(SnowflakeParser.Limit_clauseContext ctx);
}