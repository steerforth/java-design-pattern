package com.steer.design.bridge;

/**
 * 改善后的抽象化
 */
public class CountDislay extends Display {
    public CountDislay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
