package com.bendcap.enkel.compiler.bytecodegenerator.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.CompareSign;
import com.bendcap.enkel.compiler.domain.node.expression.ConditionalExpression;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.expression.FieldReference;
import com.bendcap.enkel.compiler.domain.node.expression.LocalVariableReference;
import com.bendcap.enkel.compiler.domain.node.statement.RangedForStatement;
import com.bendcap.enkel.compiler.domain.node.statement.Statement;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by KevinOfNeu on 2018/8/31  11:46.
 */
public class ForStatementGenerator {
    private final MethodVisitor methodVisitor;
    public ForStatementGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
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
        LocalVariable variable = new LocalVariable(iteratorVarName,rangedForStatement.getType());
        Expression iteratorVariable = new LocalVariableReference(variable);
        ConditionalExpression iteratorGreaterThanEndConditional = new ConditionalExpression(iteratorVariable, endExpression, CompareSign.GREATER);
        ConditionalExpression iteratorLessThanEndConditional = new ConditionalExpression(iteratorVariable, endExpression, CompareSign.LESS);
        iterator.accept(scopeGeneratorWithNewScope);
        iteratorLessThanEndConditional.accept(exprGeneratorWithNewScope);
        methodVisitor.visitJumpInsn(Opcodes.IFNE, incrementationSection);
        iteratorGreaterThanEndConditional.accept(exprGeneratorWithNewScope);
        methodVisitor.visitJumpInsn(Opcodes.IFNE, decrementationSection);
        methodVisitor.visitLabel(incrementationSection);
        rangedForStatement.getStatement().accept(scopeGeneratorWithNewScope);
        methodVisitor.visitIincInsn(newScope.getLocalVariableIndex(iteratorVarName), 1);
        iteratorGreaterThanEndConditional.accept(exprGeneratorWithNewScope);
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, incrementationSection);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, endLoopSection);
        methodVisitor.visitLabel(decrementationSection);
        rangedForStatement.getStatement().accept(scopeGeneratorWithNewScope);
        methodVisitor.visitIincInsn(newScope.getLocalVariableIndex(iteratorVarName), -1);
        iteratorLessThanEndConditional.accept(exprGeneratorWithNewScope);
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, decrementationSection);
        methodVisitor.visitLabel(endLoopSection);
    }
}
