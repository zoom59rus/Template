package com.zoom59rus.javacore.chapter15.behavior.memento.database;

import com.zoom59rus.javacore.chapter15.behavior.memento.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTable implements Table<User> {
    private List<User> users;

    public UserTable() {
        this.users = new ArrayList<>();
    }

    private UserTable(UserTable userTable){
        this.users = new ArrayList<>(userTable.users);
    }

    @Override
    public User getRow(Integer id) {
        return users.get(id);
    }

    @Override
    public Integer save(User user) {
        int id = users.size();
        if(users.contains(user)){
            System.out.println("Запись существует.");
            return -1;
        }
        user.setId(id);
        users.add(id, user);

        return id;
    }

    @Override
    public Map<Integer, User> getAll() {
        Map<Integer, User> all = new HashMap<>();
        for (int i = 0; i < users.size(); i++) {
            all.put(i, users.get(i));
        }

        return all;
    }

    @Override
    public Table clone(){
        return new UserTable(this);
    }
}
