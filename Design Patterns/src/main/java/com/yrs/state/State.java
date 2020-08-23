package com.yrs.state;

/**
 * @Author: yangrusheng
 * @Description: 抽象状态角色
 * @Date: Created in 17:11 2020/8/23
 * @Modified By:
 */
public abstract class State {

    // 供子类访问，调用相关方法
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 行为1
    public abstract void handle1();

    //行为2
    public abstract void handle2();
}
