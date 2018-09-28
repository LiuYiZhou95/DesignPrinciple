package com.Example.H03_Singleton;

public class Singleton {
    private static Singleton instance=null;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance==null) {
            instance = new Singleton();
        }
        return instance;
    }


    /**这种方式锁住的是Singleton对象，每次调用getInstance都需要给对象上锁，
     * 实际上只需要第一次创建对象的时候，上锁就可以了
     *   public static synchronized Singleton getInstance(){
     *      if(instance==null){
     *          instance=new Singleton();
     *      }
     *      return instance;
     *    }
     */

    /**这种情况下，只有在创建的时候才给对象上锁，调用的时候则不需要。
     * 但这种情况也有缺陷，当A/B两个线程调用的时候，A线程进入synchronized，此时
     * instance=new Singleton();，但是JAVA内部创建对象和赋值是分开的，也就会存在
     * A执行instance=new Singleton();后解开synchronized，B进入，但此时instance仅仅是刚刚创建对象，并没有完成赋值，
     * 此时B进入，instance已经被分配了空间，但还没有实际的实例。
     *  public static Singleton getInstance(){
            if(instance==null){
                synchronized (instance){
                    if(instance==null){
                    instance=new Singleton();
                    }
                return instance;
                }
            }
        }
     *
     */


    public Object readResolve(){
        return instance;
    }
}