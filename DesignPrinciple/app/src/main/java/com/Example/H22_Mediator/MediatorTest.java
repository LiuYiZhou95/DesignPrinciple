package com.Example.H22_Mediator;

public class MediatorTest {
    public void main(){
        Mediator mediator=new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }

}