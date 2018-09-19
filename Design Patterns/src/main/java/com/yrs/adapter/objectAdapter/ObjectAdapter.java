package com.yrs.adapter.objectAdapter;

import com.yrs.adapter.Target;

/**
 * @program: design-patterns
 * @description: 对象适配器，其和被适配者的关系是组合关系，通过组合被配置对象来实现借口的适配
 * @author: yrs
 * @create: 2018-09-19 18:50
 **/
public class ObjectAdapter implements Target {
    private Adaptee1 adaptee1 = null;
    private Adaptee2 adaptee2 = null;

    public ObjectAdapter(Adaptee1 adaptee1, Adaptee2 adaptee2) {
        this.adaptee1 = adaptee1;
        this.adaptee2 = adaptee2;
    }


    @Override
    public void request() {
        adaptee1.request1();
        adaptee2.request2();
    }
}
