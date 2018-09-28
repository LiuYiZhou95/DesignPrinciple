package com.Example.SimpleFactory2;
/**
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
 * 而多个工厂方法模式是提供多个工厂方法
 * {@link com.Example.SimpleFactory1.FactoryTest}
 */
public class FactoryTest {
    public  void main(){
        SendFactory factory=new SendFactory();
        Sender sender=factory.MailProduce();
        sender.Send();
    }
}