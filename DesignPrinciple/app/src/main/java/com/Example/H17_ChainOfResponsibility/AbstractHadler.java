package com.Example.H17_ChainOfResponsibility;

public abstract class AbstractHadler {
    private Handler handler;

    public Handler getHandler(){
        return handler;
    }
    public void setHandler(Handler handler){
        this.handler=handler;
    }

}