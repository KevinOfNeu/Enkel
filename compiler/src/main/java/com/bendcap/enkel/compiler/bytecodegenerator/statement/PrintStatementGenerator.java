package com.bendcap.enkel.compiler.bytecodegenerator.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.PrintStatement;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by KevinOfNeu on 2018/8/31  11:47.
 */
public class PrintStatementGenerator {
    private final MethodVisitor methodVisitor;
    private final ExpressionGenerator expressionGenerator;
    public PrintStatementGenerator(ExpressionGenerator expressionGenerator, MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
        this.expressionGenerator = expressionGenerator;
    }
    public void generate(PrintStatement printStatement) {
        Expression expression = printStatement.getExpression();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expression.accept(expressionGenerator);
        Type type = expression.getType();
        String descriptor = "(" + type.getDescriptor() + ")V";
        ClassType owner = new ClassType("java.io.PrintStream");
        String fieldDescriptor = owner.getDescriptor();
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, fieldDescriptor, "println", descriptor, false);
    }
}
