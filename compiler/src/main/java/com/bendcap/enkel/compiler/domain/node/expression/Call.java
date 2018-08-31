package com.bendcap.enkel.compiler.domain.node.expression;

import java.util.List;

/**
 * Created by KevinOfNeu on 2018/8/30  15:31.
 */
public interface Call extends Expression {
    List<Argument> getArguments();

    String getIdentifier();
}
