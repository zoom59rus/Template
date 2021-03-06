package com.zoom59rus.javacore.chapter15.behavior.comand;

import com.zoom59rus.javacore.chapter15.behavior.comand.dao.Database;

public class UpdateCommand extends Command {
    public UpdateCommand(Database database) {
        super(database);
    }

    @Override
    public boolean execute() {
        backup();
        super.database.update(0, "test2");

        return true;
    }
}
