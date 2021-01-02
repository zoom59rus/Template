package com.zoom59rus.javacore.chapter15.structure.flyweight;

import com.zoom59rus.javacore.chapter15.structure.flyweight.ammunition.Ammunition;
import com.zoom59rus.javacore.chapter15.structure.flyweight.ammunition.Type;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<Type, Ammunition> ammunitionMap;

    public FlyweightFactory() {
        this.ammunitionMap = new HashMap<>();
    }

    public Ammunition getAmmunition(Type type){
        Ammunition amo = ammunitionMap.get(type);
        if(amo == null){
            amo = new Ammunition(7.42, 0.146, type);
            ammunitionMap.put(type, amo);
        }

        return amo;
    }
}