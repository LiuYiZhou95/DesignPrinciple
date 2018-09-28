package com.Example.SimpleFactory1;

public class FactoryTest {
    public  void main(){
        SendFactory factory=new SendFactory();
        Sender sender1=factory.Produce("Mail");
        sender1.Send();
        Sender sender2=factory.Produce("Mail");
        sender2.Send();
    }
}