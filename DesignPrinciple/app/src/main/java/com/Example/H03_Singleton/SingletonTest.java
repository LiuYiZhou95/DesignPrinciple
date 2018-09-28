package com.Example.H03_Singleton;

public class SingletonTest {
    private static SingletonTest instance=null;

    private SingletonTest(){

    }
    private static synchronized void sysncInit(){
        if(instance==null) {
            instance = new SingletonTest();
        }
    }

    public static SingletonTest getInstance(){
        if(instance==null){
            sysncInit();
        }
        return instance;
    }
}