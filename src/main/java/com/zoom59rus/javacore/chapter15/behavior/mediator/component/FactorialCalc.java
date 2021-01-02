package com.zoom59rus.javacore.chapter15.behavior.mediator.component;

import com.zoom59rus.javacore.chapter15.behavior.mediator.Component;
import com.zoom59rus.javacore.chapter15.behavior.mediator.factory.Event;
import com.zoom59rus.javacore.chapter15.behavior.mediator.Mediator;
import com.zoom59rus.javacore.chapter15.behavior.mediator.factory.EventFactory;

public class FactorialCalc implements Component {
    private String componentName;
    private Mediator mediator;

    public FactorialCalc() {
        this.componentName = "FactorialCalc";
    }

    public Integer factorialCalc(Integer num){
        if(num <= 1) {
            return num;
        }else return num * factorialCalc(num - 1);
    }

    public void calc(Integer num){
        Integer result = factorialCalc(num);
        sendEvent(EventFactory.getEvent(componentName, result));
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
