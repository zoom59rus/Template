package com.zoom59rus.javacore.chapter15.behavior.memento;


import lombok.Data;

@Data
public class User {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer cityId;

    public User(Integer id, String firstName, String lastName, Integer cityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cityId = cityId;
    }
}
