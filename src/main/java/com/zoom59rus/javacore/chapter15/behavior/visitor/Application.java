package com.zoom59rus.javacore.chapter15.behavior.visitor;

public class Application {
    public static void main(String[] args) {
        Building factory = new Factory();
        Building home = new Home();
        Building bank = new Bank();

        System.out.println(factory.aboutMe());
        System.out.println(home.aboutMe());
        System.out.println(bank.aboutMe());

        System.out.println("\n=================================\n");

        System.out.println("Добавим гараж.");
        Visitor addGarage = new AddGarageVisitor();
        addGarage.action(factory);
        addGarage.action(home);
        addGarage.action(bank);

        System.out.println("\n=================================\n");

        TRK trk = new TRK();
        trk.add(factory);
        trk.add(home);
        trk.add(bank);

        trk.action();
    }
}
