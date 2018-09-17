package com.yrs.adapter;

/**
 * @Author: yangrusheng
 * @Description: 目标角色的实现类
 * @Date: Created in 10:04 2018/9/17
 * @Modified By:
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help,pls call me!");
    }
}
