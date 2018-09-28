package com.Example.H04_Builder;

public class Pattern {
    public static void main(){
        Director director=new Director();
        Builder builder=new ConcreteBuilder();

        director.Construct(builder);
        Computer computer=builder.GetComputer();
        computer.show();
    }
}