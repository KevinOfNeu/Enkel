package com.bendcap.enkel.compiler.parsing.visitor.statement;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.EmptyExpression;
import com.bendcap.enkel.compiler.domain.node.expression.Expression;
import com.bendcap.enkel.compiler.domain.node.statement.ReturnStatement;
import com.bendcap.enkel.compiler.domain.type.BultInType;
import com.bendcap.enkel.compiler.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:25.
 */
public class ReturnStatementVisitor  extends EnkelBaseVisitor<ReturnStatement> {
    private final ExpressionVisitor expressionVisitor;
    public ReturnStatementVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }
    @Override
    public ReturnStatement visitReturnVoid(@NotNull EnkelParser.ReturnVoidContext ctx) {
        return new ReturnStatement(new EmptyExpression(BultInType.VOID));
    }
    @Override
    public ReturnStatement visitReturnWithValue(@NotNull EnkelParser.ReturnWithValueContext ctx) {
        Expression expression = ctx.expression().accept(expressionVisitor);
        return new ReturnStatement(expression);
    }
}
