package com.yrs.mediator;

/**
 * @Author: yangrusheng
 * @Description: 抽象同事类
 * @Date: Created in 17:57 2019/1/20
 * @Modified By:
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
