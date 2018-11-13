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
                    return new Student();
            }
        }
        return student;
    }
}
