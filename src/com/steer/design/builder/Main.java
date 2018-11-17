package com.steer.design.builder;

/**
 * 建造者模式
 */
public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.construct();
        String fileName = htmlBuilder.getResult();
        System.out.println(fileName+"文件编写完成");

    }
}
