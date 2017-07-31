package com.yrs.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by yrs on 2017/7/14.
 */
public class Client {
    public static void main(String [] args) {
        Interface proxied = new RealObject();
        InvocationHandler handler = new DynamicProxyHandler(proxied);
        Interface proxy = DynamicProxy.newProxyInstance(proxied.getClass().getClassLoader(),proxied.getClass().getInterfaces(),handler);
        proxy.doSomething("sing");
    }
}
                