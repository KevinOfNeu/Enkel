package com.bendcap.enkel.compiler.parsing.visitor.expression;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.Value;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.utils.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:20.
 */
public class ValueExpressionVisitor extends EnkelBaseVisitor<Value> {
    @Override
    public Value visitValue(@NotNull EnkelParser.ValueContext ctx) {
        String value = ctx.getText();
        Type type = TypeResolver.getFromValue(ctx.getText());
        return new Value(type, value);
    }
}
