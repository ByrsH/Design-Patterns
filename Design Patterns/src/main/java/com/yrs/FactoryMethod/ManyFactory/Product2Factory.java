package com.yrs.FactoryMethod.ManyFactory;

import com.yrs.FactoryMethod.ConcreteProduct2;
import com.yrs.FactoryMethod.Product;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 10:26 2018/7/26
 * @Modified By:
 */
public class Product2Factory implements Factory {

    public Product createProduct() {
        return new ConcreteProduct2();
    }
}