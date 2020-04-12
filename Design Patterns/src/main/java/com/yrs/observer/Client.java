package com.yrs.observer;

/**
 * @Author: yangrusheng
 * @Description: 场景类
 * @Date: Created in 13:07 2020/4/12
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //定义被观察者
        ConcreteSubjectA subject = new ConcreteSubjectA();
        //定义观察者
        Observer observerA = new ConcreteObserverA();
        Observer observerB = new ConcreteObserverB();
        //添加观察者
        subject.attach(observerA);
        subject.attach(observerB);
        //被观察者活动
        subject.doSomething();
    }

}
