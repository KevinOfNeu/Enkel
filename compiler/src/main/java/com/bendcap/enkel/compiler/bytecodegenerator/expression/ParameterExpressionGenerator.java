package com.bendcap.enkel.compiler.bytecodegenerator.expression;

import com.bendcap.enkel.compiler.domain.node.expression.Parameter;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/8/31  11:44.
 */
public class ParameterExpressionGenerator {
    private final MethodVisitor methodVisitor;
    private final Scope scope;
    public ParameterExpressionGenerator(MethodVisitor methodVisitor, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
    }
    public void generate(Parameter parameter) {
        Type type = parameter.getType();
        int index = scope.getLocalVariableIndex(parameter.getName());
        methodVisitor.visitVarInsn(type.getLoadVariableOpcode(), index);
    }
}
