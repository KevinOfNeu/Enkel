package com.bendcap.enkel.compiler.domain.node.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.node.statement.Statement;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/31  11:56.
 */
public interface Expression extends Statement {
    Type getType();
    void accept(ExpressionGenerator genrator);
    @Override
    void accept(StatementGenerator generator);
}
