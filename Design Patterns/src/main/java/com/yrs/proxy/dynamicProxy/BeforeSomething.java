package com.yrs.proxy.dynamicProxy;

/**
 * Created by yrs on 2017/7/14.
 */
public class BeforeSomething implements Something{
    public void exec() {
        System.out.println("Before do something");
    }
}
                