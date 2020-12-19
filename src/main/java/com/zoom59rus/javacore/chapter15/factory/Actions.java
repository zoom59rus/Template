package com.zoom59rus.javacore.chapter15.factory;

public enum Actions {
    BACH("!!!BACH!!!"),
    TRAH("!!!TRAH!!!"),
    TARARAH("!!!TARARAH!!!"),
    BUBUM("!!!BUBUM!!!");

    private String action;

    Actions(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
