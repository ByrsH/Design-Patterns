package com.yrs.FactoryMethod;

/**
 * @Author: yangrusheng
 * @Description: 工厂具体实现，用于创建产品对象
 * @Date: Created in 9:49 2018/7/26
 * @Modified By:
 */
public class ConcreteFactory implements Factory {
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
