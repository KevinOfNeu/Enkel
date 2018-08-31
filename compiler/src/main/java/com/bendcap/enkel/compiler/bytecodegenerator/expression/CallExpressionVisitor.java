package com.bendcap.enkel.compiler.bytecodegenerator.expression;

import com.bendcap.enkel.compiler.domain.node.expression.*;
import com.bendcap.enkel.compiler.domain.scope.FunctionSignature;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import com.bendcap.enkel.compiler.exception.BadArgumentsToFunctionCallException;
import com.bendcap.enkel.compiler.exception.WrongArgumentNameException;
import com.bendcap.enkel.compiler.utils.DescriptorFactory;
import com.google.common.collect.Ordering;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.util.Comparator;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/31  13:11.
 */
public class CallExpressionVisitor {
    private final ExpressionGenerator expressionGenerator;
    private final Scope scope;
    private final MethodVisitor methodVisitor;

    public CallExpressionVisitor(ExpressionGenerator expressionGenerator, Scope scope, MethodVisitor methodVisitor) {
        this.expressionGenerator = expressionGenerator;
        this.scope = scope;
        this.methodVisitor = methodVisitor;
    }

    public void generate(ConstructorCall constructorCall) {
        String ownerDescriptor = scope.getClassInternalName();
        methodVisitor.visitTypeInsn(Opcodes.NEW, ownerDescriptor);
        methodVisitor.visitInsn(Opcodes.DUP);
        FunctionSignature methodCallSignature = scope.getMethodCallSignature(constructorCall.getIdentifier(), constructorCall.getArguments());
        String methodDescriptor = DescriptorFactory.getMethodDescriptor(methodCallSignature);
        generateArguments(constructorCall);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, ownerDescriptor, "<init>", methodDescriptor, false);
    }

    public void generate(SuperCall superCall) {
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        generateArguments(superCall);
        String ownerDescriptor = scope.getSuperClassInternalName();
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, ownerDescriptor, "<init>", "()V" /*TODO Handle super calls with arguments*/, false);
    }

    public void generate(FunctionCall functionCall) {
        functionCall.getOwner().accept(expressionGenerator);
        generateArguments(functionCall);
        String functionName = functionCall.getIdentifier();
        String methodDescriptor = DescriptorFactory.getMethodDescriptor(functionCall.getSignature());
        String ownerDescriptor = functionCall.getOwnerType().getInternalName();
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, ownerDescriptor, functionName, methodDescriptor, false);
    }

    public void generateArguments(Call call) {
        FunctionSignature signature = scope.getMethodCallSignature(call.getIdentifier(),call.getArguments());
        List<Parameter> parameters = signature.getParameters();
        List<Argument> arguments = call.getArguments();
        if (arguments.size() > parameters.size()) {
            throw new BadArgumentsToFunctionCallException(call);
        }
        arguments = getSortedArguments(arguments,parameters);
        arguments.forEach(argument -> argument.accept(expressionGenerator));
        generateDefaultParameters(call, parameters, arguments);
    }

    private List<Argument> getSortedArguments(List<Argument> arguments , List<Parameter> parameters) {
        Comparator<Argument> argumentIndexComparator = (o1, o2) -> {
            if (!o1.getParameterName().isPresent()) return 0;
            return getIndexOfArgument(o1, parameters) - getIndexOfArgument(o2, parameters);
        };
        return Ordering.from(argumentIndexComparator).immutableSortedCopy(arguments);
    }

    private Integer getIndexOfArgument(Argument argument, List<Parameter> parameters ) {
        String paramName = argument.getParameterName().get();
        return parameters.stream()
                .filter(p -> p.getName().equals(paramName))
                .map(parameters::indexOf)
                .findFirst()
                .orElseThrow(() -> new WrongArgumentNameException(argument, parameters));
    }

    private void generateDefaultParameters(Call call, List<Parameter> parameters, List<Argument> arguments) {
        for (int i = arguments.size(); i < parameters.size(); i++) {
            Expression defaultParameter = parameters.get(i).getDefaultValue()
                    .orElseThrow(() -> new BadArgumentsToFunctionCallException(call));
            defaultParameter.accept(expressionGenerator);
        }
    }
}
