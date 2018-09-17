package com.yrs.adapter;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 10:10 2018/9/17
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //原有业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        //增加适配器后
        Target target2 = new Adapter();
        target2.request();
    }

}
