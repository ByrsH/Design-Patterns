package com.yrs.facade;

/**
 * Created by yrs on 2017/7/12.
 */
public class SmartPhone {
    private Phone phone = new Phone();
    private Internet internet = new Internet();
    private MusicPlayer musicPlayer = new MusicPlayer();

    public void callPhone(String phoneNumber) {
        phone.callPhone(phoneNumber);
    }

    public void endPhone() {
        phone.endPhone();
    }

    public void openWeb(String webName) {
        internet.openWeb(webName);
    }

    public void endWeb() {
        internet.endWeb();
    }

    public void playMusic(String musicName) {
        musicPlayer.playMusic(musicName);
    }

    public void endMusic() {
        musicPlayer.endPlay();
    }

}
                