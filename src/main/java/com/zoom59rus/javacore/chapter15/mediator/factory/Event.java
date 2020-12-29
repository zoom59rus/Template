package com.zoom59rus.javacore.chapter15.mediator.factory;

public interface Event<T> {
    String getInvoker();
    T getEvent();
}