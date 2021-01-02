package com.zoom59rus.javacore.chapter15.behavior.comand;

import com.zoom59rus.javacore.chapter15.behavior.comand.dao.Database;

public class Application {
    public static void main(String[] args) {
        Database database = new Database();
        Invoker invoker = new Invoker(
                new GetCommand(database),
                new SaveCommand(database),
                new RemoveCommand(database),
                new UpdateCommand(database)
        );

        invoker.save();
        invoker.save();
        invoker.save();
        invoker.save();

        invoker.printUndo();

        invoker.get();
        invoker.remove();
        invoker.remove();

        invoker.printUndo();

        invoker.save();
        invoker.update();

        invoker.printUndo();
    }
}
