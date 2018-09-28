package com.Example.H13_Strategy;

public class Plus extends AbstarctCalculator implements ICalculator{
    @Override
    public int calculate(String exp){
        int arrayInt[]=split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}