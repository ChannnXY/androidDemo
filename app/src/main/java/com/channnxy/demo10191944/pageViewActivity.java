package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerTitleStrip;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Toast;

import java.util.ArrayList;

public class pageViewActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ArrayList<GoodsInfo> mgoodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_view);

        initPageStrip();//翻页标题栏
        initViewPager();//初始化翻页视图
    }

    private void initViewPager() {
        //初始化mgoodList
        mgoodsList = GoodsInfo.getDefaultList();
        ImagePagerAdapter adapter = new ImagePagerAdapter(this,mgoodsList);
        //创建适配器
        ViewPager mvp_content = findViewById(R.id.vp_content);
        mvp_content.setAdapter(adapter);
        mvp_content.setCurrentItem(0);
        mvp_content.addOnPageChangeListener(this);
    }

    private void initPageStrip() {
        //设置标题样式
        PagerTitleStrip mpts_title = findViewById(R.id.pts_title);
        mpts_title.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);
        mpts_title.setTextColor(Color.RED);
    }

    /*
     *在页面滑动过程中触发。
     * position表示当前页面的序号；
     * positionOffset表示当前页面偏移的百分比，取值为0到1；
     * positionOffsetPixels表示当前页面的偏移距离。
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        Toast.makeText(pageViewActivity.this,"您现在选择的是第"+position+"个",Toast.LENGTH_SHORT).show();
    }

    /*
     *在选中页面时，即滑动结束后触发。
     * position表示当前滑到了哪一个页面。
     */
    @Override
    public void onPageSelected(int position) {

    }

    /*
    在页面滑动状态变化时触发。
    state取值说明为：0表示静止，1表示正在滑动，2表示滑动完毕。
    在翻页过程中，状态值变化依次为：正在滑动→滑动完毕→静止。
     */
    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
