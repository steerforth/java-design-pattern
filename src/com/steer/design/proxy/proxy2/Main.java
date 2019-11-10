package com.steer.design.proxy.proxy2;

public class Main {
    /**
     * 基于JDK动态代理
     * @param args
     */
    public static void main(String[] args) {
        StudentProxy proxy = new StudentProxy();
        Person obj = (Person) proxy.newInstance(new Student("小明"));
        obj.buy();
    }
}
