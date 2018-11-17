package com.steer.design.bridge;

/**
 * 九、桥接模式
 */
public class Main {
    //继承是强关系，委托是弱关系
    /**
     * 将 类的功能层次结构 和 类的实现层次结构 分开了，有利于独立于对它们分别进行扩展
     * @param args
     */
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello,China."));
        Display d2 = new CountDislay(new StringDisplayImpl("Hello,World."));
        CountDislay d3 = new CountDislay(new StringDisplayImpl("Hello, Universe."));

        d1.dislay();
        d2.dislay();
        d3.dislay();
        d3.multiDisplay(5);
    }
}
