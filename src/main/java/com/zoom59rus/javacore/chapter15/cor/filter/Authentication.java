package com.zoom59rus.javacore.chapter15.cor.filter;

import com.zoom59rus.javacore.chapter15.cor.User;
import com.zoom59rus.javacore.chapter15.cor.dao.Dao;
import com.zoom59rus.javacore.chapter15.cor.dao.Source;
import com.zoom59rus.javacore.chapter15.cor.filter.ChainFilter;

public class Authentication extends ChainFilter {
    private Dao source;

    public Authentication(Source source) {
        this.source = source;
    }

    public ChainFilter setNext(ChainFilter next) {
        super.setNext(next);
        return next;
    }

    @Override
    public boolean check(User user) {
        User findUser = source.getUserByName(user).orElse(null);

        if (findUser == null || findUser.getPassword() == null) {
            System.out.println("Authentication filed");
            return false;
        }

        if (findUser.getPassword().equals(user.getPassword())) {
            System.out.println("Authentication complete");
            return checkNext(user);
        }

        return false;
    }
}
