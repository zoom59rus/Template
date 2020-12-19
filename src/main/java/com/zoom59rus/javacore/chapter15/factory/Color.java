package com.zoom59rus.javacore.chapter15.factory;

public enum Color {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m");

    private String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
