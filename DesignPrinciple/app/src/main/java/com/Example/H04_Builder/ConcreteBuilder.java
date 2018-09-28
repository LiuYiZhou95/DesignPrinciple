package com.Example.H04_Builder;

public class ConcreteBuilder extends Builder{
    Computer computer=new Computer();

    @Override
    public void BuildCPU(){
        computer.Add("CPU");
    }

    @Override
    public void BuildMainboard(){
        computer.Add("Mainboard");
    }
    @Override
    public void BuildHD(){
        computer.Add("HD");
    }

    @Override
    public Computer GetComputer(){
        return computer;
    }
}