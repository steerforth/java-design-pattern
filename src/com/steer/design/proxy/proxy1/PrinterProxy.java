package com.steer.design.proxy.proxy1;

public class PrinterProxy implements Printable {
    private String name;
    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null){
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();//真实主体放在执行方法时才生成
        real.print(string);
    }

    private void realize() {
        if (real == null){
            real = new Printer(name);
        }
    }
}
