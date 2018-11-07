package com.yrs.bridge;

/**
 * @Author: yangrusheng
 * @Description: 场景类
 * @Date: Created in 9:17 2018/11/7
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        //定义一个抽象化角色
        Abstraction abstraction = new RefineAbstraction(imp);
        //执行
        abstraction.request();
    }

}
