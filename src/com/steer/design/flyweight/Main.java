package com.steer.design.flyweight;

/**
 * 二十、享元模式
 */
public class Main {
    /**
     * 尽量通过共享实例来避免new出实例
     * @param args
     */
    public static void main(String[] args) {
//        if (args.length == 0){
//            System.out.println("Usage: java Main digits");
//            System.out.println("Example: java Main 1212123");
//            System.exit(0);
//        }
        BigString bs = new BigString("1212123");
        bs.print();
    }
}
