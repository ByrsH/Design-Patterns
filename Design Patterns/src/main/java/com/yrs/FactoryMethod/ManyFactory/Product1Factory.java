package com.yrs.factoryMethod.ManyFactory;

import com.yrs.factoryMethod.ConcreteProduct1;
import com.yrs.factoryMethod.Product;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 10:26 2018/7/26
 * @Modified By:
 */
public class Product1Factory implements Factory {
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
