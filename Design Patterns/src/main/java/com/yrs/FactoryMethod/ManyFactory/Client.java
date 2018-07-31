package com.yrs.factoryMethod.ManyFactory;

import com.yrs.factoryMethod.Product;

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
