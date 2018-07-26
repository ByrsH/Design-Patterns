package com.yrs.FactoryMethod;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 9:56 2018/7/26
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProduct1.class);
        //业务处理
        product.printName();
        product = factory.createProduct(ConcreteProduct2.class);
        //业务处理
        product.printName();
    }
}
