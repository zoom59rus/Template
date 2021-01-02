package com.zoom59rus.javacore.chapter15.behavior.observer;

public class OneConsumer implements Observer{
    private String name = "Василий";

    @Override
    public void update(String news) {
        System.out.println(name + " получил новость " + news);
    }
}
