package com.zoom59rus.javacore.chapter15.behavior.state;

import com.zoom59rus.javacore.chapter15.behavior.state.state.Lock;

public class Application {
    public static void main(String[] args) {
        Mobile mobile = new Mobile(new Lock());
        mobile.changeState();
        mobile.changeState();
        mobile.changeState();
        mobile.changeState();
        mobile.changeState();
    }
}