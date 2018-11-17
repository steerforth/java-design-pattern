package com.steer.design.abstractfactory;

import com.steer.design.abstractfactory.framework.Factory;
import com.steer.design.abstractfactory.framework.Link;
import com.steer.design.abstractfactory.framework.Page;
import com.steer.design.abstractfactory.framework.Tray;

/**
 * 八、抽象工厂模式
 */
public class Main {
    /**
     * 易于扩展具体的工厂，难以增加新的抽象零件
     * @param args
     */
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("miss args");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);
        Link people = factory.createLink("人民日报","http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报","http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!","http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan","http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite","http://www.excite.com/");
        Link google = factory.createLink("Google","http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayyahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage","杨文轩");
        page.add(traynews);
        page.add(traySearch);
        page.output();

    }
}
