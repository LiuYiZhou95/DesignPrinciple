package com.Example.H21_Visitor;

public class MySubject implements Subject{
    @Override
    public void accept(Visitor visitor){
        visitor.Visit(this);
    }
    @Override
    public String  getSubject(){
        return "love";
    }
}