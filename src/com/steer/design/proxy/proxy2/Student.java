package com.steer.design.proxy.proxy2;

public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void buy() {
        System.out.println(name+"买了");
    }
}
