package com.snk.fripSide;

import com.snk.lua.Lua4BaseVisitor;
import com.snk.lua.Lua4Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
从头实现一个lua解析器
 */

class LuaNode {
    public static LuaNode VOID = new LuaNode();
    public static LuaNode NIL = new LuaNode();

    public Object value;

    public void SetValue(LuaNode val) {

    }


    @Override
    public String toString() {
        return value.toString();
    }
}

abstract class LuaFunction {

    public String funcName;

    public abstract LuaNode invoke(List<Lua4Parser.ExpressionContext> params, Map<String, LuaFunction> functions, LuaScope scope);

}

class GlobalFunc extends LuaFunction {

    private List<TerminalNode> params;
    private ParseTree block;

    public GlobalFunc(String id, List<TerminalNode> params, ParseTree block) {
        this.funcName = id;
        this.params = params;
        this.block = block;
    }

    @Override
    public LuaNode invoke(List<Lua4Parser.ExpressionContext> params, Map<String, LuaFunction> functions, LuaScope scope) {

        return null;
    }
}


class LuaScope {

    public Map<String, LuaNode> variables = new HashMap<>();

    public LuaNode getValue() {
        LuaNode ret = new LuaNode();

        return ret;
    }

}

// 收集全局变量
class GlobalSymbolVisitor extends Lua4BaseVisitor<LuaNode> {
    Map<String, LuaFunction> functionMap;

    public GlobalSymbolVisitor(Map<String, LuaFunction> functions) {
        functionMap = functions;
        RegisterSystemFunction();
    }


    @Override
    public LuaNode visitNamedFuncDeclare(Lua4Parser.NamedFuncDeclareContext ctx) {
        System.out.println("visitNamedFuncDeclare");
        List<TerminalNode> params = parseParams(ctx.funcBody().paramList());
        ParseTree block = ctx.funcBody().block();
        String name = ctx.Name().getText();
        functionMap.put(name, new GlobalFunc(name, params, block));
        return LuaNode.VOID;
    }

    private List<TerminalNode> parseParams(Lua4Parser.ParamListContext params) {
        List<TerminalNode> ret = new ArrayList<>();

        return ret;
    }

    // 注册系统库函数
    private void RegisterSystemFunction() {
        functionMap.put("print", new SystemFuncPrint());
    }

    private class SystemFuncPrint extends LuaFunction {

        @Override
        public LuaNode invoke(List<Lua4Parser.ExpressionContext> params, Map<String, LuaFunction> functions, LuaScope scope) {
//            System.out.print("Call func print");
            EvalVisitor ev = new EvalVisitor(scope, functionMap);
//            System.out.println(params.size());
            for (int i = 0; i < params.size(); i++) {
                LuaNode node = ev.visit(params.get(i));
                System.out.print(node.toString() + ((i < params.size() - 1) ? ", " : ""));
            }
            System.out.println();
            return null;
        }
    }
}

public class EvalVisitor extends Lua4BaseVisitor<LuaNode> {

    private LuaScope scope;
    private Map<String, LuaFunction> functions;

    public EvalVisitor(LuaScope scope, Map<String, LuaFunction> functionMap) {
        this.scope = scope;
        this.functions = functionMap;
    }


    @Override
    public LuaNode visitSetValStat(Lua4Parser.SetValStatContext ctx) {
        System.out.println("visitSetValStat");
//        ctx.exprList()
        for (int i = 0; i < ctx.varList().var().size(); i++) {
            Lua4Parser.VarContext val = ctx.varList().var(i);
            // 查找scope得到var对应的node
            LuaNode value = this.visit(val);
            if (i < ctx.exprList().expression().size()) {
                Lua4Parser.ExpressionContext expr = ctx.exprList().expression(i);
                value.SetValue(this.visit(expr));
            }
        }
        return LuaNode.VOID;
    }

    @Override
    public LuaNode visitFuncCall(Lua4Parser.FuncCallContext ctx) {
        System.out.println("visitFuncCall");
        LuaNode node = this.visit(ctx.varOrExp());

        LuaFunction func = functions.get(node.value.toString());
        LuaNode result;

        for (int i = 0; i < ctx.funcCallArg().size(); i++) {
            Lua4Parser.FuncCallArgContext args = ctx.funcCallArg(i);
//            LuaNode funcArgs = this.visit();

            func.invoke(args.funcArgs().exprList().expression(), functions, scope);

        }
        return node;
    }

    @Override
    public LuaNode visitVar(Lua4Parser.VarContext ctx) {
        System.out.println("Visit Var:" + ctx.Name());
        if (ctx.Modulus() != null) {
            // upvalue
        } else {
//            this.scope.
        }
        return LuaNode.VOID;
    }

    @Override
    public LuaNode visitVarOrExp(Lua4Parser.VarOrExpContext ctx) {
        if (ctx.var() != null) {
            LuaNode node = new LuaNode();
            node.value = ctx.var().Name().getText();
            return node;
        }
        return LuaNode.VOID;
    }

    private List<Lua4Parser.ExpressionContext> resolveFuncArgs() {
        return null;
    }


}
