package com.zoom59rus.javacore.chapter15.mediator.factory;

import java.util.List;

public class EventFactory {

    public static Event getEvent(String invoker, Object o){
        return new EventImpl(invoker, o);
    }

    public static Event getEvent(String invoker, List<Object> oList){
        return new EventList(invoker, oList);
    }
}