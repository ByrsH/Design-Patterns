package com.yrs.prototype;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 8:39 2018/7/18
 * @Modified By:
 */
public class PrototypeClass implements Cloneable {
    //覆写父类Object方法
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
            //如要实现深拷贝，则类成员变量数组、引用对象也需clone。
        } catch (CloneNotSupportedException e) {
            //异常处理
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
