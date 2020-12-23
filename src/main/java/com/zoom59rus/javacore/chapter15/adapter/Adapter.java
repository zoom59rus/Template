package com.zoom59rus.javacore.chapter15.adapter;

public class Adapter extends MyAdapteClass implements SimpleApi {
    @Override
    public void upload() {
        super.uploadSomething();
    }

    @Override
    public void parse() {
        super.parseSomething();
    }

    @Override
    public void update() {
        super.updateSomething();
    }

    @Override
    public void remove() {
        super.removeSomething();
    }
}