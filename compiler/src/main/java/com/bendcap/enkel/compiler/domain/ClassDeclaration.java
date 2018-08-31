package com.bendcap.enkel.compiler.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/22  10:08.
 */
public class ClassDeclaration {
    private String name;
    private Collection<Function> methods;

    public ClassDeclaration(String name, Collection<Function> methods) {
        this.name = name;
        this.methods = methods;
    }

    public String getName() {
        return name;
    }

    public List<Function> getMethods() {
        return new ArrayList<>(methods);
    }
}
