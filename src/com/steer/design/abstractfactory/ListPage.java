package com.steer.design.abstractfactory;

import com.steer.design.abstractfactory.framework.Item;
import com.steer.design.abstractfactory.framework.Page;

import java.util.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title,author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>");
        buffer.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()){
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
