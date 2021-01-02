package com.zoom59rus.javacore.chapter15.behavior.memento;

import lombok.Data;

@Data
public class City{
    private Integer id;
    private String name;
    private Integer userId;

    public City(Integer id, String name, Integer userId) {
        this.id = id;
        this.name = name;
        this.userId = userId;
    }
}
