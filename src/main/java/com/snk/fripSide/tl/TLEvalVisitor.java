package com.snk.fripSide.tl;

import com.snk.tl.TLBaseVisitor;
import com.snk.tl.TLParser;

public class TLEvalVisitor extends TLBaseVisitor<String> {

    @Override
    public String visitAddExpression(TLParser.AddExpressionContext ctx) {
        System.out.println("visitAddExpression in:" + ctx.start.getLine());
        return super.visitAddExpression(ctx);
    }
}
