package com.steer.design.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database(){}

    public static Properties getProperties(String dbname){
        String filename = dbname+".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: "+filename+" id not found");
        }
        return prop;
    }
}
