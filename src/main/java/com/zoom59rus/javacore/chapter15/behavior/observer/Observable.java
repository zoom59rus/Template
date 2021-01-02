package com.zoom59rus.javacore.chapter15.behavior.observer;

public interface Observable {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObserver(String news);
}
