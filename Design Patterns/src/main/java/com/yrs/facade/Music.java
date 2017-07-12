package com.yrs.facade;

/**
 * Created by yrs on 2017/7/12.
 */
public class Music {
    private String name;
    private String content;

    public Music(String name, String content) {
        this.name = name;
        this.content= content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
                