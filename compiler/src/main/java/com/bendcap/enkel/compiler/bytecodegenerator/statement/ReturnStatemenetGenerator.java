package com.bendcap.enkel.compiler.bytecodegenerator.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.ReturnStatement;
import com.bendcap.enkel.compiler.domain.type.Type;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/8/31  11:47.
 */
public class ReturnStatemenetGenerator {
    private final ExpressionGenerator expressionGenerator;
    private final MethodVisitor methodVisitor;
    public ReturnStatemenetGenerator(ExpressionGenerator expressionGenerator, MethodVisitor methodVisitor) {
        this.expressionGenerator = expressionGenerator;
        this.methodVisitor = methodVisitor;
    }
    public void generate(ReturnStatement returnStatement) {
        Expression expression = returnStatement.getExpression();
        Type type = expression.getType();
        expression.accept(expressionGenerator);
        methodVisitor.visitInsn(type.getReturnOpcode());
    }
}
