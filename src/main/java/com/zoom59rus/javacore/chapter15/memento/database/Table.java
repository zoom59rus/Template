package com.zoom59rus.javacore.chapter15.memento.database;

import java.util.Map;

public interface Table<T> {
    T getRow(Integer id);
    Integer save(T row);
    Map<Integer, T> getAll();
    Table<T> clone();
}