package com.zoom59rus.javacore.chapter15.cor;

import com.zoom59rus.javacore.chapter15.cor.dao.Role;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
public class User {
    private String login;
    private String password;
    private Role type;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.type = Role.NULL;
    }
}
