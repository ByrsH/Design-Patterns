package com.yrs.singleton;

/**
 * @Author: yangrusheng
 * @Description: 线程安全的"饿汉式"单例模式实现
 * @Date: Created in 13:54 2018/7/5
 * @Modified By:
 */
public class SynchronizedMethodSingleton {

    private static SynchronizedMethodSingleton singleton = null;

    private SynchronizedMethodSingleton() {

    }

    /**
     * 在方法上加锁，能够保证同一时间只有一个线程访问，能够保证线程安全，但它的一个致命的缺点是性能问题。当singleton不为
     * null时，也需要等待其他线程释放锁后才能访问getSingleton方法。获取锁和释放锁都需要一定的开销，改进方案双重校验锁。
     * @return
     */
    public synchronized static SynchronizedMethodSingleton getSingleton() {
        if (singleton == null) {
            singleton = new SynchronizedMethodSingleton();
        }
        return singleton;
    }
}
