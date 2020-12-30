package com.zoom59rus.javacore.chapter15.observer;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Observable {
    private List<Observer> observerList;
    private List<String> news;

    public Magazine() {
        this.observerList = new ArrayList<>();
        this.news = new ArrayList<>();
    }

    public void addNews(String news){

        this.news.add(news);
        notifyAllObserver(news);
    }

    @Override
    public void addObserver(Observer observer) {
        if(observerList.contains(observer)){
            return;
        }

        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver(String news) {
        observerList.stream().forEach(observer -> observer.update(news));
    }
}
