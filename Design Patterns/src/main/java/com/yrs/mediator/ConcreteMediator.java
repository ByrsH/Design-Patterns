package com.yrs.mediator;

/**
 * @Author: yangrusheng
 * @Description: 具体中介者
 * @Date: Created in 18:06 2019/1/20
 * @Modified By:
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSomething1() {
        //调用同事类的方法
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
