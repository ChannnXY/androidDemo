package com.channnxy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

//public class MainActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_checkbox);
//
//        CheckBox ck_system = findViewById(R.id.ck_system);
////        ck_system.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
////        @Override
////        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
////            String desc = String.format("您勾选了控件%d，状态为%b",compoundButton.getId(),b);
////            Toast.makeText(MainActivity.this,desc,Toast.LENGTH_LONG).show();
////        }
////    });
////        方法一
//
////        ck_system.setOnCheckedChangeListener(new onCheckListener());
////        方法二
//    }
//
//
//    private class onCheckListener implements CompoundButton.OnCheckedChangeListener {
//        @Override
//        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//            String desc = String.format("您勾选了控件%d，状态为%b",compoundButton.getId(),b);
//            Toast.makeText(MainActivity.this,desc,Toast.LENGTH_SHORT).show();
//        }
//    }
//}

//public class MainActivity extends Activity implements View.OnClickListener{
//    CheckBox ck_system;
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_checkbox);
//
//        ck_system = MainActivity.this.findViewById(R.id.ck_system);
//        ck_system.setOnClickListener(this);
//    }
//
//    public void onClick(View v){
//        String desc = String.format("您勾选了控件，状态为");
//        Toast.makeText(MainActivity.this,desc,Toast.LENGTH_SHORT).show();
//    }
//}
