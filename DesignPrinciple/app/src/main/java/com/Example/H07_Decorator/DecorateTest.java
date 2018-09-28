package com.Example.H07_Decorator;

public class DecorateTest {
    public static void main(){
        Sourceable source=new Source();
        Sourceable decorator=new Decorator(source);
        decorator.method();
    }
}