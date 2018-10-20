package com.yrs.flyweight;

import java.util.HashMap;

/**
 * @Author: yangrusheng
 * @Description: 享元工厂
 * @Date: Created in 16:45 2018/10/20
 * @Modified By:
 */
public class FlyweightFactory {

    //定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>();

    //享元工厂
    public static Flyweight getFlyweight(String extrinsic) {
        //需要返回的对象
        Flyweight flyweight = null;
        //判断池中是否有该对象
        if (pool.containsKey(extrinsic)) {
            System.out.println("从池中获取");
            flyweight = pool.get(extrinsic);
        } else {
            System.out.println("新建对象");
            //根据外部状态创建享元对象
            flyweight = new ConcreteFlyweitht1(extrinsic);
            //放入池中
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }

}
