package com.bendcap.enkel.compiler.domain.clazz;

import com.bendcap.enkel.compiler.domain.expression.FunctionParameter;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.statement.Statement;
import com.bendcap.enkel.compiler.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  09:25.
 */
public class Function {
    private String name;
    private List<FunctionParameter> arguments;
    private Statement rootStatement;
    private Type returnType;

    public Function(String name, Type returnType, List<FunctionParameter> arguments, Statement rootStatement) {
        this.name = name;
        this.arguments = arguments;
        this.rootStatement = rootStatement;
        this.returnType = returnType;
    }

    public String getName() {
        return name;
    }

    public List<FunctionParameter> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    public Statement getRootStatement() {
        return rootStatement;
    }

    public Type getReturnType() {
        return returnType;
    }
}
