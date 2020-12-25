package com.zoom59rus.javacore.chapter15.flyweight.ammunition;

import lombok.Data;

@Data
public class Grenade {
    private Ammunition ammunition;
    private String ammoName;
    private Color color;

    public Grenade(Ammunition ammunition, String ammoName, Color color) {
        this.ammunition = ammunition;
        this.ammoName = ammoName;
        this.color = color;
    }
}
