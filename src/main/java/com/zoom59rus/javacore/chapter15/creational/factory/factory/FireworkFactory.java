package com.zoom59rus.javacore.chapter15.creational.factory.factory;

import com.zoom59rus.javacore.chapter15.creational.factory.Actions;
import com.zoom59rus.javacore.chapter15.creational.factory.Color;
import com.zoom59rus.javacore.chapter15.creational.factory.Firework.Firework;
import com.zoom59rus.javacore.chapter15.creational.factory.Firework.FireworkImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FireworkFactory {

    public static List<Firework> getFireworkList(int n){
        List<Firework> fireworks = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            fireworks.add(getBluFirework());
            fireworks.add(getYellowFirework());
            fireworks.add(getPurpleFirework());
            fireworks.add(getGreenFirework());
            fireworks.add(getCyanFirework());
            fireworks.add(getRedFirework());
        }

        return fireworks;
    }

    public static FireworkImpl getBluFirework(){
        return new FireworkImpl(Color.BLUE.getCode(), Actions.BACH.getAction(),  getPosition());
    }

    public static FireworkImpl getYellowFirework(){
        return new FireworkImpl(Color.YELLOW.getCode(), Actions.TRAH.getAction(),  getPosition());
    }

    public static FireworkImpl getPurpleFirework(){
        return new FireworkImpl(Color.PURPLE.getCode(), Actions.TARARAH.getAction(),  getPosition());
    }

    public static FireworkImpl getGreenFirework(){
        return new FireworkImpl(Color.GREEN.getCode(), Actions.BUBUM.getAction(),  getPosition());
    }

    public static FireworkImpl getCyanFirework(){
        return new FireworkImpl(Color.CYAN.getCode(), Actions.TARARAH.getAction(),  getPosition());
    }

    public static FireworkImpl getRedFirework(){
        return new FireworkImpl(Color.RED.getCode(), Actions.TRAH.getAction(),  getPosition());
    }

    private static int getPosition(){
        return new Random().nextInt(45);
    }
}
