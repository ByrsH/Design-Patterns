package com.yrs.proxy;

/**
 * Created by yrs on 2017/7/13.
 */
public class TestStaticProxy {

    public static void shop(String goods, Express express) {
        express.deliverExpress(goods);
        express.getStateInfo(goods);
    }

    public static void main(String [] args) {
        String goods = "球衣";
        shop(goods, new YundaExpress());
        shop(goods, new TaobaoProxy(new YundaExpress()));
    }
}
                