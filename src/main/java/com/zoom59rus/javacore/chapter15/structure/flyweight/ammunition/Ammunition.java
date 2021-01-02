package com.zoom59rus.javacore.chapter15.structure.flyweight.ammunition;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public final class Ammunition {
    private Double caliber;
    private Double weight;
    private Type type;

    public Ammunition(Double caliber, Double weight, Type type) {
        this.caliber = caliber;
        this.weight = weight;
        this.type = type;
    }

    public Double getCaliber() {
        return caliber;
    }

    public Double getWeight() {
        return weight;
    }

    public Type getType() {
        return type;
    }
}
