package com.yrs.memento.clone;

import com.yrs.memento.standard.Memento;

/**
 * @Author: yangrusheng
 * @Description: 发起人角色
 * @Date: Created in 17:28 2020/6/21
 * @Modified By:
 */
public class Originator implements Cloneable {

    private Originator backup;

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
     */
    public void createMemento() {
        this.backup = this.clone();
    }

    /**
     * 恢复备数据
     */
    public void restoreMemento() {
        if (this.backup != null) {
            this.setState(this.backup.state);
        }
    }

    /**
     * clone 对象
     * @return
     */
    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
