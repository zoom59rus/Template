package com.zoom59rus.javacore.chapter15.behavior.cor.filter;

import com.zoom59rus.javacore.chapter15.behavior.cor.IFilterChain;
import com.zoom59rus.javacore.chapter15.behavior.cor.User;

public abstract class ChainFilter implements IFilterChain {
    private ChainFilter next;

    public ChainFilter setNext(ChainFilter next){
        this.next = next;
        return next;
    }

    public abstract boolean check(User user);

    protected boolean checkNext(User user){
        if(next == null){
            return false;
        }

        return next.check(user);
    }
}