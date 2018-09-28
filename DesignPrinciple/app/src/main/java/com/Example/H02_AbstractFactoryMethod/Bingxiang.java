package com.Example.H02_AbstractFactoryMethod;

public abstract class Bingxiang{
    private String money;

    public abstract void CreateBingxiang();

    public String getMoney(){
        return money;
    }
    public void setMoney(String money){
        this.money=money;
    }
}