package com.zoom59rus.javacore.chapter15.bridge;

public interface Client <T>{
    void save(T t);
    void remove(T t);
    void update(T t);
    void create(T t);
}
