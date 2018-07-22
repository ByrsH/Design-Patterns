package com.yrs.prototype;

import java.util.ArrayList;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:54 2018/7/22
 * @Modified By:
 */
public class ConcreteDeepPrototype implements Prototype {

    private ArrayList<String> arrayList = new ArrayList<String>();

    public ConcreteDeepPrototype() {
        System.out.println("deep clone constructor execute");
    }

    @Override
    public ConcreteDeepPrototype clone() {
        ConcreteDeepPrototype prototype = null;
        try {
            //深拷贝
            prototype = (ConcreteDeepPrototype) super.clone();
            prototype.arrayList = (ArrayList<String>) this.arrayList.clone();
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
