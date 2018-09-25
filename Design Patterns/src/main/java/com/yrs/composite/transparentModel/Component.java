package com.yrs.composite.transparentModel;

import java.util.ArrayList;

/**
 * @Author: yangrusheng
 * @Description: 透明模式下的抽象构建，把用来组合使用的方法放在抽象类中
 * @Date: Created in 8:31 2018/9/25
 * @Modified By:
 */
public abstract class Component {

    //个体和整体都具有的方法
    public void doSomething() {
        //编写业务逻辑
    }

    //增加一个叶子构件或树枝构件
    public abstract void add(Component component);

    //删除一个叶子构件或树枝构件
    public abstract void remove(Component component);

    //获得一个叶子构件或树枝构件
    public abstract Component getChild(int i);

    //获得分支下的所有叶子构件和树枝构件
    public abstract ArrayList<Component> getChildren();

}
