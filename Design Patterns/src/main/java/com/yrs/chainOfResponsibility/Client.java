package com.yrs.chainOfResponsibility;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 17:04 2020/1/11
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Request request1 = new Request(1, "request1");
        Request request2 = new Request(2, "request2");
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        //设置下一个处理节点
        handler1.setNextHandler(handler2);
        //提交请求
        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
    }

}
