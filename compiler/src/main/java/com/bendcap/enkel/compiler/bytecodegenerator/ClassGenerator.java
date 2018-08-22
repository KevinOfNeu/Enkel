package com.bendcap.enkel.compiler.bytecodegenerator;

import com.bendcap.enkel.antlr.domain.clazz.Function;
import com.bendcap.enkel.antlr.domain.global.ClassDeclaration;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  11:50.
 */
public class ClassGenerator {
    private static final int CLASS_VERSION = 52;
    private ClassWriter classWriter;

    public ClassGenerator() {
        classWriter = new ClassWriter(ClassWriter.COMPUTE_FRAMES + ClassWriter.COMPUTE_MAXS);
    }

    public ClassWriter generate(ClassDeclaration classDeclaration) {
        String name = classDeclaration.getName();
        classWriter.visit(
                CLASS_VERSION,
                Opcodes.ACC_PUBLIC + Opcodes.ACC_SUPER,
                name,
                null,
                "java/lang/Object",
                null
        );
        List<Function> methods = classDeclaration.getMethods();
        methods.forEach(function -> new MethodGenerator(classWriter).generate(function));
        classWriter.visitEnd();
        return classWriter;
    }
}
