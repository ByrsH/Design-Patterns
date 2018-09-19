package com.yrs.adapter.objectAdapter;

import com.yrs.adapter.Adapter;
import com.yrs.adapter.ConcreteTarget;
import com.yrs.adapter.Target;

/**
 * @program: design-patterns
 * @description:
 * @author: yrs
 * @create: 2018-09-19 18:50
 **/
public class Client {
    public static void main(String[] args) {
        //原有业务逻辑
        Target target = new ConcreteTarget();
        target.request();

        //增加适配器后
        Target target2 = new ObjectAdapter(new Adaptee1(), new Adaptee2());
        target2.request();
    }
}
