package com.bendcap.enkel.compiler.parsing;

import com.bendcap.enkel.antlr.EnkelLexer;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.CompilationUnit;
import com.bendcap.enkel.compiler.parsing.EnkelTreeWalkErrorListener;
import com.bendcap.enkel.compiler.parsing.visitor.CompilationUnitVisitor;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

/**
 * Created by KevinOfNeu on 2018/8/21  09:15.
 */
public class Parser {
    public CompilationUnit getCompilationUnit(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath);
        EnkelLexer lexer = new EnkelLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        EnkelParser parser = new EnkelParser(tokenStream);

        ANTLRErrorListener errorListener = new EnkelTreeWalkErrorListener();
        parser.addErrorListener(errorListener);

        CompilationUnitVisitor compilationUnitVisitor = new CompilationUnitVisitor();
        return parser.compilationUnit().accept(compilationUnitVisitor);
    }
}