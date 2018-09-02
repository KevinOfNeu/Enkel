package com.bendcap.enkel.compiler.exception;

import com.bendcap.enkel.compiler.domain.type.Type;

/**
 * Created by KevinOfNeu on 2018/9/2  14:54.
 */
public class MixedComparisonNotAllowedException extends RuntimeException {
    public MixedComparisonNotAllowedException(Type leftType, Type rightType) {
        super("Comparison between object and primitive is not supported  :" + leftType + "  |  " + rightType);
    }
}
