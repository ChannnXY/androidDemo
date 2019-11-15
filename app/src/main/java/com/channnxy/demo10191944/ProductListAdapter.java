package com.channnxy.demo10191944;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ProductListAdapter extends BaseAdapter implements AdapterView.OnItemClickListener {

    private Context mContext; // 声明一个上下文对象
    private ArrayList<Product> mProductList; // 声明一个行星信息队列

    public ProductListAdapter(Context context, ArrayList<Product> product_list) {
        mContext = context;
        mProductList = product_list;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String desc = "您选择的是"+mProductList.get(position).title;
        Toast.makeText(mContext,desc,Toast.LENGTH_SHORT).show();
    }

    @Override
    public int getCount() {
        return mProductList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProductList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public final class ViewHolder {
        public ImageView mimg_imgView; // 声明行星图片的图像视图对象
        public TextView mtv_title; // 声明行星名称的文本视图对象
        public TextView mtv_desc; // 声明行星描述的文本视图对象
        public TextView mtv_distance;
        public TextView mtv_current;
        public TextView mtv_original;
        public  TextView mtv_discount;
        public TextView mtv_process;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) { // 转换视图为空
            holder = new ViewHolder(); // 创建一个新的视图持有者
            // 根据布局文件item_list.xml生成转换视图对象
            //item里调用布局文件的方法,这句函数表示，convertView指向item_list
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_listview, null);
            holder.mimg_imgView = convertView.findViewById(R.id.img_imgView);
            holder.mtv_title = convertView.findViewById(R.id.tv_title);
            holder.mtv_current = convertView.findViewById(R.id.tv_current);
            holder.mtv_desc = convertView.findViewById(R.id.tv_desc);
            holder.mtv_original = convertView.findViewById(R.id.tv_original);
            holder.mtv_discount = convertView.findViewById(R.id.tv_discount);
            holder.mtv_distance = convertView.findViewById(R.id.tv_distance);
            holder.mtv_process = convertView.findViewById(R.id.tv_alBought);
            // 将视图持有者保存到转换视图当中
            convertView.setTag(holder);
        } else { // 转换视图非空
            // 从转换视图中获取之前保存的视图持有者
            holder = (ViewHolder) convertView.getTag();
        }
        Product pruduct = mProductList.get(position);
        holder.mimg_imgView.setImageResource(pruduct.image); // 显示行星的图片
        holder.mtv_title.setText(pruduct.title); // 显示行星的名称
        holder.mtv_desc.setText(pruduct.desc); // 显示行星的描述
        holder.mtv_original.setText(pruduct.original); // 显示行星的描述
        holder.mtv_current.setText(pruduct.current); // 显示行星的描述
        holder.mtv_distance.setText(pruduct.distance); // 显示行星的描述
        holder.mtv_discount.setText(pruduct.discount); // 显示行星的描述
        holder.mtv_process.setText(pruduct.process);

        return convertView;
    }
}
