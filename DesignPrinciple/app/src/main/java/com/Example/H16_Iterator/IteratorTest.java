package com.Example.H16_Iterator;

public class IteratorTest {
    public  void main(){
        Collection collection=new MyCollection();
        Iterator i=collection.iterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}