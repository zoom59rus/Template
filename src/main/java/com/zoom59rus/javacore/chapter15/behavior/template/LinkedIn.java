package com.zoom59rus.javacore.chapter15.behavior.template;

public class LinkedIn extends SocialNetwork {
    @Override
    public boolean authentication(String login, String password) {
        System.out.println("Token authentication.");
        return true;
    }
}
