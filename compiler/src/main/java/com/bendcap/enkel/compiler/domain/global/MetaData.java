package com.bendcap.enkel.compiler.domain.global;

/**
 * Created by KevinOfNeu on 2018/8/22  09:41.
 */
public class MetaData {
    private String className;
    private String superClassName;

    public MetaData(String className, String superClassName) {
        this.className = className;
        this.superClassName = superClassName;
    }

    public String getClassName() {
        return className;
    }

    public String getSuperClassName() {
        return superClassName;
    }
}
