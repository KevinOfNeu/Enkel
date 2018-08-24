package com.bendcap.enkel.compiler.bytecodegenerator;

import com.bendcap.enkel.compiler.domain.expression.Expression;
import com.bendcap.enkel.compiler.domain.expression.FunctionCall;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.statement.*;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.ClassType;
import com.bendcap.enkel.compiler.domain.type.Type;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  15:30.
 */
public class StatementGenerator {
    private MethodVisitor methodVisitor;
    private ExpressionGenerator expressionGenrator;
    private Scope scope;

    public StatementGenerator(MethodVisitor methodVisitor, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
        expressionGenrator = new ExpressionGenerator(methodVisitor, scope);
    }

    public void generate(PrintStatement printStatement) {
        Expression expression = printStatement.getExpression();
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
        expression.accept(expressionGenrator);
        Type type = expression.getType();
        String descriptor = "(" + type.getDescriptor() + ")V";
        ClassType owner = new ClassType("java.io.PrintStream");
        String fieldDescriptor = owner.getDescriptor();
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, fieldDescriptor, "println", descriptor, false);
    }

    public void generate(VariableDeclarationStatement variableDeclarationStatement) {
        Expression expression = variableDeclarationStatement.getExpression();
        String name = variableDeclarationStatement.getName();
        int index = scope.getLocalVariableIndex(name);
        Type type = expression.getType();
        expression.accept(expressionGenrator);
        if (type == BuiltInType.INT) {
            methodVisitor.visitVarInsn(Opcodes.ISTORE, index);
        } else {
            methodVisitor.visitVarInsn(Opcodes.ASTORE, index);
        }
    }

    public void generate(FunctionCall functionCall) {
        functionCall.accept(expressionGenrator);
    }

    public void generate(ReturnStatement returnStatement) {
        Expression expression = returnStatement.getExpression();
        Type type = expression.getType();
        expression.accept(expressionGenrator);
        if (type == BuiltInType.VOID) {
            methodVisitor.visitInsn(Opcodes.RETURN);
        } else if (type == BuiltInType.INT) {
            methodVisitor.visitInsn(Opcodes.IRETURN);
        }
    }


    public void generate(Block block) {
        Scope newScope = block.getScope();
        List<Statement> statements = block.getStatements();
        StatementGenerator statementGenerator = new StatementGenerator(methodVisitor, newScope);
        statements.stream()
                .forEach(stmt -> stmt.accept(statementGenerator));
    }
}
