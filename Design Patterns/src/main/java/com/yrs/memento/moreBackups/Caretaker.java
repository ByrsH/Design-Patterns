package com.yrs.memento.moreBackups;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangrusheng
 * @Description: 备忘录管理员角色
 * @Date: Created in 17:36 2020/6/21
 * @Modified By:
 */
public class Caretaker {

    private Map<String, Memento> mementoMap = new HashMap<>();

    public Memento getMemento(String key) {
        return mementoMap.get(key);
    }

    public void setMemento(String key, Memento memento) {
        mementoMap.put(key, memento);
    }
}
