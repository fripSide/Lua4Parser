// Generated from /Users/fripside/IdeaProjects/LuaParser/src/main/resources/Lua4.g4 by ANTLR 4.7
package com.snk.lua;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Lua4Parser}.
 */
public interface Lua4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(Lua4Parser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(Lua4Parser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Lua4Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Lua4Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Lua4Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Lua4Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(Lua4Parser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(Lua4Parser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setValStat}
	 * labeled alternative in {@link Lua4Parser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterSetValStat(Lua4Parser.SetValStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setValStat}
	 * labeled alternative in {@link Lua4Parser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitSetValStat(Lua4Parser.SetValStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initLocalValStat}
	 * labeled alternative in {@link Lua4Parser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterInitLocalValStat(Lua4Parser.InitLocalValStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initLocalValStat}
	 * labeled alternative in {@link Lua4Parser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitInitLocalValStat(Lua4Parser.InitLocalValStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(Lua4Parser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(Lua4Parser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#whileStat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(Lua4Parser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#whileStat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(Lua4Parser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#repeatStat}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStat(Lua4Parser.RepeatStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#repeatStat}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStat(Lua4Parser.RepeatStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(Lua4Parser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(Lua4Parser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableCreateExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTableCreateExp(Lua4Parser.TableCreateExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableCreateExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTableCreateExp(Lua4Parser.TableCreateExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argsExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArgsExp(Lua4Parser.ArgsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argsExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArgsExp(Lua4Parser.ArgsExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOpExp(Lua4Parser.UnaryOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOpExp(Lua4Parser.UnaryOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinOpExp(Lua4Parser.BinOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinOpExp(Lua4Parser.BinOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRightOpExp(Lua4Parser.RightOpExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRightOpExp(Lua4Parser.RightOpExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExp(Lua4Parser.StringExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExp(Lua4Parser.StringExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valOrFuncCallExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValOrFuncCallExp(Lua4Parser.ValOrFuncCallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valOrFuncCallExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValOrFuncCallExp(Lua4Parser.ValOrFuncCallExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreExp(Lua4Parser.IgnoreExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreExp(Lua4Parser.IgnoreExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unnamedFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedFuncDeclare(Lua4Parser.UnnamedFuncDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unnamedFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedFuncDeclare(Lua4Parser.UnnamedFuncDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(Lua4Parser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(Lua4Parser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#binOp}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(Lua4Parser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#binOp}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(Lua4Parser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#rightOp}.
	 * @param ctx the parse tree
	 */
	void enterRightOp(Lua4Parser.RightOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#rightOp}.
	 * @param ctx the parse tree
	 */
	void exitRightOp(Lua4Parser.RightOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(Lua4Parser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(Lua4Parser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#prefixExp}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExp(Lua4Parser.PrefixExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#prefixExp}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExp(Lua4Parser.PrefixExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code namedFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#funcStat}.
	 * @param ctx the parse tree
	 */
	void enterNamedFuncDeclare(Lua4Parser.NamedFuncDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code namedFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#funcStat}.
	 * @param ctx the parse tree
	 */
	void exitNamedFuncDeclare(Lua4Parser.NamedFuncDeclareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#funcStat}.
	 * @param ctx the parse tree
	 */
	void enterClassFuncDeclare(Lua4Parser.ClassFuncDeclareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#funcStat}.
	 * @param ctx the parse tree
	 */
	void exitClassFuncDeclare(Lua4Parser.ClassFuncDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(Lua4Parser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(Lua4Parser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void enterFuncArgs(Lua4Parser.FuncArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#funcArgs}.
	 * @param ctx the parse tree
	 */
	void exitFuncArgs(Lua4Parser.FuncArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(Lua4Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(Lua4Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(Lua4Parser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(Lua4Parser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void enterVarOrExp(Lua4Parser.VarOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#varOrExp}.
	 * @param ctx the parse tree
	 */
	void exitVarOrExp(Lua4Parser.VarOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#funcCallArg}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallArg(Lua4Parser.FuncCallArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#funcCallArg}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallArg(Lua4Parser.FuncCallArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void enterVarSuffix(Lua4Parser.VarSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#varSuffix}.
	 * @param ctx the parse tree
	 */
	void exitVarSuffix(Lua4Parser.VarSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(Lua4Parser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(Lua4Parser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#upvalue}.
	 * @param ctx the parse tree
	 */
	void enterUpvalue(Lua4Parser.UpvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#upvalue}.
	 * @param ctx the parse tree
	 */
	void exitUpvalue(Lua4Parser.UpvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(Lua4Parser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(Lua4Parser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(Lua4Parser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(Lua4Parser.NameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#tableConstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableConstructor(Lua4Parser.TableConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#tableConstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableConstructor(Lua4Parser.TableConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(Lua4Parser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(Lua4Parser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(Lua4Parser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(Lua4Parser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lua4Parser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void enterFieldsep(Lua4Parser.FieldsepContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lua4Parser#fieldsep}.
	 * @param ctx the parse tree
	 */
	void exitFieldsep(Lua4Parser.FieldsepContext ctx);
}