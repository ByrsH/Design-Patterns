package com.yrs.composite;

import java.util.ArrayList;

/**
 * @Author: yangrusheng
 * @Description: 树枝构件
 * @Date: Created in 17:28 2018/9/24
 * @Modified By:
 */
public class Composite extends Component {

    private ArrayList<Component> componentArrayList = new ArrayList<>();

    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    public Component getChild(int i) {
        return this.componentArrayList.get(i);
    }

    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
