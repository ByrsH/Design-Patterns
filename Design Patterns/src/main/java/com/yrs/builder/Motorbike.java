package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public class Motorbike implements CarModel {
    public void installCarBody() {
        System.out.println("安装摩托车车身。");
    }

    public void installPowerSystem() {
        System.out.println("安装摩托车动力系统：汽油动力系统。");
    }

    public void installWheel() {
        System.out.println("安装摩托车车轮。");
    }
}
                