package com.zoom59rus.javacore.chapter15.singleton;

public class Application {
    public static void main(String[] args) {
        RestController restController = RestController.getInstance();
        System.out.println(restController.getSource("http://google.com"));
    }
}
