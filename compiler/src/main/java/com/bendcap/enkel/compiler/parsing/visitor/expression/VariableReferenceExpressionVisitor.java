package com.bendcap.enkel.compiler.parsing.visitor.expression;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.VariableReference;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:21.
 */
public class VariableReferenceExpressionVisitor extends EnkelBaseVisitor<VariableReference> {
    private final Scope scope;
    public VariableReferenceExpressionVisitor(Scope scope) {
        this.scope = scope;
    }
    @Override
    public VariableReference visitVarReference(@NotNull EnkelParser.VarReferenceContext ctx) {
        String varName = ctx.getText();
        LocalVariable localVariable = scope.getLocalVariable(varName);
        return new VariableReference(varName, localVariable.getType());
    }
}

