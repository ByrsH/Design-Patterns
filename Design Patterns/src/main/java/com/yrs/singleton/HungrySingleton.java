package com.yrs.singleton;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 15:30 2018/7/2
 * @Modified By: 饿汉式单例，不会产生多个实例，因此不存在线程安全问题
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getSingleton() {
        return singleton;
    }

    public static void doSomething() {

    }

}
