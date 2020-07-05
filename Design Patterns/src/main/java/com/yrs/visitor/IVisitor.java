package com.yrs.visitor;

/**
 * @Author: yangrusheng
 * @Description: 抽象访问者
 * @Date: Created in 16:03 2020/7/5
 * @Modified By:
 */
public interface IVisitor {

    /**
     * 访问对象
     * @param elementA
     */
    public void visit(ConcreteElementA elementA);

    /**
     * 访问对象
     * @param elementB
     */
    public void visit(ConcreteElementB elementB);

}
