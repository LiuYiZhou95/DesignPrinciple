package com.Example.H04_Builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<String> parts=new ArrayList<String>();

    public void Add(String s){
        parts.add(s);
    }

    public void show(){

        int count=parts.size();
        for(int i=0;i<count;i++){
            System.out.println("组件"+parts.get(i)+"组装完毕");
        }
        System.out.println("电脑组装完毕");
    }
}