package com.yrs.builder;

/**
 * Created by yrs on 2017/7/31.
 */
public class Client {

    public static void main(String [] args) {
        BikeBuilder bikeBuilder = new BikeBuilder();
        Director director = new Director(bikeBuilder);
        Bike bike = (Bike)director.constructCarModel();

        ElectrombileBuilder electrombileBuilder = new ElectrombileBuilder();
        director = new Director(electrombileBuilder);
        Electrombile electrombile = (Electrombile)director.constructCarModel();

        MotorbikeBuilder motorbikeBuilder = new MotorbikeBuilder();
        director = new Director(motorbikeBuilder);
        Motorbike motorbike = (Motorbike)director.constructCarModel();
    }

}
                