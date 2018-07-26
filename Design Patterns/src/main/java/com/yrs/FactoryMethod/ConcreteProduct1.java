package com.yrs.FactoryMethod;


/**
 * @Author: yangrusheng
 * @Description: 产品具体实现类
 * @Date: Created in 9:42 2018/7/26
 * @Modified By:
 */
public class ConcreteProduct1 implements Product {
    public void printName() {
        System.out.println(this.getClass().getName());
    }
}
