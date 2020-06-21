package com.yrs.memento.standard;

/**
 * @Author: yangrusheng
 * @Description: 备忘录角色
 * @Date: Created in 17:35 2020/6/21
 * @Modified By:
 */
public class Memento {

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
