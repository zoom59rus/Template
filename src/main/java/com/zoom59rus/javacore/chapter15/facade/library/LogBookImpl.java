package com.zoom59rus.javacore.chapter15.facade.library;

import lombok.Data;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LogBookImpl implements LogBook {
    private List<Log> logList;

    public LogBookImpl() {
        this.logList = new LinkedList<>();
    }

    @Override
    public void getBook(String bookName, String readerName) {
        logList.add(new Log(bookName, readerName, new Date()));
    }

    @Override
    public void addBook(String bookName, String readerName) {
        logList.add(new Log(bookName, readerName, new Date()));
    }

    @Data
    private class Log {
        private String bookName;
        private String readerName;
        private Date date;

        public Log(String bookName, String readerName, Date date) {
            this.bookName = bookName;
            this.readerName = readerName;
            this.date = date;
        }
    }
}
