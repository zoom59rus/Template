package com.zoom59rus.javacore.chapter15.structure.flyweight;

import com.zoom59rus.javacore.chapter15.structure.flyweight.ammunition.Bullet;
import com.zoom59rus.javacore.chapter15.structure.flyweight.ammunition.Color;
import com.zoom59rus.javacore.chapter15.structure.flyweight.ammunition.Type;

public class Application {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Bullet bullet = new Bullet(flyweightFactory.getAmmunition(Type.BULLET), "AK-47", Color.YELLOW, 1345.57);
        Bullet bullet2 = new Bullet(flyweightFactory.getAmmunition(Type.BULLET), "TT", Color.YELLOW, 1647.78);

        System.out.println(bullet.getAmmunition().hashCode());
        System.out.println(bullet2.getAmmunition().hashCode());
    }
}
