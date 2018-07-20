package com.bendcap.enkel.compiler.parsing.domain;

/**
 * Created by KevinOfNeu on 2018/7/18  21:14.
 */
public class Variable {
    private int id;
    private int type;
    private String value;

    public Variable(int id, int type, String value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public int getId() {
        return id;
    }
}
