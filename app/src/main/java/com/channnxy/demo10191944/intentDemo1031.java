package com.channnxy.demo10191944;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class intentDemo1031 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo1031);
        //声明控件们
        final EditText mtv_name = findViewById(R.id.tv_name);
        final EditText mtv_no = findViewById(R.id.tv_no);
        final EditText mtv_tel = findViewById(R.id.tv_tel);
        final EditText mtv_class = findViewById(R.id.tv_class);
        EditText mtv_float = findViewById(R.id.tv_float);

        //返回mainActivity，并将修改后的值传回去
        Button mbutton_back = findViewById(R.id.back_btn);
        mbutton_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(intentDemo1031.this, MainActivity.class);
//                backIntent.putExtra("intentActivity_name",mtv_name.getText().toString());
//                backIntent.putExtra("intentActivity_no",mtv_no.getText().toString());
//                backIntent.putExtra("intentActivity_tel",mtv_tel.getText().toString());
//                backIntent.putExtra("intentActivity_class",mtv_class.getText().toString());
//                backIntent.putExtra("intentActivity_float",24.666666);
                startActivity(backIntent);
            }
        });
        //将mainActivity传来的值赋给editText
        mtv_name.setText(getIntent().getStringExtra("mainActivity_name"));
        mtv_no.setText(getIntent().getStringExtra("mainActivity_no"));
        mtv_tel.setText(getIntent().getStringExtra("mainActivity_tel"));
        mtv_class.setText(getIntent().getStringExtra("mainActivity_class"));
        mtv_float.setText(getIntent().getStringExtra("mainActivity_float"));
    }
}
