package com.Example.H06_02_ObjectAdapter;

public class Adapter implements Targetable {
    private Source source;

    public Adapter(Source source){
        super();
        this.source=source;
    }
    @Override
    public void method2(){
        System.out.println("this is Adapter method2");
    }
    @Override
    public void method1(){
        source.method1();
    }
}