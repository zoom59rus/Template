package com.zoom59rus.javacore.chapter15.stratagy;

public class Mobile {
    private Strategy strategy;
    private boolean lock;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void action(){
        strategy.execute();
    }
}