package com.yrs.proxy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by yrs on 2017/7/13.
 */
public class ReflectUtil {

    public void printClassInfo(Class<?> object) {
        System.out.println("类名：" + object.getName());

        Class<?> ParentClass = object.getSuperclass();
        System.out.println("父类名：" + ParentClass.getName());

        Class<?> interfaces[] = object.getInterfaces();
        System.out.println("类实现的接口：");
        for (Class<?> inter: interfaces) {
            System.out.println("  " + inter.getName());
        }
    }

    public void printClassConstructor(Class<?> object) {
        Constructor<?> constructors[] = object.getConstructors();
        System.out.println("类的构造器：");
        for (Constructor<?> constructor: constructors) {
            System.out.println("  构造器名：" + constructor.getName());
            System.out.println("  构造器参数数量：" + constructor.getParameterCount());
            System.out.print("  参数类型：");
            Class<?> types[] = constructor.getParameterTypes();
            for (Class<?> type: types) {
                System.out.print("  " + type.getName());
            }
            System.out.println();
        }
    }

    public void printField(Class<?> object) {
        //获取本类的字段，包括public、protect、private修饰的字段，但不包括父类的字段
        Field[] fields = object.getDeclaredFields();
        //获取类实现的接口或父类的字段，
        //Field[] fields = object.getFields();
        System.out.println("类的字段：");
        for (Field field: fields) {
            System.out.println("  " + field.getType().getName() + " " + field.getName());
        }
    }

    public void printMethod(Class<?> object) {
        //获取本类的方法，但不包括父类的方法
        Method[] methods = object.getDeclaredMethods();
        //获取类的所有方法，包括父类的方法
        //Method[] methods = object.getMethods();
        System.out.println("类的方法：");
        for (Method method: methods) {
            System.out.print("  " + method.getReturnType().getName() + " " + method.getName() + "(");
            for (Parameter parameter: method.getParameters()) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName());
            }
            System.out.println(")");
        }
    }

}
                