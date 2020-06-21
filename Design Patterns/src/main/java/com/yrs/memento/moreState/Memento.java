package com.yrs.memento.moreState;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangrusheng
 * @Description: 备忘录角色
 * @Date: Created in 17:35 2020/6/21
 * @Modified By:
 */
public class Memento {

    /**
     * 发起人内部状态，用 Map 存储多个状态
     */
    private Map<String, Object> stateMap;

    public Memento(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
