package com.yrs.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by yrs on 2017/7/14.
 */
public class DynamicProxyHandler implements InvocationHandler {
    //被代理对象
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.proxied, args);
    }
}
                