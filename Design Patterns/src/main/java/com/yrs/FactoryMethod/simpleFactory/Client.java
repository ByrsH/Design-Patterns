package com.yrs.factoryMethod.simpleFactory;

import com.yrs.factoryMethod.Product;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:26 2018/8/12
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Product product = ProductFactory.createProduct("product1");
        product.printName();

        product = ProductFactory.createProduct("product2");
        product.printName();
    }

}
