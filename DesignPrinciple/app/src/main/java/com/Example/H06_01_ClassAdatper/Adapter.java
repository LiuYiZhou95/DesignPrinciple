package com.Example.H06_01_ClassAdatper;

public class Adapter extends Source implements Targetable{
    @Override
    public void method2(){
        System.out.println("this is Adapter method2");
    }
}