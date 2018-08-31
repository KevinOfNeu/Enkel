package com.bendcap.enkel.compiler.domain.node.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Optional;

/**
 * Created by KevinOfNeu on 2018/8/31  11:53.
 */
public class Argument implements Expression {
    private final Optional<String> parameterName;
    private final Expression expression;
    public Argument(Expression expression, Optional<String> parameterName) {
        this.parameterName = parameterName;
        this.expression = expression;
    }
    @Override
    public Type getType() {
        return expression.getType();
    }
    @Override
    public void accept(ExpressionGenerator genrator) {
        expression.accept(genrator);
    }
    @Override
    public void accept(StatementGenerator generator) {
        expression.accept(generator);
    }
    public Optional<String> getParameterName() {
        return parameterName;
    }
}
