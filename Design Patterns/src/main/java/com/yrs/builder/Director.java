package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public class Director {
    private CarBuilder carBuilder;

    public Director(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public CarModel constructCarModel() {
        this.carBuilder.buildCarBody();
        this.carBuilder.buildPowerSystem();
        this.carBuilder.buildWheel();
        return this.carBuilder.buildCarModel();
    }

}
                