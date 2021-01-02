package com.zoom59rus.javacore.chapter15.behavior.mediator.component;

import com.zoom59rus.javacore.chapter15.behavior.mediator.Component;
import com.zoom59rus.javacore.chapter15.behavior.mediator.factory.Event;
import com.zoom59rus.javacore.chapter15.behavior.mediator.Mediator;
import com.zoom59rus.javacore.chapter15.behavior.mediator.factory.EventFactory;

import java.util.ArrayList;
import java.util.List;

public class DividersNumber implements Component {
    private String componentName;
    private Mediator mediator;

    public DividersNumber() {
        this.componentName = "DividersNumber";
    }

    public List<Integer> getDividers(Integer num) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                result.add(i);
            }
        }
        sendEvent(EventFactory.getEvent(componentName, result));
        return result;
    }

    @Override
    public String getComponentName() {
        return componentName;
    }

    @Override
    public void registerMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void sendEvent(Event event) {
        mediator.event(event);
    }
}
