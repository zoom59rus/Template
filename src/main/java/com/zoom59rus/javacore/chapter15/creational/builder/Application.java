package com.zoom59rus.javacore.chapter15.creational.builder;

import com.zoom59rus.javacore.chapter15.creational.builder.mainsystem.License;
import com.zoom59rus.javacore.chapter15.creational.builder.mainsystem.MySystem;
import com.zoom59rus.javacore.chapter15.creational.builder.subsystem.*;

/**
 * У компании разработчика существует своя система бухгалтерского учета.
 * Система имеет базовый функционал, т.е. минимальный набор компонентов, позволяющий использовать ее.
 * Создать класс сборщика системы, позволяющий задавать разные конфигурации поставляемой системы.
 */



public class Application {
    public static void main(String[] args) {
        SubSystem subSystem = new SubSystemBuilder()
                .setProxy("32.145.34.190", 8888)
                .setDatabase(MyDatabase.POSTGRES)
                .setOs(Os.LINUX)
                .setReport(new Report())
                .build();

        MySystem mySystem = new SystemBuilderImpl()
                .setName("Автоматизированная система Бухгалтер.")
                .setVersion(1.0F)
                .setDescription("Данная система предназначена для учета хозяйственной деятельности на предприятии.")
                .setLicense(new License("Базовая", 1, 3600.00))
                .setSubSystem(subSystem)
                .build();

        mySystem.work();
        System.out.println(mySystem.descriptionSystem());
    }
}