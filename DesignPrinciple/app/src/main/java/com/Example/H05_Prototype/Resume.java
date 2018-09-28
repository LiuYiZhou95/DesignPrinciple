package com.Example.H05_Prototype;

public class Resume implements Cloneable{
    private String name;
    private String age;

    public Resume(String name){
        this.name=name;
    }

    public void setAge(String age){
        this.age=age;
    }

    public Object clone(){
        Resume resume=null;
        try {
            resume=(Resume)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  resume;
    }

    public void show(){
        System.out.println("姓名"+name);
        System.out.println("年龄"+age);
    }
}