package com.steer.design.proxy.proxy2;

public class Student implements Person {
    private String name;

    @Override
    public void buy(String goods) {
        System.out.println(name+"买了"+goods);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
