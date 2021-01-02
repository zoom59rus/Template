package com.zoom59rus.javacore.chapter15.behavior.mediator.factory;

public interface Event<T> {
    String getInvoker();
    T getEvent();
}