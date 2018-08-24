package com.bendcap.enkel.compiler.bytecodegenerator;

import com.bendcap.enkel.compiler.domain.clazz.Function;
import com.bendcap.enkel.compiler.domain.expression.EmptyExpression;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.statement.Block;
import com.bendcap.enkel.compiler.domain.statement.ReturnStatement;
import com.bendcap.enkel.compiler.domain.statement.Statement;
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
        String name = function.getName();
        String description = DecriptorFactory.getMethodDescriptor(function);
        Block block = (Block) function.getRootStatement();
        int access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC;//(function.getName().equals("main") ? Opcodes.ACC_STATIC : 0);
        MethodVisitor mv = classWriter.visitMethod(access, name, description, null, null);
        mv.visitCode();
        Scope scope = block.getScope();
        StatementGenerator statementGenerator = new StatementGenerator(mv, scope);
        block.accept(statementGenerator);
        appendReturnIfNotExists(function, block, statementGenerator);
        mv.visitMaxs(-1, -1);
        mv.visitEnd();
    }


    private void appendReturnIfNotExists(Function function, Block block, StatementGenerator statementGenerator) {
        Statement lastStatement = block.getStatements().get(block.getStatements().size() - 1);
        if (!(lastStatement instanceof ReturnStatement)) {
            EmptyExpression emptyExpression = new EmptyExpression(function.getReturnType());
            ReturnStatement returnStatement = new ReturnStatement(emptyExpression);
            returnStatement.accept(statementGenerator);
        }
    }
}
