package com.zoom59rus.javacore.chapter15.structure.facade;

import com.zoom59rus.javacore.chapter15.structure.facade.library.LibrarianImpl;
import com.zoom59rus.javacore.chapter15.structure.facade.library.LibraryImpl;
import com.zoom59rus.javacore.chapter15.structure.facade.library.LogBookImpl;

public class Application {
    public static void main(String[] args) {
        Facade facade = new FacadeImpl(new LibrarianImpl(new LibraryImpl()), new LogBookImpl());
        ReadUser user = new ReadUser("Вася", "Банды четырех");
        user.setBook(facade.getBook(user));

        System.out.println(user.getBook());
    }
}
