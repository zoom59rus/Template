package com.zoom59rus.javacore.chapter15.cor;

import com.zoom59rus.javacore.chapter15.cor.dao.Source;
import com.zoom59rus.javacore.chapter15.cor.filter.Authentication;
import com.zoom59rus.javacore.chapter15.cor.filter.Authorization;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Source source = new Source();
        IFilterChain filterChain = new Authentication(source);
        filterChain.setNext(new Authorization(source));

        Scanner sc = new Scanner(System.in);
        System.out.print("Input login: ");
        String login = sc.nextLine();
        System.out.print("Input password: ");
        String password = sc.nextLine();
        User user = new User(login, password);

        filterChain.check(user);
    }
}