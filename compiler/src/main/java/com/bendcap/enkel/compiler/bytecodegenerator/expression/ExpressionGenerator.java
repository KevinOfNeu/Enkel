package com.bendcap.enkel.compiler.bytecodegenerator.expression;

import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.Addition;
import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.Division;
import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.Multiplication;
import com.bendcap.enkel.compiler.domain.node.expression.arthimetic.Substraction;
import com.bendcap.enkel.compiler.domain.node.expression.*;
import com.bendcap.enkel.compiler.domain.scope.Scope;
import org.objectweb.asm.MethodVisitor;

/**
 * Created by KevinOfNeu on 2018/8/31  11:43.
 */
public class ExpressionGenerator {
    private final ReferenceExpressionGenerator referenceExpressionGenerator;
    private final ValueExpressionGenerator valueExpressionGenerator;
    private final CallExpressionGenerator callExpressionGenerator;
    private final ArithmeticExpressionGenerator arithmeticExpressionGenerator;
    private final ConditionalExpressionGenerator conditionalExpressionGenerator;
    private final ParameterExpressionGenerator parameterExpressionGenerator;
    public ExpressionGenerator(MethodVisitor methodVisitor, Scope scope) {
        referenceExpressionGenerator = new ReferenceExpressionGenerator(methodVisitor,scope);
        valueExpressionGenerator = new ValueExpressionGenerator(methodVisitor);
        callExpressionGenerator = new CallExpressionGenerator(this, scope, methodVisitor);
        arithmeticExpressionGenerator = new ArithmeticExpressionGenerator(this, methodVisitor);
        conditionalExpressionGenerator = new ConditionalExpressionGenerator(this, methodVisitor);
        parameterExpressionGenerator = new ParameterExpressionGenerator(methodVisitor, scope);
    }
    public void generate(FieldReference fieldReference) {
        referenceExpressionGenerator.generate(fieldReference);
    }
    public void generate(LocalVariableReference reference) {
        referenceExpressionGenerator.generate(reference);
    }
    public void generate(Parameter parameter) {
        parameterExpressionGenerator.generate(parameter);
    }
    public void generate(Value value) {
        valueExpressionGenerator.generate(value);
    }
    public void generate(ConstructorCall constructorCall) {
        callExpressionGenerator.generate(constructorCall);
    }
    public void generate(SuperCall superCall) {
        callExpressionGenerator.generate(superCall);
    }
    public void generate(FunctionCall functionCall) {
        callExpressionGenerator.generate(functionCall);
    }
    public void generate(Addition expression) {
        arithmeticExpressionGenerator.generate(expression);
    }
    public void generate(Substraction expression) {
        arithmeticExpressionGenerator.generate(expression);
    }
    public void generate(Multiplication expression) {
        arithmeticExpressionGenerator.generate(expression);
    }
    public void generate(Division expression) {
        arithmeticExpressionGenerator.generate(expression);
    }
    public void generate(ConditionalExpression conditionalExpression) {
        conditionalExpressionGenerator.generate(conditionalExpression);
    }
    public void generate(EmptyExpression emptyExpression) {
        //do nothing ;)
    }
}
