package com.yrs.facade;

import java.util.Random;

/**
 * Created by yrs on 2017/7/12.
 */
public class MusicPlayer {

    public void playMusic(String musicName) {
        Music music = searchMusic(musicName);
        System.out.println("播放音乐：" + music.getContent());
    }

    public void endPlay() {
        System.out.println("关闭音乐");
    }

    private Music searchMusic(String musicName) {
        //模拟本地是否有该音乐,如果没有则通过Internet类下载音乐
        Random random = new Random();
        if (random.nextInt(4) % 2 == 0) {
            String content = "本地音乐：" + musicName;
            return new Music(musicName, content);
        }else {
            Internet internet = new Internet();
            return internet.downloadMusic(musicName);
        }
    }

}
                