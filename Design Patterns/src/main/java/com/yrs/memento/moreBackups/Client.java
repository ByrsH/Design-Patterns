package com.yrs.memento.moreBackups;


/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:16 2020/6/21
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("state1");
        System.out.println("init state: " + originator.getState());
        // 带标签备份
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento("1", originator.createMemento());
        // 改变状态
        originator.setState("state2");
        System.out.println("changed state: " + originator.getState());
        // 带标签备份
        caretaker.setMemento("2", originator.createMemento());
        // 恢复之前状态
        originator.restoreMemento(caretaker.getMemento("1"));
        System.out.println("restore state1: " + originator.getState());
        originator.restoreMemento(caretaker.getMemento("2"));
        System.out.println("restore state2: " + originator.getState());
    }

}
