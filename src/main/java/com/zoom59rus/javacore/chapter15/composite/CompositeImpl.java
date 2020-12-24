package com.zoom59rus.javacore.chapter15.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeImpl implements Composite {
    private List<Composite> composites;

    public CompositeImpl() {
        this.composites = new ArrayList<>();
    }

    public void add(Composite element){
        composites.add(element);
    }

    public void remove(Composite element){
        composites.remove(element);
    }

    @Override
    public void printShape() {
        for (Composite composite : composites) {
            composite.printShape();
        }
    }
}
