package com.yrs.template;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 9:07 2018/11/13
 * @Modified By:
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        //调用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}
