package com.Example.H16_Iterator;

public class MyCollection implements Collection{
    private String string[]= {"a","b","c","d"};

    @Override
    public int size() {
        return string.length;
    }
    @Override
    public Iterator iterator(){
        return new MyIterator(this);
    }
    @Override
    public Object get(int index){
        return string[index];
    }
}