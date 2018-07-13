package com.my.concurrent;

public class NoVisibility {
    public boolean ready;
    public int number;


    private class ReaderThread extends Thread {
        public void run() {
            while (!ready) {
                System.out.println("yield");
//                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        NoVisibility noVisibility = new NoVisibility();
        noVisibility.new ReaderThread().start();
//        new noVisibility.ReaderThread().start();
        noVisibility.number = 42;
        noVisibility.ready = true;
        System.out.println(" end ");
    }
}
