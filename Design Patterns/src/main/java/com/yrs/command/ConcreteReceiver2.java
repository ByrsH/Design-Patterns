package com.yrs.command;

/**
 * @Author: yangrusheng
 * @Description: 具体接收者
 * @Date: Created in 17:50 2019/4/14
 * @Modified By:
 */
public class ConcreteReceiver2 extends Receiver {
    @Override
    public void doSomething1() {
        System.out.println("receiver2 do something1");
    }

    @Override
    public void doSomething2() {
        System.out.println("receiver2 do something2");
    }

    @Override
    public void doSomething3() {
        System.out.println("receiver2 do something3");
    }
}
