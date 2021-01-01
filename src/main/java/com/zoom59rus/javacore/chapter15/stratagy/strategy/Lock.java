package com.zoom59rus.javacore.chapter15.stratagy.strategy;

import com.zoom59rus.javacore.chapter15.stratagy.Strategy;

public class Lock implements Strategy {

    @Override
    public void execute() {
        System.out.println("Телефон заблокирован. Для разблокировки введите PIN.");
    }
}