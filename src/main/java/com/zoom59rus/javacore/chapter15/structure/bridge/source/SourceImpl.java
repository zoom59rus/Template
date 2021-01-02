package com.zoom59rus.javacore.chapter15.structure.bridge.source;

import com.zoom59rus.javacore.chapter15.structure.bridge.Source;

public abstract class SourceImpl implements Source {
    private String dbName;

    public SourceImpl(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void save() {
        System.out.println("Сохранение в " + dbName);
    }

    @Override
    public void remove() {
        System.out.println("Удаление из " + dbName);

    }

    @Override
    public void update() {
        System.out.println("Обновление в " + dbName);

    }

    @Override
    public void create() {
        System.out.println("Создание в " + dbName);

    }
}
