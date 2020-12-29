package com.zoom59rus.javacore.chapter15.mediator.component;

import com.zoom59rus.javacore.chapter15.mediator.Component;
import com.zoom59rus.javacore.chapter15.mediator.factory.Event;
import com.zoom59rus.javacore.chapter15.mediator.Mediator;
import com.zoom59rus.javacore.chapter15.mediator.factory.EventFactory;

import java.util.Random;

public class NumberGenerate implements Component {
    private String componentName;
    private Mediator mediator;

    public NumberGenerate() {
        this.componentName = "NumberGenerate";
    }

    public Integer genDecimal(){
        Integer result = new Random().nextInt(50);
        sendEvent(EventFactory.getEvent(componentName, result));
        return result;
    }

    @Override
    public void sendEvent(Event event) {
        mediator.event(event);
    }

    @Override
    public String getComponentName() {
        return componentName;
    }

    @Override
    public void registerMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}