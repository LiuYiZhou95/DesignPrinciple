package com.Example.H20_State;

public class StateTest {
    public void main(){
        State state=new State();
        Context context=new Context(state);

        state.setValue("state1");
        context.method();
        state.setValue("state2");
        context.method();
    }
}