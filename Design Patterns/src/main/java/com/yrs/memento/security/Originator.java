package com.yrs.memento.security;

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
    public IMemento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复备数据
     * @param iMemento
     */
    public void restoreMemento(IMemento iMemento) {
        this.setState(((Memento)iMemento).getState());
    }

    /**
     * 内部类
     */
    class Memento implements IMemento {
        /**
         * 发起人内部状态
         */
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
