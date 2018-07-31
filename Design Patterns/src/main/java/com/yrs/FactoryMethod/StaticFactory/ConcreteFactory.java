package com.yrs.factoryMethod.StaticFactory;

import com.yrs.factoryMethod.Product;

/**
 * @Author: yangrusheng
 * @Description: 简单工厂模式或静态工厂模式，去除接口或抽象类，工厂类创建对象的方法变为静态方法。
 * @Date: Created in 10:16 2018/7/26
 * @Modified By:
 */
public class ConcreteFactory {
    public static <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
