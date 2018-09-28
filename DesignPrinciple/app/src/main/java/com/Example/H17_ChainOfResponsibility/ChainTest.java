package com.Example.H17_ChainOfResponsibility;

public class ChainTest {
    public  void main(){
        MyHandler h1=new MyHandler("1");
        MyHandler h2=new MyHandler("2");
        MyHandler h3=new MyHandler("3");

        h1.setHandler(h2);
        h2.setHandler(h3);

        h1.operation();
    }
}