package com.zoom59rus.javacore.chapter15.builder.subsystem;

import lombok.Data;

@Data
public class Report {
    private String report;

    public Report() {
        this.report = "Я подсистема, печатаю дополнительные отчеты";
    }
}
