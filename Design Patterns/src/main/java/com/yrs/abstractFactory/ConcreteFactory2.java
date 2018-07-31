package com.yrs.abstractFactory;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 10:26 2018/7/31
 * @Modified By:
 */
public class ConcreteFactory2 extends AbstractFactory {
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
