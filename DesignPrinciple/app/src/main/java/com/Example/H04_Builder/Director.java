package com.Example.H04_Builder;

public class Director {
    public void Construct(Builder builder){
        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
    }
}