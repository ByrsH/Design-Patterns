package com.yrs.strategy;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:07 2019/6/22
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //声明具体策略
        Strategy strategy = new ConcreteStrategy1();
        //声明上下文对象
        Context context = new Context(strategy);
        //执行策略方法
        context.execute();

        // 简单工厂 + 策略模式。客户端不需要知道使用哪个策略类
        ContextFactory contextFactory = new ContextFactory(2);
        contextFactory.execute();

        // 注解 + 反射
        AnnotationReflectContext annotationReflectContext = new AnnotationReflectContext(1);
        annotationReflectContext.execute();
    }

}
