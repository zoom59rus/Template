package com.zoom59rus.javacore.chapter15.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

public class TRK implements Visitor {
    private String name = "Торгово - развдекательный центр";
    private List<Building> trkPart;

    public TRK() {
        this.trkPart = new ArrayList<>();
    }

    public void add(Building building){
        this.trkPart.add(building);
    }

    @Override
    public void action() {
        System.out.println("Я " + name + ". Я содержу слежующие отделы: ");
        for (Building building : this.trkPart) {
            action(building);
        }
    }

    @Override
    public void action(Building building) {
        System.out.println(building.aboutMe());
    }
}
