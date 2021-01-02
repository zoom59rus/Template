package com.zoom59rus.javacore.chapter15.behavior.visitor;

import java.util.Arrays;

public class Factory implements Building {
    private String name = "Завод";
    private String[] structure = new String[]{"Этажи", "Окна", "Двери", "Станки"};

    public String aboutMe(){
        return "Я " + name + ". У меня есть " + Arrays.toString(structure);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.action(this);
    }
}