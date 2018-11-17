package com.steer.design.abstractfactory;

import com.steer.design.abstractfactory.framework.Item;
import com.steer.design.abstractfactory.framework.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");
        java.util.Iterator iterator = tray.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
