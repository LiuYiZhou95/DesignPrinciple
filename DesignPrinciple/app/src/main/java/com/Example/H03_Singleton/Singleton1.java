package com.Example.H03_Singleton;

import com.Example.SimpleFactory1.FactoryTest;

public class Singleton1 {
    private Singleton1(){

    }

    private static class SingleFactory{
        private static Singleton1 instance=new Singleton1();
    }

    public static Singleton1 getinstance(){
        return SingleFactory.instance;
    }

    public Object readResolve(){
        return getinstance();
    }
}