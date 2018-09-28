package com.Example.H01_FactoryMethod;

public class SmsSender implements Sender{
    @Override
    public void Send(){
        System.out.println("this is SmsSender");
    }
}