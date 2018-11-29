package com.steer.design.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录
 */
public class Memento {
    int monney;
    ArrayList fruits;

    Memento(int monney) {
        this.monney = monney;
        this.fruits = new ArrayList();
    }

    public int getMonney() {
        return monney;
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    List getFruits(){
        return (List) fruits.clone();
    }
}
