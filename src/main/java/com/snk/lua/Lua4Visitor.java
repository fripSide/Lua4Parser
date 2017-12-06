// Generated from /Users/fripside/IdeaProjects/LuaParser/src/main/resources/Lua4.g4 by ANTLR 4.7
package com.snk.lua;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Lua4Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Lua4Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#chunk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChunk(Lua4Parser.ChunkContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(Lua4Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(Lua4Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(Lua4Parser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setValStat}
	 * labeled alternative in {@link Lua4Parser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetValStat(Lua4Parser.SetValStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initLocalValStat}
	 * labeled alternative in {@link Lua4Parser#assignStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitLocalValStat(Lua4Parser.InitLocalValStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#forStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStat(Lua4Parser.ForStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#whileStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(Lua4Parser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#repeatStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStat(Lua4Parser.RepeatStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#ifStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(Lua4Parser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableCreateExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableCreateExp(Lua4Parser.TableCreateExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code argsExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgsExp(Lua4Parser.ArgsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOpExp(Lua4Parser.UnaryOpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExp(Lua4Parser.BinOpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightOpExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightOpExp(Lua4Parser.RightOpExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExp(Lua4Parser.StringExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valOrFuncCallExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValOrFuncCallExp(Lua4Parser.ValOrFuncCallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreExp}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreExp(Lua4Parser.IgnoreExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unnamedFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamedFuncDeclare(Lua4Parser.UnnamedFuncDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(Lua4Parser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#binOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp(Lua4Parser.BinOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#rightOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightOp(Lua4Parser.RightOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(Lua4Parser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#prefixExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExp(Lua4Parser.PrefixExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code namedFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#funcStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedFuncDeclare(Lua4Parser.NamedFuncDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classFuncDeclare}
	 * labeled alternative in {@link Lua4Parser#funcStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFuncDeclare(Lua4Parser.ClassFuncDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(Lua4Parser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(Lua4Parser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(Lua4Parser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(Lua4Parser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#varOrExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarOrExp(Lua4Parser.VarOrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#funcCallArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallArg(Lua4Parser.FuncCallArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#varSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSuffix(Lua4Parser.VarSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(Lua4Parser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#upvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpvalue(Lua4Parser.UpvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(Lua4Parser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(Lua4Parser.NameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#tableConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableConstructor(Lua4Parser.TableConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(Lua4Parser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(Lua4Parser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Lua4Parser#fieldsep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldsep(Lua4Parser.FieldsepContext ctx);
}