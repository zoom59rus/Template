package com.zoom59rus.javacore.chapter15.comand;

import com.zoom59rus.javacore.chapter15.comand.dao.BackUp;

public class Invoker {
    private ICommand get;
    private ICommand save;
    private ICommand remove;
    private ICommand update;
    private BackUp backUp;

    public Invoker(ICommand get, ICommand save, ICommand remove, ICommand update) {
        this.get = get;
        this.save = save;
        this.remove = remove;
        this.update = update;
        this.backUp = new BackUp();
    }

    public void save(){
        save.execute();
        backUp.push(save);
    }

    public void get(){
        get.execute();
        backUp.push(get);
    }

    public void remove(){
        remove.execute();
        backUp.push(remove);
    }

    public void update(){
        update.execute();
        backUp.push(update);
    }

    public void printUndo(){
        Command command = (Command) backUp.pop();
        for (String s : command.database.getLog()) {
            System.out.println(s);
        }
    }
}
