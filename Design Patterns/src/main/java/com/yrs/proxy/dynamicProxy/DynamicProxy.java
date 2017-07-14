package com.yrs.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by yrs on 2017/7/14.
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        if (true) {
            (new BeforeSomething()).exec();
        }
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
                