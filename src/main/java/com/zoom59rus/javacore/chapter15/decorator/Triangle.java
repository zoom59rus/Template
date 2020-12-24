package com.zoom59rus.javacore.chapter15.decorator;

public class Triangle  implements Shape{
    private String shapeName;
    private int a, b, c;

    public Triangle(String shapeName, int a, int b, int c) {
        this.shapeName = shapeName;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String getName() {
        return String.format("Я %s, мои стороны равны: а - %d, б - %d, с - %d", shapeName, a, b, c);
    }
}
