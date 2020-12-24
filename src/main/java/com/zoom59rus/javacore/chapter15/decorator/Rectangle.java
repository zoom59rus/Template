package com.zoom59rus.javacore.chapter15.decorator;

public class Rectangle extends Decorator {
    private int d;

    public Rectangle(Shape shape, int d) {
        super(shape);
        this.d = d;
    }

    @Override
    public String getName(){
        return shape.getName() + ", d - " + d;
    }
}