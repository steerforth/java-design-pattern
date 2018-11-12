package com.steer.design.adapter.two;

/**
 * 二、适配器模式
 * 2.2使用委托的适配器
 */
public class Main {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
