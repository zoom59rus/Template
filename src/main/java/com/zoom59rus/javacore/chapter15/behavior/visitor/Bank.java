package com.zoom59rus.javacore.chapter15.behavior.visitor;

import java.util.Arrays;

public class Bank implements Building {
    private String name = "Банк";
    private String[] structure = new String[]{"Этажи", "Окна", "Двери", "Мебель", "Сейф"};
    @Override
    public String aboutMe() {
        return "Я " + name + ". У меня есть " + Arrays.toString(structure);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.action(this);
    }
}