package com.zoom59rus.javacore.chapter15.structure.facade;

public interface Facade {
    String getBook(ReadUser readUser);
    void addBook(ReadUser readUser, String bookName);

}
