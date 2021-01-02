package com.zoom59rus.javacore.chapter15.creational.factory;

import com.zoom59rus.javacore.chapter15.creational.factory.Firework.Firework;
import com.zoom59rus.javacore.chapter15.creational.factory.factory.FireworkFactory;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Firework> fireworkList = FireworkFactory.getFireworkList(100);
        fireworkList.forEach(Firework::run);
    }
}
