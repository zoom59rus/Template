package com.zoom59rus.javacore.chapter15.template;

public class Odnoklassniki extends SocialNetwork {
    @Override
    public boolean authentication(String login, String password) {
        System.out.println("HTTP Basic authentication.");
        return false;
    }
}
