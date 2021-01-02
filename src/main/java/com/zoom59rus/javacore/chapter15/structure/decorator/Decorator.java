package com.zoom59rus.javacore.chapter15.structure.decorator;

public class Decorator implements Shape {
    Shape shape;

    public Decorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public String getName() {
        return shape.getName();
    }
}