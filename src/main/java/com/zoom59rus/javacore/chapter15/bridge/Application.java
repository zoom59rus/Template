package com.zoom59rus.javacore.chapter15.bridge;

import com.zoom59rus.javacore.chapter15.bridge.client.User;
import com.zoom59rus.javacore.chapter15.bridge.source.MsSql;
import com.zoom59rus.javacore.chapter15.bridge.source.OracleDB;

public class Application {
    public static void main(String[] args) {
        Client<String> client = new User(new OracleDB());
        Client<String> client2 = new User(new MsSql());
        Client<String> tmpClient;

        client.create("cr");
        client.update("up");

        tmpClient = client2;
        client2 = client;
        client = tmpClient;

        client.remove("rm");
        client.save("sv");


        client2.create("c");
        client2.update("u");

        client2 = client;

        client2.remove("r");
        client2.save("s");
    }
}
