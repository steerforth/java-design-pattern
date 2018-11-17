package com.steer.design.abstractfactory.framework;

public abstract class Link extends Item {
    protected String url;
    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
