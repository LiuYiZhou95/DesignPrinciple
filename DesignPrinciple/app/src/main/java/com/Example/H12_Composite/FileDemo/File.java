package com.Example.H12_Composite.FileDemo;

public abstract class File {
    private String name;

    public abstract void display();
    public File(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

}