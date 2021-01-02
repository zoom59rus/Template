package com.zoom59rus.javacore.chapter15.behavior.cor;

import com.zoom59rus.javacore.chapter15.behavior.cor.filter.ChainFilter;

public interface IFilterChain {
    ChainFilter setNext(ChainFilter next);
    boolean check(User user);
}
