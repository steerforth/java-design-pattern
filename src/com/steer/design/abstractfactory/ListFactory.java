package com.steer.design.abstractfactory;

import com.steer.design.abstractfactory.framework.Factory;
import com.steer.design.abstractfactory.framework.Link;
import com.steer.design.abstractfactory.framework.Page;
import com.steer.design.abstractfactory.framework.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
