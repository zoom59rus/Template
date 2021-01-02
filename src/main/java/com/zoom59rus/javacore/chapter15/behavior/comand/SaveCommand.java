package com.zoom59rus.javacore.chapter15.behavior.comand;

import com.zoom59rus.javacore.chapter15.behavior.comand.dao.Database;

public class SaveCommand extends Command {
    public SaveCommand(Database database) {
        super(database);
    }

    @Override
    public boolean execute() {
        String str = "Test777";
        backup();
        super.database.save(str);

        return true;
    }
}
