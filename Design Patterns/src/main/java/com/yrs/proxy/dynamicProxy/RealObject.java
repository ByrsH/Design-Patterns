package com.yrs.proxy.dynamicProxy;

/**
 * Created by yrs on 2017/7/14.
 */
public class RealObject implements Interface {
    public void doSomething(String thing) {
        System.out.println("RealObject do " + thing);
    }
}
                