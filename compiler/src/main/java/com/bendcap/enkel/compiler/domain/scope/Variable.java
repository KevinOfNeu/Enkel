package com.bendcap.enkel.compiler.domain.scope;

import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/8/31  22:17.
 */
public interface Variable {
    Type getType();

    String getName();
}
