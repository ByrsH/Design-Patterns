package com.yrs.strategy;

/**
 * @Author: yangrusheng
 * @Description: 具体的策略角色
 * @Date: Created in 18:02 2019/6/22
 * @Modified By:
 */
@StrategyInfo(type = 1)
public class ConcreteStrategy1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("ConcreteStrategy1 execute!!!");
    }
}
