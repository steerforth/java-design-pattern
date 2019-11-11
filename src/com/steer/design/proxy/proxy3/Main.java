package com.steer.design.proxy.proxy3;

import com.steer.design.proxy.proxy2.Person;
import com.steer.design.proxy.proxy2.Student;

public class Main {

    /**
     * 基于cglib的动态代理
     * @param args
     */
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        Student student = new Student();
        student.setName("张三");
        Person person = (Person) proxy.newInstance(student);
        person.buy("酱油");
    }
}
