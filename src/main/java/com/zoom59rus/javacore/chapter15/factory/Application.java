package com.zoom59rus.javacore.chapter15.factory;

import com.zoom59rus.javacore.chapter15.factory.Firework.Firework;
import com.zoom59rus.javacore.chapter15.factory.factory.FireworkFactory;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Firework> fireworkList = FireworkFactory.getFireworkList(100);
        fireworkList.forEach(Firework::run);
    }
}
