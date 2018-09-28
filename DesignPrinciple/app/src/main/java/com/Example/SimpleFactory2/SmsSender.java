package com.Example.SimpleFactory2;

public class SmsSender implements Sender {
    @Override
    public void Send(){
        System.out.println("this is SmsSender");
    }
}