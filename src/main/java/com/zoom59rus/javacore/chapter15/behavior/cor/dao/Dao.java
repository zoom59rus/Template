package com.zoom59rus.javacore.chapter15.behavior.cor.dao;

import com.zoom59rus.javacore.chapter15.behavior.cor.User;

import java.util.Optional;

public interface Dao {
    Optional<User> getUserByName(User user);

    boolean disabledUser(User user);
}
