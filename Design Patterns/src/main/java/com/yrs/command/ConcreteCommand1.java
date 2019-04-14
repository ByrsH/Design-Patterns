package com.yrs.command;

/**
 * @Author: yangrusheng
 * @Description: 具体的命令类
 * @Date: Created in 17:56 2019/4/14
 * @Modified By:
 */
public class ConcreteCommand1 extends Command {

    //哪个receiver类要进行命令处理
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //业务逻辑
        receiver.doSomething1();
        receiver.doSomething3();
    }
}
