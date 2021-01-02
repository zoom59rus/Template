package com.zoom59rus.javacore.chapter15.behavior.comand;

import com.zoom59rus.javacore.chapter15.behavior.comand.dao.Database;

public abstract class Command implements ICommand {
    protected Database database;
    private Database backup;

    public Command(Database database) {
        this.database = database;
    }

    public void backup(){
        this.backup = database.clone();
    }

    public void undo(){
        this.database = backup;
    }

    public abstract boolean execute();
}