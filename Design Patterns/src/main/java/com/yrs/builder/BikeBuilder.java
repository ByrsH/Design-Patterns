package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public class BikeBuilder implements CarBuilder {
    private Bike bike = new Bike();
    public void buildCarBody() {
        this.bike.installCarBody();
    }

    public void buildPowerSystem() {
        this.bike.installPowerSystem();
    }

    public void buildWheel() {
        this.bike.installWheel();
    }

    public CarModel buildCarModel() {
        return this.bike;
    }
}
                