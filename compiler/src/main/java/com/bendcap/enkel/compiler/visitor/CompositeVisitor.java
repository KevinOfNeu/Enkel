package com.bendcap.enkel.compiler.visitor;

import com.bendcap.enkel.antlr.EnkelBaseVisitor;
import com.bendcap.enkel.compiler.exception.NoVisitorReturnedValueException;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Arrays;

/**
 * Created by KevinOfNeu on 2018/8/22  16:04.
 */
public class CompositeVisitor<T> {
    private EnkelBaseVisitor<? extends T>[] visitors;

    public CompositeVisitor(EnkelBaseVisitor<? extends T>... visitors) {
        this.visitors = visitors;
    }

    public T accept(ParserRuleContext context) {
        return Arrays.stream(visitors)
                .map(context::accept)
                .filter(t -> t != null)
                .findFirst()
                .orElseThrow(() -> new NoVisitorReturnedValueException());
    }
}
