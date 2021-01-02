package com.zoom59rus.javacore.chapter15.structure.proxy;

public class Application {
    public static void main(String[] args) {
        String name = "Anton";
        String password = "123456";
        String password2 = "qwerty";

        AuthorityService authorityService = new ProxyAuthorityService();
        authorityService.login(name, password);
        authorityService.login(name, password2);
    }
}
