package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class listViewActivity extends AppCompatActivity {
    private ArrayList<Product> ProductList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initListView();
    }

    private void initListView() {
        ProductList = Product.getDefaultList();
        final ProductListAdapter adapter = new ProductListAdapter(this,ProductList);

        ListView mlist_listView = findViewById(R.id.list_listView);
        mlist_listView.setAdapter(adapter);
        mlist_listView.setSelection(0);
        mlist_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String desc = "您选择的是"+ProductList.get(position).title;
                Toast.makeText(listViewActivity.this,desc,Toast.LENGTH_SHORT).show();
            }
        });
    }
}
