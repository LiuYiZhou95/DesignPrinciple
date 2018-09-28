package com.Example.H11_Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWightFactory {
    static Map<String,Shape>shapes=new HashMap<String, Shape>();

    public static Shape getShape(String key){
        Shape shape=shapes.get(key);
        if(shape==null){
            shape=new Cricle(key);
            shapes.put(key,shape);
        }
            return shape;
    }
    public static int getSum(){
        return shapes.size();
    }
}