package com.zoom59rus.javacore.chapter15.behavior.comand.dao;

import com.zoom59rus.javacore.chapter15.behavior.comand.ICommand;

import java.util.Deque;
import java.util.LinkedList;

public class BackUp {
    private Deque<ICommand> backup;

    public BackUp() {
        this.backup = new LinkedList<>();
    }

    public void push(ICommand command){
        backup.push(command);
    }

    public ICommand pop(){
        return backup.pop();
    }

    public Deque<ICommand> getBackup(){
        return  backup;
    }
}
