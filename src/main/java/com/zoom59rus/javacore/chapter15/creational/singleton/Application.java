package com.zoom59rus.javacore.chapter15.creational.singleton;

public class Application {
    public static void main(String[] args) {
        RestController restController = RestController.getInstance();
        System.out.println(restController.getSource("http://google.com"));

        RestController restController1 = RestController.getInstance();
        System.out.println(restController1.getSource("http://mail.ru"));

        System.out.println("Hash restController: " + restController.hashCode());
        System.out.println("Hash restController1: " + restController1.hashCode());
    }
}
