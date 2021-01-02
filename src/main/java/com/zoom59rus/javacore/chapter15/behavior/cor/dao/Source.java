package com.zoom59rus.javacore.chapter15.behavior.cor.dao;

import com.zoom59rus.javacore.chapter15.behavior.cor.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Source implements Dao{
    private List<User> source;
    private List<User> disabledUser;

    public Source() {
        this.source = new ArrayList<>();
        this.disabledUser = new ArrayList<>();
        source.add(new User("admin", "123456"));
        source.add(new User("user1", "qwerty"));
        source.add(new User("user2", "qazxsw"));
        source.add(new User("user3", "zxcvbn"));
        disabledUser.add(new User("user2", "qazxsw"));
    }

    @Override
    public Optional<User> getUserByName(User user) {
        return source.stream().filter(u -> u.getLogin().equals(user.getLogin())).findFirst();
    }

    @Override
    public boolean disabledUser(User user) {
        return disabledUser.contains(user);
    }
}
