package com.zoom59rus.javacore.chapter15.structure.facade;

import com.zoom59rus.javacore.chapter15.structure.facade.library.*;

public class FacadeImpl implements Facade {

    private Librarian librarian;
    private LogBook logBook;

    public FacadeImpl(LibrarianImpl librarian, LogBookImpl logBook) {
        this.librarian = librarian;
        this.logBook = logBook;
    }

    @Override
    public String getBook(ReadUser readUser) {
        if(librarian.findBook(readUser.getFindBook())){
            logBook.getBook(readUser.getFindBook(), readUser.getUserName());
            return librarian.getBook(readUser.getFindBook());
        }else return null;
    }

    @Override
    public void addBook(ReadUser readUser, String bookName) {
        logBook.addBook(bookName, readUser.getUserName());
        librarian.addBook(bookName);
    }
}
