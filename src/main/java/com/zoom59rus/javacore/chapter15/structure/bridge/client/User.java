package com.zoom59rus.javacore.chapter15.structure.bridge.client;

import com.zoom59rus.javacore.chapter15.structure.bridge.Client;
import com.zoom59rus.javacore.chapter15.structure.bridge.Source;

public class User implements Client<String> {
    private Source source;

    public User(Source source) {
        this.source = source;
    }

    @Override
    public void save(String s) {
        System.out.println("Вызов метода сохранения из клиента для объекта " + s);
        source.save();
    }

    @Override
    public void remove(String s) {
        System.out.println("Вызов метода удаления из клиента для объекта " + s);
        source.remove();
    }

    @Override
    public void update(String s) {
        System.out.println("Вызов метода обновления из клиента для объекта " + s);
        source.update();
    }

    @Override
    public void create(String s) {
        System.out.println("Вызов метода создания из клиента для объекта " + s);
        source.create();
    }
}
