package com.yrs.command;

/**
 * @Author: yangrusheng
 * @Description: 抽象的Command类
 * @Date: Created in 17:53 2019/4/14
 * @Modified By:
 */
public abstract class Command {

    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();

}
