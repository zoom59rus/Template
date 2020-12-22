package com.zoom59rus.javacore.chapter15.builder.mainsystem;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Delivery {
    private List<String> delivers;

    public Delivery() {
        this.delivers = new ArrayList<>();
    }

    public void add(String subsystemName){
        this.delivers.add(subsystemName);
    }

    public String getDelivery(){
        StringBuilder sb = new StringBuilder();
        sb.append("ОПИСАНИЕ ПОСТАВКИ: " + "\n");
        int n = 1;
        for (String s : this.delivers) {
            sb.append(n++).append(". ").append(s).append("\n");
        }

        return sb.toString();
    }
}
