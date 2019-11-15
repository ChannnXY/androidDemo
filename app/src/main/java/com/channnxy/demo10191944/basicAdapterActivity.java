package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class basicAdapterActivity extends AppCompatActivity {
    private ArrayList<Planet> planetsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_adapter);

        initPlanetList();
    }

    private void initPlanetList() {
        //获取默认队列
        planetsList = Planet.getDefaultList();
        //设置适配器
        final PlanetListAdapter adapter = new PlanetListAdapter(this,planetsList);
        Spinner sp = findViewById(R.id.sp_planet);
        sp.setPrompt("请选择行星");
        sp.setSelection(0);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String desc = "您选择的是"+adapter.getItem(position);
                Toast.makeText(basicAdapterActivity.this,desc,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
