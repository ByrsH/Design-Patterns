package com.yrs.bridge;

/**
 * @Author: yangrusheng
 * @Description: 具体抽象化角色
 * @Date: Created in 9:14 2018/11/7
 * @Modified By:
 */
public class RefineAbstraction extends Abstraction {

    //重写构造函数
    public RefineAbstraction(Implementor imp) {
        super(imp);
    }

    //修正父类的行为
    @Override
    public void request() {
        /*
         *  业务逻辑处理...
         */
        super.request();
        super.getImp().doAnything();
    }

}
