package com.Example.SimpleFactory1;

public class SendFactory {
    public Sender Produce(String type){
        if(type=="Mail"){
            return new MailSender();
        }else if(type=="Sms"){
            return new SmsSender();
        }else{
            System.out.println("没有此类型");
            return  null;
        }

    }
}