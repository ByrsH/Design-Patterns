package com.yrs.prototype;

import java.util.ArrayList;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 9:15 2018/7/17
 * @Modified By:
 */
public class ShallowCopyPrototype implements Cloneable{
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public ShallowCopyPrototype clone() {
        ShallowCopyPrototype prototype = null;
        try {
            prototype = (ShallowCopyPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
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
