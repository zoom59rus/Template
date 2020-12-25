package com.zoom59rus.javacore.chapter15.flyweight.ammunition;

import lombok.Data;

@Data
public class Shell {
    private Ammunition ammunition;
    private String ammoName;
    private Color color;
    private Double speed;

    public Shell(Ammunition ammunition, String ammoName, Color color, Double speed) {
        this.ammunition = ammunition;
        this.ammoName = ammoName;
        this.color = color;
        this.speed = speed;
    }
}
