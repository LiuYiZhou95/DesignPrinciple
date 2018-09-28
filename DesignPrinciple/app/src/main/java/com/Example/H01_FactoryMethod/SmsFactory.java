package com.Example.H01_FactoryMethod;

public class SmsFactory implements Provider{
    @Override
    public Sender Produce(){
        return new SmsSender();
    }
}