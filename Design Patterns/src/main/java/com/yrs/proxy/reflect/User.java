package com.yrs.proxy.reflect;

import java.io.Serializable;

/**
 * Created by yrs on 2017/7/13.
 */
public class User implements Serializable{
    private int age;
    private String name;

    public User() {

    }

    public User(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
                