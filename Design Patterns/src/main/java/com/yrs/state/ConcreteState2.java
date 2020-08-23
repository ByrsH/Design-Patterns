package com.yrs.state;

/**
 * @Author: yangrusheng
 * @Description: 具体状态
 * @Date: Created in 17:13 2020/8/23
 * @Modified By:
 */
public class ConcreteState2 extends State {

    @Override
    public void handle1() {
        // 状态变化，执行相应状态的动作
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2() {
        // 该状态下所要做的事
        System.out.println("concrete state2 execute handle2");
    }
}
