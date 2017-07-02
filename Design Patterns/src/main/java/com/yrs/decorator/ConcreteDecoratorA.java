package com.yrs.decorator;

/**
 * Created by yrs on 2017/7/2.
 */
public class ConcreteDecoratorA extends Decorator {

    private Component component;

    public ConcreteDecoratorA(Component component) {
        this.component = component;
    }

    @Override
    public void say() {
        preSay();
        component.say();
        sufSay();
    }

    public void preSay() {
        System.out.println("Welcome everyone!");
    }

    public void sufSay() {
        System.out.println("Thank you!");
    }
}
                