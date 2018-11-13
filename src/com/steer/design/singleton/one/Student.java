package com.steer.design.singleton.one;

/**
 * 恶汉模式
 */
public class Student {
    private static Student student = new Student();
    //1.private
    private Student() {
    }
    public static Student getInstance(){
        return student;
    }
}
