package com.channnxy.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.Format;

public class radioActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    public CheckBox mCheckBox;
    public TextView mTextView;
    public TextView mTextView_2;
    public RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        mCheckBox = findViewById(R.id.ck_status);
        mTextView = findViewById(R.id.tv_result);

        mCheckBox.setOnCheckedChangeListener(this);
        refreshCheck();

        mRadioGroup = findViewById(R.id.radioGroup_1);
        mTextView_2 = findViewById(R.id.radio_result);
        mRadioGroup.setOnCheckedChangeListener(new cxyListener());
    }

    public void refreshCheck(){
        String result = String.format("您选中的是："+mCheckBox.isChecked());
        mTextView.setText(result);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        refreshCheck();
    }

    private class cxyListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            String result = "您选择的是radioBtn_" + i;
            mTextView_2.setText(result);
        }
    }
}
