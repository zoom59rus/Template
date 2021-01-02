package com.zoom59rus.javacore.chapter15.behavior.template;

public class Application {
    public static void main(String[] args) {
        SocialNetwork vk = new Vk();
        SocialNetwork linkedIn = new LinkedIn();
        SocialNetwork odnoklassniki = new Odnoklassniki();

        vk.login();
        linkedIn.login();
        odnoklassniki.login();

    }
}
