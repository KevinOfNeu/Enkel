package com.bendcap.enkel.compiler.bytecodegenerator.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.CompareSign;
import com.bendcap.enkel.compiler.domain.node.expression.ConditionalExpression;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by KevinOfNeu on 2018/8/31  11:42.
 */
public class ConditionalExpressionGenerator {
    private final ExpressionGenerator expressionGenerator;
    private final MethodVisitor methodVisitor;
    public ConditionalExpressionGenerator(ExpressionGenerator expressionGenerator, MethodVisitor methodVisitor) {
        this.expressionGenerator = expressionGenerator;
        this.methodVisitor = methodVisitor;
    }
    public void generate(ConditionalExpression conditionalExpression) {
        Expression leftExpression = conditionalExpression.getLeftExpression();
        Expression rightExpression = conditionalExpression.getRightExpression();
        leftExpression.accept(expressionGenerator);
        rightExpression.accept(expressionGenerator);
        CompareSign compareSign = conditionalExpression.getCompareSign();
        Label endLabel = new Label();
        Label trueLabel = new Label();
        methodVisitor.visitJumpInsn(compareSign.getOpcode(), trueLabel);
        methodVisitor.visitInsn(Opcodes.ICONST_0);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, endLabel);
        methodVisitor.visitLabel(trueLabel);
        methodVisitor.visitInsn(Opcodes.ICONST_1);
        methodVisitor.visitLabel(endLabel);
    }
}
