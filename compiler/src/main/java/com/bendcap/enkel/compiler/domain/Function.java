package com.bendcap.enkel.compiler.domain;

import com.bendcap.enkel.compiler.bytecodegenerator.MethodGenerator;
import com.bendcap.enkel.compiler.domain.node.expression.Parameter;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.node.statement.Statement;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  09:25.
 */
public class Function {
    private FunctionSignature functionSignature;
    private Statement rootStatement;

    public Function(FunctionSignature functionSignature, Statement rootStatement) {
        this.functionSignature = functionSignature;
        this.rootStatement = rootStatement;
    }

    public String getName() {
        return functionSignature.getName();
    }

    public List<Parameter> getParameters() {
        return Collections.unmodifiableList(functionSignature.getParameters());
    }

    public Statement getRootStatement() {
        return rootStatement;
    }

    public Type getReturnType() {
        return functionSignature.getReturnType();
    }

    public void accept(MethodGenerator generator) {
        generator.generate(this);
    }
}
