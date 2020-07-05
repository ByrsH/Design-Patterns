package com.yrs.visitor;

/**
 * @Author: yangrusheng
 * @Description: 场景类
 * @Date: Created in 16:51 2020/7/5
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            // 获取元素
            Element element = ObjectStructure.createElement();
            // 接受访问者访问
            element.accept(new Visitor());
        }
    }

}
