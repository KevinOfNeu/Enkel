package com.bendcap.enkel.compiler.parsing.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.ClassDeclaration;
import com.bendcap.enkel.compiler.domain.Constructor;
import com.bendcap.enkel.compiler.domain.Function;
import com.bendcap.enkel.compiler.domain.MetaData;
import com.bendcap.enkel.compiler.domain.node.expression.ConstructorCall;
import com.bendcap.enkel.compiler.domain.node.expression.FunctionCall;
import com.bendcap.enkel.compiler.domain.node.expression.Parameter;
import com.bendcap.enkel.compiler.domain.node.statement.Block;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.type.BultInType;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by KevinOfNeu on 2018/8/21  09:24.
 */
public class ClassVisitor extends EnkelBaseVisitor<ClassDeclaration> {
    private Scope scope;

    @Override
    public ClassDeclaration visitClassDeclaration(EnkelParser.ClassDeclarationContext ctx) {
        String name = ctx.className().getText();
        FunctionSignatureVisitor functionSignatureVisitor = new FunctionSignatureVisitor(scope);
        List<EnkelParser.FunctionContext> methodsCtx = ctx.classBody().function();
        MetaData metaData = new MetaData(ctx.className().getText(),"java.lang.Object");
        scope = new Scope(metaData);
        methodsCtx.stream()
                .map(method -> method.functionDeclaration().accept(functionSignatureVisitor))
                .forEach(scope::addSignature);
        boolean defaultConstructorExists = scope.isParameterLessSignatureExists(name);
        addDefaultConstructorSignatureToScope(name, defaultConstructorExists);
        List<Function> methods = methodsCtx.stream()
                .map(method -> method.accept(new FunctionVisitor(scope)))
                .collect(Collectors.toList());
        if(!defaultConstructorExists) {
            methods.add(getDefaultConstructor());
        }
        methods.add(getGeneratedMainMethod());

        return new ClassDeclaration(name, methods);
    }

    private void addDefaultConstructorSignatureToScope(String name, boolean defaultConstructorExists) {
        if(!defaultConstructorExists) {
            FunctionSignature constructorSignature = new FunctionSignature(name, Collections.emptyList(), BultInType.VOID);
            scope.addSignature(constructorSignature);
        }
    }

    private Constructor getDefaultConstructor() {
        FunctionSignature signature = scope.getMethodCallSignatureWithoutParameters(scope.getClassName());
        Constructor constructor = new Constructor(signature, Block.empty(scope));
        return constructor;
    }
    private Function getGeneratedMainMethod() {
        Parameter args = new Parameter("args", BultInType.STRING_ARR, Optional.empty());
        FunctionSignature functionSignature = new FunctionSignature("main", Collections.singletonList(args), BultInType.VOID);
        ConstructorCall constructorCall = new ConstructorCall(scope.getClassName());
        FunctionSignature startFunSignature = new FunctionSignature("start", Collections.emptyList(), BultInType.VOID);
        FunctionCall startFunctionCall = new FunctionCall(startFunSignature, Collections.emptyList(), scope.getClassType());
        Block block = new Block(new Scope(scope), Arrays.asList(constructorCall,startFunctionCall));
        return new Function(functionSignature, block);
    }
}
