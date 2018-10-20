package com.yrs.flyweight;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 16:59 2018/10/20
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("yrs");
        flyweight1.setIntrinsic("25");
        flyweight1.operate();

        Flyweight flyweight2 = FlyweightFactory.getFlyweight("yrs");
        flyweight2.operate();
        flyweight2.setIntrinsic("26");
        flyweight2.operate();

    }

}
