package com.my.algorithm.design.pattern.chain;

public class NegativeProcessor implements Chain {
    private Chain nextChain;
    @Override
    public void setNext(Chain chain) {
        this.nextChain = chain;
    }

    @Override
    public void process(Number number) {
        if (number.getNumber() < 0) {
            System.out.println("负数");
        }else {
            if (nextChain != null) {
                nextChain.process(number);
            }
        }
    }
}
