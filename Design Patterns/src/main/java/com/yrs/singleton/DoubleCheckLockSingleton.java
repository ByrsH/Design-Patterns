package com.yrs.singleton;

/**
 * @Author: yangrusheng
 * @Description: 双重校验锁方式，线程安全的单例模式实现。
 * @Date: Created in 17:23 2018/7/5
 * @Modified By:
 */
public class DoubleCheckLockSingleton {

    // volatile关键字保证singleton = new DoubleCheckLockSingleton();语句在编译时不被指令重排序优化：
    // 1、给 instance 分配内存    2、调用 Singleton 的构造函数来初始化成员变量
    // 3、将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
    // 会存在1-3-2的执行顺序，线程2在线程1进行到3时进入getSingleton方法中，就会得到一个未初始化成员变量的对象，之后的
    // 操作会出现问题。

    private volatile static DoubleCheckLockSingleton singleton;

    //私有构造方法确保不被通过new实例化出对象
    private DoubleCheckLockSingleton() {

    }

    /**
     * 双重校验是否为null的原因是：多个线程同时通过了第一个if语句，线程1获得锁，进行初始化后singleton不为null，线程1
     * 释放锁，线程2获得锁后，如果没有再次校验singleton为null的话，线程2将会创建第二个DoubleCheckLockSingleton对象，就
     * 会造成线程不安全。
     * @return
     */
    public static DoubleCheckLockSingleton getSingleton() {
        // local variable increases performance by 25 percent
        // Joshua Bloch "Effective Java, Second Edition", p. 283-284
        DoubleCheckLockSingleton result = singleton;

        if (result == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                result = singleton;
                if (result == null) {
                    result = singleton = new DoubleCheckLockSingleton();
                }
            }
        }
        return result;
    }

}
