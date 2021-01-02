package com.zoom59rus.javacore.chapter15.structure.decorator;

public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Decorator(new Rectangle(new Triangle("Прямоугольник", 10, 4, 14), 30));
        System.out.println(rectangle.getName());
    }
}
