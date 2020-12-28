package com.zoom59rus.javacore.chapter15.cor.filter;

import com.zoom59rus.javacore.chapter15.cor.IFilterChain;
import com.zoom59rus.javacore.chapter15.cor.User;

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