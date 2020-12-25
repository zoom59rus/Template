package com.zoom59rus.javacore.chapter15.facade.library;

public interface Librarian {
    boolean findBook(String bookName);
    String getBook(String bookName);
    void addBook(String bookName);
}