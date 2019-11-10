package com.steer.design.proxy.proxy1;

/**
 * 二十一、代理模式
 */
public class Main {
    /**
     * 静态代理
     * 代理类PrinterProxy和被代理类Printer有一致性的接口Printable
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
