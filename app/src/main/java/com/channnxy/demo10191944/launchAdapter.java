package com.channnxy.demo10191944;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.Console;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

public class launchAdapter extends PagerAdapter {
    private Context mContext;//声明上下文对象
    private ArrayList<View> mViewList = new ArrayList<>();//商品图片视图
    private ArrayList<launchPage> mLaunchPages = new ArrayList<>();//商品信息视图

    public launchAdapter(Context context,ArrayList<launchPage> launchPage){
        mContext = context;
        mLaunchPages = launchPage;
        for(int i = 0;i<mLaunchPages.size();i++){
            //动态控制布局文件
            View view = LayoutInflater.from(mContext).inflate(R.layout.item_launch,null);
            ImageView iv_launch = view.findViewById(R.id.iv_launch);
            RadioGroup rg_indicate = view.findViewById(R.id.rg_indicate);
            iv_launch.setImageResource(mLaunchPages.get(i).pic);
            //生成圆点
            for(int j = 0;j<mLaunchPages.size();j++){
                RadioButton radio = new RadioButton(mContext);
                radio.setLayoutParams(new RadioGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                radio.setPadding(10,10,10,10);
                if(i==j){
                    radio.setButtonDrawable(R.drawable.guide_checked);
                }else{
                    radio.setButtonDrawable(R.drawable.guide);
                }
                rg_indicate.addView(radio);
            }
            //控制按钮
            if(i==3){
                Button btn_start = view.findViewById(R.id.btn_start);
                btn_start.setVisibility(View.VISIBLE);
            }
            mViewList.add(view);
        }
    }
    @Override
    public int getCount() {
        return mViewList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(mViewList.get(position));
        return mViewList.get(position);
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(mViewList.get(position));
    }

}
