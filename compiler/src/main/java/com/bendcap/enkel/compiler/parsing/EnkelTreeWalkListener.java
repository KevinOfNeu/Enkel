package com.bendcap.enkel.compiler.parsing;

import com.bendcap.enkel.antlr.EnkelBaseListener;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.bytecodegeneration.ClassDeclaration;
import com.bendcap.enkel.compiler.bytecodegeneration.CompilationUnit;
import com.bendcap.enkel.compiler.bytecodegeneration.classscopeinstructions.ClassScopeInstruction;
import com.bendcap.enkel.compiler.bytecodegeneration.classscopeinstructions.PrintVariable;
import com.bendcap.enkel.compiler.bytecodegeneration.classscopeinstructions.VariableDeclaration;
import com.bendcap.enkel.compiler.parsing.domain.Variable;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * Created by KevinOfNeu on 2018/7/18  21:14.
 */
public class EnkelTreeWalkListener extends EnkelBaseListener {

    Queue<ClassScopeInstruction> classScopeInstructions = new ArrayDeque<>();
    Map<String, Variable> variables = new HashMap<>();
    private CompilationUnit compilationUnit;
    private ClassDeclaration classDeclaration;

    public Queue<ClassScopeInstruction> getClassScopeInstructions() {
        return classScopeInstructions;
    }

    @Override
    public void exitVariable(@NotNull EnkelParser.VariableContext ctx) {
        final TerminalNode varName = ctx.ID();
        final EnkelParser.ValueContext varValue = ctx.value();
        final int varType = varValue.getStart().getType();
        final int varIndex = variables.size();
        final String varTextValue = varValue.getText();
        Variable var = new Variable(varIndex, varType, varTextValue);
        variables.put(varName.getText(), var);
        classScopeInstructions.add(new VariableDeclaration(var));
        logVariableDeclarationStatementFound(varName, varValue);
    }

    @Override
    public void exitPrint(@NotNull EnkelParser.PrintContext ctx) {
        final TerminalNode varName = ctx.ID();
        final boolean printedVarNotDeclared = !variables.containsKey(varName.getText());
        if (printedVarNotDeclared) {
            final String erroFormat = "ERROR: WTF? You are trying to print var '%s' which has not been declared!!!.";
            System.err.printf(erroFormat, varName.getText());
            return;
        }
        final Variable variable = variables.get(varName.getText());
        classScopeInstructions.add(new PrintVariable(variable));
        logPrintStatementFound(varName, variable);
    }


    @Override
    public void exitCompilationUnit(EnkelParser.CompilationUnitContext ctx) {
        super.exitCompilationUnit(ctx);
        compilationUnit = new CompilationUnit(classDeclaration);
    }

    @Override
    public void exitClassDeclaration(EnkelParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);
        final String className = ctx.className().getText();
        classDeclaration = new ClassDeclaration(classScopeInstructions, className);
    }

    private void logVariableDeclarationStatementFound(TerminalNode varName, EnkelParser.ValueContext varValue) {
        final int line = varName.getSymbol().getLine();
        final String format = "OK: You declared variable named '%s' with value of '%s' at line '%s'.\n";
        System.out.printf(format, varName, varValue.getText(), line);
    }

    private void logPrintStatementFound(TerminalNode varName, Variable variable) {
        final int line = varName.getSymbol().getLine();
        final String format = "OK: You instructed to print variable '%s' which has value of '%s' at line '%s'.'\n";
        System.out.printf(format, variable.getId(), variable.getValue(), line);
    }


    public CompilationUnit getCompilationUnit() {
        return compilationUnit;
    }
}
