package com.steer.design.prototype;

import com.steer.design.prototype.framework.Manager;
import com.steer.design.prototype.framework.Product;

/**
 * 六、模型模式
 */
public class Main {
    /**
     * clone方法是浅拷贝,即基本数据类型是值传递，引用数据类型是引用传递
     * 若要实现深拷贝，需要重写clone方法，将原型模式中的数组、容器对象、引用对象等另行拷贝
     * @param args
     */
    public static void main(String[] args) {
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message",underlinePen);
        manager.register("warning box",mbox);
        manager.register("slash box",sbox);


        Product p1 = manager.create("strong message");
        p1.use("hello,world!");
        Product p2 = manager.create("warning box");
        p2.use("hello,world!");
        Product p3 = manager.create("slash box");
        p3.use("hello,world!");
    }
}
