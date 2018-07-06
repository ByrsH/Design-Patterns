package com.yrs.singleton;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 15:30 2018/7/2
 * @Modified By: 饿汉式单例，在类加载时会初始化静态变量，因此不会产生多个实例，也就不存在线程安全问题
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {
        // 防止通过反射的方式，调用构造方法实例化对象。
        if (singleton != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static HungrySingleton getSingleton() {
        return singleton;
    }

    public static void doSomething() {

    }

}
