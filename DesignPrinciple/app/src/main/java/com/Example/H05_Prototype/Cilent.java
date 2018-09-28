package com.Example.H05_Prototype;

public class Cilent {
    public static void  main(){
        Resume a=new Resume("小明");
        a.setAge("12");

        Resume b=(Resume)a.clone();


        System.out.println("----------------A");
        a.show();
        System.out.println("----------------B");
        b.show();

        System.out.println("A==B:");
        System.out.println(a==b);

        System.out.println("A.class==B.class:");
        System.out.println(a.getClass()==b.getClass());
    }
}