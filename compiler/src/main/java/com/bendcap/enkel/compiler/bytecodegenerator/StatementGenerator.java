package com.bendcap.enkel.compiler.bytecodegenerator;

import com.bendcap.enkel.compiler.CompareSign;
import com.bendcap.enkel.compiler.domain.expression.ConditionalExpression;
import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.expression.FunctionCall;
import com.bendcap.enkel.compiler.domain.expression.VarReference;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.statement.*;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.sun.org.apache.bcel.internal.generic.IFEQ;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  15:30.
 */
public class StatementGenerator {
    private MethodVisitor methodVisitor;
    private ExpressionGenerator expressionGenrator;
    private Scope scope;

    public StatementGenerator(MethodVisitor methodVisitor, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
        expressionGenrator = new ExpressionGenerator(methodVisitor, scope);
    }

    public void generate(PrintStatement printStatement) {
        Expression expression = printStatement.getExpression();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expression.accept(expressionGenrator);
        Type type = expression.getType();
        String descriptor = "(" + type.getDescriptor() + ")V";
        ClassType owner = new ClassType("java.io.PrintStream");
        String fieldDescriptor = owner.getDescriptor();
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, fieldDescriptor, "println", descriptor, false);
    }

    public void generate(VariableDeclarationStatement variableDeclarationStatement) {
        Expression expression = variableDeclarationStatement.getExpression();
        expression.accept(expressionGenrator);
        AssignmentStatement assignmentStatement = new AssignmentStatement(variableDeclarationStatement);
        generate(assignmentStatement);
    }

    public void generate(FunctionCall functionCall) {
        functionCall.accept(expressionGenrator);
    }

    public void generate(ReturnStatement returnStatement) {
        Expression expression = returnStatement.getExpression();
        Type type = expression.getType();
        expression.accept(expressionGenrator);
        methodVisitor.visitInsn(type.getReturnOpcode());
    }

    public void generate(IfStatement ifStatement) {
        Expression condition = ifStatement.getCondition();
        condition.accept(expressionGenrator);
        Label trueLabel = new Label();
        Label endLabel = new Label();
        methodVisitor.visitJumpInsn(Opcodes.IFNE, trueLabel);
        ifStatement.getFalseStatement().accept(this);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, endLabel);
        methodVisitor.visitLabel(trueLabel);
        ifStatement.getTrueStatement().accept(this);
        methodVisitor.visitLabel(endLabel);
    }


    public void generate(Block block) {
        Scope newScope = block.getScope();
        List<Statement> statements = block.getStatements();
        StatementGenerator statementGenerator = new StatementGenerator(methodVisitor, newScope);
        statements.stream()
                .forEach(stmt -> stmt.accept(statementGenerator));
    }


    public void generate(RangedForStatement rangedForStatement) {
        Scope newScope = rangedForStatement.getScope();
        StatementGenerator scopeGeneratorWithNewScope = new StatementGenerator(methodVisitor, newScope);
        ExpressionGenerator exprGeneratorWithNewScope = new ExpressionGenerator(methodVisitor, newScope);
        Statement iterator = rangedForStatement.getIteratorVariableStatement();
        Label incrementationSection = new Label();
        Label decrementationSection = new Label();
        Label endLoopSection = new Label();
        String iteratorVarName = rangedForStatement.getIteratorVarName();
        Expression endExpression = rangedForStatement.getEndExpression();
        Expression iteratorVariable = new VarReference(iteratorVarName, rangedForStatement.getType());
        ConditionalExpression iteratorGreaterThanEndConditional = new ConditionalExpression(iteratorVariable, endExpression, CompareSign.GREATER);
        ConditionalExpression iteratorLessThanEndConditional = new ConditionalExpression(iteratorVariable, endExpression, CompareSign.LESS);

        iterator.accept(scopeGeneratorWithNewScope);

        iteratorLessThanEndConditional.accept(exprGeneratorWithNewScope);
        methodVisitor.visitJumpInsn(Opcodes.IFNE,incrementationSection);

        iteratorGreaterThanEndConditional.accept(exprGeneratorWithNewScope);
        methodVisitor.visitJumpInsn(Opcodes.IFNE,decrementationSection);

        methodVisitor.visitLabel(incrementationSection);
        rangedForStatement.getStatement().accept(scopeGeneratorWithNewScope);
        methodVisitor.visitIincInsn(newScope.getLocalVariableIndex(iteratorVarName),1);
        iteratorGreaterThanEndConditional.accept(exprGeneratorWithNewScope);
        methodVisitor.visitJumpInsn(Opcodes.IFEQ,incrementationSection);
        methodVisitor.visitJumpInsn(Opcodes.GOTO,endLoopSection);

        methodVisitor.visitLabel(decrementationSection);
        rangedForStatement.getStatement().accept(scopeGeneratorWithNewScope);
        methodVisitor.visitIincInsn(newScope.getLocalVariableIndex(iteratorVarName),-1);
        iteratorLessThanEndConditional.accept(exprGeneratorWithNewScope);
        methodVisitor.visitJumpInsn(Opcodes.IFEQ,decrementationSection);

        methodVisitor.visitLabel(endLoopSection);
    }


    public void generate(AssignmentStatement assignmentStatement) {
        String varName = assignmentStatement.getVarName();
        Type type = assignmentStatement.getExpression().getType();
        int index = scope.getLocalVariableIndex(varName);
        methodVisitor.visitVarInsn(type.getStoreVariableOpcode(), index);
    }
}
