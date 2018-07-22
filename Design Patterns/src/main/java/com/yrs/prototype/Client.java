package com.yrs.prototype;

/**
 * @Author: yangrusheng
 * @Description:
 * @Date: Created in 19:04 2018/7/22
 * @Modified By:
 */
public class Client {

    public static void main(String[] args) {
        Prototype shallowPrototype = new ConcreteShallowPrototype();
        shallowPrototype.setValue("yrs");
        Prototype copyShallowPrototype = shallowPrototype.clone();
        System.out.println(shallowPrototype.getValue());
        System.out.println(copyShallowPrototype.getValue());
        copyShallowPrototype.setValue("ByrsH");
        System.out.println(shallowPrototype.getValue());
        System.out.println(copyShallowPrototype.getValue());

        System.out.println("**************************");

        Prototype deepPrototype = new ConcreteDeepPrototype();
        deepPrototype.setValue("yrs");
        Prototype copyDeepPrototype = deepPrototype.clone();
        System.out.println(deepPrototype.getValue());
        System.out.println(copyDeepPrototype.getValue());
        copyDeepPrototype.setValue("ByrsH");
        System.out.println(deepPrototype.getValue());
        System.out.println(copyDeepPrototype.getValue());
    }

}
