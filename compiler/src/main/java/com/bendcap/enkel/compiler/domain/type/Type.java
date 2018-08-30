package com.bendcap.enkel.compiler.domain.type;

/**
 * Created by KevinOfNeu on 2018/8/22  09:31.
 */
public interface Type {
    String getName();

    Class<?> getTypeClass();

    String getDescriptor();

    String getInternalName();

    int getLoadVariableOpcode();

    int getStoreVariableOpcode();

    int getReturnOpcode();

    int getAddOpcode();

    int getSubstractOpcode();

    int getMultiplyOpcode();

    int getDividOpcode();
}
