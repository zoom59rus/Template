package com.zoom59rus.javacore.chapter15.behavior.template;

public class Vk extends SocialNetwork {

    @Override
    public boolean authentication(String login, String password) {
        System.out.println("OAuth authentication.");
        return true;
    }
}
