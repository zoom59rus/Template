package com.zoom59rus.javacore.chapter15.creational.builder.mainsystem;

import com.zoom59rus.javacore.chapter15.creational.builder.subsystem.SubSystem;
import lombok.Data;

@Data
public class MySystemImpl implements MySystem {
    private String name;
    private String description;
    private Float version;
    private License license;
    private SubSystem subsystem;
    private Delivery delivery;

    public MySystemImpl() {
        this.delivery = new Delivery();
    }

    @Override
    public void work() {
        System.out.println("Система запущена, и работает...");
    }

    @Override
    public String descriptionSystem() {
        return delivery.getDelivery();
    }
}