package com.Example.H21_Visitor;

public class MyVisitor implements Visitor{
    @Override
    public  void Visit(Subject subject){
        System.out.println("visit subject"+subject.getSubject());
    }
}