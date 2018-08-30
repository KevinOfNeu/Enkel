package com.bendcap.enkel.compiler.domain.expression;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/30  15:31.
 */
public interface Call extends Expression {
    List<Expression> getArguments();

    String getIdentifier();
}
