package com.bendcap.enkel.compiler.domain.node.expression;

import com.bendcap.enkel.compiler.bytecodegenerator.expression.ExpressionGenerator;
import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.scope.Field;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/22  10:11.
 */
public class FieldReference implements Reference {
    private Field field;

    public FieldReference(Field field) {
        this.field = field;
    }

    public String geName() {
        return field.getName();
    }

    @Override
    public void accept(ExpressionGenerator generator) {
        generator.generate(this);
    }


    @Override
    public void accept(StatementGenerator generator) {
        generator.generate(this);
    }

    @Override
    public Type getType() {
        return field.getType();
    }

    public String getOwnerInternalName() {
        return field.getOwnerInternalName();
    }
}
