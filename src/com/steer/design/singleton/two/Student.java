package com.steer.design.singleton.two;

public class Student {
    private static final Object obj = new Object();
    /**
     * 必须要加volatile,可以防止指令重排
     */
    private volatile static Student student = null;

    private Student() {

    }

    public static Student getInstance(){
        if (student == null) {
            synchronized (obj){
                if (student == null)
                /**
                 * jvm指令分3部
                 * 1.alloc分配内存
                 * 2.初始化赋值
                 * 3.student指向分配空间
                 *
                 * 2，3步骤替换不会改变最后执行结果，所以可能会发生指令重排。
                 * 导致其他线程等到的student不为空，但未初始化值的对象，直接return了
                 */
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
