package com.bendcap.enkel.compiler.parsing;

import com.bendcap.enkel.antlr.EnkelLexer;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.bytecodegeneration.instructions.Instruction;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.Queue;

/**
 * Created by KevinOfNeu on 2018/7/18  21:14.
 */
public class SyntaxTreeTraverser {
    public Queue<Instruction> getInstructions(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath); //fileAbsolutePath - file containing first enk code file

        EnkelLexer lexer = new EnkelLexer(charStream);  //create lexer (pass enk file to it)

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        EnkelParser parser = new EnkelParser(tokenStream);

        EnkelTreeWalkListener listener = new EnkelTreeWalkListener(); //EnkelTreeWalkListener extends EnkelBaseLitener - handles parse tree visiting events
        BaseErrorListener errorListener = new EnkelTreeWalkErrorListener(); //EnkelTreeWalkErrorListener - handles parse tree visiting error events

        parser.addErrorListener(errorListener);
        parser.addParseListener(listener);
        parser.compilationUnit(); //compilation unit is root parser rule - start from it!
        return listener.getInstructionsQueue();
    }
}
