package com.bendcap.enkel.compiler.bytecodegenerator.expression;

import com.bendcap.enkel.compiler.domain.node.expression.Value;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.utils.TypeResolver;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/8/31  11:45.
 */
public class ValueExpressionGenerator {
    private final MethodVisitor methodVisitor;
    public ValueExpressionGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
    }
    public void generate(Value value) {
        Type type = value.getType();
        String stringValue = value.getValue();
        Object transformedValue = TypeResolver.getValueFromString(stringValue, type);
        methodVisitor.visitLdcInsn(transformedValue);
    }
}
