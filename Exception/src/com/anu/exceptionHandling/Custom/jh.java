package com.anu.exceptionHandling.Custom;

public class jh extends RuntimeException {

    private String field;

    public jh(String message, String field) {
        super(message);
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
