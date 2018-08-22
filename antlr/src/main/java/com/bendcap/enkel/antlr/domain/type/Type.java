package com.bendcap.enkel.antlr.domain.type;

/**
 * Created by KevinOfNeu on 2018/8/22  09:31.
 */
public interface Type {
    String getName();

    Class<?> getTypeClass();

    String getDescriptor();

    String getInternalName();
}
