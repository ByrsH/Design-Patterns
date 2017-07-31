package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public class ElectrombileBuilder implements CarBuilder {

    private Electrombile electrombile = new Electrombile();

    public void buildCarBody() {
        this.electrombile.installCarBody();
    }

    public void buildPowerSystem() {
        this.electrombile.installPowerSystem();
    }

    public void buildWheel() {
        this.electrombile.installWheel();
    }

    public CarModel buildCarModel() {
        return this.electrombile;
    }
}
                