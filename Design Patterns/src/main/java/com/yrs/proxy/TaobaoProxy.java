package com.yrs.proxy;

/**
 * Created by yrs on 2017/7/13.
 */
public class TaobaoProxy implements Express{

    private Express express;

    protected TaobaoProxy(Express express) {
        this.express = express;
    }

    public void deliverExpress(String goods) {
        System.out.println("淘宝卖家已通知快递揽件：" + goods);
        express.deliverExpress(goods);
    }

    public void getStateInfo(String goods) {
        System.out.println("亲，您的快递" + goods + "快到了哟！");
        express.getStateInfo(goods);
    }
}
                