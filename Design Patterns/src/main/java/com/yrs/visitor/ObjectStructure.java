package com.yrs.visitor;

import java.util.Random;

/**
 * @Author: yangrusheng
 * @Description: 结构对象
 * @Date: Created in 16:41 2020/7/5
 * @Modified By:
 */
public class ObjectStructure {

    /**
     * 元素对象创建
     * @return
     */
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElementA();
        } else {
            return new ConcreteElementB();
        }
    }

}
