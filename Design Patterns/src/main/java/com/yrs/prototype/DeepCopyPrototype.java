package com.yrs.prototype;

import java.util.ArrayList;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 9:21 2018/7/17
 * @Modified By:
 */
public class DeepCopyPrototype implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public DeepCopyPrototype clone() {
        DeepCopyPrototype prototype = null;
        try {
            prototype = (DeepCopyPrototype) super.clone();
            prototype.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }
}
