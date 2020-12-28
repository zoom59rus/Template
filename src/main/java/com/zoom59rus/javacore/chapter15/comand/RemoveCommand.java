package com.zoom59rus.javacore.chapter15.comand;

import com.zoom59rus.javacore.chapter15.comand.dao.Database;

public class RemoveCommand extends Command {

    public RemoveCommand(Database database) {
        super(database);
    }

    @Override
    public boolean execute() {
        backup();
        super.database.remove("1");
        return true;
    }
}
