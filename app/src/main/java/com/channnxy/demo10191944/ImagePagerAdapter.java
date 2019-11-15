package com.channnxy.demo10191944;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;

public class ImagePagerAdapter extends PagerAdapter {
    private Context mContext;//声明上下文对象
    private ArrayList<ImageView> mViewList = new ArrayList<>();//商品图片视图
    private ArrayList<GoodsInfo> mGoodsList = new ArrayList<>();//商品信息视图

    public ImagePagerAdapter(Context context,ArrayList<GoodsInfo> goodsList){
        mContext = context;
        mGoodsList = goodsList;
        for(int i = 0;i<mGoodsList.size();i++){
            ImageView view = new ImageView(mContext);
            //动态控制布局文件
            view.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT
            ));
            view.setImageResource(mGoodsList.get(i).pic);
            //缩放类型
            view.setScaleType(ImageView.ScaleType.FIT_CENTER);
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

    //获取指定的标题文本
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mGoodsList.get(position).name;
    }
}
