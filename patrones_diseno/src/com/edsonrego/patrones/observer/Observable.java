package com.edsonrego.patrones.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notityObservers(){
        notityObservers(null);
    }
    public void notityObservers(Object obj){
        for(Observer obs: this.observers){
            obs.update(this, obj);
        }
    }
}
