package com.steer.design.factory;

import com.steer.design.factory.framework.Factory;
import com.steer.design.factory.framework.Product;
import com.steer.design.factory.idcard.IDCardFactory;

/**
 * 四、工厂模式
 */
public class Main {
    /**
     * 父类决定实例的生成方式，但并不决定所要生成的具体的类，具体的处理由子类负责
     * @param args
     */
    public static void main(String[] args) {
        //1.并没有出现IDCard这个实体类
        //2.framework包里不依赖idcard包内的文件
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        Product card3 = factory.create("小刚");
        card1.use();
        card2.use();
        card3.use();
    }
}
