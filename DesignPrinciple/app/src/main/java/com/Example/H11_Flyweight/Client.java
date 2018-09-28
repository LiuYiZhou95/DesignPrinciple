package com.Example.H11_Flyweight;

public class Client {
    public static void main() {
        Shape shape1 = FlyWightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyWightFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = FlyWightFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = FlyWightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyWightFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = FlyWightFactory.getShape("灰色");
        shape6.draw();

        System.out.println("一共绘制了"+FlyWightFactory.getSum()+"中颜色的圆形");
    }
}