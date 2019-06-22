package com.yrs.strategy;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.reflections.Reflections;

/**
 * @Author: yangrusheng
 * @Description: 注解 + 反射 创建具体策略对象
 * @Date: Created in 18:44 2019/6/22
 * @Modified By:
 */
public class AnnotationReflectContext {

    private final static Map<Integer, Class> allStrategyMap = new ConcurrentHashMap<>();

    private final static String pkgName = "com.yrs.strategy";

    private Strategy strategy;

    static {
        Reflections reflections = new Reflections(pkgName);
        Set<Class<?>> annotatedClasses = reflections.getTypesAnnotatedWith(StrategyInfo.class);
        for (Class<?> classObj: annotatedClasses) {
            StrategyInfo strategyInfo = classObj.getAnnotation(StrategyInfo.class);
            allStrategyMap.put(strategyInfo.type(), classObj);
        }
    }

    public AnnotationReflectContext(Integer type) {
        if (allStrategyMap.containsKey(type)) {
            try {
                this.strategy = (Strategy) allStrategyMap.get(type).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    //调用策略方法
    public void execute() {
        strategy.execute();
    }

}
