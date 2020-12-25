package com.zoom59rus.javacore.chapter15.flyweight.ammunition;

import lombok.Data;

@Data
public class Torpedo {
    private Ammunition ammunition;
    private String ammoName;
    private Double speed;
    private Color color;

    public Torpedo(Ammunition ammunition, String ammoName, Double speed, Color color) {
        this.ammunition = ammunition;
        this.ammoName = ammoName;
        this.speed = speed;
        this.color = color;
    }
}
