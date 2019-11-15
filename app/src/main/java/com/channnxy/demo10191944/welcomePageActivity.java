package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class welcomePageActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private ArrayList<launchPage> mArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        initPageAdapter();
    }

    private void initPageAdapter() {
        mArrayList = launchPage.getDefaultData();
        launchAdapter adapter = new launchAdapter(this,mArrayList);
        //创建适配器
        ViewPager mvp_content = findViewById(R.id.vp_welcome);
        mvp_content.setAdapter(adapter);
        mvp_content.setCurrentItem(0);
        mvp_content.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
