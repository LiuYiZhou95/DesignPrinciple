package com.Example.H02_AbstractFactoryMethod;

public class HaiErFactory extends Factory{
    @Override
    public Bingxiang CreateBingxiang(){
        return new HaiErBingxiang();
    }
    @Override
    public Tv CreateTv(){
        return new HaiErTv();
    }
}