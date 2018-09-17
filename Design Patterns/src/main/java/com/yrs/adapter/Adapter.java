package com.yrs.adapter;

/**
 * @Author: yangrusheng
 * @Description: 适配器角色
 * @Date: Created in 10:09 2018/9/17
 * @Modified By:
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
