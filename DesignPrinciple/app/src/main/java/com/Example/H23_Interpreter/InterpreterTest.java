package com.Example.H23_Interpreter;

public class InterpreterTest {
    public void main(){
        int result=new Plus().interpret(new Context(1,10));
        System.out.println(result);
    }
}