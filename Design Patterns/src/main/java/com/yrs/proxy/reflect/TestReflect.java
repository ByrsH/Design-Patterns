package com.yrs.proxy.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by yrs on 2017/7/13.
 */
public class TestReflect {

    public static void main(String [] args) throws Exception {
        //查看类相关的信息
        Class<?> userClass = Class.forName("com.yrs.proxy.reflect.User");
        ReflectUtil reflectUtil = new ReflectUtil();
        reflectUtil.printClassInfo(userClass);
        reflectUtil.printClassConstructor(userClass);
        reflectUtil.printField(userClass);
        reflectUtil.printMethod(userClass);


        //实例化一个类的对象，并初始化
        User user = (User)userClass.newInstance();
        user.setName("ByrsH");
        user.setAge(23);
        System.out.println(user.getName() + " " + user.getAge());

        //通过反射操作某个类的属性
        Object object = userClass.newInstance();
        Field field = userClass.getDeclaredField("age");
        field.setAccessible(true);
        field.set(object,18);
        System.out.println(field.get(object));

        //通过反射调用某个方法
        Method methodSet = userClass.getDeclaredMethod("setName", String.class);
        methodSet.setAccessible(true);
        methodSet.invoke(object, "yrs");

        Method methodGet = userClass.getDeclaredMethod("getName");
        methodGet.setAccessible(true);
        System.out.println(methodGet.invoke(object));
    }

}
                