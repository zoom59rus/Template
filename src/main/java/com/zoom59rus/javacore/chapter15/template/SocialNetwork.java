package com.zoom59rus.javacore.chapter15.template;

import java.util.Scanner;

public abstract class SocialNetwork {

    public void login(){
        System.out.print("Введите имя пользователя: ");
        Scanner sc = new Scanner(System.in);
        String login = sc.nextLine();
        System.out.print("Введите пароль: ");
        String password = sc.nextLine();
        if(authentication(login, password)){
            System.out.println("Доро пожаловать");
            return;
        }

        System.out.println("Не правильное имя пользователя или пароль.");
    }

    public abstract boolean authentication(String login, String password);
}
