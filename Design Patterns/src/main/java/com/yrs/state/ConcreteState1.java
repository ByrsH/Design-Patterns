package com.yrs.state;

/**
 * @Author: yangrusheng
 * @Description: 具体状态
 * @Date: Created in 17:13 2020/8/23
 * @Modified By:
 */
public class ConcreteState1 extends State {

    @Override
    public void handle1() {
        // 该状态下所要做的事
        System.out.println("concrete state1 execute handle1");
    }

    @Override
    public void handle2() {
        // 状态改变，执行对应状态动作
        super.context.setCurrentState(Context.STATE2);
        super.context.handle2();
    }
}
