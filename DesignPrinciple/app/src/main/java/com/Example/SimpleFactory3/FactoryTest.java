package com.Example.SimpleFactory3;

/**
 * 将SinpleFactory2
 * 多个工厂方式模式下得方法
 * 置为static静态的，这样不需要创建实例
 * 直接调用方法即可
 *  {@link com.Example.SimpleFactory2.FactoryTest}
 */
public class FactoryTest {
    public  void main(){
        Sender sender=SendFactory.MailProduce();
        sender.Send();
    }
}