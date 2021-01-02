package com.zoom59rus.javacore.chapter15.behavior.memento.database;

import com.zoom59rus.javacore.chapter15.behavior.memento.Memento;

import java.util.Deque;
import java.util.LinkedList;

public class BackupStore {
    private Deque<Memento> backupStore;

    public BackupStore() {
        this.backupStore = new LinkedList<>();
    }

    public void rollback(Database database){
        database.rollback(backupStore.pop());
    }

    public void backup(Database database){
        backupStore.push(database.backup());
    }
}