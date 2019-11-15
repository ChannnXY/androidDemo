package com.channnxy.demo10191944;

import java.util.ArrayList;

public class launchPage {
    public int pic;
    public launchPage(){
        pic = 0;
    }

    private static int[] mPicArray = {
            R.drawable.guide_bg1, R.drawable.guide_bg2, R.drawable.guide_bg3, R.drawable.guide_bg4
    };

    public static ArrayList<launchPage> getDefaultData(){
        ArrayList<launchPage> launchpages = new ArrayList<>();
        for (int i = 0;i<mPicArray.length;i++){
            launchPage launchPage = new launchPage();
            launchPage.pic=mPicArray[i];
            launchpages.add(launchPage);
        }
        return launchpages;
    }
}
