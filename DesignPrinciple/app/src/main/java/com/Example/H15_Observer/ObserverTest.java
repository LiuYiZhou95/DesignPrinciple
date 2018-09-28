package com.Example.H15_Observer;

public class ObserverTest {
    public  void main(){
        Subject subject=new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}