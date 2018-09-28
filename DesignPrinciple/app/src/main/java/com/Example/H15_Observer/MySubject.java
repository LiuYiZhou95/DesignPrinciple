package com.Example.H15_Observer;

public class MySubject extends AbstractSubject{
    @Override
    public void operation(){
        System.out.println("update self!");
        nodifyObserver();
    }
}