package com.yrs.composite.transparentModel;

import java.util.ArrayList;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 8:40 2018/9/25
 * @Modified By:
 */
public class Leaf extends Component {

    @Deprecated
    @Override
    public void add(Component component) throws UnsupportedOperationException {
        //空实现，直接抛出“不支持请求”异常
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public Component getChild(int i) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public ArrayList<Component> getChildren() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}
