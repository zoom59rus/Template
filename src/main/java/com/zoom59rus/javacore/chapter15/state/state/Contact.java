package com.zoom59rus.javacore.chapter15.state.state;

import com.zoom59rus.javacore.chapter15.state.State;

public class Contact implements State {
    @Override
    public void execute() {
        System.out.println("Список контактов.");
    }
}
