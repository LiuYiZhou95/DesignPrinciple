package com.Example.H21_Visitor;

public class VisitorTest {
    public void main(){
        Visitor visitor=new MyVisitor();
        Subject subject=new MySubject();
        subject.accept(visitor);
    }
}