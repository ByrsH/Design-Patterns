package com.yrs.chainOfResponsibility;

/**
 * @Author: yangrusheng
 * @Description: 请求类
 * @Date: Created in 17:07 2020/1/11
 * @Modified By:
 */
public class Request {

    /**
     * 处理级别
     */
    private int level;

    /**
     * 处理内容
     */
    private String msg;

    public Request() {

    }

    public Request(int level, String msg) {
        this.level = level;
        this.msg = msg;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
