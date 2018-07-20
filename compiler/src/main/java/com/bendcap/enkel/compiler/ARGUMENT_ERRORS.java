package com.bendcap.enkel.compiler;

/**
 * Created by KevinOfNeu on 2018/7/18  21:14.
 */
public enum ARGUMENT_ERRORS {
    NONE(""),
    NO_FILE("Specify files for compilation"),
    BAD_FILE_EXTENSION("File has to end with .enk extension");

    private String message;

    ARGUMENT_ERRORS(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
