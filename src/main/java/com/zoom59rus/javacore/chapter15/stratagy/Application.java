package com.zoom59rus.javacore.chapter15.stratagy;

import com.zoom59rus.javacore.chapter15.stratagy.strategy.Contact;
import com.zoom59rus.javacore.chapter15.stratagy.strategy.Lock;
import com.zoom59rus.javacore.chapter15.stratagy.strategy.MediaPLayer;
import com.zoom59rus.javacore.chapter15.stratagy.strategy.Sender;

public class Application {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.setStrategy(new Lock());
        mobile.action();

        mobile.setStrategy(new Contact());
        mobile.action();

        mobile.setStrategy(new Sender());
        mobile.action();

        mobile.setStrategy(new MediaPLayer());
        mobile.action();
    }
}
