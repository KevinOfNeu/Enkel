package com.bendcap.enkel.compiler.bytecodegenerator;

import com.bendcap.enkel.antlr.domain.global.ClassDeclaration;
import com.bendcap.enkel.antlr.domain.global.CompilationUnit;

/**
 * Created by KevinOfNeu on 2018/8/22  11:49.
 */
public class BytecodeGenerator {
    public byte[] generate(CompilationUnit compilationUnit) {
        ClassDeclaration classDeclaration = compilationUnit.getClassDeclaration();
        ClassGenerator classGenerator = new ClassGenerator();
        return classGenerator.generate(classDeclaration).toByteArray();
    }
}
