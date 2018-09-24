package com.yrs.composite;

/**
 * @Author: yangrusheng
 * @Description: 场景类
 * @Date: Created in 17:34 2018/9/24
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子构件
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    //通过递归遍历树
    public static void display(Composite root) {
        for (Component item : root.getChildren()) {
            if (item instanceof Leaf) {  //叶子节点
                item.doSomething();
            }else {  //树枝节点
                display((Composite) item);
            }
        }
    }

}
