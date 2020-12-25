package com.zoom59rus.javacore.chapter15.facade.library;

public class LibrarianImpl implements Librarian {
    private String name;
    private String books;
    private Library library;

    public LibrarianImpl(LibraryImpl library) {
        this.name = "";
        this.books = "";
        this.library = library;
    }

    @Override
    public boolean findBook(String bookName) {
        return library.checkBook(bookName);
    }

    @Override
    public String getBook(String bookName) {
        if(findBook(bookName)){
            return library.getBook(bookName);
        }else return null;
    }

    @Override
    public void addBook(String bookName) {
        library.addBook(bookName);
    }
}