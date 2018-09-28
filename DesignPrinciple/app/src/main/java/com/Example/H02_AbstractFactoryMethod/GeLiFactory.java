package com.Example.H02_AbstractFactoryMethod;

public class GeLiFactory extends Factory{

    @Override
    public Bingxiang CreateBingxiang(){
        return new GeLiBingxiang();
    }
    @Override
    public Tv CreateTv(){
        return new GeLiTv();
    }
}