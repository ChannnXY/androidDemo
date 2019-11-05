package com.channnxy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class checkActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        Button btn_1 = findViewById(R.id.btn_1);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toast(1);
            }
        });

        Button btn_2 = findViewById(R.id.btn_2);
        btn_2.setOnClickListener(new btnListener());

        Button btn_3 = findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_3:toast(3);break;
            default:break;
        }
    }

    public void btn_4_click(View view) {
        toast(4);
    }

    private class btnListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            toast(2);
        }
    }

    public void toast(int number){
        String desc = "btn_" + number;
        Toast.makeText(checkActivity.this,desc,Toast.LENGTH_SHORT).show();
    }
}