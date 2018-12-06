package com.steer.design.singleton.two;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 五、单例模式
 * 2.懒汉模式
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();
        if(student1 == student2){
            System.out.println("学生1和学生2是相同实例");
        }else {
            System.out.println("学生1和学生2不是相同实例");
        }

//        //反射调用私有构造器
//        try {
//            Class<Student> clz = (Class<Student>) Class.forName("com.steer.design.singleton.two.Student");
//            Constructor<Student> constructor = clz.getDeclaredConstructor(null);
//            constructor.setAccessible(true);
//            Student student3 = constructor.newInstance();
//            Student student4 = constructor.newInstance();
//            if(student3 == student4){
//                System.out.println("学生3和学生4是相同实例");
//            }else {
//                System.out.println("学生3和学生4不是相同实例");
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
    }
}
