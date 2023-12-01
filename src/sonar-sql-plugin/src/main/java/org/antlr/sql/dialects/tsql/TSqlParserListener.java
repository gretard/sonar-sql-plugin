// Generated from java-escape by ANTLR 4.11.1
package org.antlr.sql.dialects.tsql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TSqlParser}.
 */
public interface TSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TSqlParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void enterTsql_file(TSqlParser.Tsql_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void exitTsql_file(TSqlParser.Tsql_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(TSqlParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(TSqlParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#batch_level_statement}.
	 * @param ctx the parse tree
	 */
	void enterBatch_level_statement(TSqlParser.Batch_level_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#batch_level_statement}.
	 * @param ctx the parse tree
	 */
	void exitBatch_level_statement(TSqlParser.Batch_level_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(TSqlParser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(TSqlParser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_clause(TSqlParser.Dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_clause(TSqlParser.Dml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(TSqlParser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(TSqlParser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void enterBackup_statement(TSqlParser.Backup_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void exitBackup_statement(TSqlParser.Backup_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterCfl_statement(TSqlParser.Cfl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitCfl_statement(TSqlParser.Cfl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(TSqlParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(TSqlParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(TSqlParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(TSqlParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(TSqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(TSqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(TSqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(TSqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(TSqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(TSqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(TSqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(TSqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(TSqlParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(TSqlParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 */
	void enterThrow_error_number(TSqlParser.Throw_error_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 */
	void exitThrow_error_number(TSqlParser.Throw_error_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#throw_message}.
	 * @param ctx the parse tree
	 */
	void enterThrow_message(TSqlParser.Throw_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#throw_message}.
	 * @param ctx the parse tree
	 */
	void exitThrow_message(TSqlParser.Throw_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#throw_state}.
	 * @param ctx the parse tree
	 */
	void enterThrow_state(TSqlParser.Throw_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#throw_state}.
	 * @param ctx the parse tree
	 */
	void exitThrow_state(TSqlParser.Throw_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(TSqlParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(TSqlParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_statement(TSqlParser.Waitfor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_statement(TSqlParser.Waitfor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(TSqlParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(TSqlParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(TSqlParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(TSqlParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseerror_statement(TSqlParser.Raiseerror_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseerror_statement(TSqlParser.Raiseerror_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(TSqlParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(TSqlParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void enterAnother_statement(TSqlParser.Another_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void exitAnother_statement(TSqlParser.Another_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_application_role(TSqlParser.Alter_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_application_role(TSqlParser.Alter_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterAlter_xml_schema_collection(TSqlParser.Alter_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitAlter_xml_schema_collection(TSqlParser.Alter_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_application_role(TSqlParser.Create_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_application_role(TSqlParser.Create_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterDrop_aggregate(TSqlParser.Drop_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitDrop_aggregate(TSqlParser.Drop_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_application_role(TSqlParser.Drop_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_application_role(TSqlParser.Drop_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly(TSqlParser.Alter_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly(TSqlParser.Alter_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_start(TSqlParser.Alter_assembly_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_start(TSqlParser.Alter_assembly_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_clause(TSqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_clause(TSqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_from_clause(TSqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_from_clause(TSqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_from_clause_start(TSqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_from_clause_start(TSqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop_clause(TSqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop_clause(TSqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop_multiple_files(TSqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop_multiple_files(TSqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop(TSqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop(TSqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_add_clause(TSqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_add_clause(TSqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asssembly_add_clause_start(TSqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asssembly_add_clause_start(TSqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_client_file_clause(TSqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_client_file_clause(TSqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_file_name(TSqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_file_name(TSqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_file_bits(TSqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_file_bits(TSqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_as(TSqlParser.Alter_assembly_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_as(TSqlParser.Alter_assembly_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_with_clause(TSqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_with_clause(TSqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_with(TSqlParser.Alter_assembly_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_with(TSqlParser.Alter_assembly_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void enterClient_assembly_specifier(TSqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void exitClient_assembly_specifier(TSqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_option(TSqlParser.Assembly_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_option(TSqlParser.Assembly_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#network_file_share}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_file_share(TSqlParser.Network_file_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#network_file_share}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_file_share(TSqlParser.Network_file_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#network_computer}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_computer(TSqlParser.Network_computerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#network_computer}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_computer(TSqlParser.Network_computerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#network_file_start}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_file_start(TSqlParser.Network_file_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#network_file_start}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_file_start(TSqlParser.Network_file_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_path}.
	 * @param ctx the parse tree
	 */
	void enterFile_path(TSqlParser.File_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_path}.
	 * @param ctx the parse tree
	 */
	void exitFile_path(TSqlParser.File_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 */
	void enterFile_directory_path_separator(TSqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 */
	void exitFile_directory_path_separator(TSqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#local_file}.
	 * @param ctx the parse tree
	 */
	void enterLocal_file(TSqlParser.Local_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#local_file}.
	 * @param ctx the parse tree
	 */
	void exitLocal_file(TSqlParser.Local_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#local_drive}.
	 * @param ctx the parse tree
	 */
	void enterLocal_drive(TSqlParser.Local_driveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#local_drive}.
	 * @param ctx the parse tree
	 */
	void exitLocal_drive(TSqlParser.Local_driveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_local_files(TSqlParser.Multiple_local_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_local_files(TSqlParser.Multiple_local_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_local_file_start(TSqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_local_file_start(TSqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void enterCreate_assembly(TSqlParser.Create_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void exitCreate_assembly(TSqlParser.Create_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void enterDrop_assembly(TSqlParser.Drop_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void exitDrop_assembly(TSqlParser.Drop_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key(TSqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key(TSqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key_start(TSqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key_start(TSqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option(TSqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option(TSqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option_start(TSqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option_start(TSqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_password_change_option(TSqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_password_change_option(TSqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_asymmetric_key(TSqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_asymmetric_key(TSqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_asymmetric_key(TSqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_asymmetric_key(TSqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization(TSqlParser.Alter_authorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization(TSqlParser.Alter_authorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void enterAuthorization_grantee(TSqlParser.Authorization_granteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void exitAuthorization_grantee(TSqlParser.Authorization_granteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#entity_to}.
	 * @param ctx the parse tree
	 */
	void enterEntity_to(TSqlParser.Entity_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#entity_to}.
	 * @param ctx the parse tree
	 */
	void exitEntity_to(TSqlParser.Entity_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#colon_colon}.
	 * @param ctx the parse tree
	 */
	void enterColon_colon(TSqlParser.Colon_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#colon_colon}.
	 * @param ctx the parse tree
	 */
	void exitColon_colon(TSqlParser.Colon_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_start(TSqlParser.Alter_authorization_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_start(TSqlParser.Alter_authorization_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_sql_database(TSqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_sql_database(TSqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_azure_dw(TSqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_azure_dw(TSqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_parallel_dw(TSqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_parallel_dw(TSqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(TSqlParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(TSqlParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_sql_database(TSqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_sql_database(TSqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_azure_dw(TSqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_azure_dw(TSqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_parallel_dw(TSqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_parallel_dw(TSqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type_for_grant}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_grant(TSqlParser.Class_type_for_grantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type_for_grant}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_grant(TSqlParser.Class_type_for_grantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_availability_group(TSqlParser.Drop_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_availability_group(TSqlParser.Drop_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group(TSqlParser.Alter_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group(TSqlParser.Alter_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_start(TSqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_start(TSqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_options(TSqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_options(TSqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ip_v4_failover}.
	 * @param ctx the parse tree
	 */
	void enterIp_v4_failover(TSqlParser.Ip_v4_failoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ip_v4_failover}.
	 * @param ctx the parse tree
	 */
	void exitIp_v4_failover(TSqlParser.Ip_v4_failoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ip_v6_failover}.
	 * @param ctx the parse tree
	 */
	void enterIp_v6_failover(TSqlParser.Ip_v6_failoverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ip_v6_failover}.
	 * @param ctx the parse tree
	 */
	void exitIp_v6_failover(TSqlParser.Ip_v6_failoverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_broker_priority(TSqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_broker_priority(TSqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterDrop_broker_priority(TSqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitDrop_broker_priority(TSqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void enterAlter_certificate(TSqlParser.Alter_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void exitAlter_certificate(TSqlParser.Alter_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_encryption_key(TSqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_encryption_key(TSqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_encryption_key(TSqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_encryption_key(TSqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 */
	void enterDrop_certificate(TSqlParser.Drop_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 */
	void exitDrop_certificate(TSqlParser.Drop_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_encryption_key(TSqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_encryption_key(TSqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_master_key(TSqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_master_key(TSqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_contract}.
	 * @param ctx the parse tree
	 */
	void enterDrop_contract(TSqlParser.Drop_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_contract}.
	 * @param ctx the parse tree
	 */
	void exitDrop_contract(TSqlParser.Drop_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_credential}.
	 * @param ctx the parse tree
	 */
	void enterDrop_credential(TSqlParser.Drop_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_credential}.
	 * @param ctx the parse tree
	 */
	void exitDrop_credential(TSqlParser.Drop_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 */
	void enterDrop_cryptograhic_provider(TSqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 */
	void exitDrop_cryptograhic_provider(TSqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(TSqlParser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(TSqlParser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_audit_specification(TSqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_audit_specification(TSqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_encryption_key(TSqlParser.Drop_database_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_database_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_encryption_key(TSqlParser.Drop_database_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_scoped_credential(TSqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_scoped_credential(TSqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_default}.
	 * @param ctx the parse tree
	 */
	void enterDrop_default(TSqlParser.Drop_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_default}.
	 * @param ctx the parse tree
	 */
	void exitDrop_default(TSqlParser.Drop_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterDrop_endpoint(TSqlParser.Drop_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitDrop_endpoint(TSqlParser.Drop_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_data_source(TSqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_data_source(TSqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_file_format(TSqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_file_format(TSqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_library(TSqlParser.Drop_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_library(TSqlParser.Drop_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_resource_pool(TSqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_resource_pool(TSqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_table(TSqlParser.Drop_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_table(TSqlParser.Drop_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_notifications(TSqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_notifications(TSqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_session(TSqlParser.Drop_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_session(TSqlParser.Drop_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_catalog(TSqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_catalog(TSqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_index(TSqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_index(TSqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_stoplist(TSqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_stoplist(TSqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_login}.
	 * @param ctx the parse tree
	 */
	void enterDrop_login(TSqlParser.Drop_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_login}.
	 * @param ctx the parse tree
	 */
	void exitDrop_login(TSqlParser.Drop_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_master_key(TSqlParser.Drop_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_master_key(TSqlParser.Drop_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_message_type(TSqlParser.Drop_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_message_type(TSqlParser.Drop_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_partition_function(TSqlParser.Drop_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_partition_function(TSqlParser.Drop_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterDrop_partition_scheme(TSqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitDrop_partition_scheme(TSqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_queue}.
	 * @param ctx the parse tree
	 */
	void enterDrop_queue(TSqlParser.Drop_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_queue}.
	 * @param ctx the parse tree
	 */
	void exitDrop_queue(TSqlParser.Drop_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterDrop_remote_service_binding(TSqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitDrop_remote_service_binding(TSqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterDrop_resource_pool(TSqlParser.Drop_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitDrop_resource_pool(TSqlParser.Drop_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_db_role(TSqlParser.Drop_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_db_role(TSqlParser.Drop_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_route}.
	 * @param ctx the parse tree
	 */
	void enterDrop_route(TSqlParser.Drop_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_route}.
	 * @param ctx the parse tree
	 */
	void exitDrop_route(TSqlParser.Drop_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_rule}.
	 * @param ctx the parse tree
	 */
	void enterDrop_rule(TSqlParser.Drop_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_rule}.
	 * @param ctx the parse tree
	 */
	void exitDrop_rule(TSqlParser.Drop_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema(TSqlParser.Drop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema(TSqlParser.Drop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterDrop_search_property_list(TSqlParser.Drop_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitDrop_search_property_list(TSqlParser.Drop_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterDrop_security_policy(TSqlParser.Drop_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitDrop_security_policy(TSqlParser.Drop_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(TSqlParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(TSqlParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_audit(TSqlParser.Drop_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_audit(TSqlParser.Drop_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_audit_specification(TSqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_audit_specification(TSqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_role(TSqlParser.Drop_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_role(TSqlParser.Drop_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_service}.
	 * @param ctx the parse tree
	 */
	void enterDrop_service(TSqlParser.Drop_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_service}.
	 * @param ctx the parse tree
	 */
	void exitDrop_service(TSqlParser.Drop_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void enterDrop_signature(TSqlParser.Drop_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void exitDrop_signature(TSqlParser.Drop_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics_name_azure_dw_and_pdw(TSqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics_name_azure_dw_and_pdw(TSqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_symmetric_key(TSqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_symmetric_key(TSqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 */
	void enterDrop_synonym(TSqlParser.Drop_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 */
	void exitDrop_synonym(TSqlParser.Drop_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_user}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user(TSqlParser.Drop_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_user}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user(TSqlParser.Drop_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_workload_group(TSqlParser.Drop_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_workload_group(TSqlParser.Drop_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterDrop_xml_schema_collection(TSqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitDrop_xml_schema_collection(TSqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDisable_trigger(TSqlParser.Disable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDisable_trigger(TSqlParser.Disable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEnable_trigger(TSqlParser.Enable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEnable_trigger(TSqlParser.Enable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void enterLock_table(TSqlParser.Lock_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void exitLock_table(TSqlParser.Lock_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table(TSqlParser.Truncate_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table(TSqlParser.Truncate_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_master_key(TSqlParser.Create_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_master_key(TSqlParser.Create_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void enterAlter_credential(TSqlParser.Alter_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void exitAlter_credential(TSqlParser.Alter_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_credential}.
	 * @param ctx the parse tree
	 */
	void enterCreate_credential(TSqlParser.Create_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_credential}.
	 * @param ctx the parse tree
	 */
	void exitCreate_credential(TSqlParser.Create_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterAlter_cryptographic_provider(TSqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitAlter_cryptographic_provider(TSqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cryptographic_provider(TSqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cryptographic_provider(TSqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterCreate_endpoint(TSqlParser.Create_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitCreate_endpoint(TSqlParser.Create_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#endpoint_encryption_alogorithm_clause}.
	 * @param ctx the parse tree
	 */
	void enterEndpoint_encryption_alogorithm_clause(TSqlParser.Endpoint_encryption_alogorithm_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#endpoint_encryption_alogorithm_clause}.
	 * @param ctx the parse tree
	 */
	void exitEndpoint_encryption_alogorithm_clause(TSqlParser.Endpoint_encryption_alogorithm_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#endpoint_authentication_clause}.
	 * @param ctx the parse tree
	 */
	void enterEndpoint_authentication_clause(TSqlParser.Endpoint_authentication_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#endpoint_authentication_clause}.
	 * @param ctx the parse tree
	 */
	void exitEndpoint_authentication_clause(TSqlParser.Endpoint_authentication_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#endpoint_listener_clause}.
	 * @param ctx the parse tree
	 */
	void enterEndpoint_listener_clause(TSqlParser.Endpoint_listener_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#endpoint_listener_clause}.
	 * @param ctx the parse tree
	 */
	void exitEndpoint_listener_clause(TSqlParser.Endpoint_listener_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_notification(TSqlParser.Create_event_notificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_notification(TSqlParser.Create_event_notificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_event_session(TSqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_event_session(TSqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_expression(TSqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_expression(TSqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_factor(TSqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_factor(TSqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_leaf(TSqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_leaf(TSqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_data_source(TSqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_data_source(TSqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_library(TSqlParser.Alter_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_library(TSqlParser.Alter_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_library(TSqlParser.Create_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_library(TSqlParser.Create_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_resource_pool(TSqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_resource_pool(TSqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_resource_pool(TSqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_resource_pool(TSqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_catalog(TSqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_catalog(TSqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_catalog(TSqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_catalog(TSqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_stoplist(TSqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_stoplist(TSqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_stoplist(TSqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_stoplist(TSqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_sql_server(TSqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_sql_server(TSqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_sql_server(TSqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_sql_server(TSqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_azure_sql(TSqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_azure_sql(TSqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_azure_sql(TSqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_azure_sql(TSqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_azure_sql_dw_and_pdw(TSqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_azure_sql_dw_and_pdw(TSqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_pdw(TSqlParser.Create_login_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_pdw(TSqlParser.Create_login_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_sql_server(TSqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_sql_server(TSqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_sql_server(TSqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_sql_server(TSqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_azure_sql(TSqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_azure_sql(TSqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_azure_sql(TSqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_azure_sql(TSqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_message_type(TSqlParser.Alter_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_message_type(TSqlParser.Alter_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_function(TSqlParser.Alter_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_function(TSqlParser.Alter_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_scheme(TSqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_scheme(TSqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterAlter_remote_service_binding(TSqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitAlter_remote_service_binding(TSqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterCreate_remote_service_binding(TSqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitCreate_remote_service_binding(TSqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_resource_pool(TSqlParser.Create_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_resource_pool(TSqlParser.Create_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void enterAlter_resource_governor(TSqlParser.Alter_resource_governorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void exitAlter_resource_governor(TSqlParser.Alter_resource_governorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database_audit_specification(TSqlParser.Alter_database_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database_audit_specification(TSqlParser.Alter_database_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#audit_action_spec_group}.
	 * @param ctx the parse tree
	 */
	void enterAudit_action_spec_group(TSqlParser.Audit_action_spec_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#audit_action_spec_group}.
	 * @param ctx the parse tree
	 */
	void exitAudit_action_spec_group(TSqlParser.Audit_action_spec_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#audit_action_specification}.
	 * @param ctx the parse tree
	 */
	void enterAudit_action_specification(TSqlParser.Audit_action_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#audit_action_specification}.
	 * @param ctx the parse tree
	 */
	void exitAudit_action_specification(TSqlParser.Audit_action_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#action_specification}.
	 * @param ctx the parse tree
	 */
	void enterAction_specification(TSqlParser.Action_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#action_specification}.
	 * @param ctx the parse tree
	 */
	void exitAction_specification(TSqlParser.Action_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#audit_class_name}.
	 * @param ctx the parse tree
	 */
	void enterAudit_class_name(TSqlParser.Audit_class_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#audit_class_name}.
	 * @param ctx the parse tree
	 */
	void exitAudit_class_name(TSqlParser.Audit_class_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#audit_securable}.
	 * @param ctx the parse tree
	 */
	void enterAudit_securable(TSqlParser.Audit_securableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#audit_securable}.
	 * @param ctx the parse tree
	 */
	void exitAudit_securable(TSqlParser.Audit_securableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_db_role(TSqlParser.Alter_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_db_role(TSqlParser.Alter_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_audit_specification(TSqlParser.Create_database_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_audit_specification(TSqlParser.Create_database_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_db_role(TSqlParser.Create_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_db_role(TSqlParser.Create_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_route}.
	 * @param ctx the parse tree
	 */
	void enterCreate_route(TSqlParser.Create_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_route}.
	 * @param ctx the parse tree
	 */
	void exitCreate_route(TSqlParser.Create_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_rule}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rule(TSqlParser.Create_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_rule}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rule(TSqlParser.Create_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_sql(TSqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_sql(TSqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema(TSqlParser.Create_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema(TSqlParser.Create_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_azure_sql_dw_and_pdw(TSqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_azure_sql_dw_and_pdw(TSqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_azure_sql_dw_and_pdw(TSqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_azure_sql_dw_and_pdw(TSqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_search_property_list(TSqlParser.Create_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_search_property_list(TSqlParser.Create_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_policy(TSqlParser.Create_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_policy(TSqlParser.Create_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(TSqlParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(TSqlParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(TSqlParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(TSqlParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit(TSqlParser.Alter_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit(TSqlParser.Alter_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit(TSqlParser.Create_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit(TSqlParser.Create_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit_specification(TSqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit_specification(TSqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit_specification(TSqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit_specification(TSqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_configuration(TSqlParser.Alter_server_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_configuration(TSqlParser.Alter_server_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role(TSqlParser.Alter_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role(TSqlParser.Alter_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_role(TSqlParser.Create_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_role(TSqlParser.Create_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role_pdw(TSqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role_pdw(TSqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_service}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service(TSqlParser.Alter_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_service}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service(TSqlParser.Alter_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#opt_arg_clause}.
	 * @param ctx the parse tree
	 */
	void enterOpt_arg_clause(TSqlParser.Opt_arg_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#opt_arg_clause}.
	 * @param ctx the parse tree
	 */
	void exitOpt_arg_clause(TSqlParser.Opt_arg_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_service}.
	 * @param ctx the parse tree
	 */
	void enterCreate_service(TSqlParser.Create_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_service}.
	 * @param ctx the parse tree
	 */
	void exitCreate_service(TSqlParser.Create_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service_master_key(TSqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service_master_key(TSqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_symmetric_key(TSqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_symmetric_key(TSqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym(TSqlParser.Create_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym(TSqlParser.Create_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user(TSqlParser.Alter_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user(TSqlParser.Alter_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(TSqlParser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(TSqlParser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_azure_sql_dw(TSqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_azure_sql_dw(TSqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_azure_sql(TSqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_azure_sql(TSqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_workload_group(TSqlParser.Alter_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_workload_group(TSqlParser.Alter_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_workload_group(TSqlParser.Create_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_workload_group(TSqlParser.Create_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterCreate_xml_schema_collection(TSqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitCreate_xml_schema_collection(TSqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_partition_function(TSqlParser.Create_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_partition_function(TSqlParser.Create_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterCreate_partition_scheme(TSqlParser.Create_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitCreate_partition_scheme(TSqlParser.Create_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_queue}.
	 * @param ctx the parse tree
	 */
	void enterCreate_queue(TSqlParser.Create_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_queue}.
	 * @param ctx the parse tree
	 */
	void exitCreate_queue(TSqlParser.Create_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void enterQueue_settings(TSqlParser.Queue_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void exitQueue_settings(TSqlParser.Queue_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void enterAlter_queue(TSqlParser.Alter_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void exitAlter_queue(TSqlParser.Alter_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#queue_action}.
	 * @param ctx the parse tree
	 */
	void enterQueue_action(TSqlParser.Queue_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#queue_action}.
	 * @param ctx the parse tree
	 */
	void exitQueue_action(TSqlParser.Queue_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void enterQueue_rebuild_options(TSqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void exitQueue_rebuild_options(TSqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_contract}.
	 * @param ctx the parse tree
	 */
	void enterCreate_contract(TSqlParser.Create_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_contract}.
	 * @param ctx the parse tree
	 */
	void exitCreate_contract(TSqlParser.Create_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void enterConversation_statement(TSqlParser.Conversation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void exitConversation_statement(TSqlParser.Conversation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void enterMessage_statement(TSqlParser.Message_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void exitMessage_statement(TSqlParser.Message_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(TSqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(TSqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#when_matches}.
	 * @param ctx the parse tree
	 */
	void enterWhen_matches(TSqlParser.When_matchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#when_matches}.
	 * @param ctx the parse tree
	 */
	void exitWhen_matches(TSqlParser.When_matchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_matched(TSqlParser.Merge_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_matched(TSqlParser.Merge_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_not_matched(TSqlParser.Merge_not_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_not_matched(TSqlParser.Merge_not_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(TSqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(TSqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement_from(TSqlParser.Delete_statement_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement_from(TSqlParser.Delete_statement_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(TSqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(TSqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement_value(TSqlParser.Insert_statement_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement_value(TSqlParser.Insert_statement_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void enterReceive_statement(TSqlParser.Receive_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void exitReceive_statement(TSqlParser.Receive_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#select_statement_standalone}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement_standalone(TSqlParser.Select_statement_standaloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#select_statement_standalone}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement_standalone(TSqlParser.Select_statement_standaloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(TSqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(TSqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(TSqlParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(TSqlParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(TSqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(TSqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void enterOutput_clause(TSqlParser.Output_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void exitOutput_clause(TSqlParser.Output_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterOutput_dml_list_elem(TSqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitOutput_dml_list_elem(TSqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(TSqlParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(TSqlParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(TSqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(TSqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_index_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_options(TSqlParser.Create_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_index_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_options(TSqlParser.Create_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#relational_index_option}.
	 * @param ctx the parse tree
	 */
	void enterRelational_index_option(TSqlParser.Relational_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#relational_index_option}.
	 * @param ctx the parse tree
	 */
	void exitRelational_index_option(TSqlParser.Relational_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_index}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index(TSqlParser.Alter_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_index}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index(TSqlParser.Alter_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#resumable_index_options}.
	 * @param ctx the parse tree
	 */
	void enterResumable_index_options(TSqlParser.Resumable_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#resumable_index_options}.
	 * @param ctx the parse tree
	 */
	void exitResumable_index_options(TSqlParser.Resumable_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#resumable_index_option}.
	 * @param ctx the parse tree
	 */
	void enterResumable_index_option(TSqlParser.Resumable_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#resumable_index_option}.
	 * @param ctx the parse tree
	 */
	void exitResumable_index_option(TSqlParser.Resumable_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#reorganize_partition}.
	 * @param ctx the parse tree
	 */
	void enterReorganize_partition(TSqlParser.Reorganize_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#reorganize_partition}.
	 * @param ctx the parse tree
	 */
	void exitReorganize_partition(TSqlParser.Reorganize_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#reorganize_options}.
	 * @param ctx the parse tree
	 */
	void enterReorganize_options(TSqlParser.Reorganize_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#reorganize_options}.
	 * @param ctx the parse tree
	 */
	void exitReorganize_options(TSqlParser.Reorganize_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#reorganize_option}.
	 * @param ctx the parse tree
	 */
	void enterReorganize_option(TSqlParser.Reorganize_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#reorganize_option}.
	 * @param ctx the parse tree
	 */
	void exitReorganize_option(TSqlParser.Reorganize_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#set_index_options}.
	 * @param ctx the parse tree
	 */
	void enterSet_index_options(TSqlParser.Set_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#set_index_options}.
	 * @param ctx the parse tree
	 */
	void exitSet_index_options(TSqlParser.Set_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#set_index_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_index_option(TSqlParser.Set_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#set_index_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_index_option(TSqlParser.Set_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#rebuild_partition}.
	 * @param ctx the parse tree
	 */
	void enterRebuild_partition(TSqlParser.Rebuild_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#rebuild_partition}.
	 * @param ctx the parse tree
	 */
	void exitRebuild_partition(TSqlParser.Rebuild_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#rebuild_index_options}.
	 * @param ctx the parse tree
	 */
	void enterRebuild_index_options(TSqlParser.Rebuild_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#rebuild_index_options}.
	 * @param ctx the parse tree
	 */
	void exitRebuild_index_options(TSqlParser.Rebuild_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#rebuild_index_option}.
	 * @param ctx the parse tree
	 */
	void enterRebuild_index_option(TSqlParser.Rebuild_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#rebuild_index_option}.
	 * @param ctx the parse tree
	 */
	void exitRebuild_index_option(TSqlParser.Rebuild_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#single_partition_rebuild_index_options}.
	 * @param ctx the parse tree
	 */
	void enterSingle_partition_rebuild_index_options(TSqlParser.Single_partition_rebuild_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#single_partition_rebuild_index_options}.
	 * @param ctx the parse tree
	 */
	void exitSingle_partition_rebuild_index_options(TSqlParser.Single_partition_rebuild_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#single_partition_rebuild_index_option}.
	 * @param ctx the parse tree
	 */
	void enterSingle_partition_rebuild_index_option(TSqlParser.Single_partition_rebuild_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#single_partition_rebuild_index_option}.
	 * @param ctx the parse tree
	 */
	void exitSingle_partition_rebuild_index_option(TSqlParser.Single_partition_rebuild_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#on_partitions}.
	 * @param ctx the parse tree
	 */
	void enterOn_partitions(TSqlParser.On_partitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#on_partitions}.
	 * @param ctx the parse tree
	 */
	void exitOn_partitions(TSqlParser.On_partitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_columnstore_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_columnstore_index(TSqlParser.Create_columnstore_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_columnstore_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_columnstore_index(TSqlParser.Create_columnstore_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_columnstore_index_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_columnstore_index_options(TSqlParser.Create_columnstore_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_columnstore_index_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_columnstore_index_options(TSqlParser.Create_columnstore_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#columnstore_index_option}.
	 * @param ctx the parse tree
	 */
	void enterColumnstore_index_option(TSqlParser.Columnstore_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#columnstore_index_option}.
	 * @param ctx the parse tree
	 */
	void exitColumnstore_index_option(TSqlParser.Columnstore_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_nonclustered_columnstore_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_nonclustered_columnstore_index(TSqlParser.Create_nonclustered_columnstore_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_nonclustered_columnstore_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_nonclustered_columnstore_index(TSqlParser.Create_nonclustered_columnstore_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_xml_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_xml_index(TSqlParser.Create_xml_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_xml_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_xml_index(TSqlParser.Create_xml_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_index_options}.
	 * @param ctx the parse tree
	 */
	void enterXml_index_options(TSqlParser.Xml_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_index_options}.
	 * @param ctx the parse tree
	 */
	void exitXml_index_options(TSqlParser.Xml_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_index_option}.
	 * @param ctx the parse tree
	 */
	void enterXml_index_option(TSqlParser.Xml_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_index_option}.
	 * @param ctx the parse tree
	 */
	void exitXml_index_option(TSqlParser.Xml_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_procedure(TSqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_procedure(TSqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#as_external_name}.
	 * @param ctx the parse tree
	 */
	void enterAs_external_name(TSqlParser.As_external_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#as_external_name}.
	 * @param ctx the parse tree
	 */
	void exitAs_external_name(TSqlParser.As_external_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_trigger(TSqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_trigger(TSqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_dml_trigger(TSqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_dml_trigger(TSqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 */
	void enterDml_trigger_option(TSqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 */
	void exitDml_trigger_option(TSqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterDml_trigger_operation(TSqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitDml_trigger_operation(TSqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_ddl_trigger(TSqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_ddl_trigger(TSqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterDdl_trigger_operation(TSqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitDdl_trigger_operation(TSqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_function(TSqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_function(TSqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_select(TSqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_select(TSqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_table(TSqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_table(TSqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_scalar(TSqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_scalar(TSqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#procedure_param_default_value}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_param_default_value(TSqlParser.Procedure_param_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#procedure_param_default_value}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_param_default_value(TSqlParser.Procedure_param_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_param(TSqlParser.Procedure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_param(TSqlParser.Procedure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_option(TSqlParser.Procedure_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_option(TSqlParser.Procedure_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#function_option}.
	 * @param ctx the parse tree
	 */
	void enterFunction_option(TSqlParser.Function_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#function_option}.
	 * @param ctx the parse tree
	 */
	void exitFunction_option(TSqlParser.Function_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(TSqlParser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(TSqlParser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_statistics}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statistics(TSqlParser.Update_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_statistics}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statistics(TSqlParser.Update_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_statistics_options}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statistics_options(TSqlParser.Update_statistics_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_statistics_options}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statistics_options(TSqlParser.Update_statistics_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_statistics_option}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statistics_option(TSqlParser.Update_statistics_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_statistics_option}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statistics_option(TSqlParser.Update_statistics_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(TSqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(TSqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_indices}.
	 * @param ctx the parse tree
	 */
	void enterTable_indices(TSqlParser.Table_indicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_indices}.
	 * @param ctx the parse tree
	 */
	void exitTable_indices(TSqlParser.Table_indicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_options(TSqlParser.Table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_options(TSqlParser.Table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_option(TSqlParser.Table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_option(TSqlParser.Table_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_table_index_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_index_options(TSqlParser.Create_table_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_table_index_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_index_options(TSqlParser.Create_table_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_table_index_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_index_option(TSqlParser.Create_table_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_table_index_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_index_option(TSqlParser.Create_table_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(TSqlParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(TSqlParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void enterView_attribute(TSqlParser.View_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void exitView_attribute(TSqlParser.View_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(TSqlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(TSqlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#switch_partition}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_partition(TSqlParser.Switch_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#switch_partition}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_partition(TSqlParser.Switch_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#low_priority_lock_wait}.
	 * @param ctx the parse tree
	 */
	void enterLow_priority_lock_wait(TSqlParser.Low_priority_lock_waitContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#low_priority_lock_wait}.
	 * @param ctx the parse tree
	 */
	void exitLow_priority_lock_wait(TSqlParser.Low_priority_lock_waitContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(TSqlParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(TSqlParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#add_or_modify_files}.
	 * @param ctx the parse tree
	 */
	void enterAdd_or_modify_files(TSqlParser.Add_or_modify_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#add_or_modify_files}.
	 * @param ctx the parse tree
	 */
	void exitAdd_or_modify_files(TSqlParser.Add_or_modify_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#filespec}.
	 * @param ctx the parse tree
	 */
	void enterFilespec(TSqlParser.FilespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#filespec}.
	 * @param ctx the parse tree
	 */
	void exitFilespec(TSqlParser.FilespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#add_or_modify_filegroups}.
	 * @param ctx the parse tree
	 */
	void enterAdd_or_modify_filegroups(TSqlParser.Add_or_modify_filegroupsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#add_or_modify_filegroups}.
	 * @param ctx the parse tree
	 */
	void exitAdd_or_modify_filegroups(TSqlParser.Add_or_modify_filegroupsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#filegroup_updatability_option}.
	 * @param ctx the parse tree
	 */
	void enterFilegroup_updatability_option(TSqlParser.Filegroup_updatability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#filegroup_updatability_option}.
	 * @param ctx the parse tree
	 */
	void exitFilegroup_updatability_option(TSqlParser.Filegroup_updatability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_optionspec(TSqlParser.Database_optionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_optionspec(TSqlParser.Database_optionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void enterAuto_option(TSqlParser.Auto_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void exitAuto_option(TSqlParser.Auto_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option(TSqlParser.Change_tracking_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option(TSqlParser.Change_tracking_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option_list(TSqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option_list(TSqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void enterContainment_option(TSqlParser.Containment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void exitContainment_option(TSqlParser.Containment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option(TSqlParser.Cursor_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option(TSqlParser.Cursor_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_endpoint(TSqlParser.Alter_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_endpoint(TSqlParser.Alter_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_mirroring_option(TSqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_mirroring_option(TSqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_set_option(TSqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_set_option(TSqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_partner(TSqlParser.Mirroring_partnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_partner(TSqlParser.Mirroring_partnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_witness(TSqlParser.Mirroring_witnessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_witness(TSqlParser.Mirroring_witnessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 */
	void enterWitness_partner_equal(TSqlParser.Witness_partner_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 */
	void exitWitness_partner_equal(TSqlParser.Witness_partner_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#partner_option}.
	 * @param ctx the parse tree
	 */
	void enterPartner_option(TSqlParser.Partner_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#partner_option}.
	 * @param ctx the parse tree
	 */
	void exitPartner_option(TSqlParser.Partner_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#witness_option}.
	 * @param ctx the parse tree
	 */
	void enterWitness_option(TSqlParser.Witness_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#witness_option}.
	 * @param ctx the parse tree
	 */
	void exitWitness_option(TSqlParser.Witness_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#witness_server}.
	 * @param ctx the parse tree
	 */
	void enterWitness_server(TSqlParser.Witness_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#witness_server}.
	 * @param ctx the parse tree
	 */
	void exitWitness_server(TSqlParser.Witness_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#partner_server}.
	 * @param ctx the parse tree
	 */
	void enterPartner_server(TSqlParser.Partner_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#partner_server}.
	 * @param ctx the parse tree
	 */
	void exitPartner_server(TSqlParser.Partner_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_host_port_seperator(TSqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_host_port_seperator(TSqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 */
	void enterPartner_server_tcp_prefix(TSqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 */
	void exitPartner_server_tcp_prefix(TSqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#port_number}.
	 * @param ctx the parse tree
	 */
	void enterPort_number(TSqlParser.Port_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#port_number}.
	 * @param ctx the parse tree
	 */
	void exitPort_number(TSqlParser.Port_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(TSqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(TSqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void enterDate_correlation_optimization_option(TSqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void exitDate_correlation_optimization_option(TSqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_encryption_option(TSqlParser.Db_encryption_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_encryption_option(TSqlParser.Db_encryption_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_state_option(TSqlParser.Db_state_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_state_option(TSqlParser.Db_state_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_update_option(TSqlParser.Db_update_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_update_option(TSqlParser.Db_update_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_access_option(TSqlParser.Db_user_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_access_option(TSqlParser.Db_user_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_durability_option(TSqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_durability_option(TSqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void enterExternal_access_option(TSqlParser.External_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void exitExternal_access_option(TSqlParser.External_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void enterHadr_options(TSqlParser.Hadr_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void exitHadr_options(TSqlParser.Hadr_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void enterMixed_page_allocation_option(TSqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void exitMixed_page_allocation_option(TSqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void enterParameterization_option(TSqlParser.Parameterization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void exitParameterization_option(TSqlParser.Parameterization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_option(TSqlParser.Recovery_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_option(TSqlParser.Recovery_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void enterService_broker_option(TSqlParser.Service_broker_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void exitService_broker_option(TSqlParser.Service_broker_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void enterSnapshot_option(TSqlParser.Snapshot_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void exitSnapshot_option(TSqlParser.Snapshot_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void enterSql_option(TSqlParser.Sql_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void exitSql_option(TSqlParser.Sql_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void enterTarget_recovery_time_option(TSqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void exitTarget_recovery_time_option(TSqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void enterTermination(TSqlParser.TerminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void exitTermination(TSqlParser.TerminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(TSqlParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(TSqlParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_relational_or_xml_or_spatial_index(TSqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_relational_or_xml_or_spatial_index(TSqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_backward_compatible_index(TSqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_backward_compatible_index(TSqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(TSqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(TSqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(TSqlParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(TSqlParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_dml_trigger(TSqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_dml_trigger(TSqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_ddl_trigger(TSqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_ddl_trigger(TSqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(TSqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(TSqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics(TSqlParser.Drop_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics(TSqlParser.Drop_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(TSqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(TSqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view(TSqlParser.Drop_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view(TSqlParser.Drop_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(TSqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(TSqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(TSqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(TSqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function_limited(TSqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function_limited(TSqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void enterOpenquery(TSqlParser.OpenqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void exitOpenquery(TSqlParser.OpenqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void enterOpendatasource(TSqlParser.OpendatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void exitOpendatasource(TSqlParser.OpendatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(TSqlParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(TSqlParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_declaration}.
	 * @param ctx the parse tree
	 */
	void enterXml_declaration(TSqlParser.Xml_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_declaration}.
	 * @param ctx the parse tree
	 */
	void exitXml_declaration(TSqlParser.Xml_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(TSqlParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(TSqlParser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_database}.
	 * @param ctx the parse tree
	 */
	void enterBackup_database(TSqlParser.Backup_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_database}.
	 * @param ctx the parse tree
	 */
	void exitBackup_database(TSqlParser.Backup_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_log}.
	 * @param ctx the parse tree
	 */
	void enterBackup_log(TSqlParser.Backup_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_log}.
	 * @param ctx the parse tree
	 */
	void exitBackup_log(TSqlParser.Backup_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void enterBackup_certificate(TSqlParser.Backup_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void exitBackup_certificate(TSqlParser.Backup_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_master_key(TSqlParser.Backup_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_master_key(TSqlParser.Backup_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_service_master_key(TSqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_service_master_key(TSqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#kill_statement}.
	 * @param ctx the parse tree
	 */
	void enterKill_statement(TSqlParser.Kill_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#kill_statement}.
	 * @param ctx the parse tree
	 */
	void exitKill_statement(TSqlParser.Kill_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#kill_process}.
	 * @param ctx the parse tree
	 */
	void enterKill_process(TSqlParser.Kill_processContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#kill_process}.
	 * @param ctx the parse tree
	 */
	void exitKill_process(TSqlParser.Kill_processContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#kill_query_notification}.
	 * @param ctx the parse tree
	 */
	void enterKill_query_notification(TSqlParser.Kill_query_notificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#kill_query_notification}.
	 * @param ctx the parse tree
	 */
	void exitKill_query_notification(TSqlParser.Kill_query_notificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#kill_stats_job}.
	 * @param ctx the parse tree
	 */
	void enterKill_stats_job(TSqlParser.Kill_stats_jobContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#kill_stats_job}.
	 * @param ctx the parse tree
	 */
	void exitKill_stats_job(TSqlParser.Kill_stats_jobContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(TSqlParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(TSqlParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_body_batch}.
	 * @param ctx the parse tree
	 */
	void enterExecute_body_batch(TSqlParser.Execute_body_batchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_body_batch}.
	 * @param ctx the parse tree
	 */
	void exitExecute_body_batch(TSqlParser.Execute_body_batchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_body}.
	 * @param ctx the parse tree
	 */
	void enterExecute_body(TSqlParser.Execute_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_body}.
	 * @param ctx the parse tree
	 */
	void exitExecute_body(TSqlParser.Execute_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg(TSqlParser.Execute_statement_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg(TSqlParser.Execute_statement_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_statement_arg_named}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg_named(TSqlParser.Execute_statement_arg_namedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_statement_arg_named}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg_named(TSqlParser.Execute_statement_arg_namedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_statement_arg_unnamed}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg_unnamed(TSqlParser.Execute_statement_arg_unnamedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_statement_arg_unnamed}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg_unnamed(TSqlParser.Execute_statement_arg_unnamedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_parameter}.
	 * @param ctx the parse tree
	 */
	void enterExecute_parameter(TSqlParser.Execute_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_parameter}.
	 * @param ctx the parse tree
	 */
	void exitExecute_parameter(TSqlParser.Execute_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void enterExecute_var_string(TSqlParser.Execute_var_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void exitExecute_var_string(TSqlParser.Execute_var_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_statement(TSqlParser.Security_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_statement(TSqlParser.Security_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#principal_id}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal_id(TSqlParser.Principal_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#principal_id}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal_id(TSqlParser.Principal_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void enterCreate_certificate(TSqlParser.Create_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void exitCreate_certificate(TSqlParser.Create_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void enterExisting_keys(TSqlParser.Existing_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void exitExisting_keys(TSqlParser.Existing_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_key_options(TSqlParser.Private_key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_key_options(TSqlParser.Private_key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_new_keys(TSqlParser.Generate_new_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_new_keys(TSqlParser.Generate_new_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#date_options}.
	 * @param ctx the parse tree
	 */
	void enterDate_options(TSqlParser.Date_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#date_options}.
	 * @param ctx the parse tree
	 */
	void exitDate_options(TSqlParser.Date_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#open_key}.
	 * @param ctx the parse tree
	 */
	void enterOpen_key(TSqlParser.Open_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#open_key}.
	 * @param ctx the parse tree
	 */
	void exitOpen_key(TSqlParser.Open_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#close_key}.
	 * @param ctx the parse tree
	 */
	void enterClose_key(TSqlParser.Close_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#close_key}.
	 * @param ctx the parse tree
	 */
	void exitClose_key(TSqlParser.Close_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_key(TSqlParser.Create_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_key(TSqlParser.Create_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#key_options}.
	 * @param ctx the parse tree
	 */
	void enterKey_options(TSqlParser.Key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#key_options}.
	 * @param ctx the parse tree
	 */
	void exitKey_options(TSqlParser.Key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm(TSqlParser.AlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm(TSqlParser.AlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterEncryption_mechanism(TSqlParser.Encryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitEncryption_mechanism(TSqlParser.Encryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterDecryption_mechanism(TSqlParser.Decryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitDecryption_mechanism(TSqlParser.Decryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void enterGrant_permission(TSqlParser.Grant_permissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void exitGrant_permission(TSqlParser.Grant_permissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(TSqlParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(TSqlParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(TSqlParser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(TSqlParser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void enterGo_statement(TSqlParser.Go_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void exitGo_statement(TSqlParser.Go_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(TSqlParser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(TSqlParser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 */
	void enterSetuser_statement(TSqlParser.Setuser_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 */
	void exitSetuser_statement(TSqlParser.Setuser_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#reconfigure_statement}.
	 * @param ctx the parse tree
	 */
	void enterReconfigure_statement(TSqlParser.Reconfigure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#reconfigure_statement}.
	 * @param ctx the parse tree
	 */
	void exitReconfigure_statement(TSqlParser.Reconfigure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#shutdown_statement}.
	 * @param ctx the parse tree
	 */
	void enterShutdown_statement(TSqlParser.Shutdown_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#shutdown_statement}.
	 * @param ctx the parse tree
	 */
	void exitShutdown_statement(TSqlParser.Shutdown_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#checkpoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterCheckpoint_statement(TSqlParser.Checkpoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#checkpoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitCheckpoint_statement(TSqlParser.Checkpoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkalloc_option}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkalloc_option(TSqlParser.Dbcc_checkalloc_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkalloc_option}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkalloc_option(TSqlParser.Dbcc_checkalloc_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkalloc}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkalloc(TSqlParser.Dbcc_checkallocContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkalloc}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkalloc(TSqlParser.Dbcc_checkallocContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkcatalog}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkcatalog(TSqlParser.Dbcc_checkcatalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkcatalog}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkcatalog(TSqlParser.Dbcc_checkcatalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkconstraints_option}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkconstraints_option(TSqlParser.Dbcc_checkconstraints_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkconstraints_option}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkconstraints_option(TSqlParser.Dbcc_checkconstraints_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkconstraints}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkconstraints(TSqlParser.Dbcc_checkconstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkconstraints}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkconstraints(TSqlParser.Dbcc_checkconstraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkdb_table_option}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkdb_table_option(TSqlParser.Dbcc_checkdb_table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkdb_table_option}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkdb_table_option(TSqlParser.Dbcc_checkdb_table_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkdb}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkdb(TSqlParser.Dbcc_checkdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkdb}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkdb(TSqlParser.Dbcc_checkdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkfilegroup_option}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkfilegroup_option(TSqlParser.Dbcc_checkfilegroup_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkfilegroup_option}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkfilegroup_option(TSqlParser.Dbcc_checkfilegroup_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checkfilegroup}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checkfilegroup(TSqlParser.Dbcc_checkfilegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checkfilegroup}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checkfilegroup(TSqlParser.Dbcc_checkfilegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_checktable}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_checktable(TSqlParser.Dbcc_checktableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_checktable}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_checktable(TSqlParser.Dbcc_checktableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_cleantable}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_cleantable(TSqlParser.Dbcc_cleantableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_cleantable}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_cleantable(TSqlParser.Dbcc_cleantableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_clonedatabase_option}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_clonedatabase_option(TSqlParser.Dbcc_clonedatabase_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_clonedatabase_option}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_clonedatabase_option(TSqlParser.Dbcc_clonedatabase_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_clonedatabase}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_clonedatabase(TSqlParser.Dbcc_clonedatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_clonedatabase}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_clonedatabase(TSqlParser.Dbcc_clonedatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_pdw_showspaceused}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_pdw_showspaceused(TSqlParser.Dbcc_pdw_showspaceusedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_pdw_showspaceused}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_pdw_showspaceused(TSqlParser.Dbcc_pdw_showspaceusedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_proccache}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_proccache(TSqlParser.Dbcc_proccacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_proccache}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_proccache(TSqlParser.Dbcc_proccacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_showcontig_option}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_showcontig_option(TSqlParser.Dbcc_showcontig_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_showcontig_option}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_showcontig_option(TSqlParser.Dbcc_showcontig_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_showcontig}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_showcontig(TSqlParser.Dbcc_showcontigContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_showcontig}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_showcontig(TSqlParser.Dbcc_showcontigContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_shrinklog}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_shrinklog(TSqlParser.Dbcc_shrinklogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_shrinklog}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_shrinklog(TSqlParser.Dbcc_shrinklogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_dbreindex}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_dbreindex(TSqlParser.Dbcc_dbreindexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_dbreindex}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_dbreindex(TSqlParser.Dbcc_dbreindexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_dll_free}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_dll_free(TSqlParser.Dbcc_dll_freeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_dll_free}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_dll_free(TSqlParser.Dbcc_dll_freeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_dropcleanbuffers}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_dropcleanbuffers(TSqlParser.Dbcc_dropcleanbuffersContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_dropcleanbuffers}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_dropcleanbuffers(TSqlParser.Dbcc_dropcleanbuffersContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_clause(TSqlParser.Dbcc_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_clause(TSqlParser.Dbcc_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_clause(TSqlParser.Execute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_clause(TSqlParser.Execute_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_local(TSqlParser.Declare_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_local(TSqlParser.Declare_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_definition(TSqlParser.Table_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_definition(TSqlParser.Table_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_type_indices}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_indices(TSqlParser.Table_type_indicesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_type_indices}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_indices(TSqlParser.Table_type_indicesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterXml_type_definition(TSqlParser.Xml_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitXml_type_definition(TSqlParser.Xml_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterXml_schema_collection(TSqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitXml_schema_collection(TSqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraints(TSqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraints(TSqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraint(TSqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraint(TSqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(TSqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(TSqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_definition_element}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition_element(TSqlParser.Column_definition_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_definition_element}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition_element(TSqlParser.Column_definition_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_modifier}.
	 * @param ctx the parse tree
	 */
	void enterColumn_modifier(TSqlParser.Column_modifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_modifier}.
	 * @param ctx the parse tree
	 */
	void exitColumn_modifier(TSqlParser.Column_modifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterMaterialized_column_definition(TSqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitMaterialized_column_definition(TSqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(TSqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(TSqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_index}.
	 * @param ctx the parse tree
	 */
	void enterColumn_index(TSqlParser.Column_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_index}.
	 * @param ctx the parse tree
	 */
	void exitColumn_index(TSqlParser.Column_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#on_partition_or_filegroup}.
	 * @param ctx the parse tree
	 */
	void enterOn_partition_or_filegroup(TSqlParser.On_partition_or_filegroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#on_partition_or_filegroup}.
	 * @param ctx the parse tree
	 */
	void exitOn_partition_or_filegroup(TSqlParser.On_partition_or_filegroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(TSqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(TSqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#connection_node}.
	 * @param ctx the parse tree
	 */
	void enterConnection_node(TSqlParser.Connection_nodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#connection_node}.
	 * @param ctx the parse tree
	 */
	void exitConnection_node(TSqlParser.Connection_nodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#primary_key_options}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_key_options(TSqlParser.Primary_key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#primary_key_options}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_key_options(TSqlParser.Primary_key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#foreign_key_options}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_options(TSqlParser.Foreign_key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#foreign_key_options}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_options(TSqlParser.Foreign_key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#check_constraint}.
	 * @param ctx the parse tree
	 */
	void enterCheck_constraint(TSqlParser.Check_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#check_constraint}.
	 * @param ctx the parse tree
	 */
	void exitCheck_constraint(TSqlParser.Check_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete(TSqlParser.On_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete(TSqlParser.On_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#on_update}.
	 * @param ctx the parse tree
	 */
	void enterOn_update(TSqlParser.On_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#on_update}.
	 * @param ctx the parse tree
	 */
	void exitOn_update(TSqlParser.On_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_table_index_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_index_options(TSqlParser.Alter_table_index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_table_index_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_index_options(TSqlParser.Alter_table_index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_table_index_option}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_index_option(TSqlParser.Alter_table_index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_table_index_option}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_index_option(TSqlParser.Alter_table_index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(TSqlParser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(TSqlParser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common(TSqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common(TSqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common_partial(TSqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common_partial(TSqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void enterFetch_cursor(TSqlParser.Fetch_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void exitFetch_cursor(TSqlParser.Fetch_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void enterSet_special(TSqlParser.Set_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void exitSet_special(TSqlParser.Set_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#special_list}.
	 * @param ctx the parse tree
	 */
	void enterSpecial_list(TSqlParser.Special_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#special_list}.
	 * @param ctx the parse tree
	 */
	void exitSpecial_list(TSqlParser.Special_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void enterConstant_LOCAL_ID(TSqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void exitConstant_LOCAL_ID(TSqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(TSqlParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(TSqlParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#time_zone}.
	 * @param ctx the parse tree
	 */
	void enterTime_zone(TSqlParser.Time_zoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#time_zone}.
	 * @param ctx the parse tree
	 */
	void exitTime_zone(TSqlParser.Time_zoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(TSqlParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(TSqlParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(TSqlParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(TSqlParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_expression(TSqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_expression(TSqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(TSqlParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(TSqlParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(TSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(TSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_expression(TSqlParser.With_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_expression(TSqlParser.With_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(TSqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(TSqlParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem(TSqlParser.Update_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem(TSqlParser.Update_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_elem_merge}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem_merge(TSqlParser.Update_elem_mergeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_elem_merge}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem_merge(TSqlParser.Update_elem_mergeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(TSqlParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(TSqlParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(TSqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(TSqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(TSqlParser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(TSqlParser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sql_union}.
	 * @param ctx the parse tree
	 */
	void enterSql_union(TSqlParser.Sql_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sql_union}.
	 * @param ctx the parse tree
	 */
	void exitSql_union(TSqlParser.Sql_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(TSqlParser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(TSqlParser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void enterTop_clause(TSqlParser.Top_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void exitTop_clause(TSqlParser.Top_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#top_percent}.
	 * @param ctx the parse tree
	 */
	void enterTop_percent(TSqlParser.Top_percentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#top_percent}.
	 * @param ctx the parse tree
	 */
	void exitTop_percent(TSqlParser.Top_percentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#top_count}.
	 * @param ctx the parse tree
	 */
	void enterTop_count(TSqlParser.Top_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#top_count}.
	 * @param ctx the parse tree
	 */
	void exitTop_count(TSqlParser.Top_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(TSqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(TSqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#select_order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_order_by_clause(TSqlParser.Select_order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#select_order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_order_by_clause(TSqlParser.Select_order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_clause(TSqlParser.For_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_clause(TSqlParser.For_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void enterXml_common_directives(TSqlParser.Xml_common_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void exitXml_common_directives(TSqlParser.Xml_common_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(TSqlParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(TSqlParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#grouping_sets_item}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_sets_item(TSqlParser.Grouping_sets_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#grouping_sets_item}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_sets_item(TSqlParser.Grouping_sets_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_item(TSqlParser.Group_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_item(TSqlParser.Group_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void enterOption_clause(TSqlParser.Option_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void exitOption_clause(TSqlParser.Option_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(TSqlParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(TSqlParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void enterOptimize_for_arg(TSqlParser.Optimize_for_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void exitOptimize_for_arg(TSqlParser.Optimize_for_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(TSqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(TSqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 */
	void enterUdt_method_arguments(TSqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 */
	void exitUdt_method_arguments(TSqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#asterisk}.
	 * @param ctx the parse tree
	 */
	void enterAsterisk(TSqlParser.AsteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#asterisk}.
	 * @param ctx the parse tree
	 */
	void exitAsterisk(TSqlParser.AsteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#udt_elem}.
	 * @param ctx the parse tree
	 */
	void enterUdt_elem(TSqlParser.Udt_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#udt_elem}.
	 * @param ctx the parse tree
	 */
	void exitUdt_elem(TSqlParser.Udt_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void enterExpression_elem(TSqlParser.Expression_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void exitExpression_elem(TSqlParser.Expression_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(TSqlParser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(TSqlParser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void enterTable_sources(TSqlParser.Table_sourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void exitTable_sources(TSqlParser.Table_sourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#non_ansi_join}.
	 * @param ctx the parse tree
	 */
	void enterNon_ansi_join(TSqlParser.Non_ansi_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#non_ansi_join}.
	 * @param ctx the parse tree
	 */
	void exitNon_ansi_join(TSqlParser.Non_ansi_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(TSqlParser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(TSqlParser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item(TSqlParser.Table_source_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item(TSqlParser.Table_source_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#open_xml}.
	 * @param ctx the parse tree
	 */
	void enterOpen_xml(TSqlParser.Open_xmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#open_xml}.
	 * @param ctx the parse tree
	 */
	void exitOpen_xml(TSqlParser.Open_xmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#open_json}.
	 * @param ctx the parse tree
	 */
	void enterOpen_json(TSqlParser.Open_jsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#open_json}.
	 * @param ctx the parse tree
	 */
	void exitOpen_json(TSqlParser.Open_jsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#json_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJson_declaration(TSqlParser.Json_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#json_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJson_declaration(TSqlParser.Json_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#json_column_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJson_column_declaration(TSqlParser.Json_column_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#json_column_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJson_column_declaration(TSqlParser.Json_column_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSchema_declaration(TSqlParser.Schema_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSchema_declaration(TSqlParser.Schema_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void enterColumn_declaration(TSqlParser.Column_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void exitColumn_declaration(TSqlParser.Column_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void enterChange_table(TSqlParser.Change_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void exitChange_table(TSqlParser.Change_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#change_table_changes}.
	 * @param ctx the parse tree
	 */
	void enterChange_table_changes(TSqlParser.Change_table_changesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#change_table_changes}.
	 * @param ctx the parse tree
	 */
	void exitChange_table_changes(TSqlParser.Change_table_changesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#change_table_version}.
	 * @param ctx the parse tree
	 */
	void enterChange_table_version(TSqlParser.Change_table_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#change_table_version}.
	 * @param ctx the parse tree
	 */
	void exitChange_table_version(TSqlParser.Change_table_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#join_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_part(TSqlParser.Join_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#join_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_part(TSqlParser.Join_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#join_on}.
	 * @param ctx the parse tree
	 */
	void enterJoin_on(TSqlParser.Join_onContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#join_on}.
	 * @param ctx the parse tree
	 */
	void exitJoin_on(TSqlParser.Join_onContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cross_join}.
	 * @param ctx the parse tree
	 */
	void enterCross_join(TSqlParser.Cross_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cross_join}.
	 * @param ctx the parse tree
	 */
	void exitCross_join(TSqlParser.Cross_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#apply_}.
	 * @param ctx the parse tree
	 */
	void enterApply_(TSqlParser.Apply_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#apply_}.
	 * @param ctx the parse tree
	 */
	void exitApply_(TSqlParser.Apply_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#pivot}.
	 * @param ctx the parse tree
	 */
	void enterPivot(TSqlParser.PivotContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#pivot}.
	 * @param ctx the parse tree
	 */
	void exitPivot(TSqlParser.PivotContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#unpivot}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot(TSqlParser.UnpivotContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#unpivot}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot(TSqlParser.UnpivotContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(TSqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(TSqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(TSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(TSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name_list(TSqlParser.Full_column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name_list(TSqlParser.Full_column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function(TSqlParser.Rowset_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function(TSqlParser.Rowset_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void enterBulk_option(TSqlParser.Bulk_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void exitBulk_option(TSqlParser.Bulk_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(TSqlParser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(TSqlParser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterRANKING_WINDOWED_FUNC(TSqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitRANKING_WINDOWED_FUNC(TSqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterAGGREGATE_WINDOWED_FUNC(TSqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitAGGREGATE_WINDOWED_FUNC(TSqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterANALYTIC_WINDOWED_FUNC(TSqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitANALYTIC_WINDOWED_FUNC(TSqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BUILT_IN_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterBUILT_IN_FUNC(TSqlParser.BUILT_IN_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BUILT_IN_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitBUILT_IN_FUNC(TSqlParser.BUILT_IN_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSCALAR_FUNCTION(TSqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSCALAR_FUNCTION(TSqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FREE_TEXT}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFREE_TEXT(TSqlParser.FREE_TEXTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FREE_TEXT}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFREE_TEXT(TSqlParser.FREE_TEXTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARTITION_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterPARTITION_FUNC(TSqlParser.PARTITION_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARTITION_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitPARTITION_FUNC(TSqlParser.PARTITION_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HIERARCHYID_METHOD}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterHIERARCHYID_METHOD(TSqlParser.HIERARCHYID_METHODContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HIERARCHYID_METHOD}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitHIERARCHYID_METHOD(TSqlParser.HIERARCHYID_METHODContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#partition_function}.
	 * @param ctx the parse tree
	 */
	void enterPartition_function(TSqlParser.Partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#partition_function}.
	 * @param ctx the parse tree
	 */
	void exitPartition_function(TSqlParser.Partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#freetext_function}.
	 * @param ctx the parse tree
	 */
	void enterFreetext_function(TSqlParser.Freetext_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#freetext_function}.
	 * @param ctx the parse tree
	 */
	void exitFreetext_function(TSqlParser.Freetext_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#freetext_predicate}.
	 * @param ctx the parse tree
	 */
	void enterFreetext_predicate(TSqlParser.Freetext_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#freetext_predicate}.
	 * @param ctx the parse tree
	 */
	void exitFreetext_predicate(TSqlParser.Freetext_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#json_key_value}.
	 * @param ctx the parse tree
	 */
	void enterJson_key_value(TSqlParser.Json_key_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#json_key_value}.
	 * @param ctx the parse tree
	 */
	void exitJson_key_value(TSqlParser.Json_key_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#json_null_clause}.
	 * @param ctx the parse tree
	 */
	void enterJson_null_clause(TSqlParser.Json_null_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#json_null_clause}.
	 * @param ctx the parse tree
	 */
	void exitJson_null_clause(TSqlParser.Json_null_clauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APP_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterAPP_NAME(TSqlParser.APP_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APP_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitAPP_NAME(TSqlParser.APP_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APPLOCK_MODE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterAPPLOCK_MODE(TSqlParser.APPLOCK_MODEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APPLOCK_MODE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitAPPLOCK_MODE(TSqlParser.APPLOCK_MODEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APPLOCK_TEST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterAPPLOCK_TEST(TSqlParser.APPLOCK_TESTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APPLOCK_TEST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitAPPLOCK_TEST(TSqlParser.APPLOCK_TESTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASSEMBLYPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterASSEMBLYPROPERTY(TSqlParser.ASSEMBLYPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASSEMBLYPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitASSEMBLYPROPERTY(TSqlParser.ASSEMBLYPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COL_LENGTH}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCOL_LENGTH(TSqlParser.COL_LENGTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COL_LENGTH}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCOL_LENGTH(TSqlParser.COL_LENGTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COL_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCOL_NAME(TSqlParser.COL_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COL_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCOL_NAME(TSqlParser.COL_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COLUMNPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCOLUMNPROPERTY(TSqlParser.COLUMNPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COLUMNPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCOLUMNPROPERTY(TSqlParser.COLUMNPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATABASEPROPERTYEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATABASEPROPERTYEX(TSqlParser.DATABASEPROPERTYEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATABASEPROPERTYEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATABASEPROPERTYEX(TSqlParser.DATABASEPROPERTYEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DB_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDB_ID(TSqlParser.DB_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DB_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDB_ID(TSqlParser.DB_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DB_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDB_NAME(TSqlParser.DB_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DB_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDB_NAME(TSqlParser.DB_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILE_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFILE_ID(TSqlParser.FILE_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILE_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFILE_ID(TSqlParser.FILE_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILE_IDEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFILE_IDEX(TSqlParser.FILE_IDEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILE_IDEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFILE_IDEX(TSqlParser.FILE_IDEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILE_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFILE_NAME(TSqlParser.FILE_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILE_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFILE_NAME(TSqlParser.FILE_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILEGROUP_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFILEGROUP_ID(TSqlParser.FILEGROUP_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILEGROUP_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFILEGROUP_ID(TSqlParser.FILEGROUP_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILEGROUP_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFILEGROUP_NAME(TSqlParser.FILEGROUP_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILEGROUP_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFILEGROUP_NAME(TSqlParser.FILEGROUP_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILEGROUPPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFILEGROUPPROPERTY(TSqlParser.FILEGROUPPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILEGROUPPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFILEGROUPPROPERTY(TSqlParser.FILEGROUPPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILEPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFILEPROPERTY(TSqlParser.FILEPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILEPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFILEPROPERTY(TSqlParser.FILEPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FILEPROPERTYEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFILEPROPERTYEX(TSqlParser.FILEPROPERTYEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FILEPROPERTYEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFILEPROPERTYEX(TSqlParser.FILEPROPERTYEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FULLTEXTCATALOGPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFULLTEXTCATALOGPROPERTY(TSqlParser.FULLTEXTCATALOGPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FULLTEXTCATALOGPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFULLTEXTCATALOGPROPERTY(TSqlParser.FULLTEXTCATALOGPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FULLTEXTSERVICEPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFULLTEXTSERVICEPROPERTY(TSqlParser.FULLTEXTSERVICEPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FULLTEXTSERVICEPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFULLTEXTSERVICEPROPERTY(TSqlParser.FULLTEXTSERVICEPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INDEX_COL}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterINDEX_COL(TSqlParser.INDEX_COLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INDEX_COL}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitINDEX_COL(TSqlParser.INDEX_COLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INDEXKEY_PROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterINDEXKEY_PROPERTY(TSqlParser.INDEXKEY_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INDEXKEY_PROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitINDEXKEY_PROPERTY(TSqlParser.INDEXKEY_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INDEXPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterINDEXPROPERTY(TSqlParser.INDEXPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INDEXPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitINDEXPROPERTY(TSqlParser.INDEXPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEXT_VALUE_FOR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterNEXT_VALUE_FOR(TSqlParser.NEXT_VALUE_FORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEXT_VALUE_FOR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitNEXT_VALUE_FOR(TSqlParser.NEXT_VALUE_FORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBJECT_DEFINITION}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterOBJECT_DEFINITION(TSqlParser.OBJECT_DEFINITIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBJECT_DEFINITION}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitOBJECT_DEFINITION(TSqlParser.OBJECT_DEFINITIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBJECT_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterOBJECT_ID(TSqlParser.OBJECT_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBJECT_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitOBJECT_ID(TSqlParser.OBJECT_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBJECT_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterOBJECT_NAME(TSqlParser.OBJECT_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBJECT_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitOBJECT_NAME(TSqlParser.OBJECT_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBJECT_SCHEMA_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterOBJECT_SCHEMA_NAME(TSqlParser.OBJECT_SCHEMA_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBJECT_SCHEMA_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitOBJECT_SCHEMA_NAME(TSqlParser.OBJECT_SCHEMA_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBJECTPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterOBJECTPROPERTY(TSqlParser.OBJECTPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBJECTPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitOBJECTPROPERTY(TSqlParser.OBJECTPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OBJECTPROPERTYEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterOBJECTPROPERTYEX(TSqlParser.OBJECTPROPERTYEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OBJECTPROPERTYEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitOBJECTPROPERTYEX(TSqlParser.OBJECTPROPERTYEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORIGINAL_DB_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterORIGINAL_DB_NAME(TSqlParser.ORIGINAL_DB_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORIGINAL_DB_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitORIGINAL_DB_NAME(TSqlParser.ORIGINAL_DB_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARSENAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterPARSENAME(TSqlParser.PARSENAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARSENAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitPARSENAME(TSqlParser.PARSENAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCHEMA_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSCHEMA_ID(TSqlParser.SCHEMA_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCHEMA_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSCHEMA_ID(TSqlParser.SCHEMA_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCHEMA_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSCHEMA_NAME(TSqlParser.SCHEMA_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCHEMA_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSCHEMA_NAME(TSqlParser.SCHEMA_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCOPE_IDENTITY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSCOPE_IDENTITY(TSqlParser.SCOPE_IDENTITYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCOPE_IDENTITY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSCOPE_IDENTITY(TSqlParser.SCOPE_IDENTITYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SERVERPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSERVERPROPERTY(TSqlParser.SERVERPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SERVERPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSERVERPROPERTY(TSqlParser.SERVERPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STATS_DATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSTATS_DATE(TSqlParser.STATS_DATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STATS_DATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSTATS_DATE(TSqlParser.STATS_DATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TYPE_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTYPE_ID(TSqlParser.TYPE_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPE_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTYPE_ID(TSqlParser.TYPE_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TYPE_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTYPE_NAME(TSqlParser.TYPE_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPE_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTYPE_NAME(TSqlParser.TYPE_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TYPEPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTYPEPROPERTY(TSqlParser.TYPEPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TYPEPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTYPEPROPERTY(TSqlParser.TYPEPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASCII}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterASCII(TSqlParser.ASCIIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASCII}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitASCII(TSqlParser.ASCIIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCHAR(TSqlParser.CHARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHAR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCHAR(TSqlParser.CHARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHARINDEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCHARINDEX(TSqlParser.CHARINDEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHARINDEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCHARINDEX(TSqlParser.CHARINDEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONCAT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCONCAT(TSqlParser.CONCATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONCAT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCONCAT(TSqlParser.CONCATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONCAT_WS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCONCAT_WS(TSqlParser.CONCAT_WSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONCAT_WS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCONCAT_WS(TSqlParser.CONCAT_WSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DIFFERENCE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDIFFERENCE(TSqlParser.DIFFERENCEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DIFFERENCE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDIFFERENCE(TSqlParser.DIFFERENCEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMAT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFORMAT(TSqlParser.FORMATContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMAT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFORMAT(TSqlParser.FORMATContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LEFT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterLEFT(TSqlParser.LEFTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LEFT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitLEFT(TSqlParser.LEFTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LEN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterLEN(TSqlParser.LENContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LEN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitLEN(TSqlParser.LENContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOWER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterLOWER(TSqlParser.LOWERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOWER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitLOWER(TSqlParser.LOWERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LTRIM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterLTRIM(TSqlParser.LTRIMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LTRIM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitLTRIM(TSqlParser.LTRIMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NCHAR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterNCHAR(TSqlParser.NCHARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NCHAR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitNCHAR(TSqlParser.NCHARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PATINDEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterPATINDEX(TSqlParser.PATINDEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PATINDEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitPATINDEX(TSqlParser.PATINDEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code QUOTENAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterQUOTENAME(TSqlParser.QUOTENAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code QUOTENAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitQUOTENAME(TSqlParser.QUOTENAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code REPLACE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterREPLACE(TSqlParser.REPLACEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code REPLACE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitREPLACE(TSqlParser.REPLACEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code REPLICATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterREPLICATE(TSqlParser.REPLICATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code REPLICATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitREPLICATE(TSqlParser.REPLICATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code REVERSE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterREVERSE(TSqlParser.REVERSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code REVERSE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitREVERSE(TSqlParser.REVERSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RIGHT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterRIGHT(TSqlParser.RIGHTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RIGHT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitRIGHT(TSqlParser.RIGHTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RTRIM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterRTRIM(TSqlParser.RTRIMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RTRIM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitRTRIM(TSqlParser.RTRIMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SOUNDEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSOUNDEX(TSqlParser.SOUNDEXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SOUNDEX}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSOUNDEX(TSqlParser.SOUNDEXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SPACE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSPACE(TSqlParser.SPACEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SPACE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSPACE(TSqlParser.SPACEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSTR(TSqlParser.STRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSTR(TSqlParser.STRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRINGAGG}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSTRINGAGG(TSqlParser.STRINGAGGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRINGAGG}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSTRINGAGG(TSqlParser.STRINGAGGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING_ESCAPE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSTRING_ESCAPE(TSqlParser.STRING_ESCAPEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING_ESCAPE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSTRING_ESCAPE(TSqlParser.STRING_ESCAPEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSTUFF(TSqlParser.STUFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSTUFF(TSqlParser.STUFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUBSTRING}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSUBSTRING(TSqlParser.SUBSTRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUBSTRING}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSUBSTRING(TSqlParser.SUBSTRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TRANSLATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTRANSLATE(TSqlParser.TRANSLATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TRANSLATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTRANSLATE(TSqlParser.TRANSLATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TRIM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTRIM(TSqlParser.TRIMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TRIM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTRIM(TSqlParser.TRIMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNICODE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterUNICODE(TSqlParser.UNICODEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNICODE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitUNICODE(TSqlParser.UNICODEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UPPER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterUPPER(TSqlParser.UPPERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UPPER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitUPPER(TSqlParser.UPPERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterBINARY_CHECKSUM(TSqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitBINARY_CHECKSUM(TSqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCHECKSUM(TSqlParser.CHECKSUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCHECKSUM(TSqlParser.CHECKSUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COMPRESS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCOMPRESS(TSqlParser.COMPRESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COMPRESS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCOMPRESS(TSqlParser.COMPRESSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONNECTIONPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCONNECTIONPROPERTY(TSqlParser.CONNECTIONPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONNECTIONPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCONNECTIONPROPERTY(TSqlParser.CONNECTIONPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONTEXT_INFO}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCONTEXT_INFO(TSqlParser.CONTEXT_INFOContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONTEXT_INFO}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCONTEXT_INFO(TSqlParser.CONTEXT_INFOContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_REQUEST_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_REQUEST_ID(TSqlParser.CURRENT_REQUEST_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_REQUEST_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_REQUEST_ID(TSqlParser.CURRENT_REQUEST_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_TRANSACTION_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_TRANSACTION_ID(TSqlParser.CURRENT_TRANSACTION_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_TRANSACTION_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_TRANSACTION_ID(TSqlParser.CURRENT_TRANSACTION_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DECOMPRESS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDECOMPRESS(TSqlParser.DECOMPRESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DECOMPRESS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDECOMPRESS(TSqlParser.DECOMPRESSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR_LINE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterERROR_LINE(TSqlParser.ERROR_LINEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR_LINE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitERROR_LINE(TSqlParser.ERROR_LINEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR_MESSAGE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterERROR_MESSAGE(TSqlParser.ERROR_MESSAGEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR_MESSAGE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitERROR_MESSAGE(TSqlParser.ERROR_MESSAGEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR_NUMBER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterERROR_NUMBER(TSqlParser.ERROR_NUMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR_NUMBER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitERROR_NUMBER(TSqlParser.ERROR_NUMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR_PROCEDURE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterERROR_PROCEDURE(TSqlParser.ERROR_PROCEDUREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR_PROCEDURE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitERROR_PROCEDURE(TSqlParser.ERROR_PROCEDUREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR_SEVERITY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterERROR_SEVERITY(TSqlParser.ERROR_SEVERITYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR_SEVERITY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitERROR_SEVERITY(TSqlParser.ERROR_SEVERITYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ERROR_STATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterERROR_STATE(TSqlParser.ERROR_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ERROR_STATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitERROR_STATE(TSqlParser.ERROR_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FORMATMESSAGE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFORMATMESSAGE(TSqlParser.FORMATMESSAGEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FORMATMESSAGE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFORMATMESSAGE(TSqlParser.FORMATMESSAGEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GET_FILESTREAM_TRANSACTION_CONTEXT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterGET_FILESTREAM_TRANSACTION_CONTEXT(TSqlParser.GET_FILESTREAM_TRANSACTION_CONTEXTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GET_FILESTREAM_TRANSACTION_CONTEXT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitGET_FILESTREAM_TRANSACTION_CONTEXT(TSqlParser.GET_FILESTREAM_TRANSACTION_CONTEXTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETANSINULL}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterGETANSINULL(TSqlParser.GETANSINULLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETANSINULL}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitGETANSINULL(TSqlParser.GETANSINULLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HOST_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterHOST_ID(TSqlParser.HOST_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HOST_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitHOST_ID(TSqlParser.HOST_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HOST_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterHOST_NAME(TSqlParser.HOST_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HOST_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitHOST_NAME(TSqlParser.HOST_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterISNULL(TSqlParser.ISNULLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitISNULL(TSqlParser.ISNULLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ISNUMERIC}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterISNUMERIC(TSqlParser.ISNUMERICContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ISNUMERIC}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitISNUMERIC(TSqlParser.ISNUMERICContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterMIN_ACTIVE_ROWVERSION(TSqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitMIN_ACTIVE_ROWVERSION(TSqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEWID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterNEWID(TSqlParser.NEWIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEWID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitNEWID(TSqlParser.NEWIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NEWSEQUENTIALID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterNEWSEQUENTIALID(TSqlParser.NEWSEQUENTIALIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NEWSEQUENTIALID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitNEWSEQUENTIALID(TSqlParser.NEWSEQUENTIALIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ROWCOUNT_BIG}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterROWCOUNT_BIG(TSqlParser.ROWCOUNT_BIGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ROWCOUNT_BIG}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitROWCOUNT_BIG(TSqlParser.ROWCOUNT_BIGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SESSION_CONTEXT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSESSION_CONTEXT(TSqlParser.SESSION_CONTEXTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SESSION_CONTEXT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSESSION_CONTEXT(TSqlParser.SESSION_CONTEXTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XACT_STATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterXACT_STATE(TSqlParser.XACT_STATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XACT_STATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitXACT_STATE(TSqlParser.XACT_STATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCAST(TSqlParser.CASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCAST(TSqlParser.CASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TRY_CAST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTRY_CAST(TSqlParser.TRY_CASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TRY_CAST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTRY_CAST(TSqlParser.TRY_CASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCONVERT(TSqlParser.CONVERTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCONVERT(TSqlParser.CONVERTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCOALESCE(TSqlParser.COALESCEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCOALESCE(TSqlParser.COALESCEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURSOR_ROWS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURSOR_ROWS(TSqlParser.CURSOR_ROWSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURSOR_ROWS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURSOR_ROWS(TSqlParser.CURSOR_ROWSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FETCH_STATUS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFETCH_STATUS(TSqlParser.FETCH_STATUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FETCH_STATUS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFETCH_STATUS(TSqlParser.FETCH_STATUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURSOR_STATUS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURSOR_STATUS(TSqlParser.CURSOR_STATUSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURSOR_STATUS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURSOR_STATUS(TSqlParser.CURSOR_STATUSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CERT_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCERT_ID(TSqlParser.CERT_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CERT_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCERT_ID(TSqlParser.CERT_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATALENGTH}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATALENGTH(TSqlParser.DATALENGTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATALENGTH}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATALENGTH(TSqlParser.DATALENGTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENT_CURRENT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIDENT_CURRENT(TSqlParser.IDENT_CURRENTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENT_CURRENT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIDENT_CURRENT(TSqlParser.IDENT_CURRENTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENT_INCR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIDENT_INCR(TSqlParser.IDENT_INCRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENT_INCR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIDENT_INCR(TSqlParser.IDENT_INCRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENT_SEED}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIDENT_SEED(TSqlParser.IDENT_SEEDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENT_SEED}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIDENT_SEED(TSqlParser.IDENT_SEEDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIDENTITY(TSqlParser.IDENTITYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIDENTITY(TSqlParser.IDENTITYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQL_VARIANT_PROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSQL_VARIANT_PROPERTY(TSqlParser.SQL_VARIANT_PROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQL_VARIANT_PROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSQL_VARIANT_PROPERTY(TSqlParser.SQL_VARIANT_PROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_DATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_DATE(TSqlParser.CURRENT_DATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_DATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_DATE(TSqlParser.CURRENT_DATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_TIMESTAMP(TSqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_TIMESTAMP(TSqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_TIMEZONE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_TIMEZONE(TSqlParser.CURRENT_TIMEZONEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_TIMEZONE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_TIMEZONE(TSqlParser.CURRENT_TIMEZONEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_TIMEZONE_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_TIMEZONE_ID(TSqlParser.CURRENT_TIMEZONE_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_TIMEZONE_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_TIMEZONE_ID(TSqlParser.CURRENT_TIMEZONE_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATE_BUCKET}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATE_BUCKET(TSqlParser.DATE_BUCKETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATE_BUCKET}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATE_BUCKET(TSqlParser.DATE_BUCKETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATEADD(TSqlParser.DATEADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATEADD(TSqlParser.DATEADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATEDIFF(TSqlParser.DATEDIFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATEDIFF(TSqlParser.DATEDIFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEDIFF_BIG}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATEDIFF_BIG(TSqlParser.DATEDIFF_BIGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEDIFF_BIG}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATEDIFF_BIG(TSqlParser.DATEDIFF_BIGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATEFROMPARTS(TSqlParser.DATEFROMPARTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATEFROMPARTS(TSqlParser.DATEFROMPARTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATENAME(TSqlParser.DATENAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATENAME(TSqlParser.DATENAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATEPART(TSqlParser.DATEPARTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATEPART(TSqlParser.DATEPARTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATETIME2FROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATETIME2FROMPARTS(TSqlParser.DATETIME2FROMPARTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATETIME2FROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATETIME2FROMPARTS(TSqlParser.DATETIME2FROMPARTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATETIMEFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATETIMEFROMPARTS(TSqlParser.DATETIMEFROMPARTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATETIMEFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATETIMEFROMPARTS(TSqlParser.DATETIMEFROMPARTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATETIMEOFFSETFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATETIMEOFFSETFROMPARTS(TSqlParser.DATETIMEOFFSETFROMPARTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATETIMEOFFSETFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATETIMEOFFSETFROMPARTS(TSqlParser.DATETIMEOFFSETFROMPARTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATETRUNC}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATETRUNC(TSqlParser.DATETRUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATETRUNC}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATETRUNC(TSqlParser.DATETRUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DAY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDAY(TSqlParser.DAYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DAY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDAY(TSqlParser.DAYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EOMONTH}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterEOMONTH(TSqlParser.EOMONTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EOMONTH}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitEOMONTH(TSqlParser.EOMONTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterGETDATE(TSqlParser.GETDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitGETDATE(TSqlParser.GETDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterGETUTCDATE(TSqlParser.GETUTCDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitGETUTCDATE(TSqlParser.GETUTCDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ISDATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterISDATE(TSqlParser.ISDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ISDATE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitISDATE(TSqlParser.ISDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MONTH}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterMONTH(TSqlParser.MONTHContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MONTH}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitMONTH(TSqlParser.MONTHContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SMALLDATETIMEFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSMALLDATETIMEFROMPARTS(TSqlParser.SMALLDATETIMEFROMPARTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SMALLDATETIMEFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSMALLDATETIMEFROMPARTS(TSqlParser.SMALLDATETIMEFROMPARTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SWITCHOFFSET}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSWITCHOFFSET(TSqlParser.SWITCHOFFSETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SWITCHOFFSET}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSWITCHOFFSET(TSqlParser.SWITCHOFFSETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SYSDATETIME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSYSDATETIME(TSqlParser.SYSDATETIMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SYSDATETIME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSYSDATETIME(TSqlParser.SYSDATETIMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SYSDATETIMEOFFSET}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSYSDATETIMEOFFSET(TSqlParser.SYSDATETIMEOFFSETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SYSDATETIMEOFFSET}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSYSDATETIMEOFFSET(TSqlParser.SYSDATETIMEOFFSETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SYSUTCDATETIME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSYSUTCDATETIME(TSqlParser.SYSUTCDATETIMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SYSUTCDATETIME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSYSUTCDATETIME(TSqlParser.SYSUTCDATETIMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TIMEFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTIMEFROMPARTS(TSqlParser.TIMEFROMPARTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TIMEFROMPARTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTIMEFROMPARTS(TSqlParser.TIMEFROMPARTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TODATETIMEOFFSET}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTODATETIMEOFFSET(TSqlParser.TODATETIMEOFFSETContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TODATETIMEOFFSET}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTODATETIMEOFFSET(TSqlParser.TODATETIMEOFFSETContext ctx);
	/**
	 * Enter a parse tree produced by the {@code YEAR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterYEAR(TSqlParser.YEARContext ctx);
	/**
	 * Exit a parse tree produced by the {@code YEAR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitYEAR(TSqlParser.YEARContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterNULLIF(TSqlParser.NULLIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitNULLIF(TSqlParser.NULLIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARSE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterPARSE(TSqlParser.PARSEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARSE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitPARSE(TSqlParser.PARSEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterXML_DATA_TYPE_FUNC(TSqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitXML_DATA_TYPE_FUNC(TSqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IIF}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIIF(TSqlParser.IIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IIF}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIIF(TSqlParser.IIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ISJSON}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterISJSON(TSqlParser.ISJSONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ISJSON}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitISJSON(TSqlParser.ISJSONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSON_OBJECT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterJSON_OBJECT(TSqlParser.JSON_OBJECTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSON_OBJECT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitJSON_OBJECT(TSqlParser.JSON_OBJECTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSON_ARRAY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterJSON_ARRAY(TSqlParser.JSON_ARRAYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSON_ARRAY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitJSON_ARRAY(TSqlParser.JSON_ARRAYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSON_VALUE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterJSON_VALUE(TSqlParser.JSON_VALUEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSON_VALUE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitJSON_VALUE(TSqlParser.JSON_VALUEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSON_QUERY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterJSON_QUERY(TSqlParser.JSON_QUERYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSON_QUERY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitJSON_QUERY(TSqlParser.JSON_QUERYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSON_MODIFY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterJSON_MODIFY(TSqlParser.JSON_MODIFYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSON_MODIFY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitJSON_MODIFY(TSqlParser.JSON_MODIFYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JSON_PATH_EXISTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterJSON_PATH_EXISTS(TSqlParser.JSON_PATH_EXISTSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JSON_PATH_EXISTS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitJSON_PATH_EXISTS(TSqlParser.JSON_PATH_EXISTSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ABS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterABS(TSqlParser.ABSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ABS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitABS(TSqlParser.ABSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ACOS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterACOS(TSqlParser.ACOSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ACOS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitACOS(TSqlParser.ACOSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASIN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterASIN(TSqlParser.ASINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASIN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitASIN(TSqlParser.ASINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATAN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterATAN(TSqlParser.ATANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATAN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitATAN(TSqlParser.ATANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATN2}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterATN2(TSqlParser.ATN2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ATN2}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitATN2(TSqlParser.ATN2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code CEILING}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCEILING(TSqlParser.CEILINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CEILING}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCEILING(TSqlParser.CEILINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCOS(TSqlParser.COSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCOS(TSqlParser.COSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCOT(TSqlParser.COTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCOT(TSqlParser.COTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DEGREES}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDEGREES(TSqlParser.DEGREESContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DEGREES}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDEGREES(TSqlParser.DEGREESContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EXP}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterEXP(TSqlParser.EXPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EXP}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitEXP(TSqlParser.EXPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FLOOR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterFLOOR(TSqlParser.FLOORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FLOOR}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitFLOOR(TSqlParser.FLOORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOG}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterLOG(TSqlParser.LOGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOG}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitLOG(TSqlParser.LOGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOG10}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterLOG10(TSqlParser.LOG10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code LOG10}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitLOG10(TSqlParser.LOG10Context ctx);
	/**
	 * Enter a parse tree produced by the {@code PI}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterPI(TSqlParser.PIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PI}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitPI(TSqlParser.PIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code POWER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterPOWER(TSqlParser.POWERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code POWER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitPOWER(TSqlParser.POWERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RADIANS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterRADIANS(TSqlParser.RADIANSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RADIANS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitRADIANS(TSqlParser.RADIANSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RAND}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterRAND(TSqlParser.RANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RAND}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitRAND(TSqlParser.RANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ROUND}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterROUND(TSqlParser.ROUNDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ROUND}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitROUND(TSqlParser.ROUNDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MATH_SIGN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterMATH_SIGN(TSqlParser.MATH_SIGNContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MATH_SIGN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitMATH_SIGN(TSqlParser.MATH_SIGNContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SIN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSIN(TSqlParser.SINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SIN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSIN(TSqlParser.SINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQRT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSQRT(TSqlParser.SQRTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQRT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSQRT(TSqlParser.SQRTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SQUARE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSQUARE(TSqlParser.SQUAREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SQUARE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSQUARE(TSqlParser.SQUAREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TAN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterTAN(TSqlParser.TANContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TAN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitTAN(TSqlParser.TANContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GREATEST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterGREATEST(TSqlParser.GREATESTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GREATEST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitGREATEST(TSqlParser.GREATESTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LEAST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterLEAST(TSqlParser.LEASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LEAST}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitLEAST(TSqlParser.LEASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CERTENCODED}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCERTENCODED(TSqlParser.CERTENCODEDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CERTENCODED}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCERTENCODED(TSqlParser.CERTENCODEDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CERTPRIVATEKEY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCERTPRIVATEKEY(TSqlParser.CERTPRIVATEKEYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CERTPRIVATEKEY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCERTPRIVATEKEY(TSqlParser.CERTPRIVATEKEYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_USER(TSqlParser.CURRENT_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_USER(TSqlParser.CURRENT_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATABASE_PRINCIPAL_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterDATABASE_PRINCIPAL_ID(TSqlParser.DATABASE_PRINCIPAL_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATABASE_PRINCIPAL_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitDATABASE_PRINCIPAL_ID(TSqlParser.DATABASE_PRINCIPAL_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HAS_DBACCESS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterHAS_DBACCESS(TSqlParser.HAS_DBACCESSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HAS_DBACCESS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitHAS_DBACCESS(TSqlParser.HAS_DBACCESSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HAS_PERMS_BY_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterHAS_PERMS_BY_NAME(TSqlParser.HAS_PERMS_BY_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HAS_PERMS_BY_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitHAS_PERMS_BY_NAME(TSqlParser.HAS_PERMS_BY_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IS_MEMBER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIS_MEMBER(TSqlParser.IS_MEMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IS_MEMBER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIS_MEMBER(TSqlParser.IS_MEMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IS_ROLEMEMBER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIS_ROLEMEMBER(TSqlParser.IS_ROLEMEMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IS_ROLEMEMBER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIS_ROLEMEMBER(TSqlParser.IS_ROLEMEMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IS_SRVROLEMEMBER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterIS_SRVROLEMEMBER(TSqlParser.IS_SRVROLEMEMBERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IS_SRVROLEMEMBER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitIS_SRVROLEMEMBER(TSqlParser.IS_SRVROLEMEMBERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOGINPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterLOGINPROPERTY(TSqlParser.LOGINPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOGINPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitLOGINPROPERTY(TSqlParser.LOGINPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ORIGINAL_LOGIN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterORIGINAL_LOGIN(TSqlParser.ORIGINAL_LOGINContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ORIGINAL_LOGIN}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitORIGINAL_LOGIN(TSqlParser.ORIGINAL_LOGINContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PERMISSIONS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterPERMISSIONS(TSqlParser.PERMISSIONSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PERMISSIONS}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitPERMISSIONS(TSqlParser.PERMISSIONSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PWDENCRYPT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterPWDENCRYPT(TSqlParser.PWDENCRYPTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PWDENCRYPT}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitPWDENCRYPT(TSqlParser.PWDENCRYPTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PWDCOMPARE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterPWDCOMPARE(TSqlParser.PWDCOMPAREContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PWDCOMPARE}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitPWDCOMPARE(TSqlParser.PWDCOMPAREContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSESSION_USER(TSqlParser.SESSION_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSESSION_USER(TSqlParser.SESSION_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SESSIONPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSESSIONPROPERTY(TSqlParser.SESSIONPROPERTYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SESSIONPROPERTY}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSESSIONPROPERTY(TSqlParser.SESSIONPROPERTYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUSER_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSUSER_ID(TSqlParser.SUSER_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUSER_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSUSER_ID(TSqlParser.SUSER_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUSER_SNAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSUSER_SNAME(TSqlParser.SUSER_SNAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUSER_SNAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSUSER_SNAME(TSqlParser.SUSER_SNAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SUSER_SID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSUSER_SID(TSqlParser.SUSER_SIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SUSER_SID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSUSER_SID(TSqlParser.SUSER_SIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterSYSTEM_USER(TSqlParser.SYSTEM_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitSYSTEM_USER(TSqlParser.SYSTEM_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code USER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterUSER(TSqlParser.USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code USER}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitUSER(TSqlParser.USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code USER_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterUSER_ID(TSqlParser.USER_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code USER_ID}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitUSER_ID(TSqlParser.USER_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code USER_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void enterUSER_NAME(TSqlParser.USER_NAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code USER_NAME}
	 * labeled alternative in {@link TSqlParser#built_in_functions}.
	 * @param ctx the parse tree
	 */
	void exitUSER_NAME(TSqlParser.USER_NAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 */
	void enterXml_data_type_methods(TSqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 */
	void exitXml_data_type_methods(TSqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dateparts_9}.
	 * @param ctx the parse tree
	 */
	void enterDateparts_9(TSqlParser.Dateparts_9Context ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dateparts_9}.
	 * @param ctx the parse tree
	 */
	void exitDateparts_9(TSqlParser.Dateparts_9Context ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dateparts_12}.
	 * @param ctx the parse tree
	 */
	void enterDateparts_12(TSqlParser.Dateparts_12Context ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dateparts_12}.
	 * @param ctx the parse tree
	 */
	void exitDateparts_12(TSqlParser.Dateparts_12Context ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dateparts_15}.
	 * @param ctx the parse tree
	 */
	void enterDateparts_15(TSqlParser.Dateparts_15Context ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dateparts_15}.
	 * @param ctx the parse tree
	 */
	void exitDateparts_15(TSqlParser.Dateparts_15Context ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dateparts_datetrunc}.
	 * @param ctx the parse tree
	 */
	void enterDateparts_datetrunc(TSqlParser.Dateparts_datetruncContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dateparts_datetrunc}.
	 * @param ctx the parse tree
	 */
	void exitDateparts_datetrunc(TSqlParser.Dateparts_datetruncContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#value_method}.
	 * @param ctx the parse tree
	 */
	void enterValue_method(TSqlParser.Value_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#value_method}.
	 * @param ctx the parse tree
	 */
	void exitValue_method(TSqlParser.Value_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#value_call}.
	 * @param ctx the parse tree
	 */
	void enterValue_call(TSqlParser.Value_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#value_call}.
	 * @param ctx the parse tree
	 */
	void exitValue_call(TSqlParser.Value_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#query_method}.
	 * @param ctx the parse tree
	 */
	void enterQuery_method(TSqlParser.Query_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#query_method}.
	 * @param ctx the parse tree
	 */
	void exitQuery_method(TSqlParser.Query_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#query_call}.
	 * @param ctx the parse tree
	 */
	void enterQuery_call(TSqlParser.Query_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#query_call}.
	 * @param ctx the parse tree
	 */
	void exitQuery_call(TSqlParser.Query_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#exist_method}.
	 * @param ctx the parse tree
	 */
	void enterExist_method(TSqlParser.Exist_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#exist_method}.
	 * @param ctx the parse tree
	 */
	void exitExist_method(TSqlParser.Exist_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#exist_call}.
	 * @param ctx the parse tree
	 */
	void enterExist_call(TSqlParser.Exist_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#exist_call}.
	 * @param ctx the parse tree
	 */
	void exitExist_call(TSqlParser.Exist_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#modify_method}.
	 * @param ctx the parse tree
	 */
	void enterModify_method(TSqlParser.Modify_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#modify_method}.
	 * @param ctx the parse tree
	 */
	void exitModify_method(TSqlParser.Modify_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#modify_call}.
	 * @param ctx the parse tree
	 */
	void enterModify_call(TSqlParser.Modify_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#modify_call}.
	 * @param ctx the parse tree
	 */
	void exitModify_call(TSqlParser.Modify_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#hierarchyid_call}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyid_call(TSqlParser.Hierarchyid_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#hierarchyid_call}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyid_call(TSqlParser.Hierarchyid_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#hierarchyid_static_method}.
	 * @param ctx the parse tree
	 */
	void enterHierarchyid_static_method(TSqlParser.Hierarchyid_static_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#hierarchyid_static_method}.
	 * @param ctx the parse tree
	 */
	void exitHierarchyid_static_method(TSqlParser.Hierarchyid_static_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#nodes_method}.
	 * @param ctx the parse tree
	 */
	void enterNodes_method(TSqlParser.Nodes_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#nodes_method}.
	 * @param ctx the parse tree
	 */
	void exitNodes_method(TSqlParser.Nodes_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(TSqlParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(TSqlParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_search_condition_section(TSqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_search_condition_section(TSqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_column_alias(TSqlParser.As_column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_column_alias(TSqlParser.As_column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_table_alias(TSqlParser.As_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_table_alias(TSqlParser.As_table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(TSqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(TSqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterWith_table_hints(TSqlParser.With_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitWith_table_hints(TSqlParser.With_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#deprecated_table_hint}.
	 * @param ctx the parse tree
	 */
	void enterDeprecated_table_hint(TSqlParser.Deprecated_table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#deprecated_table_hint}.
	 * @param ctx the parse tree
	 */
	void exitDeprecated_table_hint(TSqlParser.Deprecated_table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sybase_legacy_hints}.
	 * @param ctx the parse tree
	 */
	void enterSybase_legacy_hints(TSqlParser.Sybase_legacy_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sybase_legacy_hints}.
	 * @param ctx the parse tree
	 */
	void exitSybase_legacy_hints(TSqlParser.Sybase_legacy_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sybase_legacy_hint}.
	 * @param ctx the parse tree
	 */
	void enterSybase_legacy_hint(TSqlParser.Sybase_legacy_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sybase_legacy_hint}.
	 * @param ctx the parse tree
	 */
	void exitSybase_legacy_hint(TSqlParser.Sybase_legacy_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint(TSqlParser.Table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint(TSqlParser.Table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(TSqlParser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(TSqlParser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_list(TSqlParser.Column_alias_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_list(TSqlParser.Column_alias_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(TSqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(TSqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor(TSqlParser.Table_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor(TSqlParser.Table_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#expression_list_}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list_(TSqlParser.Expression_list_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#expression_list_}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list_(TSqlParser.Expression_list_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterRanking_windowed_function(TSqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitRanking_windowed_function(TSqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_windowed_function(TSqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_windowed_function(TSqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_windowed_function(TSqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_windowed_function(TSqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct_expression(TSqlParser.All_distinct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct_expression(TSqlParser.All_distinct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(TSqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(TSqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_range_clause(TSqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_range_clause(TSqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_extent(TSqlParser.Window_frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_extent(TSqlParser.Window_frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_bound(TSqlParser.Window_frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_bound(TSqlParser.Window_frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_preceding(TSqlParser.Window_frame_precedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_preceding(TSqlParser.Window_frame_precedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_following(TSqlParser.Window_frame_followingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_following(TSqlParser.Window_frame_followingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(TSqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(TSqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_filestream_option(TSqlParser.Database_filestream_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_filestream_option(TSqlParser.Database_filestream_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_spec(TSqlParser.Database_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_spec(TSqlParser.Database_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void enterFile_group(TSqlParser.File_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void exitFile_group(TSqlParser.File_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(TSqlParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(TSqlParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#entity_name}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name(TSqlParser.Entity_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#entity_name}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name(TSqlParser.Entity_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_for_azure_dw(TSqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_for_azure_dw(TSqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_for_parallel_dw(TSqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_for_parallel_dw(TSqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(TSqlParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(TSqlParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(TSqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(TSqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(TSqlParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(TSqlParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_proc_name_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_schema(TSqlParser.Func_proc_name_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_proc_name_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_schema(TSqlParser.Func_proc_name_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_proc_name_database_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_database_schema(TSqlParser.Func_proc_name_database_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_proc_name_database_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_database_schema(TSqlParser.Func_proc_name_database_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_proc_name_server_database_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_server_database_schema(TSqlParser.Func_proc_name_server_database_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_proc_name_server_database_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_server_database_schema(TSqlParser.Func_proc_name_server_database_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void enterDdl_object(TSqlParser.Ddl_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void exitDdl_object(TSqlParser.Ddl_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(TSqlParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(TSqlParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list_with_order(TSqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list_with_order(TSqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#insert_column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_name_list(TSqlParser.Insert_column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#insert_column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_name_list(TSqlParser.Insert_column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#insert_column_id}.
	 * @param ctx the parse tree
	 */
	void enterInsert_column_id(TSqlParser.Insert_column_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#insert_column_id}.
	 * @param ctx the parse tree
	 */
	void exitInsert_column_id(TSqlParser.Insert_column_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(TSqlParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(TSqlParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(TSqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(TSqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void enterOn_off(TSqlParser.On_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void exitOn_off(TSqlParser.On_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void enterClustered(TSqlParser.ClusteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void exitClustered(TSqlParser.ClusteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(TSqlParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(TSqlParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function_name(TSqlParser.Scalar_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function_name(TSqlParser.Scalar_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_timer(TSqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_timer(TSqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_dialog(TSqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_dialog(TSqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#contract_name}.
	 * @param ctx the parse tree
	 */
	void enterContract_name(TSqlParser.Contract_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#contract_name}.
	 * @param ctx the parse tree
	 */
	void exitContract_name(TSqlParser.Contract_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#service_name}.
	 * @param ctx the parse tree
	 */
	void enterService_name(TSqlParser.Service_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#service_name}.
	 * @param ctx the parse tree
	 */
	void exitService_name(TSqlParser.Service_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void enterEnd_conversation(TSqlParser.End_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void exitEnd_conversation(TSqlParser.End_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_conversation(TSqlParser.Waitfor_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_conversation(TSqlParser.Waitfor_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void enterGet_conversation(TSqlParser.Get_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void exitGet_conversation(TSqlParser.Get_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#queue_id}.
	 * @param ctx the parse tree
	 */
	void enterQueue_id(TSqlParser.Queue_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#queue_id}.
	 * @param ctx the parse tree
	 */
	void exitQueue_id(TSqlParser.Queue_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void enterSend_conversation(TSqlParser.Send_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void exitSend_conversation(TSqlParser.Send_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(TSqlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(TSqlParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TSqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TSqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#primitive_constant}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_constant(TSqlParser.Primitive_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#primitive_constant}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_constant(TSqlParser.Primitive_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(TSqlParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(TSqlParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#id_}.
	 * @param ctx the parse tree
	 */
	void enterId_(TSqlParser.Id_Context ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#id_}.
	 * @param ctx the parse tree
	 */
	void exitId_(TSqlParser.Id_Context ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_id(TSqlParser.Simple_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_id(TSqlParser.Simple_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#id_or_string}.
	 * @param ctx the parse tree
	 */
	void enterId_or_string(TSqlParser.Id_or_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#id_or_string}.
	 * @param ctx the parse tree
	 */
	void exitId_or_string(TSqlParser.Id_or_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(TSqlParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(TSqlParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(TSqlParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(TSqlParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(TSqlParser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(TSqlParser.File_sizeContext ctx);
}