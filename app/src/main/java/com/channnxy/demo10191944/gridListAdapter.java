package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class gridListAdapter extends AppCompatActivity {
    private ArrayList<Planet> planetsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_list_adapter);
        initGridList();
    }

    private void initGridList() {
        planetsList = Planet.getDefaultList();
        //设置适配器
        final PlanetListAdapter adapter = new PlanetListAdapter(this,planetsList);

        GridView mgr_grid = findViewById(R.id.gr_grid);

        mgr_grid.setAdapter(adapter);
        mgr_grid.setSelection(0);
        mgr_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = "您选择的是"+planetsList.get(position).name;
                Toast.makeText(gridListAdapter.this,desc,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
