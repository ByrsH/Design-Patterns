package com.yrs.singleton;

/**
 * @Author: yangrusheng
 * @Description: 使用枚举来实现单例模式。线程安全，能够防止通过序列化或者反射的方式多次实例化。
 *                单元素的枚举类型已经成为实现Singleton的最佳方法。
 * @Date: Created in 10:59 2018/7/6
 * @Modified By:
 */
public enum  EnumSingleton {

    SINGLETON;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }

    public static void main(String[] args) {
        System.out.println(EnumSingleton.SINGLETON.toString());
    }
}
