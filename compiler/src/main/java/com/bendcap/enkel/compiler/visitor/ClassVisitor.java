package com.bendcap.enkel.compiler.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.domain.clazz.Constructor;
import com.bendcap.enkel.compiler.domain.clazz.Function;
import com.bendcap.enkel.compiler.domain.expression.ConstructorCall;
import com.bendcap.enkel.compiler.domain.expression.FunctionCall;
import com.bendcap.enkel.compiler.domain.expression.FunctionParameter;
import com.bendcap.enkel.compiler.domain.global.ClassDeclaration;
import com.bendcap.enkel.compiler.domain.global.MetaData;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.domain.statement.Block;
import com.bendcap.enkel.compiler.domain.type.BuiltInType;

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
        boolean defaultConstructorExists = scope.parameterLessSignatureExists(name);
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
            FunctionSignature constructorSignature = new FunctionSignature(name, Collections.emptyList(), BuiltInType.VOID);
            scope.addSignature(constructorSignature);
        }
    }

    private Constructor getDefaultConstructor() {
        FunctionSignature signature = scope.getMethodCallSignatureWithoutParameters(scope.getClassName());
        Constructor constructor = new Constructor(signature, Block.empty(scope));
        return constructor;
    }
    private Function getGeneratedMainMethod() {
        FunctionParameter args = new FunctionParameter("args", BuiltInType.STRING_ARR, Optional.empty());
        FunctionSignature functionSignature = new FunctionSignature("main", Collections.singletonList(args), BuiltInType.VOID);
        ConstructorCall constructorCall = new ConstructorCall(scope.getClassName());
        FunctionSignature startFunSignature = new FunctionSignature("start", Collections.emptyList(), BuiltInType.VOID);
        FunctionCall startFunctionCall = new FunctionCall(startFunSignature, Collections.emptyList(), scope.getClassType());
        Block block = new Block(new Scope(scope), Arrays.asList(constructorCall,startFunctionCall));
        return new Function(functionSignature, block);
    }
}
