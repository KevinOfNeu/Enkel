package com.bendcap.enkel.compiler.parsing.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.scope.Field;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.Type;
import com.bendcap.enkel.compiler.utils.TypeResolver;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * Created by KevinOfNeu on 2018/8/31  22:19.
 */
public class FieldVisitor extends EnkelBaseVisitor<Field> {
    private final Scope scope;

    public FieldVisitor(Scope scope) {
        this.scope = scope;
    }

    @Override
    public Field visitField(@NotNull EnkelParser.FieldContext ctx) {
        Type owner = scope.getClassType();
        Type type = TypeResolver.getFromTypeContext(ctx.type());
        String name = ctx.name().getText();
        return new Field(name, owner, type);
    }
}
