package com.steer.design.facade;

/**
 * 十五、外观模式
 */
public class Main {
    /**
     * 提供一个统一的接口 供客户端使用
     * @param args
     */
    public static void main(String[] args) {
        PageMaker.makeWelcomePage("fangwk@qq.com","welcome.html");
    }
}
