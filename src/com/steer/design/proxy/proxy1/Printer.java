package com.steer.design.proxy.proxy1;

public class Printer implements Printable {
    private String name;

    public Printer() {
        headvyJob("Printer的实例生成中");
    }

    public Printer(String name) {
        this.name = name;
        headvyJob("Printer的实例生成中("+this.name+")");
    }

    private void headvyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("结束.");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== "+name+" ===");
        System.out.println(string);
    }
}
