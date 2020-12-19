package com.zoom59rus.javacore.chapter15.factory.Firework;

public class FireworkImpl implements Firework {
    private String color;
    private String action;
    private int position;

    public FireworkImpl(String color, String action, int position) {
        this.color = color;
        this.action = action;
        this.position = position;
    }

    public void run() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < position; i++) {
            sb.append("\t");
        }
        System.out.println(sb + color + action);
    }
}