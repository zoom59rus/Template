package com.zoom59rus.javacore.chapter15.structure.composite;

public class Rectangle implements Composite{
    private String shapeName;

    public Rectangle(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public void printShape() {
        System.out.println(getShapeName());
    }
}
