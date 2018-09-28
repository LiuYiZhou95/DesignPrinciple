package com.Example.H16_Iterator;

public class MyIterator implements Iterator{
    private Collection collection;
    private int pos = -1;
    @Override
    public Object pervious(){
        if(pos>0){
            pos--;
        }
        return collection.get(pos);
    }
    @Override
    public Object next(){
        if(pos<collection.size()-1){
            pos++;
        }
        return collection.get(pos);
    }
    @Override
    public boolean hasNext(){
        if(pos<collection.size()-1){
            return true;

        }else {
            return false;
        }
    }
    @Override
    public Object first(){
        pos=0;
        return collection.get(pos);
    }
    public MyIterator(Collection collection){
        this.collection=collection;
    }
}