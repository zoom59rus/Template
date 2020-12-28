package com.zoom59rus.javacore.chapter15.cor;

import com.zoom59rus.javacore.chapter15.cor.filter.ChainFilter;

public interface IFilterChain {
    ChainFilter setNext(ChainFilter next);
    boolean check(User user);
}
