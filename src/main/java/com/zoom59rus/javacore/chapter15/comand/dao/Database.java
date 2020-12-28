package com.zoom59rus.javacore.chapter15.comand.dao;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<String> log;

    public Database() {
        this.log = new ArrayList<>();
    }

    public Database(Database database){
        this.log = database.log;
    }

    public void save(String str){
        log.add(str);
    }

    public void remove(String str){
        log.remove(str);
    }

    public void update(Integer num, String str){
        log.set(num, str);
    }

    public String get(Integer num){
        return log.get(num);
    }

    public Database clone(){
        return new Database(this);
    }

    public List<String> getLog(){
        return log;
    }
}
