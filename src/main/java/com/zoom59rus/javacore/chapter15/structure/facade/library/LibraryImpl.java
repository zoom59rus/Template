package com.zoom59rus.javacore.chapter15.structure.facade.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryImpl implements Library{
    private List<String> collectionsBook;

    public LibraryImpl() {
        this.collectionsBook = new ArrayList<>();
        collectionsBook.add("Преступление и наказание");
        collectionsBook.add("Идиот");
        collectionsBook.add("Война и мир");
        collectionsBook.add("Муму");
        collectionsBook.add("Паттерны программирования");
        collectionsBook.add("Банды четырех");
        collectionsBook.add("Чистый код");
        collectionsBook.add("Java 8 Полное руководство");
    }

    public List<String> getCollectionsBook() {
        return collectionsBook;
    }

    @Override
    public boolean checkBook(String bookName) {
        return collectionsBook.contains(bookName);
    }

    @Override
    public void addBook(String bookName) {
        collectionsBook.add(bookName);
    }

    @Override
    public String getBook(String bookName) {
        if(checkBook(bookName)){
            String findBook = collectionsBook.stream()
                    .filter(b -> collectionsBook.equals(b))
                    .findFirst().orElse(null);
            removeBook(findBook);
            return findBook;
        }else return null;
    }

    @Override
    public boolean removeBook(String bookName) {
        return collectionsBook.remove(bookName);
    }
}
