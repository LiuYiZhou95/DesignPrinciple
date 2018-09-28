package com.Example.H18_command;

public class CommandTest {
    public void main(){
        Receiver receiver=new Receiver();
        Command command=new MyCommand(receiver);

        Invoker invoker=new Invoker(command);
        invoker.action();
    }
}