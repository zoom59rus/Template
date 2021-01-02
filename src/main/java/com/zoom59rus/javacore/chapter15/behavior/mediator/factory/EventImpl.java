package com.zoom59rus.javacore.chapter15.behavior.mediator.factory;

import lombok.Data;

@Data
public class EventImpl<Object> implements Event{
    private String invoker;
    private Object event;

    public EventImpl(String invoker, Object event) {
        this.invoker = invoker;
        this.event = event;
    }
}