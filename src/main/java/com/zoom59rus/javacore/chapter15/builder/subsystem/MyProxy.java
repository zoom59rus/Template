package com.zoom59rus.javacore.chapter15.builder.subsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class MyProxy {
    private String host;
    private Integer port;


}
