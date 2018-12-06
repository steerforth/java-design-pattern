package com.steer.design.singleton.one;

/**
 * 恶汉模式
 */
public class Student {
    private static Student student = new Student();
    //1.private
    private Student() {
        //防止反射破解;对懒汉模式没用，因为懒汉初始化时为null，第一次就反射即破解
        if (student != null){
            throw new RuntimeException("不允许反射破解");
        }
    }
    public static Student getInstance(){
        return student;
    }

    //防止反序列化破解
    public Object readResolve(){
        return student;
    }
}
