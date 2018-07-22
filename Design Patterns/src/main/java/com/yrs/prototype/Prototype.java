package com.yrs.prototype;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 18:48 2018/7/22
 * @Modified By:
 */
public interface Prototype extends Cloneable{
    Prototype clone();
    void setValue(String str);
    Object getValue();
}
