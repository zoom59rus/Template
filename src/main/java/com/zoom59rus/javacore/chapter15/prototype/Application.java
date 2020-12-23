package com.zoom59rus.javacore.chapter15.prototype;

public class Application {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus 3", "White", 240);
        Car cloneCar = car.clone();

        System.out.println(car);
        System.out.println(cloneCar);
        System.out.println("Hash car: " + car.hashCode());
        System.out.println("Hash cloneCar: " + car.hashCode());

    }
}
