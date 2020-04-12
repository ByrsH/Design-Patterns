package com.yrs.observer;

/**
 * @Author: yangrusheng
 * @Description: 具体观察者
 * @Date: Created in 13:03 2020/4/12
 * @Modified By:
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("concreteObserverA receive notify, begin update");
    }
}
