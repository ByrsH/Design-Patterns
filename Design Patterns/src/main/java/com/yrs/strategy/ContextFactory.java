package com.yrs.strategy;

/**
 * @Author: yangrusheng
 * @Description: 利用简单工厂模式创建策略角色
 * @Date: Created in 18:11 2019/6/22
 * @Modified By:
 */
public class ContextFactory {

    private Strategy strategy;

    //判断选择哪个策略放在了封装角色里面，客户端不做判断
    public ContextFactory(Integer type) {
        switch (type) {
            case 1:
                this.strategy = new ConcreteStrategy1();
                break;
            case 2:
                this.strategy = new ConcreteStrategy2();
                break;
            default:
                break;
        }
    }

    //调用策略方法
    public void execute() {
        strategy.execute();
    }

}
