package com.yrs.abstractFactory;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 10:27 2018/7/31
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //声明创建两个类型的工厂对象
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractFactory factory2 = new ConcreteFactory2();

        //创建A1类型的对象
        AbstractProductA a1 = factory1.createProductA();
        a1.doSomething();

        //创建A2类型的对象
        AbstractProductA a2 = factory2.createProductA();
        a2.doSomething();

        //创建B1类型的对象
        AbstractProductB b1 = factory1.createProductB();
        b1.doSomething();

        //创建B1类型的对象
        AbstractProductB b2 = factory2.createProductB();
        b2.doSomething();
    }

}
