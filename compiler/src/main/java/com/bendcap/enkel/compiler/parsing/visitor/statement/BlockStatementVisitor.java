package com.bendcap.enkel.compiler.parsing.visitor.statement;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.statement.Block;
import com.bendcap.enkel.compiler.domain.node.statement.Statement;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by KevinOfNeu on 2018/8/31  12:23.
 */
public class BlockStatementVisitor extends EnkelBaseVisitor<Block> {
    private final Scope scope;
    public BlockStatementVisitor(Scope scope) {
        this.scope = scope;
    }
    @Override
    public Block visitBlock(@NotNull EnkelParser.BlockContext ctx) {
        List<EnkelParser.StatementContext> blockstatementsCtx = ctx.statement();
        Scope newScope = new Scope(scope);
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        List<Statement> statements = blockstatementsCtx.stream().map(smtt -> smtt.accept(statementVisitor)).collect(Collectors.toList());
        return new Block(newScope, statements);
    }
}
