package com.bendcap.enkel.compiler.bytecodegeneration;

import com.bendcap.enkel.compiler.bytecodegeneration.classscopeinstructions.ClassScopeInstruction;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by KevinOfNeu on 2018/8/13  22:41.
 */
public class ClassDeclaration {
    private Queue<ClassScopeInstruction> classScopeInstructions = new ArrayDeque<>();
    private String name;


    public ClassDeclaration(Queue<ClassScopeInstruction> classScopeInstructions, String name) {
        this.classScopeInstructions = classScopeInstructions;
        this.name = name;
    }

    public void add(ClassScopeInstruction instruction) {
        this.classScopeInstructions.add(instruction);
    }


    public Queue<ClassScopeInstruction> getClassScopeInstructions() {
        return classScopeInstructions;
    }

    public String getName() {
        return name;
    }
}
