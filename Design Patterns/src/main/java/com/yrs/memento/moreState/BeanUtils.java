package com.yrs.memento.moreState;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yangrusheng
 * @Description: bean 工具类
 * @Date: Created in 18:35 2020/6/21
 * @Modified By:
 */
public class BeanUtils {

    /**
     * 把 bean 中的所有属性及数值放入 Map 中
     * @param bean
     * @return
     */
    public static Map<String, Object> backupProperty(Object bean) {
        Map<String, Object> result = new HashMap<>();
        try {
            // 获得bean 描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            // 获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            // 遍历所有属性
            for (PropertyDescriptor descriptor: descriptors) {
                // 属性名称
                String fieldName = descriptor.getName();
                // 获得属性方法
                Method getter = descriptor.getReadMethod();
                // 读取属性值
                Object fieldValue = getter.invoke(bean, new Object[] {});
                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void restoreProperty(Object bean, Map<String, Object> propertyMap) {
        try {
            // 获得bean 描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            // 获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            // 遍历所有属性
            for (PropertyDescriptor descriptor: descriptors) {
                // 属性名称
                String fieldName = descriptor.getName();
                // 如果有这个属性，则写入对象
                if (propertyMap.containsKey(fieldName)) {
                    Method setter = descriptor.getWriteMethod();
                    setter.invoke(bean, new Object[] {propertyMap.get(fieldName)});
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
