package com.bendcap.enkel.compiler.bytecodegeneration.classscopeinstructions;

import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/8/13  22:28.
 */
public interface ClassScopeInstruction {
    void apply(MethodVisitor mv);
}
