package com.Example.H02_AbstractFactoryMethod;

public abstract class Tv {
    private String money;

    public abstract void CreateTv();

    public String getMoney(){
        return money;
    }
    public void setMoney(String money){
        this.money=money;
    }
}