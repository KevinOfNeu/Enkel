package com.bendcap.enkel.compiler.bytecodegenerator.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.Assignment;
import com.bendcap.enkel.compiler.domain.scope.Field;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * Created by KevinOfNeu on 2018/8/31  11:45.
 */
public class AssignmentStatementGenerator {
    private final MethodVisitor methodVisitor;
    private final ExpressionGenerator expressionGenerator;
    private final Scope scope;
    public AssignmentStatementGenerator(MethodVisitor methodVisitor, ExpressionGenerator expressionGenerator, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.expressionGenerator = expressionGenerator;
        this.scope = scope;
    }
    public void generate(Assignment assignment) {
        String varName = assignment.getVarName();
        Expression expression = assignment.getExpression();
        Type type = expression.getType();
        if(scope.isLocalVariableExists(varName)) {
            int index = scope.getLocalVariableIndex(varName);
            methodVisitor.visitVarInsn(type.getStoreVariableOpcode(), index);
            return;
        }
        Field field = scope.getField(varName);
        String descriptor = field.getType().getDescriptor();
        methodVisitor.visitVarInsn(Opcodes.ALOAD,0);
        expression.accept(expressionGenerator);
        methodVisitor.visitFieldInsn(Opcodes.PUTFIELD,field.getOwnerInternalName(),field.getName(),descriptor);
    }
}
