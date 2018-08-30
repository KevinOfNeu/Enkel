package com.bendcap.enkel.compiler.domain.type;

import static org.objectweb.asm.Opcodes.*;

/**
 * Created by KevinOfNeu on 2018/8/29  23:42.
 */
public enum TypeSpecificOpcodes {
    INT(ILOAD, ISTORE, IRETURN, IADD, ISUB, IMUL, IDIV), //values (-127,127) - one byte.
    LONG(LLOAD, LSTORE, LRETURN, LADD, LSUB, LMUL, LDIV),
    FLOAT(FLOAD, FSTORE, FRETURN, FADD, FSUB, FMUL, FDIV),
    DOUBLE(DLOAD, DSTORE, DRETURN, DADD, DSUB, DMUL, DDIV),
    VOID(ALOAD, ASTORE, RETURN, 0, 0, 0, 0),
    OBJECT(ALOAD, ASTORE, ARETURN, 0, 0, 0, 0);
    private final int load;
    private final int store;
    private final int ret;
    private final int add;
    private final int sub;
    private final int mul;
    private final int div;

    TypeSpecificOpcodes(int load, int store, int ret, int add, int sub, int mul, int div) {
        this.load = load;
        this.store = store;
        this.ret = ret;
        this.add = add;
        this.sub = sub;
        this.mul = mul;
        this.div = div;
    }

    public int getLoad() {
        return load;
    }

    public int getStore() {
        return store;
    }

    public int getReturn() {
        return ret;
    }

    public int getAdd() {
        return add;
    }

    public int getSubstract() {
        return sub;
    }

    public int getMultiply() {
        return mul;
    }

    public int getDivide() {
        return div;
    }
}
