package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public Button mbutton_toNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //页面跳转
        mbutton_toNext = findViewById(R.id.toNext_btn);
        mbutton_toNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //从mainactivity到intentDemo1031
                    Intent myIntent = new Intent(MainActivity.this,intentDemo1031.class);
                    myIntent.putExtra("mainActivity_name","陈心远");
                    myIntent.putExtra("mainActivity_no","1170280043");
                    myIntent.putExtra("mainActivity_tel","13588853112");
                    myIntent.putExtra("mainActivity_class","数字媒体技术");
                    myIntent.putExtra("mainActivity_float",24.666666);
                    startActivity(myIntent);
                }
        });

        Button mbtn_toLogin = findViewById(R.id.toLogin_btn);
        mbtn_toLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(MainActivity.this,login1031.class);
                startActivity(loginIntent);
            }
        });

        //接收并显示原有内容

        //初始化适配器
        initDiaAdapter();
        initDropAdapter();
        initSimpleAdapter();
        getIntentDemo();
    }

    private void getIntentDemo() {

    }


    private void initDropAdapter() {
        ArrayAdapter<String> starAdapter = new ArrayAdapter<>(this,R.layout.item_select,starArray);

        Spinner sp = findViewById(R.id.sp_dropdown);
        sp.setPrompt("请选择行星");
        sp.setAdapter(starAdapter);
        sp.setSelection(0);
        sp.setOnItemSelectedListener(new MySelectedListener());
    }

    private void initDiaAdapter() {
        ArrayAdapter<String> starAdapter = new ArrayAdapter<>(this,R.layout.item_select,starArray);

        Spinner sp = findViewById(R.id.sp_dialog);
        sp.setPrompt("请选择行星");
        sp.setAdapter(starAdapter);
        sp.setSelection(0);
        sp.setOnItemSelectedListener(new MySelectedListener());
    }

    private void initSimpleAdapter() {
        // 声明一个映射对象的队列，用于保存行星的图标与名称配对信息
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < iconArray.length; i++) {
            Map<String, Object> item = new HashMap<String, Object>();
            item.put("icon", iconArray[i]);
            item.put("name", starArray[i]);
            list.add(item);
        }
        SimpleAdapter starAdapter = new SimpleAdapter(this, list,
                R.layout.item_simple, new String[]{"icon", "name"},
                new int[]{R.id.iv_icon, R.id.tv_name});
        starAdapter.setDropDownViewResource(R.layout.item_simple);
        Spinner sp = findViewById(R.id.sp_simple);
        sp.setPrompt("请选择行星");
        sp.setAdapter(starAdapter);
        sp.setSelection(0);
        sp.setOnItemSelectedListener(new MySelectedListener());
    }

    private int[] iconArray = {R.drawable.shuixing, R.drawable.jinxing, R.drawable.diqiu,
            R.drawable.huoxing, R.drawable.muxing, R.drawable.tuxing};
    // 定义下拉列表需要显示的行星名称数组
    private String[] starArray = {"水星", "金星", "地球", "火星", "木星", "土星"};

    private class MySelectedListener implements android.widget.AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            Toast.makeText(MainActivity.this, "您选择的是" + starArray[i], Toast.LENGTH_LONG).show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}
