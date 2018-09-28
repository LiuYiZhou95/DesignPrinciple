package com.Example.H06_01_ClassAdatper;

public class AdapterTest {
    public void main(){
        Targetable targetable=new Adapter();
        targetable.method1();
        targetable.method2();
    }
}