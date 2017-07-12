package com.yrs.facade;

/**
 * Created by yrs on 2017/7/12.
 */
public class Phone {
    public void callPhone(String phoneNumber) {
        System.out.println("拨通电话 " + phoneNumber);
    }

    public void endPhone() {
        System.out.println("挂断电话");
    }
}
                