package com.yrs.visitor;

/**
 * @Author: yangrusheng
 * @Description: 抽象元素
 * @Date: Created in 16:00 2020/7/5
 * @Modified By:
 */
public abstract class Element {

    /**
     * 定义业务逻辑
     */
    public abstract void doSomething();

    /**
     * 接受访问者访问
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);

}
