package com.yrs.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 11:05 2018/9/6
 * @Modified By:
 */
public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Interface subject) {
        //获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();

        //获得接口数据
        Class<?> [] classes = subject.getClass().getInterfaces();

        //获得Handler
        InvocationHandler handler = new DynamicProxyHandler(subject);

        return newProxyInstance(loader, classes, handler);
    }

}
