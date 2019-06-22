package com.yrs.strategy;

/**
 * @Author: yangrusheng
 * @Description: 封装角色
 * @Date: Created in 18:04 2019/6/22
 * @Modified By:
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    //调用策略方法
    public void execute() {
        strategy.execute();
    }

}
