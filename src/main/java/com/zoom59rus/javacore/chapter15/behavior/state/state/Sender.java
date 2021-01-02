package com.zoom59rus.javacore.chapter15.behavior.state.state;

import com.zoom59rus.javacore.chapter15.behavior.state.State;

public class Sender implements State {
    @Override
    public void execute() {
        System.out.println("Пишем сообщение.");
    }
}
