package com.yrs.flyweight;

/**
 * @Author: yangrusheng
 * @Description: 抽象享元角色
 * @Date: Created in 16:37 2018/10/20
 * @Modified By:
 */
public abstract class Flyweight {

    //内部状态
    private String intrinsic;

    //外部状态
    private final String extrinsic;

    //要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    //定义业务操作
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
