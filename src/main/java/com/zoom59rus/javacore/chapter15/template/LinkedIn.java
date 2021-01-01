package com.zoom59rus.javacore.chapter15.template;

public class LinkedIn extends SocialNetwork {
    @Override
    public boolean authentication(String login, String password) {
        System.out.println("Token authentication.");
        return true;
    }
}
