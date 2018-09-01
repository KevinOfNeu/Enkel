package com.bendcap.enkel.compiler.bytecodegenerator.expression;

import com.bendcap.enkel.compiler.domain.node.expression.FieldReference;
import com.bendcap.enkel.compiler.domain.node.expression.LocalVariableReference;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by KevinOfNeu on 2018/8/31  23:15.
 */
public class ReferenceExpressionGenerator {
    private final MethodVisitor methodVisitor;
    private final Scope scope;
    public ReferenceExpressionGenerator(MethodVisitor methodVisitor, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
    }
    public void generate(LocalVariableReference localVariableReference) {
        String varName = localVariableReference.geName();
        int index = scope.getLocalVariableIndex(varName);
        Type type = localVariableReference.getType();
        methodVisitor.visitVarInsn(type.getLoadVariableOpcode(), index);
    }
    public void generate(FieldReference fieldReference) {
        String varName = fieldReference.geName();
        Type type = fieldReference.getType();
        String ownerInternalName = fieldReference.getOwnerInternalName();
        String descriptor = type.getDescriptor();
        methodVisitor.visitVarInsn(Opcodes.ALOAD,0);
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, ownerInternalName,varName,descriptor);
    }
}
