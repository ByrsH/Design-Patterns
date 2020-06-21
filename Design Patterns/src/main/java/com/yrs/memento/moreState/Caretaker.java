package com.yrs.memento.moreState;

/**
 * @Author: yangrusheng
 * @Description: 备忘录管理员角色
 * @Date: Created in 17:36 2020/6/21
 * @Modified By:
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
