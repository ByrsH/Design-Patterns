package com.yrs.visitor;

/**
 * @Author: yangrusheng
 * @Description: 具体元素实现类
 * @Date: Created in 16:05 2020/7/5
 * @Modified By:
 */
public class ConcreteElementB extends Element {

    /**
     * 具体元素特有的方法
     */
    public void specialB() {
        System.out.println("ConcreteElementB special method");
    }

    @Override
    public void doSomething() {
        // 具体元素的业务处理
        System.out.println("ConcreteElementB doSomeThing");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
