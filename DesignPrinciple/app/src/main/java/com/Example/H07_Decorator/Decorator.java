package com.Example.H07_Decorator;

public class Decorator implements Sourceable{
    private Sourceable source;

    public Decorator(Sourceable source){
        super();
        this.source=source;
    }
    @Override
    public void method(){
        System.out.println("before");
        source.method();
        System.out.println("after");
    }
}