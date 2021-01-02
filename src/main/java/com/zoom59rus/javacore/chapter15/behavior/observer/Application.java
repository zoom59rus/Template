package com.zoom59rus.javacore.chapter15.behavior.observer;

public class Application {
    public static void main(String[] args) {
        Magazine magazine = new Magazine();
        OneConsumer oneConsumer = new OneConsumer();
        TwoConsumer twoConsumer = new TwoConsumer();

        magazine.addObserver(oneConsumer);
        magazine.addObserver(oneConsumer);
        magazine.addObserver(twoConsumer);

        magazine.addNews("Some news about magazine");
        magazine.addNews("Some news about sellers");
        magazine.addNews("Warnings during COVID period");
    }
}
