package com.yrs.singleton;

/**
 * @Author: yangrusheng
 * @Description: "饿汉式"实现，非线程安全的单例模式实现。
 * @Date: Created in 9:21 2018/7/5
 * @Modified By:
 */
public class NonThreadSecuritySingleton {

    private static NonThreadSecuritySingleton singleton = null;

    private NonThreadSecuritySingleton() {

    }

    /**
     * 当线程一进入该方法，if语句判断singleton是null，然后进行实例化。在还没有实例化完时，线程二进入该方法，
     * 这时singleton依然是null，线程二也会实例化一个新的对象，就会造成有多个对象，因此线程不安全。
     * @return
     */
    public static NonThreadSecuritySingleton getNonThreadSecuritySingleton() {
        if (singleton == null) {
            singleton = new NonThreadSecuritySingleton();
        }
        return singleton;
    }

}
