package com.steer.design.singleton.one;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 五、单例模式
 * 1.恶汉模式
 */
public class Main {
    /**
     *枚举方式写单例
     * @param args
     */
    public static void main(String[] args) {
        Student student1 = Student.getInstance();
        Student student2 = Student.getInstance();
        if (student1 == student2){
            System.out.println("是相同实例");
        }else {
            System.out.println("不是相同实例");
        }

        //反射调用私有构造器
        try {
            Class<com.steer.design.singleton.one.Student> clz = (Class<com.steer.design.singleton.one.Student>) Class.forName("com.steer.design.singleton.one.Student");
            Constructor<Student> constructor = clz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Student student3 = constructor.newInstance();
            Student student4 = constructor.newInstance();
            if(student3 == student4){
                System.out.println("学生3和学生4是相同实例");
            }else {
                System.out.println("学生3和学生4不是相同实例");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
