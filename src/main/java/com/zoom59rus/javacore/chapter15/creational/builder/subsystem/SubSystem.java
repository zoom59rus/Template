package com.zoom59rus.javacore.chapter15.creational.builder.subsystem;

import lombok.Data;

@Data
public class SubSystem {
    private MyProxy proxy;
    private MyDatabase database;
    private Os os;
    private Report report;

    public String userRepresentation(){
        return proxy + "\n" +
                "Используемое хранилище данных: " + database.toString() + "\n" +
                "Компиляция для системного ПО: " + os + "\n" +
                "Система расширенных отчетов: " + report;
    }
}
