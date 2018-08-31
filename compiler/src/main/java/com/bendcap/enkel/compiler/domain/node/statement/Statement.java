package com.bendcap.enkel.compiler.domain.node.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.statement.StatementGenerator;
import com.bendcap.enkel.compiler.domain.node.Node;

/**
 * Created by KevinOfNeu on 2018/8/22  09:25.
 */
@FunctionalInterface
public interface Statement extends Node {
    void accept(StatementGenerator generator);
}
