package com.yrs.state;

/**
 * @Author: yangrusheng
 * @Description: 环境上下文角色
 * @Date: Created in 17:14 2020/8/23
 * @Modified By:
 */
public class Context {

    // 所有状态
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    // 当前状态
    private State currentState;

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        // 切换状态
        this.currentState = currentState;
        // 和当前状态建立联系
        this.currentState.setContext(this);
    }

    // 行为委托
    public void handle1() {
        this.currentState.handle1();
    }

    public void handle2() {
        this.currentState.handle2();
    }

}
