package com.yrs.singleton;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 8:14 2018/7/17
 * @Modified By:
 */
public class StaticHungrySingleton {
    private static StaticHungrySingleton singleton = null;

    static {
        singleton = new StaticHungrySingleton();
    }

    private StaticHungrySingleton() {
        // 防止通过反射的方式，调用构造方法实例化对象。
        if (singleton != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static StaticHungrySingleton getSingleton() {
        return singleton;
    }

    public static void doSomething() {

    }


}
