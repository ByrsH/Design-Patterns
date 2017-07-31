package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public class Electrombile implements CarModel{
    public void installCarBody() {
        System.out.println("安装电动车车身。");
    }

    public void installPowerSystem() {
        System.out.println("安装电动车动力系统：电力动力系统。");
    }

    public void installWheel() {
        System.out.println("安装电动车车轮。");
    }
}
                