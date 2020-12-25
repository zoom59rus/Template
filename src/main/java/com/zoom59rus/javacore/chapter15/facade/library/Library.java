package com.zoom59rus.javacore.chapter15.facade.library;

public interface Library {
    boolean checkBook(String bookName);
    void addBook(String bookName);
    String getBook(String bookName);
    boolean removeBook(String bookName);
}