package com.yrs.singleton;

import java.io.*;

/**
 * @Author: yangrusheng
 * @Description: 当单例类变为可序列化（Serializable）的, 为了维护并保证Singleton，必须声明所有实例域都是transient的，
 *                并提供一个readResolve方法。
 * @Date: Created in 14:38 2018/7/6
 * @Modified By:
 */
public class SerializeHungrySingleton implements Serializable {

    // 为了保证Singleton，必须声明所有实例域都是transient的。
    private static final transient SerializeHungrySingleton singleton = new SerializeHungrySingleton();

    private SerializeHungrySingleton() {
        if (singleton != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static SerializeHungrySingleton getSingleton() {
        return singleton;
    }

    // readResolve方法是为了保护单例属性。
    // 反序列化的时候会判断如果实现了serializable 或者 externalizable接口的类中又包含readResolve()方法的话，
    // 会直接调用readResolve()方法来获取实例。
    private Object readResolve() {
        return singleton;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializeHungrySingleton singleton = SerializeHungrySingleton.getSingleton();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(singleton);

        //将对象从流中取出来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        SerializeHungrySingleton singleton1 =  (SerializeHungrySingleton) ois.readObject();

        System.out.println(singleton == singleton1);
    }

}
