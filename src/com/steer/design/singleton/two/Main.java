package com.steer.design.singleton.two;

/**
 * 五、单例模式
 * 2.懒汉模式
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();
        if(student1 == student2){
            System.out.println("是相同实例");
        }else {
            System.out.println("不是相同实例");
        }
    }
}
