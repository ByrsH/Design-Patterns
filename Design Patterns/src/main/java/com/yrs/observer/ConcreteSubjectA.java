package com.yrs.observer;

/**
 * @Author: yangrusheng
 * @Description: 具体被观察者类
 * @Date: Created in 12:56 2020/4/12
 * @Modified By:
 */
public class ConcreteSubjectA extends Subject {

    /**
     * 具体业务
     */
    public void doSomething() {
        System.out.println("concreteSubjectA begin do something.");
        super.notifyObserver();
    }

}
