package com.yrs.factoryMethod;

/**
 * @Author: yangrusheng
 * @Description: 工厂接口
 * @Date: Created in 9:45 2018/7/26
 * @Modified By:
 */
public interface Factory {
    <T extends Product> T createProduct(Class<T> c);
}
