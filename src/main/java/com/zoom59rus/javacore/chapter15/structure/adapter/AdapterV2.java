package com.zoom59rus.javacore.chapter15.structure.adapter;

public class AdapterV2 implements SimpleApi {
    MyAdapteClass myClass;

    public AdapterV2(MyAdapteClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void upload() {
        myClass.uploadSomething();
    }

    @Override
    public void parse() {
        myClass.parseSomething();
    }

    @Override
    public void update() {
        myClass.updateSomething();
    }

    @Override
    public void remove() {
        myClass.removeSomething();
    }
}
