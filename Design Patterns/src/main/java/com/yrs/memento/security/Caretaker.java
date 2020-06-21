package com.yrs.memento.security;

/**
 * @Author: yangrusheng
 * @Description: 备忘录管理员角色
 * @Date: Created in 17:36 2020/6/21
 * @Modified By:
 */
public class Caretaker {

    private IMemento iMemento;

    public IMemento getIMemento() {
        return iMemento;
    }

    public void setIMemento(IMemento iMemento) {
        this.iMemento = iMemento;
    }
}
