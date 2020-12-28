package com.zoom59rus.javacore.chapter15.cor.dao;

import com.zoom59rus.javacore.chapter15.cor.User;

import java.util.Optional;

public interface Dao {
    Optional<User> getUserByName(User user);

    boolean disabledUser(User user);
}
