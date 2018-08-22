package com.bendcap.enkel.compiler.bytecodegenerator;

import com.bendcap.enkel.antlr.domain.clazz.Function;
import com.bendcap.enkel.antlr.domain.scope.Scope;
import com.bendcap.enkel.antlr.domain.statement.Statement;
import org.objectweb.asm.ClassWriter;
import com.bendcap.enkel.compiler.utils.DecriptorFactory;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Collection;

/**
 * Created by KevinOfNeu on 2018/8/22  15:44.
 */
public class MethodGenerator {
    private ClassWriter classWriter;

    public MethodGenerator(ClassWriter classWriter) {
        this.classWriter = classWriter;
    }

    public void generate(Function function) {
        Scope scope = function.getScope();
        String name = function.getName();
        String description = DecriptorFactory.getMethodDescriptor(function);
        Collection<Statement> instructions = function.getStatements();
        int access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;//(function.getName().equals("main") ? Opcodes.ACC_STATIC : 0);
        MethodVisitor mv = classWriter.visitMethod(access, name, description, null, null);
        mv.visitCode();
        StatementGenerator statementGenerator = new StatementGenerator(mv);
        instructions.forEach(instruction -> statementGenerator.generate(instruction, scope));
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(-1, -1);
        mv.visitEnd();
    }
}
