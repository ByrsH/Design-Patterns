package com.yrs.memento.clone;

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
        // 备份
        originator.createMemento();
        // 改变状态
        originator.setState("state2");
        System.out.println("changed state: " + originator.getState());
        // 恢复之前状态
        originator.restoreMemento();
        System.out.println("restore state: " + originator.getState());
    }

}
