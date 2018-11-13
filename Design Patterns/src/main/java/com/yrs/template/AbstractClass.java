package com.yrs.template;

/**
 * @Author: yangrusheng
 * @Description: 抽象模板类
 * @Date: Created in 9:00 2018/11/13
 * @Modified By:
 */
public abstract class AbstractClass {

    //基本方法
    protected abstract void doSomething();

    //基本方法
    protected abstract void doAnything();

    //模板方法
    public void templateMethod() {
        /*
         * 调用基本方法完成相关逻辑
         */
        this.doSomething();
        this.doAnything();
    }

}
