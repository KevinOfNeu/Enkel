package com.bendcap.enkel.compiler.bytecodegenerator.expression;

import com.bendcap.enkel.compiler.domain.node.expression.VariableReference;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/8/31  11:45.
 */
public class VariableReferenceExpressionGenerator {
    private final MethodVisitor methodVisitor;
    private final Scope scope;

    public VariableReferenceExpressionGenerator(MethodVisitor methodVisitor, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
    }

    public void generate(VariableReference variableReference) {
        String varName = variableReference.geName();
        int index = scope.getLocalVariableIndex(varName);
        LocalVariable localVariable = scope.getLocalVariable(varName);
        Type type = localVariable.getType();
        methodVisitor.visitVarInsn(type.getLoadVariableOpcode(), index);
    }
}
