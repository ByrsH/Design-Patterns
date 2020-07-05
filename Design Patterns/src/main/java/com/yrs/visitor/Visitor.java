package com.yrs.visitor;

/**
 * @Author: yangrusheng
 * @Description: 具体访问者实现类
 * @Date: Created in 16:30 2020/7/5
 * @Modified By:
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElementA elementA) {
        elementA.doSomething();
        elementA.specialA();
    }

    @Override
    public void visit(ConcreteElementB elementB) {
        elementB.doSomething();
        elementB.specialB();
    }
}
