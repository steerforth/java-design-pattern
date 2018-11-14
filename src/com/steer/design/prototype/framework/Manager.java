package com.steer.design.prototype.framework;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();
    public void register(String name,Product product){
        showcase.put(name,product);
    }
    public Product create(String protoname){
        Product product = (Product) showcase.get(protoname);
        return product.createClone();
    }
}
