package com.zoom59rus.javacore.chapter15.state.state;

import com.zoom59rus.javacore.chapter15.state.State;

public class Lock implements State {
    private String pin;
    private boolean lock;

    @Override
    public void execute() {
        System.out.println("Телефон заблокирован. Введите PIN код.");
    }
}
