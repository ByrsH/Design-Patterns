package com.yrs.facade;

/**
 * Created by yrs on 2017/7/12.
 */
public class Internet {

    public void openWeb(String webName) {
        System.out.println("打开网站：" + webName);
    }

    public void endWeb() {
        System.out.println("关闭网站");
    }

    public Music downloadMusic(String musicName) {
        System.out.println("下载音乐：" + musicName);
        String content = "网络下载音乐：" + musicName;
        return new Music(musicName, content);
    }

}
                