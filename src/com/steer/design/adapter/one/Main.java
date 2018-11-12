package com.steer.design.adapter.one;

/**
 * 二、适配器模式
 * 2.1使用继承的适配器
 */
public class Main {
    /**
     *1.透明：
     *   通过适配器，客户端可以调用同一接口
     *2.重用
     *   复用了现存的类，解决了现存类和复用环境不一致的问题
     *3.低耦合
     *   将目标类和适配器类解耦，通过引入一个适配器类重用现有的适配者类，而无须修改原来的代码，复合开闭原则
     * @param args
     */
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
