package com.bendcap.enkel.compiler.domain.clazz;

import com.bendcap.enkel.compiler.bytecodegenerator.MethodGenerator;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.statement.Statement;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;
import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/30  16:02.
 */
public class Constructor extends Function {
    public Constructor(FunctionSignature functionSignature, Statement block) {
        super(functionSignature, block);
    }

    @Override
    public Type getReturnType() {
        return BuiltInType.VOID;
    }

    @Override
    public void accept(MethodGenerator generator) {
        generator.generate(this);
    }
}
