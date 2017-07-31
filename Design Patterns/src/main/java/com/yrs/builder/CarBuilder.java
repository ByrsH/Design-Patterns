package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public interface CarBuilder {
    void buildCarBody();
    void buildPowerSystem();
    void buildWheel();
    CarModel buildCarModel();
}
