package com.Example.SimpleFactory1;

public class SmsSender implements Sender{
    @Override
    public void Send(){
        System.out.println("this is SmsSender");
    }
}