package com.yrs.factoryMethod.simpleFactory;

import com.yrs.factoryMethod.ConcreteProduct1;
import com.yrs.factoryMethod.ConcreteProduct2;
import com.yrs.factoryMethod.Product;

/**
 * @Author: yangrusheng
 * @Description: 简单工厂模式
 * @Date: Created in 18:19 2018/8/12
 * @Modified By:
 */
public class ProductFactory {

    public static Product createProduct(String type) {
        if ("product1".equals(type)) {
            return new ConcreteProduct1();
        } else if ("product2".equals(type)) {
            return new ConcreteProduct2();
        }
        return null;
    }

}
