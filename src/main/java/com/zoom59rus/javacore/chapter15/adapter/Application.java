package com.zoom59rus.javacore.chapter15.adapter;

public class Application {
    public static void main(String[] args) {
        SimpleApi simpleApi = new Adapter();
        SimpleApi simpleApi2 = new AdapterV2(new MyAdapteClass());

        simpleApi.update();
        simpleApi.parse();
        simpleApi.remove();
        simpleApi.upload();

        simpleApi2.upload();
        simpleApi2.remove();
        simpleApi2.parse();
        simpleApi2.update();
    }
}
