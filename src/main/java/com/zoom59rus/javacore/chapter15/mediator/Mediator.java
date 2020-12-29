package com.zoom59rus.javacore.chapter15.mediator;

import com.zoom59rus.javacore.chapter15.mediator.factory.Event;

public interface Mediator {
    void registerComponent(Component component);
    void event(Event event);
}
