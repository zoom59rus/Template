package com.zoom59rus.javacore.chapter15.structure.facade;

import lombok.Data;

@Data
public class ReadUser {
    private String userName;
    private String findBook;
    private String book;

    public ReadUser(String userName, String bookName) {
        this.userName = userName;
        this.findBook = bookName;
    }

    public String getUserName() {
        return userName;
    }

    public void getFindBook(String findBook) {
        this.book = findBook;
    }
}
