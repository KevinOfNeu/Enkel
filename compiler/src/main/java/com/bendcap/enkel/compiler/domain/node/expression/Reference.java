package com.bendcap.enkel.compiler.domain.node.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;

/**
 * Created by KevinOfNeu on 2018/8/31  23:07.
 */
public interface Reference extends Expression {
    String geName();

    @Override
    void accept(ExpressionGenerator genrator);

    @Override
    void accept(StatementGenerator generator);
}
