package com.yrs.prototype;

import java.util.ArrayList;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:54 2018/7/22
 * @Modified By:
 */
public class ConcreteShallowPrototype implements Prototype {

    private ArrayList<String> arrayList = new ArrayList<String>();

    public ConcreteShallowPrototype() {
        System.out.println("shallow clone constructor execute");
    }

    @Override
    public ConcreteShallowPrototype clone() {
        ConcreteShallowPrototype prototype = null;
        try {
            //浅拷贝
            prototype = (ConcreteShallowPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            //异常处理
            e.printStackTrace();
        }
        return prototype;
    }

    //设置HashMap的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    //取得arrayList的值
    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
