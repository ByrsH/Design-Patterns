package com.yrs.singleton;

/**
 * @Author: yangrusheng
 * @Description: 静态内部类实现单例模式。懒加载，jvm保证线程安全。
 * @Date: Created in 10:01 2018/7/6
 * @Modified By:
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
        // 防止通过反射的方式，调用构造方法实例化对象。
        if (SingletonHolder.INSTANCE != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static StaticInnerClassSingleton getSingleton() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

}
