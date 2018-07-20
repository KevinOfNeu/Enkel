package com.bendcap.enkel.compiler.bytecodegeneration.instructions;

import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/7/18  21:14.
 */
public interface Instruction {
    void apply(MethodVisitor methodVisitor);
}
