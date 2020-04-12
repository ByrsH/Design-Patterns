package com.yrs.observer;

import java.util.Vector;

/**
 * @Author: yangrusheng
 * @Description: 被观察者抽象类
 * @Date: Created in 12:46 2020/4/12
 * @Modified By:
 */
public abstract class Subject {

    //定义存储观察者对象容器
    private Vector<Observer> observers = new Vector<>();

    /**
     * 添加观察者
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除观察者
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知所有观察者
     */
    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update();
        }
    }
}
