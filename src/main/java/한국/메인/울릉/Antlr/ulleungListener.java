package 한국.메인.울릉.Antlr;// Generated from ulleung.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ulleungParser}.
 */
public interface ulleungListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ulleungParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ulleungParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ulleungParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_package}.
	 * @param ctx the parse tree
	 */
	void enterDefine_package(ulleungParser.Define_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_package}.
	 * @param ctx the parse tree
	 */
	void exitDefine_package(ulleungParser.Define_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_import}.
	 * @param ctx the parse tree
	 */
	void enterDefine_import(ulleungParser.Define_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_import}.
	 * @param ctx the parse tree
	 */
	void exitDefine_import(ulleungParser.Define_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_class}.
	 * @param ctx the parse tree
	 */
	void enterDefine_class(ulleungParser.Define_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_class}.
	 * @param ctx the parse tree
	 */
	void exitDefine_class(ulleungParser.Define_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_interface}.
	 * @param ctx the parse tree
	 */
	void enterDefine_interface(ulleungParser.Define_interfaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_interface}.
	 * @param ctx the parse tree
	 */
	void exitDefine_interface(ulleungParser.Define_interfaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_global_var}.
	 * @param ctx the parse tree
	 */
	void enterDefine_global_var(ulleungParser.Define_global_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_global_var}.
	 * @param ctx the parse tree
	 */
	void exitDefine_global_var(ulleungParser.Define_global_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_function}.
	 * @param ctx the parse tree
	 */
	void enterDefine_function(ulleungParser.Define_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_function}.
	 * @param ctx the parse tree
	 */
	void exitDefine_function(ulleungParser.Define_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#public_type}.
	 * @param ctx the parse tree
	 */
	void enterPublic_type(ulleungParser.Public_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#public_type}.
	 * @param ctx the parse tree
	 */
	void exitPublic_type(ulleungParser.Public_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(ulleungParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(ulleungParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#type_name_array}.
	 * @param ctx the parse tree
	 */
	void enterType_name_array(ulleungParser.Type_name_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#type_name_array}.
	 * @param ctx the parse tree
	 */
	void exitType_name_array(ulleungParser.Type_name_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(ulleungParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(ulleungParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#passed_arg}.
	 * @param ctx the parse tree
	 */
	void enterPassed_arg(ulleungParser.Passed_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#passed_arg}.
	 * @param ctx the parse tree
	 */
	void exitPassed_arg(ulleungParser.Passed_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#passed_args}.
	 * @param ctx the parse tree
	 */
	void enterPassed_args(ulleungParser.Passed_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#passed_args}.
	 * @param ctx the parse tree
	 */
	void exitPassed_args(ulleungParser.Passed_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#new_object}.
	 * @param ctx the parse tree
	 */
	void enterNew_object(ulleungParser.New_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#new_object}.
	 * @param ctx the parse tree
	 */
	void exitNew_object(ulleungParser.New_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#calculation}.
	 * @param ctx the parse tree
	 */
	void enterCalculation(ulleungParser.CalculationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#calculation}.
	 * @param ctx the parse tree
	 */
	void exitCalculation(ulleungParser.CalculationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#change_type}.
	 * @param ctx the parse tree
	 */
	void enterChange_type(ulleungParser.Change_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#change_type}.
	 * @param ctx the parse tree
	 */
	void exitChange_type(ulleungParser.Change_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(ulleungParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(ulleungParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_var}.
	 * @param ctx the parse tree
	 */
	void enterDefine_var(ulleungParser.Define_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_var}.
	 * @param ctx the parse tree
	 */
	void exitDefine_var(ulleungParser.Define_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(ulleungParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(ulleungParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#first_passed_args}.
	 * @param ctx the parse tree
	 */
	void enterFirst_passed_args(ulleungParser.First_passed_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#first_passed_args}.
	 * @param ctx the parse tree
	 */
	void exitFirst_passed_args(ulleungParser.First_passed_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ulleungParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ulleungParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(ulleungParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(ulleungParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#single_boolean}.
	 * @param ctx the parse tree
	 */
	void enterSingle_boolean(ulleungParser.Single_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#single_boolean}.
	 * @param ctx the parse tree
	 */
	void exitSingle_boolean(ulleungParser.Single_booleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#booleans}.
	 * @param ctx the parse tree
	 */
	void enterBooleans(ulleungParser.BooleansContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#booleans}.
	 * @param ctx the parse tree
	 */
	void exitBooleans(ulleungParser.BooleansContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_if}.
	 * @param ctx the parse tree
	 */
	void enterDefine_if(ulleungParser.Define_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_if}.
	 * @param ctx the parse tree
	 */
	void exitDefine_if(ulleungParser.Define_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#for_start}.
	 * @param ctx the parse tree
	 */
	void enterFor_start(ulleungParser.For_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#for_start}.
	 * @param ctx the parse tree
	 */
	void exitFor_start(ulleungParser.For_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(ulleungParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(ulleungParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#define_for}.
	 * @param ctx the parse tree
	 */
	void enterDefine_for(ulleungParser.Define_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#define_for}.
	 * @param ctx the parse tree
	 */
	void exitDefine_for(ulleungParser.Define_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link ulleungParser#package_name}.
	 * @param ctx the parse tree
	 */
	void enterPackage_name(ulleungParser.Package_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ulleungParser#package_name}.
	 * @param ctx the parse tree
	 */
	void exitPackage_name(ulleungParser.Package_nameContext ctx);
}