package com.channnxy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class simpleAdapter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);

//        initSimpleAdapter();
    }

    //设置映射,并初始化文件
//    private void initSimpleAdapter(){
//        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//        for(int i = 0; i < iconArray.length; i++){
//            Map<String,Object> item = new HashMap<String,Object>();
//            item.put("icon", iconArray[i]);
//            item.put("name", starArray[i]);
//            list.add(item);
//        }
//        SimpleAdapter starAdapter = new SimpleAdapter(this, list,
//                R.layout.item_simple, new String[]{"icon", "name"},new int[]{R.id.iv_icon, R.id.tv_name});
//
//        starAdapter.setDropDownViewResource(R.layout.item_simple);
//        Spinner sp_simple = findViewById(R.id.sp_simple);
//        sp_simple.setPrompt("请选择行星");
//        sp_simple.setAdapter(starAdapter);
//        sp_simple.setSelection(0);
//        sp_simple.setOnItemSelectedListener(new simpleListener());
    }
//
//    private int[] iconArray = {R.drawable.shuixing,R.drawable.muxing,R.drawable.jinxing,R.drawable.diqiu,R.drawable.muxing,R.drawable.tuxing};
//
//    private String[] starArray = {"水星","木星","金星","地球","木星","土星"};
//
//    private class simpleListener implements android.widget.AdapterView.OnItemSelectedListener {
//        @Override
//        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//            Toast.makeText(simpleAdapter.this,"您选择的是："+starArray[i],Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        public void onNothingSelected(AdapterView<?> adapterView) {
//
//        }
//    }
