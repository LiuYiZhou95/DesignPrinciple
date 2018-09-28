package com.Example.H01_FactoryMethod;

public class MainFactory implements Provider{
    @Override
    public Sender Produce(){
       return new MailSender();
    }
}