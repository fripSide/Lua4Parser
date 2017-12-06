package com.snk.fripSide;

import com.snk.fripSide.tl.TLEvalVisitor;
import com.snk.lua.Lua4Lexer;
import com.snk.lua.Lua4Parser;
import com.snk.tl.TLLexer;
import com.snk.tl.TLParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static sun.tools.java.Scanner.EOF;


/**
 * Created by fripside on 23/09/17.
 */
public class Main {

    public static  void main(String[] args) throws IOException {
//
        LuaExec();
//        TestTL();
    }


    public static void LuaExec() {
        String file = "test/t1.lua";
        Map<String, LuaFunction> functions = new HashMap<>();
        try {
            Lexer lexer = new Lua4Lexer(CharStreams.fromFileName(file));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            Lua4Parser parser = new Lua4Parser(tokens);
//            parser.setBuildParseTree(true);
            ParseTree tree = parser.chunk();
            GlobalSymbolVisitor visitor = new GlobalSymbolVisitor(functions);
            visitor.visit(tree);
            LuaScope globalScope = new LuaScope();
            EvalVisitor ev = new EvalVisitor(globalScope, functions);
            ev.visit(tree);

//            new TestVisitor().visit(tree);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void TestTL() {
        TLLexer lexer = null;
        try {
            lexer = new TLLexer(CharStreams.fromFileName("test/test.tl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        TLParser parser = new TLParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();
        System.out.println(tree);
        TLEvalVisitor ev = new TLEvalVisitor();
        ev.visit(tree);
    }


    // 词法分析结果
    private static void PrintTokens(TokenSource tokens) {

        while (true) {
            Token token = tokens.nextToken();
            if (token.getType() == EOF) {
                break;
            }

            System.out.print("CHARLITERAL: ");
            System.out.println(token.getText());
        }
    }
}
