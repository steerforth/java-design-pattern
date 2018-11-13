package com.steer.design.singleton.one;

/**
 * 五、单例模式
 * 1.恶汉模式
 */
public class Main {
    /**
     *
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
    }
}
