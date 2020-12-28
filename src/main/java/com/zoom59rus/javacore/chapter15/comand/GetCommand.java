package com.zoom59rus.javacore.chapter15.comand;

import com.zoom59rus.javacore.chapter15.comand.dao.Database;

public class GetCommand extends Command {

    public GetCommand(Database database) {
        super(database);
    }

    @Override
    public boolean execute() {
        String result = database.get(1);
        if(result != null){
            System.out.println("Find - " + result);
            return true;
        }else return false;
    }
}