package com.steer.design.proxy;

/**
 * 二十一、代理模式
 */
public class Main {
    /**
     * 代理人和实际主体有一致性的接口
     * Virtual Proxy虚拟代理：在真正需要时，才生成真实主体的实例。例子就是
     * remote Proxy远程代理：
     * Access Proxy:
     * @param args
     */
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在名字是"+p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在名字是"+p.getPrinterName());
        p.print("Hello world!");
    }
}
