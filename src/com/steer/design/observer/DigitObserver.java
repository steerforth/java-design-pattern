package com.steer.design.observer;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver:"+((RandomNumberGenerator)generator).getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
