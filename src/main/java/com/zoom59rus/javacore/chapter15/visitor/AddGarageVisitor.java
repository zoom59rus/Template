package com.zoom59rus.javacore.chapter15.visitor;

public class AddGarageVisitor implements Visitor {
    private String structurePart = "Гараж";

    @Override
    public void accept() {
    }

    @Override
    public void accept(Building building) {
        System.out.println(building.aboutMe() + " " + structurePart);
    }
}