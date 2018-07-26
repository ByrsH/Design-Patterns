package com.yrs.FactoryMethod.ManyFactory;

import com.yrs.FactoryMethod.ConcreteProduct1;
import com.yrs.FactoryMethod.ConcreteProduct2;
import com.yrs.FactoryMethod.Product;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 10:29 2018/7/26
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {

        Factory factory = new Product1Factory();
        Product product = factory.createProduct();
        //业务处理
        product.printName();

        factory = new Product2Factory();
        product = factory.createProduct();
        //业务处理
        product.printName();
    }
}
