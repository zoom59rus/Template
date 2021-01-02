package com.zoom59rus.javacore.chapter15.visitor;

import java.util.List;

public interface Visitor {
    void accept(Building building);
    void accept();
}
