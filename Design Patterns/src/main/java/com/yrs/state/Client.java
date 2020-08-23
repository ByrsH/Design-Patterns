package com.yrs.state;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:11 2020/8/23
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        // 定义环境上下文
        Context context = new Context();
        // 初始状态
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
    }

}
