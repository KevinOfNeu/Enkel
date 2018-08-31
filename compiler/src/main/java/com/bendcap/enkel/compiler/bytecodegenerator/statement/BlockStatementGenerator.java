package com.bendcap.enkel.compiler.bytecodegenerator.statement;

import com.bendcap.enkel.compiler.domain.node.statement.Block;
import com.bendcap.enkel.compiler.domain.node.statement.Statement;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import org.objectweb.asm.MethodVisitor;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/31  11:46.
 */
public class BlockStatementGenerator {
    private final MethodVisitor methodVisitor;
    public BlockStatementGenerator(MethodVisitor methodVisitor) {
        this.methodVisitor = methodVisitor;
    }
    public void generate(Block block) {
        Scope newScope = block.getScope();
        List<Statement> statements = block.getStatements();
        StatementGenerator statementGenerator = new StatementGenerator(methodVisitor, newScope);
        statements.stream().forEach(stmt -> stmt.accept(statementGenerator));
    }
}
