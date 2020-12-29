package com.zoom59rus.javacore.chapter15.mediator.factory;

import lombok.Data;

import java.util.List;

@Data
public class EventList implements Event<List<Object>>{
    private String invoker;
    private List<Object> oList;

    public EventList(String invoker, List<Object> oList) {
        this.invoker = invoker;
        this.oList = oList;
    }

    @Override
    public List<Object> getEvent() {
        return oList;
    }
}
