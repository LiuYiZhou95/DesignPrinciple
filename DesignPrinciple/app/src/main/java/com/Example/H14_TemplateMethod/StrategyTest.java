package com.Example.H14_TemplateMethod;

public class StrategyTest {
    public  void main() {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}