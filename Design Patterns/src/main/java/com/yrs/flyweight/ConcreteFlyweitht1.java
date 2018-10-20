package com.yrs.flyweight;

/**
 * @Author: yangrusheng
 * @Description: 具体享元角色
 * @Date: Created in 16:42 2018/10/20
 * @Modified By:
 */
public class ConcreteFlyweitht1 extends Flyweight {

    public ConcreteFlyweitht1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println(this.getClass().getName() + " " + this.getIntrinsic());
    }
}
