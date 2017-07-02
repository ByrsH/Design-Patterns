package com.yrs.decorator;

/**
 * Created by yrs on 2017/7/2.
 */
public class Test {
    public static void main(String [] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecoratorA(component); //用ConcreteDecoratorA类装饰ConcreteComponent对象
        component = new ConcreteDecoratorB(component);//用ConcreteDecoratorB类装饰ConcreteComponent对象

        component.say();
    }
}
                