package com.yrs.adapter;

/**
 * @Author: yangrusheng
 * @Description: 类适配器，其与被适配类的关系是继承，通过继承来实现适配。
 * @Date: Created in 10:09 2018/9/17
 * @Modified By:
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
