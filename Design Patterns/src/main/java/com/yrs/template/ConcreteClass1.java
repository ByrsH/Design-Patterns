package com.yrs.template;

/**
 * @Author: yangrusheng
 * @Description: 具体模板类
 * @Date: Created in 9:04 2018/11/13
 * @Modified By:
 */
public class ConcreteClass1 extends AbstractClass {
    //实现基本方法
    @Override
    protected void doSomething() {
        //业务逻辑
        System.out.println(this.getClass().getName() + " doSomething method");
    }

    @Override
    protected void doAnything() {
        //业务逻辑
        System.out.println(this.getClass().getName() + " doAnything method");
    }
}
