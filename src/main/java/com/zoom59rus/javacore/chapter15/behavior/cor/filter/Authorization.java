package com.zoom59rus.javacore.chapter15.behavior.cor.filter;

import com.zoom59rus.javacore.chapter15.behavior.cor.User;
import com.zoom59rus.javacore.chapter15.behavior.cor.dao.Role;
import com.zoom59rus.javacore.chapter15.behavior.cor.dao.Dao;
import com.zoom59rus.javacore.chapter15.behavior.cor.dao.Source;

public class Authorization extends ChainFilter {
    private Dao source;

    public Authorization(Source source) {
        this.source = source;
    }

    @Override
    public boolean check(User user) {
        if(source.disabledUser(user)){
            System.out.println("User not active status or disabled");
            return false;
        }
        if(user.getLogin().equals("admin")){
            user.setType(Role.ADMIN);
            System.out.println("Hello, Admin");
            return checkNext(user);
        }

        user.setType(Role.USER);
        System.out.println("Hello, user");
        return checkNext(user);
    }
}