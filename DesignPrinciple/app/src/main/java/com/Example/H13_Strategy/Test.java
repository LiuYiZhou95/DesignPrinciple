package com.Example.H13_Strategy;

public class Test {
    public static void main(){
        String exp="2+8";
        ICalculator cal=new Plus();

        int result=cal.calculate(exp);
        System.out.println(result);
    }
}