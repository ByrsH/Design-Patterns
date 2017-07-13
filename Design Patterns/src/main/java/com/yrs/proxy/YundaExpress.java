package com.yrs.proxy;

/**
 * Created by yrs on 2017/7/13.
 */
public class YundaExpress implements Express{
    public void deliverExpress(String goods) {
        System.out.println("韵达快递将为您寄送：" + goods);
    }

    public void getStateInfo(String goods) {
        System.out.println("您的快递：" + goods + " 已经到目的站，正在为您配送！");
    }
}
                