package com.yrs.chainOfResponsibility;

/**
 * @Author: yangrusheng
 * @Description: 具体处理者
 * @Date: Created in 17:26 2020/1/11
 * @Modified By:
 */
public class ConcreteHandler2 extends Handler {
    @Override
    protected int getLevel() {
        return 2;
    }

    @Override
    protected void doHandle(Request request) {
        System.out.println("concreteHandler2 handle request: " + request.getMsg());
    }
}
