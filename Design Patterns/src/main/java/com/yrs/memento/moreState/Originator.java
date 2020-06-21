package com.yrs.memento.moreState;

/**
 * @Author: yangrusheng
 * @Description: 发起人角色
 * @Date: Created in 17:28 2020/6/21
 * @Modified By:
 */
public class Originator {

    /**
     * 内部多个状态
     */
    private String state1;

    private String state2;

    private String state3;

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    /**
     * 创建一个备忘录
     * @return
     */
    public Memento createMemento() {
        return new Memento(BeanUtils.backupProperty(this));
    }

    /**
     * 恢复备数据
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        BeanUtils.restoreProperty(this, memento.getStateMap());
    }

    @Override
    public String toString() {
        return "state1: " + this.state1 + ", state2: " + this.state2 + ", state3: " + this.state3;
    }
}
