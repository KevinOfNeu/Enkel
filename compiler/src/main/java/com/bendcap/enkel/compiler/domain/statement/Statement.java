package com.bendcap.enkel.compiler.domain.statement;

import com.bendcap.enkel.compiler.bytecodegenerator.StatementGenerator;

/**
 * Created by KevinOfNeu on 2018/8/22  09:25.
 */
public interface Statement extends Node {
    void accept(StatementGenerator generator);
}
