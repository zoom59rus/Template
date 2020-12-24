package com.zoom59rus.javacore.chapter15.composite;

public class Application {
    public static void main(String[] args) {
        CompositeImpl composite = new CompositeImpl();

        Circle circle = new Circle("Я кгруг");
        Rectangle rectangle = new Rectangle("Я прямоугольник");
        Triangle triangle = new Triangle("Я треугольник");

        composite.add(circle);
        composite.add(rectangle);
        composite.add(triangle);

        Composite c = composite;
        c.printShape();
        System.out.println();

        composite.remove(circle);
        c.printShape();

    }
}