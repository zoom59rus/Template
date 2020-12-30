package com.zoom59rus.javacore.chapter15.observer;

public class TwoConsumer implements Observer {
    private String name = "Иван";

    @Override
    public void update(String news) {
        System.out.println(name + " получил новость " + news);
    }
}
