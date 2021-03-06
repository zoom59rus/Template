package com.zoom59rus.javacore.chapter15.behavior.mediator;

import com.zoom59rus.javacore.chapter15.behavior.mediator.factory.Event;

public interface Component {
    String getComponentName();
    void registerMediator(Mediator mediator);
    void sendEvent(Event event);
}
