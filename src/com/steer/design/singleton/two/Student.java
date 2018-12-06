package com.steer.design.singleton.two;

public class Student {
    private static final Object obj = new Object();
    private volatile static Student student = null;

    private Student() {

    }

    public static Student getInstance(){
        if (student == null) {
            synchronized (obj){
                if (student == null)
                    student = new Student();
            }
        }
        return student;
    }

    //防止反序列化破解
    public Object readResolve(){
        return student;
    }
}
