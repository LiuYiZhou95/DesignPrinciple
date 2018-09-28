package com.Example.H02_AbstractFactoryMethod;

public class Client {

    public void main(){
        Factory factory=new GeLiFactory();
        Bingxiang bingxiang=factory.CreateBingxiang();
        bingxiang.setMoney("1000");
        bingxiang.CreateBingxiang();

        Tv tv=factory.CreateTv();
        tv.setMoney("2");
        tv.CreateTv();
    }
}