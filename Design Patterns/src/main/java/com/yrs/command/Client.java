package com.yrs.command;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:04 2019/4/14
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        //声明调用者
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreteReceiver1();
        //定义一个命令
        Command command = new ConcreteCommand1(receiver);
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();

        //执行其他命令
        receiver = new ConcreteReceiver2();
        command = new ConcreteCommand2(receiver);
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
