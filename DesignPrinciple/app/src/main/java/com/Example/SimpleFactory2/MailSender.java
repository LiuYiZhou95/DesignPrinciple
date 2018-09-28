package com.Example.SimpleFactory2;

public class MailSender implements Sender {
    @Override
    public void Send(){
        System.out.println("this is MailSender");
    }
}