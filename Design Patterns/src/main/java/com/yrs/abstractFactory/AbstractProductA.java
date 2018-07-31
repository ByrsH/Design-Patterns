package com.yrs.abstractFactory;

/**
 * @Author: yangrusheng
 * @Description: 产品A和产品B之间可以有关系（共同继承某个接口），也可以没有关系。但是要有相同的约束（类型1、2）。
 * @Date: Created in 10:03 2018/7/31
 * @Modified By:
 */
public abstract class AbstractProductA {

    //产品A共有的方法
    public void commonMethod() {
        System.out.println("this is product A");
    }

    //不同类型产品A共有方法，不同的实现
    public abstract void doSomething();

}
