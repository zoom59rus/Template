package com.zoom59rus.javacore.chapter15.creational.singleton;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public final class RestController {
    private static RestController restController;

    private RestController(){}

    public static synchronized RestController getInstance(){
        if(restController == null){
            restController = new RestController();
        }

        return restController;
    }

    public String getSource(String url){
        StringBuilder result = new StringBuilder();
        try {
            URLConnection urlConnection = new URL(url).openConnection();
            Scanner sc = new Scanner(urlConnection.getInputStream());
            while (sc.hasNext()){
                result.append(sc.nextLine());
            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }

        return result.toString();
    }
}
