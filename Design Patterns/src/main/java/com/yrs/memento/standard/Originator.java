package com.yrs.memento.standard;

/**
 * @Author: yangrusheng
 * @Description: 发起人角色
 * @Date: Created in 17:28 2020/6/21
 * @Modified By:
 */
public class Originator {

    /**
     * 内部状态
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建一个备忘录
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复备数据
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
