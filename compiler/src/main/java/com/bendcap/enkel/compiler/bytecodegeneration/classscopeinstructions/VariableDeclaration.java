package com.bendcap.enkel.compiler.bytecodegeneration.classscopeinstructions;

import com.bendcap.enkel.antlr.EnkelLexer;
import com.bendcap.enkel.compiler.parsing.domain.Variable;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by KevinOfNeu on 2018/7/18  21:14.
 */
public class VariableDeclaration implements ClassScopeInstruction, Opcodes {
    Variable variable;

    public VariableDeclaration(Variable variable) {
        this.variable = variable;
    }

    @Override
    public void apply(MethodVisitor mv) {
        final int type = variable.getType();
        if (type == EnkelLexer.NUMBER) {
            int val = Integer.valueOf(variable.getValue());
            mv.visitIntInsn(BIPUSH, val);
            mv.visitVarInsn(ISTORE, variable.getId());
        } else if (type == EnkelLexer.STRING) {
            mv.visitLdcInsn(variable.getValue());
            mv.visitVarInsn(ASTORE, variable.getId());
        }
    }
}
