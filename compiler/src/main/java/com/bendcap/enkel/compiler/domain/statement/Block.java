package com.bendcap.enkel.compiler.domain.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.scope.Scope;

import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/24  13:16.
 */
public class Block implements Statement {
    private List<Statement> statements;
    private Scope scope;

    public Block( Scope scope, List<Statement> statements) {
        this.statements = statements;
        this.scope = scope;
    }

    public static Block empty(Scope scope) {
        return new Block(scope, Collections.emptyList());
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    public Scope getScope() {
        return scope;
    }

    public List<Statement> getStatements() {
        return statements;
    }
}
