package com.Example.H17_ChainOfResponsibility;

public class MyHandler extends AbstractHadler implements Handler{
    private String name;

    public MyHandler(String name){
        this.name=name;
    }

    @Override
    public void operation(){
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operation();
        }
    }
}