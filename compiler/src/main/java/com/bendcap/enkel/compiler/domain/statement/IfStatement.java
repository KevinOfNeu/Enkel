package com.bendcap.enkel.compiler.domain.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;
import com.bendcap.enkel.compiler.domain.expression.Expression;

/**
 * Created by KevinOfNeu on 2018/8/24  22:42.
 */
public class IfStatement implements Statement{
    private Expression condition;
    private Statement trueStatement;
    private Statement falseStatement;

    public IfStatement(Expression condition, Statement trueStatement, Statement falseStatement) {
        this.condition = condition;
        this.trueStatement = trueStatement;
        this.falseStatement = falseStatement;
    }

    public Expression getCondition() {
        return condition;
    }

    public Statement getTrueStatement() {
        return trueStatement;
    }

    public Statement getFalseStatement() {
        return falseStatement;
    }

    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }
}