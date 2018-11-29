package com.steer.design.memento;

/**
 * 十八、备忘录模式
 */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        //只保存了一个备忘录、快照
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("第"+(i+1)+"次掷骰子");  //显示掷骰子的次数
            System.out.println("当前状态："+gamer);
            gamer.bet();

            System.out.println("所持有的金钱为"+gamer.getMoney()+"元.");
            if (gamer.getMoney() > memento.getMonney()){
                System.out.println("  (所持金钱增加了许多，因此保存游戏当前状态)  ");
            }else if(gamer.getMoney() < memento.getMonney()/2){
                System.out.println(" (所持金钱减少了许多，因此将游戏恢复至以前状态)  ");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("");

        }
    }
}
