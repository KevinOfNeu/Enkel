package com.bendcap.enkel.antlr.domain.global;

/**
 * Created by KevinOfNeu on 2018/8/22  10:08.
 */
public class CompilationUnit {
    private ClassDeclaration classDeclaration;

    public CompilationUnit(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }


    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }


    public String getClassName() {
        return classDeclaration.getName();
    }
}
