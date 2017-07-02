package com.yrs.decorator;

/**
 * Created by yrs on 2017/7/2.
 */
public class ConcreteDecoratorB extends Decorator {

    private Component component;

    public ConcreteDecoratorB(Component component) {
        this.component = component;
    }

    @Override
    public void say() {
        component.say();
        sayHelp();
    }

    public void sayHelp() {
        System.out.println("please help me!");
    }

}
                