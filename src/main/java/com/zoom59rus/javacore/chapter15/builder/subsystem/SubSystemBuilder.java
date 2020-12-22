package com.zoom59rus.javacore.chapter15.builder.subsystem;

public class SubSystemBuilder {
    private SubSystem subSystem = new SubSystem();

    public SubSystemBuilder setProxy(String host, Integer port){
        subSystem.setProxy(new MyProxy(host, port));
        return this;
    }

    public SubSystemBuilder setDatabase(MyDatabase myDatabase){
        subSystem.setDatabase(myDatabase);
        return this;
    }

    public SubSystemBuilder setOs(Os os){
        subSystem.setOs(os);
        return this;
    }

    public SubSystemBuilder setReport(Report report){
        subSystem.setReport(report);
        return this;
    }

    public SubSystem build(){
        return this.subSystem;
    }
}