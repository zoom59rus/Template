package com.zoom59rus.javacore.chapter15.creational.builder.mainsystem;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class License {
    private String name;
    private Integer userCount;
    private Double price;

    @Override
    public String toString(){
        return "Лицензия: " + name + "\n" +
                "\tКоличество пользователей: " + userCount + "\n" +
                "\tСтоимость: " + price;
    }
}
