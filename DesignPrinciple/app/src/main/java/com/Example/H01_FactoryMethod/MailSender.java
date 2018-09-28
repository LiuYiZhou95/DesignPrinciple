package com.Example.H01_FactoryMethod;

public class MailSender implements Sender{
    @Override
    public void Send(){
        System.out.println("this is MainSender");
    }
}