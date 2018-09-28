package com.Example.SimpleFactory3;

public class MailSender implements Sender {
    @Override
    public void Send(){
        System.out.println("this is MailSender");
    }
}