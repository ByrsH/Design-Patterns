package com.yrs.factoryMethod.StaticFactory;

import com.yrs.factoryMethod.ConcreteProduct1;
import com.yrs.factoryMethod.ConcreteProduct2;
import com.yrs.factoryMethod.Product;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 10:22 2018/7/26
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        Product product = ConcreteFactory.createProduct(ConcreteProduct1.class);
        //业务处理
        product.printName();
        product = ConcreteFactory.createProduct(ConcreteProduct2.class);
        //业务处理
        product.printName();
    }
}
