package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public class MotorbikeBuilder implements CarBuilder {

    private Motorbike motorbike = new Motorbike();

    public void buildCarBody() {
        this.motorbike.installCarBody();
    }

    public void buildPowerSystem() {
        this.motorbike.installPowerSystem();
    }

    public void buildWheel() {
        this.motorbike.installWheel();
    }

    public CarModel buildCarModel() {
        return this.motorbike;
    }
}
                