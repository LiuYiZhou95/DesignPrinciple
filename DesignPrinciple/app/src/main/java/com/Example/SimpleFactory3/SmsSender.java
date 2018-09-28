package com.Example.SimpleFactory3;

public class SmsSender implements Sender {
    @Override
    public void Send(){
        System.out.println("this is SmsSender");
    }
}