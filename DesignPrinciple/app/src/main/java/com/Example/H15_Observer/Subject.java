package com.Example.H15_Observer;

public interface Subject {
    public void add(Observer observer);
    public void del(Observer observer);
    public void nodifyObserver();
    public void operation();
}
