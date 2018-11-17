package com.steer.design.bridge;

/**
 * 定义了类的功能层级结构
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawClose();
    }

    public final void dislay(){
        open();
        print();
        close();
    }
}
