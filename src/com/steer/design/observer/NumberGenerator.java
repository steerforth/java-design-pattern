package com.steer.design.observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();
    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()){
            Observer o = (Observer) iterator.next();
            o.update(this);
        }
    }
}
