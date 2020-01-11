package com.yrs.chainOfResponsibility;

/**
 * @Author: yangrusheng
 * @Description: 抽象处理者。主要作用请求接收、传递。
 * @Date: Created in 17:04 2020/1/11
 * @Modified By:
 */
public abstract class Handler {

    /**
     * 下一个责任链节点
     */
    private Handler nextHandler;

    public final void handleRequest(Request request) {
        if (request.getLevel() == this.getLevel()) {
            //此节点处理
            this.doHandle(request);
        } else {
            //判断是否有下个处理节点，传递请求
            if (nextHandler != null) {
                this.nextHandler.handleRequest(request);
            } else {
                System.out.println("this request not handler handle!");
            }
        }
    }

    /**
     * 设置下个处理节点
     * @param nextHandler
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 获得处理者能够处理的请求的等级
     * @return
     */
    protected abstract int getLevel();

    /**
     * 处理请求
     */
    protected abstract void doHandle(Request request);
}
