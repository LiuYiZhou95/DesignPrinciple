package com.Example.H06_02_ObjectAdapter;

public class AdapterTest {
    public void main(){
        Source source=new Source();
        Targetable targetable=new Adapter(source);
        targetable.method1();
        targetable.method2();
    }
}