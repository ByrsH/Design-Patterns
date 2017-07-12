package com.yrs.facade;

/**
 * Created by yrs on 2017/7/12.
 */
public class TestFacade {
    public static void main(String [] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.callPhone("18888888888");
        smartPhone.endPhone();

        smartPhone.openWeb("https://github.com/ByrsH");
        smartPhone.endWeb();

        smartPhone.playMusic("山丘");
        smartPhone.endMusic();
    }

}
                