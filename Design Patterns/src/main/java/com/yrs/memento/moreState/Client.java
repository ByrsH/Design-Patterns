package com.yrs.memento.moreState;


/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:16 2020/6/21
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState1("state1");
        originator.setState2("state2");
        originator.setState3("state3");
        System.out.println("init state: " + originator.toString());
        // 备份
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        // 改变状态
        originator.setState1("state11");
        originator.setState2("state22");
        originator.setState3("state33");
        System.out.println("changed state: " + originator.toString());
        // 恢复之前状态
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("restore state: " + originator.toString());
    }

}
