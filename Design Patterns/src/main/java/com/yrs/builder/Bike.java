package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public class Bike implements CarModel{

    public void installCarBody() {
        System.out.println("安装自行车车身。");
    }

    public void installPowerSystem() {
        System.out.println("安装自行车动力系统：无。");
    }

    public void installWheel() {
        System.out.println("安装自行车车轮。");
    }
}
                