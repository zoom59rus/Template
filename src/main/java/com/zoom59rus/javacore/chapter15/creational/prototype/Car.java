package com.zoom59rus.javacore.chapter15.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class Car implements MyPrototype {
    private String marka;
    private String model;
    private String color;
    private Integer speed;

    public Car(Car target) {
        this.marka = target.marka;
        this.model = target.model;
        this.color = target.color;
        this.speed = target.speed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
