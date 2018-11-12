package com.steer.design.template;

/**
 * 三、模板模式
 */
public class Main {
    /**
     * 定义一个算法的统一骨架，如step1,step2,...step n。而将具体的算法实现延迟到子类中。
     * 优点：使用模板方法模式，在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户灵活多变的需求。
     * 缺点：如果算法骨架有修改的话，则需要修改抽象类
     * @param args
     */
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello world!");
        AbstractDisplay d3 = new StringDisplay("你好 世界!");
        d1.display();
        d2.display();
        d3.display();
    }
}
