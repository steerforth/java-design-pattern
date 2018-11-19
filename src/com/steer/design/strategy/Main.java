package com.steer.design.strategy;

import java.util.Random;

/**
 * 十、策略模式
 */
public class Main {
    /**
     * 优点：
     * 1）使用了组合，使架构更加灵活
     * 2）富有弹性，可以较好的应对变化（开闭原则）
     * 3）更好的代码复用性（相对于继承）
     * 4）消除大量的条件语句
     *
     * 缺点：
     * 1）客户代码需要了解每个策略实现的细节
     * 2）增加了对象的数目
     *
     *
     * 适用场景：
     * 1）许多相关的类仅仅是行为的差异，提取差异共性分离出来成为一个策略接口
     * 2）运行时选取不同的算法变体
     * 3）通过条件语句在多个分支中选取
     *
     * @param args
     */
    public static void main(String[] args) {
        int seed1 = 1;
        int seed2 = 2;
        Player player1 = new Player("Taro",new WinningStrategy(seed1));
        Player player2 = new Player("Hana",new ProbStrategy(seed2));

        for (int i = 0; i < 20; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("胜者:"+player1);
                player1.win();
                player2.lose();
            }else if(nextHand2.isStrongerThan(nextHand1)){
                System.out.println("胜者:"+player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("平局");
                player1.even();
                player2.even();
            }


        }

        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
