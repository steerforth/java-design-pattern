package com.steer.design.factory.framework;

/**
 * 用到了模版模式
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract void registerProduct(Product product);

    protected abstract Product createProduct(String owner);
}
