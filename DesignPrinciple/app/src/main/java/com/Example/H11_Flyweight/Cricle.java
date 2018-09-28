package com.Example.H11_Flyweight;

public class Cricle extends Shape{

    private String color;

    public Cricle(String color){
        this.color=color;
    }

    public void draw(){
        System.out.println("画一个"+color+"的圆");
    }
}