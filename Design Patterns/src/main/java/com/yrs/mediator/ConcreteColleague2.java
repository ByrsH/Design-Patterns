package com.yrs.mediator;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 17:59 2019/1/20
 * @Modified By:
 */
public class ConcreteColleague2 extends Colleague {
    //通过构造函数传递中介者
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    //自有方法
    public void selfMethod2() {
        System.out.println("self method2");
    }
    //依赖其他同事方法
    public void depMethod2() {
        //处理自己的业务逻辑
        //自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething2();
    }

}
