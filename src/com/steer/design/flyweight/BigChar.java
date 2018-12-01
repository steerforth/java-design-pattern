package com.steer.design.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontdata;
    public BigChar(char charname){
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big"+charname+".txt"));
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) !=null){
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            this.fontdata = buffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //显示大型数据
    public void print(){
        System.out.println(fontdata);
    }
}
