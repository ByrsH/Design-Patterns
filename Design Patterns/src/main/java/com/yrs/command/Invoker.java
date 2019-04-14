package com.yrs.command;

/**
 * @Author: yangrusheng
 * @Description: 调用者
 * @Date: Created in 18:01 2019/4/14
 * @Modified By:
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //执行命令
    public void action() {
        this.command.execute();
    }
}
