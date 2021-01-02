package com.zoom59rus.javacore.chapter15.behavior.visitor;

public class AddGarageVisitor implements Visitor {
    private String structurePart = "Гараж";

    @Override
    public void action() {
    }

    @Override
    public void action(Building building) {
        System.out.println(building.aboutMe() + " " + structurePart);
    }
}