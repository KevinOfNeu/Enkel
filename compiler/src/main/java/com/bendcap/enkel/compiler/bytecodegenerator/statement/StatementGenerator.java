package com.bendcap.enkel.compiler.bytecodegenerator.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.Addition;
import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.Division;
import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.Multiplication;
import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.Substraction;
import com.bendcap.enkel.compiler.domain.node.expression.*;
import com.bendcap.enkel.compiler.domain.node.statement.*;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/8/31  11:47.
 */
public class StatementGenerator {
    private final PrintStatementGenerator printStatementGenerator;
    private final VariableDeclarationStatementGenerator variableDeclarationStatementGenerator;
    private final ReturnStatemenetGenerator returnStatemenetGenerator;
    private final IfStatementGenerator ifStatementGenerator;
    private final BlockStatementGenerator blockStatementGenerator;
    private final ForStatementGenerator forStatementGenerator;
    private final AssignmentStatementGenerator assignmentStatementGenerator;
    private final ExpressionGenerator expressionGenerator;
    public StatementGenerator(MethodVisitor methodVisitor, Scope scope) {
        expressionGenerator = new ExpressionGenerator(methodVisitor, scope);
        printStatementGenerator = new PrintStatementGenerator(expressionGenerator,methodVisitor);
        variableDeclarationStatementGenerator = new VariableDeclarationStatementGenerator(this, expressionGenerator);
        forStatementGenerator = new ForStatementGenerator(methodVisitor);
        blockStatementGenerator = new BlockStatementGenerator(methodVisitor);
        ifStatementGenerator = new IfStatementGenerator(this, expressionGenerator, methodVisitor);
        returnStatemenetGenerator = new ReturnStatemenetGenerator(expressionGenerator, methodVisitor);
        assignmentStatementGenerator = new AssignmentStatementGenerator(methodVisitor, expressionGenerator, scope);
    }
    public void generate(PrintStatement printStatement) {
        printStatementGenerator.generate(printStatement);
    }
    public void generate(VariableDeclaration variableDeclaration) {
        variableDeclarationStatementGenerator.generate(variableDeclaration);
    }
    public void generate(FunctionCall functionCall) {
        functionCall.accept(expressionGenerator);
    }
    public void generate(ReturnStatement returnStatement) {
        returnStatemenetGenerator.generate(returnStatement);
    }
    public void generate(IfStatement ifStatement) {
        ifStatementGenerator.generate(ifStatement);
    }
    public void generate(Block block) {
        blockStatementGenerator.generate(block);
    }
    public void generate(RangedForStatement rangedForStatement) {
        forStatementGenerator.generate(rangedForStatement);
    }
    public void generate(Assignment assignment) {
        assignmentStatementGenerator.generate(assignment);
    }
    public void generate(SuperCall superCall) {
        expressionGenerator.generate(superCall);
    }
    public void generate(ConstructorCall constructorCall) {
        expressionGenerator.generate(constructorCall);
    }
    public void generate(Addition addition) {
        expressionGenerator.generate(addition);
    }
    public void generate(Parameter parameter) {
        expressionGenerator.generate(parameter);
    }
    public void generate(ConditionalExpression conditionalExpression) {
        expressionGenerator.generate(conditionalExpression);
    }
    public void generate(Multiplication multiplication) {
        expressionGenerator.generate(multiplication);
    }
    public void generate(Value value) {
        expressionGenerator.generate(value);
    }

    public void generate(Substraction substraction) {
        expressionGenerator.generate(substraction);
    }
    public void generate(Division division) {
        expressionGenerator.generate(division);
    }
    public void generate(EmptyExpression emptyExpression) {
        expressionGenerator.generate(emptyExpression);
    }

    public void generate(LocalVariableReference localVariableReference) {
        expressionGenerator.generate(localVariableReference);
    }
    public void generate(FieldReference fieldReference) {
        expressionGenerator.generate(fieldReference);
    }
}
