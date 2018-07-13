package com.my.algorithm.design.pattern.chain;

public interface Chain {
    void setNext(Chain chain);
    void process(Number number);
}
