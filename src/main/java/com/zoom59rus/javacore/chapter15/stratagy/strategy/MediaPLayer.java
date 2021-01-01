package com.zoom59rus.javacore.chapter15.stratagy.strategy;

import com.zoom59rus.javacore.chapter15.stratagy.Strategy;

public class MediaPLayer implements Strategy {
    @Override
    public void execute() {
        System.out.println("Играю композицию.");
    }
}
