package com.Example.H12_Composite.FileDemo;

public class TextFile extends File{
    public TextFile(String name){
        super(name);
    }
    public void display(){
        System.out.println("这是文本文件，文件名：" + super.getName());
    }
}