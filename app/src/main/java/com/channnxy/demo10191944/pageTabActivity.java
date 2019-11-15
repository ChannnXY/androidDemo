package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;

import java.util.ArrayList;

public class pageTabActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private ArrayList<GoodsInfo> mgoodsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_tab);

        initPageStrip();//翻页标题栏
        initViewPager();//初始化翻页视图
    }

    private void initViewPager() {
        //初始化mgoodList
        mgoodsList = GoodsInfo.getDefaultList();
        ImagePagerAdapter adapter = new ImagePagerAdapter(this,mgoodsList);
        //创建适配器
        ViewPager mvp_content = findViewById(R.id.vp_contentTab);
        mvp_content.setAdapter(adapter);
        mvp_content.setCurrentItem(0);
        mvp_content.addOnPageChangeListener(this);
    }

    private void initPageStrip() {
        //设置标题样式
        PagerTitleStrip mpts_title = findViewById(R.id.pts_titleTab);
        mpts_title.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        mpts_title.setTextColor(Color.RED);
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
