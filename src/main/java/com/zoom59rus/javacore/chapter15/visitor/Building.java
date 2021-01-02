package com.zoom59rus.javacore.chapter15.visitor;

public interface Building {
    String aboutMe();
    void accept(Visitor visitor);
}
