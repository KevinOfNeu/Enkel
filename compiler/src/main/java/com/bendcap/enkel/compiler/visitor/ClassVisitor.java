package com.bendcap.enkel.compiler.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.antlr.EnkelParser;
import com.bendcap.enkel.compiler.bytecodegeneration.ClassDeclaration;

/**
 * Created by KevinOfNeu on 2018/8/21  09:24.
 */
public class ClassVisitor extends EnkelBaseVisitor<ClassDeclaration> {

    @Override
    public ClassDeclaration visitClassDeclaration(EnkelParser.ClassDeclarationContext ctx) {
        String name = ctx.className().getText();
        StatementVisitor statementVisitor = new StatementVisitor();
        ctx.classBody().accept(statementVisitor);
        return new ClassDeclaration(statementVisitor.getClassScopeInstruction(), name);
    }
}
