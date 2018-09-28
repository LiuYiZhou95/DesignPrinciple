package com.designprinciple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.Example.H04_Builder.Pattern;
import com.Example.H02_AbstractFactoryMethod.Client;
import com.Example.H15_Observer.Observer;
import com.Example.H15_Observer.ObserverTest;
import com.Example.H16_Iterator.IteratorTest;
import com.Example.H17_ChainOfResponsibility.ChainTest;
import com.Example.H19_Memento.MementoTest;
import com.Example.H20_State.StateTest;
import com.Example.H21_Visitor.VisitorTest;
import com.Example.H22_Mediator.Mediator;
import com.Example.H22_Mediator.MediatorTest;
import com.Example.H23_Interpreter.InterpreterTest;
import com.Example.SimpleFactory1.FactoryTest;
import com.Example.designprinciple.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InterpreterTest a=new InterpreterTest();
        a.main();
        setContentView(R.layout.activity_main);
    }
}
