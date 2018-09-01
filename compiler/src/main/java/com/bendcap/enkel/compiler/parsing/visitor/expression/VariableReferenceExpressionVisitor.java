package com.bendcap.enkel.compiler.parsing.visitor.expression;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.node.expression.FieldReference;
import com.bendcap.enkel.compiler.domain.node.expression.LocalVariableReference;
import com.bendcap.enkel.compiler.domain.node.expression.Reference;
import com.bendcap.enkel.compiler.domain.scope.Field;
import com.bendcap.enkel.compiler.domain.scope.LocalVariable;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  12:21.
 */
public class VariableReferenceExpressionVisitor extends EnkelBaseVisitor<Reference> {
    private final Scope scope;
    public VariableReferenceExpressionVisitor(Scope scope) {
        this.scope = scope;
    }
    @Override
    public Reference visitVarReference(@NotNull EnkelParser.VarReferenceContext ctx) {
        String varName = ctx.getText();
        if(scope.isFieldExists(varName)) {
            Field field = scope.getField(varName);
            return new FieldReference(field);
        }
        LocalVariable variable = scope.getLocalVariable(varName);
        return new LocalVariableReference(variable);
    }
}

