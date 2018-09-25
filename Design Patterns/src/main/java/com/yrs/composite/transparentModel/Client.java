package com.yrs.composite.transparentModel;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 8:47 2018/9/25
 * @Modified By:
 */
public class Client {
    //通过递归遍历树
    public static void deploy(Component root) {
        for (Component item : root.getChildren()) {
            if (item instanceof Leaf) {
                item.doSomething();
            } else {
                deploy(item);
            }
        }
    }
}
