package com.bendcap.enkel.compiler.bytecodegenerator.statement;

import com.bendcap.enkel.compiler.domain.node.statement.Assignment;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/8/31  11:45.
 */
public class AssignmentStatementGenerator {
    private final MethodVisitor methodVisitor;
    private final Scope scope;
    public AssignmentStatementGenerator(MethodVisitor methodVisitor, Scope scope) {
        this.methodVisitor = methodVisitor;
        this.scope = scope;
    }
    public void generate(Assignment assignment) {
        String varName = assignment.getVarName();
        Type type = assignment.getExpression().getType();
        int index = scope.getLocalVariableIndex(varName);
        methodVisitor.visitVarInsn(type.getStoreVariableOpcode(), index);
    }
}
